package typings.pixiSpine.PIXI.spine.core

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SkeletonClipping extends js.Object {
  var clipAttachment: js.Any
  var clipOutput: js.Any
  var clippedTriangles: js.Array[Double]
  var clippedVertices: js.Array[Double]
  var clippingPolygon: js.Any
  var clippingPolygons: js.Any
  var scratch: js.Any
  var triangulator: js.Any
  def clip(
    x1: Double,
    y1: Double,
    x2: Double,
    y2: Double,
    x3: Double,
    y3: Double,
    clippingArea: js.Array[Double],
    output: js.Array[Double]
  ): Boolean
  def clipEnd(): Unit
  def clipEndWithSlot(slot: Slot): Unit
  def clipStart(slot: Slot, clip: ClippingAttachment): Double
  def clipTriangles(
    vertices: ArrayLike[Double],
    verticesLength: Double,
    triangles: ArrayLike[Double],
    trianglesLength: Double,
    uvs: ArrayLike[Double],
    light: Color,
    dark: Color,
    twoColor: Boolean
  ): Unit
  def isClipping(): Boolean
}

object SkeletonClipping {
  @scala.inline
  def apply(
    clip: (Double, Double, Double, Double, Double, Double, js.Array[Double], js.Array[Double]) => Boolean,
    clipAttachment: js.Any,
    clipEnd: () => Unit,
    clipEndWithSlot: Slot => Unit,
    clipOutput: js.Any,
    clipStart: (Slot, ClippingAttachment) => Double,
    clipTriangles: (ArrayLike[Double], Double, ArrayLike[Double], Double, ArrayLike[Double], Color, Color, Boolean) => Unit,
    clippedTriangles: js.Array[Double],
    clippedVertices: js.Array[Double],
    clippingPolygon: js.Any,
    clippingPolygons: js.Any,
    isClipping: () => Boolean,
    scratch: js.Any,
    triangulator: js.Any
  ): SkeletonClipping = {
    val __obj = js.Dynamic.literal(clip = js.Any.fromFunction8(clip), clipAttachment = clipAttachment.asInstanceOf[js.Any], clipEnd = js.Any.fromFunction0(clipEnd), clipEndWithSlot = js.Any.fromFunction1(clipEndWithSlot), clipOutput = clipOutput.asInstanceOf[js.Any], clipStart = js.Any.fromFunction2(clipStart), clipTriangles = js.Any.fromFunction8(clipTriangles), clippedTriangles = clippedTriangles.asInstanceOf[js.Any], clippedVertices = clippedVertices.asInstanceOf[js.Any], clippingPolygon = clippingPolygon.asInstanceOf[js.Any], clippingPolygons = clippingPolygons.asInstanceOf[js.Any], isClipping = js.Any.fromFunction0(isClipping), scratch = scratch.asInstanceOf[js.Any], triangulator = triangulator.asInstanceOf[js.Any])
    __obj.asInstanceOf[SkeletonClipping]
  }
}

