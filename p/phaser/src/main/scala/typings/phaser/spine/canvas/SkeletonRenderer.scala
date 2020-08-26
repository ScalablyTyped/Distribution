package typings.phaser.spine.canvas

import typings.phaser.spine.Skeleton
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SkeletonRenderer extends js.Object {
  var computeMeshVertices: js.Any = js.native
  var computeRegionVertices: js.Any = js.native
  var ctx: js.Any = js.native
  var debugRendering: Boolean = js.native
  var drawImages: js.Any = js.native
  var drawTriangle: js.Any = js.native
  var drawTriangles: js.Any = js.native
  var tempColor: js.Any = js.native
  var triangleRendering: Boolean = js.native
  var vertices: js.Any = js.native
  def draw(skeleton: Skeleton): Unit = js.native
}

object SkeletonRenderer {
  @scala.inline
  def apply(
    computeMeshVertices: js.Any,
    computeRegionVertices: js.Any,
    ctx: js.Any,
    debugRendering: Boolean,
    draw: Skeleton => Unit,
    drawImages: js.Any,
    drawTriangle: js.Any,
    drawTriangles: js.Any,
    tempColor: js.Any,
    triangleRendering: Boolean,
    vertices: js.Any
  ): SkeletonRenderer = {
    val __obj = js.Dynamic.literal(computeMeshVertices = computeMeshVertices.asInstanceOf[js.Any], computeRegionVertices = computeRegionVertices.asInstanceOf[js.Any], ctx = ctx.asInstanceOf[js.Any], debugRendering = debugRendering.asInstanceOf[js.Any], draw = js.Any.fromFunction1(draw), drawImages = drawImages.asInstanceOf[js.Any], drawTriangle = drawTriangle.asInstanceOf[js.Any], drawTriangles = drawTriangles.asInstanceOf[js.Any], tempColor = tempColor.asInstanceOf[js.Any], triangleRendering = triangleRendering.asInstanceOf[js.Any], vertices = vertices.asInstanceOf[js.Any])
    __obj.asInstanceOf[SkeletonRenderer]
  }
  @scala.inline
  implicit class SkeletonRendererOps[Self <: SkeletonRenderer] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setComputeMeshVertices(value: js.Any): Self = this.set("computeMeshVertices", value.asInstanceOf[js.Any])
    @scala.inline
    def setComputeRegionVertices(value: js.Any): Self = this.set("computeRegionVertices", value.asInstanceOf[js.Any])
    @scala.inline
    def setCtx(value: js.Any): Self = this.set("ctx", value.asInstanceOf[js.Any])
    @scala.inline
    def setDebugRendering(value: Boolean): Self = this.set("debugRendering", value.asInstanceOf[js.Any])
    @scala.inline
    def setDraw(value: Skeleton => Unit): Self = this.set("draw", js.Any.fromFunction1(value))
    @scala.inline
    def setDrawImages(value: js.Any): Self = this.set("drawImages", value.asInstanceOf[js.Any])
    @scala.inline
    def setDrawTriangle(value: js.Any): Self = this.set("drawTriangle", value.asInstanceOf[js.Any])
    @scala.inline
    def setDrawTriangles(value: js.Any): Self = this.set("drawTriangles", value.asInstanceOf[js.Any])
    @scala.inline
    def setTempColor(value: js.Any): Self = this.set("tempColor", value.asInstanceOf[js.Any])
    @scala.inline
    def setTriangleRendering(value: Boolean): Self = this.set("triangleRendering", value.asInstanceOf[js.Any])
    @scala.inline
    def setVertices(value: js.Any): Self = this.set("vertices", value.asInstanceOf[js.Any])
  }
  
}

