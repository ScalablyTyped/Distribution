package typings.ol

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object orientMod {
  
  @JSImport("ol/geom/flat/orient", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def linearRingIsClockwise(flatCoordinates: js.Array[Double], offset: Double, end: Double, stride: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("linearRingIsClockwise")(flatCoordinates.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], end.asInstanceOf[js.Any], stride.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def linearRingsAreOriented(flatCoordinates: js.Array[Double], offset: Double, ends: js.Array[Double], stride: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("linearRingsAreOriented")(flatCoordinates.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], ends.asInstanceOf[js.Any], stride.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def linearRingsAreOriented(
    flatCoordinates: js.Array[Double],
    offset: Double,
    ends: js.Array[Double],
    stride: Double,
    opt_right: Boolean
  ): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("linearRingsAreOriented")(flatCoordinates.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], ends.asInstanceOf[js.Any], stride.asInstanceOf[js.Any], opt_right.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def linearRingssAreOriented(
    flatCoordinates: js.Array[Double],
    offset: Double,
    endss: js.Array[js.Array[Double]],
    stride: Double
  ): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("linearRingssAreOriented")(flatCoordinates.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], endss.asInstanceOf[js.Any], stride.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def linearRingssAreOriented(
    flatCoordinates: js.Array[Double],
    offset: Double,
    endss: js.Array[js.Array[Double]],
    stride: Double,
    opt_right: Boolean
  ): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("linearRingssAreOriented")(flatCoordinates.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], endss.asInstanceOf[js.Any], stride.asInstanceOf[js.Any], opt_right.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def orientLinearRings(flatCoordinates: js.Array[Double], offset: Double, ends: js.Array[Double], stride: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("orientLinearRings")(flatCoordinates.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], ends.asInstanceOf[js.Any], stride.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def orientLinearRings(
    flatCoordinates: js.Array[Double],
    offset: Double,
    ends: js.Array[Double],
    stride: Double,
    opt_right: Boolean
  ): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("orientLinearRings")(flatCoordinates.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], ends.asInstanceOf[js.Any], stride.asInstanceOf[js.Any], opt_right.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def orientLinearRingsArray(
    flatCoordinates: js.Array[Double],
    offset: Double,
    endss: js.Array[js.Array[Double]],
    stride: Double
  ): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("orientLinearRingsArray")(flatCoordinates.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], endss.asInstanceOf[js.Any], stride.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def orientLinearRingsArray(
    flatCoordinates: js.Array[Double],
    offset: Double,
    endss: js.Array[js.Array[Double]],
    stride: Double,
    opt_right: Boolean
  ): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("orientLinearRingsArray")(flatCoordinates.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], endss.asInstanceOf[js.Any], stride.asInstanceOf[js.Any], opt_right.asInstanceOf[js.Any])).asInstanceOf[Double]
}
