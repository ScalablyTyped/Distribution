package typings.ol

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ol/geom/flat/orient", JSImport.Namespace)
@js.native
object orientMod extends js.Object {
  def linearRingIsClockwise(flatCoordinates: js.Array[Double], offset: Double, end: Double, stride: Double): Boolean = js.native
  def linearRingsAreOriented(flatCoordinates: js.Array[Double], offset: Double, ends: js.Array[Double], stride: Double): Boolean = js.native
  def linearRingsAreOriented(
    flatCoordinates: js.Array[Double],
    offset: Double,
    ends: js.Array[Double],
    stride: Double,
    opt_right: Boolean
  ): Boolean = js.native
  def linearRingssAreOriented(
    flatCoordinates: js.Array[Double],
    offset: Double,
    endss: js.Array[js.Array[Double]],
    stride: Double
  ): Boolean = js.native
  def linearRingssAreOriented(
    flatCoordinates: js.Array[Double],
    offset: Double,
    endss: js.Array[js.Array[Double]],
    stride: Double,
    opt_right: Boolean
  ): Boolean = js.native
  def orientLinearRings(flatCoordinates: js.Array[Double], offset: Double, ends: js.Array[Double], stride: Double): Double = js.native
  def orientLinearRings(
    flatCoordinates: js.Array[Double],
    offset: Double,
    ends: js.Array[Double],
    stride: Double,
    opt_right: Boolean
  ): Double = js.native
  def orientLinearRingsArray(
    flatCoordinates: js.Array[Double],
    offset: Double,
    endss: js.Array[js.Array[Double]],
    stride: Double
  ): Double = js.native
  def orientLinearRingsArray(
    flatCoordinates: js.Array[Double],
    offset: Double,
    endss: js.Array[js.Array[Double]],
    stride: Double,
    opt_right: Boolean
  ): Double = js.native
}

