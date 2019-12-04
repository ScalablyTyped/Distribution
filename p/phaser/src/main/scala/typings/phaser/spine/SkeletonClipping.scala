package typings.phaser.spine

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("spine.SkeletonClipping")
@js.native
class SkeletonClipping () extends js.Object {
  var clipAttachment: js.Any = js.native
  var clipOutput: js.Any = js.native
  var clippedTriangles: js.Array[Double] = js.native
  var clippedVertices: js.Array[Double] = js.native
  var clippingPolygon: js.Any = js.native
  var clippingPolygons: js.Any = js.native
  var scratch: js.Any = js.native
  var triangulator: js.Any = js.native
  def clip(
    x1: Double,
    y1: Double,
    x2: Double,
    y2: Double,
    x3: Double,
    y3: Double,
    clippingArea: js.Array[Double],
    output: js.Array[Double]
  ): Boolean = js.native
  def clipEnd(): Unit = js.native
  def clipEndWithSlot(slot: Slot): Unit = js.native
  def clipStart(slot: Slot, clip: ClippingAttachment): Double = js.native
  def clipTriangles(
    vertices: ArrayLike[Double],
    verticesLength: Double,
    triangles: ArrayLike[Double],
    trianglesLength: Double,
    uvs: ArrayLike[Double],
    light: Color,
    dark: Color,
    twoColor: Boolean
  ): Unit = js.native
  def isClipping(): Boolean = js.native
}

/* static members */
@JSGlobal("spine.SkeletonClipping")
@js.native
object SkeletonClipping extends js.Object {
  def makeClockwise(polygon: ArrayLike[Double]): Unit = js.native
}

