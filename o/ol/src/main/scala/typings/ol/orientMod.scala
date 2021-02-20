package typings.ol

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object orientMod {
  
  @JSImport("ol/geom/flat/orient", "linearRingIsClockwise")
  @js.native
  def linearRingIsClockwise(flatCoordinates: js.Array[Double], offset: Double, end: Double, stride: Double): Boolean = js.native
  
  @JSImport("ol/geom/flat/orient", "linearRingsAreOriented")
  @js.native
  def linearRingsAreOriented(flatCoordinates: js.Array[Double], offset: Double, ends: js.Array[Double], stride: Double): Boolean = js.native
  @JSImport("ol/geom/flat/orient", "linearRingsAreOriented")
  @js.native
  def linearRingsAreOriented(
    flatCoordinates: js.Array[Double],
    offset: Double,
    ends: js.Array[Double],
    stride: Double,
    opt_right: Boolean
  ): Boolean = js.native
  
  @JSImport("ol/geom/flat/orient", "linearRingssAreOriented")
  @js.native
  def linearRingssAreOriented(
    flatCoordinates: js.Array[Double],
    offset: Double,
    endss: js.Array[js.Array[Double]],
    stride: Double
  ): Boolean = js.native
  @JSImport("ol/geom/flat/orient", "linearRingssAreOriented")
  @js.native
  def linearRingssAreOriented(
    flatCoordinates: js.Array[Double],
    offset: Double,
    endss: js.Array[js.Array[Double]],
    stride: Double,
    opt_right: Boolean
  ): Boolean = js.native
  
  @JSImport("ol/geom/flat/orient", "orientLinearRings")
  @js.native
  def orientLinearRings(flatCoordinates: js.Array[Double], offset: Double, ends: js.Array[Double], stride: Double): Double = js.native
  @JSImport("ol/geom/flat/orient", "orientLinearRings")
  @js.native
  def orientLinearRings(
    flatCoordinates: js.Array[Double],
    offset: Double,
    ends: js.Array[Double],
    stride: Double,
    opt_right: Boolean
  ): Double = js.native
  
  @JSImport("ol/geom/flat/orient", "orientLinearRingsArray")
  @js.native
  def orientLinearRingsArray(
    flatCoordinates: js.Array[Double],
    offset: Double,
    endss: js.Array[js.Array[Double]],
    stride: Double
  ): Double = js.native
  @JSImport("ol/geom/flat/orient", "orientLinearRingsArray")
  @js.native
  def orientLinearRingsArray(
    flatCoordinates: js.Array[Double],
    offset: Double,
    endss: js.Array[js.Array[Double]],
    stride: Double,
    opt_right: Boolean
  ): Double = js.native
}
