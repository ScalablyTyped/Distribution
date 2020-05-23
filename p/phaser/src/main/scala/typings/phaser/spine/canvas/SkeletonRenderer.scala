package typings.phaser.spine.canvas

import typings.phaser.spine.Skeleton
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SkeletonRenderer extends js.Object {
  var computeMeshVertices: js.Any
  var computeRegionVertices: js.Any
  var ctx: js.Any
  var debugRendering: Boolean
  var drawImages: js.Any
  var drawTriangle: js.Any
  var drawTriangles: js.Any
  var tempColor: js.Any
  var triangleRendering: Boolean
  var vertices: js.Any
  def draw(skeleton: Skeleton): Unit
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
}

