package typings
package phaserLib.spineNs.webglNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("spine.webgl.SkeletonDebugRenderer")
@js.native
class SkeletonDebugRenderer protected ()
  extends phaserLib.spineNs.Disposable {
  def this(context: ManagedWebGLRenderingContext) = this()
  def this(context: stdLib.WebGLRenderingContext) = this()
  var aabbColor: phaserLib.spineNs.Color = js.native
  var attachmentLineColor: phaserLib.spineNs.Color = js.native
  var boneLineColor: phaserLib.spineNs.Color = js.native
  var boneOriginColor: phaserLib.spineNs.Color = js.native
  var boneWidth: scala.Double = js.native
  var bounds: js.Any = js.native
  var clipColor: phaserLib.spineNs.Color = js.native
  var context: js.Any = js.native
  var drawBones: scala.Boolean = js.native
  var drawBoundingBoxes: scala.Boolean = js.native
  var drawClipping: scala.Boolean = js.native
  var drawMeshHull: scala.Boolean = js.native
  var drawMeshTriangles: scala.Boolean = js.native
  var drawPaths: scala.Boolean = js.native
  var drawRegionAttachments: scala.Boolean = js.native
  var drawSkeletonXY: scala.Boolean = js.native
  var pathColor: phaserLib.spineNs.Color = js.native
  var premultipliedAlpha: scala.Boolean = js.native
  var scale: scala.Double = js.native
  var temp: js.Any = js.native
  var triangleLineColor: phaserLib.spineNs.Color = js.native
  var vertices: js.Any = js.native
  /* CompleteClass */
  override def dispose(): scala.Unit = js.native
  def draw(shapes: ShapeRenderer, skeleton: phaserLib.spineNs.Skeleton): scala.Unit = js.native
  def draw(
    shapes: ShapeRenderer,
    skeleton: phaserLib.spineNs.Skeleton,
    ignoredBones: js.Array[java.lang.String]
  ): scala.Unit = js.native
}

@JSGlobal("spine.webgl.SkeletonDebugRenderer")
@js.native
object SkeletonDebugRenderer extends js.Object {
  var GREEN: js.Any = js.native
  var LIGHT_GRAY: js.Any = js.native
}

