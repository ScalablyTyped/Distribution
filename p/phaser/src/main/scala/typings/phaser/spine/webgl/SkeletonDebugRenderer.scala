package typings.phaser.spine.webgl

import typings.phaser.spine.Color
import typings.phaser.spine.Disposable
import typings.phaser.spine.Skeleton
import typings.std.WebGLRenderingContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("spine.webgl.SkeletonDebugRenderer")
@js.native
class SkeletonDebugRenderer protected () extends Disposable {
  def this(context: ManagedWebGLRenderingContext) = this()
  def this(context: WebGLRenderingContext) = this()
  var aabbColor: Color = js.native
  var attachmentLineColor: Color = js.native
  var boneLineColor: Color = js.native
  var boneOriginColor: Color = js.native
  var boneWidth: Double = js.native
  var bounds: js.Any = js.native
  var clipColor: Color = js.native
  var context: js.Any = js.native
  var drawBones: Boolean = js.native
  var drawBoundingBoxes: Boolean = js.native
  var drawClipping: Boolean = js.native
  var drawMeshHull: Boolean = js.native
  var drawMeshTriangles: Boolean = js.native
  var drawPaths: Boolean = js.native
  var drawRegionAttachments: Boolean = js.native
  var drawSkeletonXY: Boolean = js.native
  var pathColor: Color = js.native
  var premultipliedAlpha: Boolean = js.native
  var scale: Double = js.native
  var temp: js.Any = js.native
  var triangleLineColor: Color = js.native
  var vertices: js.Any = js.native
  /* CompleteClass */
  override def dispose(): Unit = js.native
  def draw(shapes: ShapeRenderer, skeleton: Skeleton): Unit = js.native
  def draw(shapes: ShapeRenderer, skeleton: Skeleton, ignoredBones: js.Array[String]): Unit = js.native
}

/* static members */
@JSGlobal("spine.webgl.SkeletonDebugRenderer")
@js.native
object SkeletonDebugRenderer extends js.Object {
  var GREEN: js.Any = js.native
  var LIGHT_GRAY: js.Any = js.native
}

