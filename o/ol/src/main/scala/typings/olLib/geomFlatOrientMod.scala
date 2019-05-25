package typings
package olLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ol/geom/flat/orient", JSImport.Namespace)
@js.native
object geomFlatOrientMod extends js.Object {
  def linearRingIsClockwise(
    flatCoordinates: js.Array[scala.Double],
    offset: scala.Double,
    end: scala.Double,
    stride: scala.Double
  ): scala.Boolean = js.native
  def linearRingIsOriented(
    flatCoordinates: js.Array[scala.Double],
    offset: scala.Double,
    ends: js.Array[scala.Double],
    stride: scala.Double
  ): scala.Boolean = js.native
  def linearRingIsOriented(
    flatCoordinates: js.Array[scala.Double],
    offset: scala.Double,
    ends: js.Array[scala.Double],
    stride: scala.Double,
    opt_right: scala.Boolean
  ): scala.Boolean = js.native
  def linearRingsAreOriented(
    flatCoordinates: js.Array[scala.Double],
    offset: scala.Double,
    endss: js.Array[js.Array[scala.Double]],
    stride: scala.Double
  ): scala.Boolean = js.native
  def linearRingsAreOriented(
    flatCoordinates: js.Array[scala.Double],
    offset: scala.Double,
    endss: js.Array[js.Array[scala.Double]],
    stride: scala.Double,
    opt_right: scala.Boolean
  ): scala.Boolean = js.native
  def orientLinearRings(
    flatCoordinates: js.Array[scala.Double],
    offset: scala.Double,
    ends: js.Array[scala.Double],
    stride: scala.Double
  ): scala.Double = js.native
  def orientLinearRings(
    flatCoordinates: js.Array[scala.Double],
    offset: scala.Double,
    ends: js.Array[scala.Double],
    stride: scala.Double,
    opt_right: scala.Boolean
  ): scala.Double = js.native
  def orientLinearRingsArray(
    flatCoordinates: js.Array[scala.Double],
    offset: scala.Double,
    endss: js.Array[js.Array[scala.Double]],
    stride: scala.Double
  ): scala.Double = js.native
  def orientLinearRingsArray(
    flatCoordinates: js.Array[scala.Double],
    offset: scala.Double,
    endss: js.Array[js.Array[scala.Double]],
    stride: scala.Double,
    opt_right: scala.Boolean
  ): scala.Double = js.native
}

