package typings.phaser.spine.webgl

import typings.phaser.spine.Skeleton
import typings.phaser.spine.VertexEffect
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("spine.webgl.SkeletonRenderer")
@js.native
class SkeletonRenderer protected () extends js.Object {
  def this(context: ManagedWebGLRenderingContext) = this()
  def this(context: ManagedWebGLRenderingContext, twoColorTint: Boolean) = this()
  var clipper: js.Any = js.native
  var premultipliedAlpha: Boolean = js.native
  var renderable: js.Any = js.native
  var temp: js.Any = js.native
  var temp2: js.Any = js.native
  var temp3: js.Any = js.native
  var temp4: js.Any = js.native
  var tempColor: js.Any = js.native
  var tempColor2: js.Any = js.native
  var twoColorTint: js.Any = js.native
  var vertexEffect: VertexEffect = js.native
  var vertexSize: js.Any = js.native
  var vertices: js.Any = js.native
  def draw(batcher: PolygonBatcher, skeleton: Skeleton): Unit = js.native
  def draw(batcher: PolygonBatcher, skeleton: Skeleton, slotRangeStart: Double): Unit = js.native
  def draw(batcher: PolygonBatcher, skeleton: Skeleton, slotRangeStart: Double, slotRangeEnd: Double): Unit = js.native
}

/* static members */
@JSGlobal("spine.webgl.SkeletonRenderer")
@js.native
object SkeletonRenderer extends js.Object {
  var QUAD_TRIANGLES: js.Array[Double] = js.native
}

