package typings
package pixiDashSpineLib.PIXINs.spineNs.coreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("PIXI.spine.core.SkeletonClipping")
@js.native
class SkeletonClipping () extends js.Object {
  var clipAttachment: js.Any = js.native
  var clipOutput: js.Any = js.native
  var clippedTriangles: js.Array[scala.Double] = js.native
  var clippedVertices: js.Array[scala.Double] = js.native
  var clippingPolygon: js.Any = js.native
  var clippingPolygons: js.Any = js.native
  var scratch: js.Any = js.native
  var triangulator: js.Any = js.native
  def clip(
    x1: scala.Double,
    y1: scala.Double,
    x2: scala.Double,
    y2: scala.Double,
    x3: scala.Double,
    y3: scala.Double,
    clippingArea: js.Array[scala.Double],
    output: js.Array[scala.Double]
  ): scala.Boolean = js.native
  def clipEnd(): scala.Unit = js.native
  def clipEndWithSlot(slot: Slot): scala.Unit = js.native
  def clipStart(slot: Slot, clip: ClippingAttachment): scala.Double = js.native
  def clipTriangles(
    vertices: ArrayLike[scala.Double],
    verticesLength: scala.Double,
    triangles: ArrayLike[scala.Double],
    trianglesLength: scala.Double,
    uvs: ArrayLike[scala.Double],
    light: Color,
    dark: Color,
    twoColor: scala.Boolean
  ): scala.Unit = js.native
  def isClipping(): scala.Boolean = js.native
}

@JSGlobal("PIXI.spine.core.SkeletonClipping")
@js.native
object SkeletonClipping extends js.Object {
  def makeClockwise(polygon: pixiDashSpineLib.PIXINs.spineNs.coreNs.ArrayLike[scala.Double]): scala.Unit = js.native
}

