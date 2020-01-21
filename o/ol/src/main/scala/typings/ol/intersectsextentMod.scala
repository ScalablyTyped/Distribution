package typings.ol

import typings.ol.extentMod.Extent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ol/geom/flat/intersectsextent", JSImport.Namespace)
@js.native
object intersectsextentMod extends js.Object {
  def intersectsLineString(flatCoordinates: js.Array[Double], offset: Double, end: Double, stride: Double, extent: Extent): Boolean = js.native
  def intersectsLineStringArray(
    flatCoordinates: js.Array[Double],
    offset: Double,
    ends: js.Array[Double],
    stride: Double,
    extent: Extent
  ): Boolean = js.native
  def intersectsLinearRing(flatCoordinates: js.Array[Double], offset: Double, end: Double, stride: Double, extent: Extent): Boolean = js.native
  def intersectsLinearRingArray(
    flatCoordinates: js.Array[Double],
    offset: Double,
    ends: js.Array[Double],
    stride: Double,
    extent: Extent
  ): Boolean = js.native
  def intersectsLinearRingMultiArray(
    flatCoordinates: js.Array[Double],
    offset: Double,
    endss: js.Array[js.Array[Double]],
    stride: Double,
    extent: Extent
  ): Boolean = js.native
}

