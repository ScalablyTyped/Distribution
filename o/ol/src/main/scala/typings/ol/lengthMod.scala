package typings.ol

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object lengthMod {
  
  @JSImport("ol/geom/flat/length", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def lineStringLength(flatCoordinates: js.Array[Double], offset: Double, end: Double, stride: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("lineStringLength")(flatCoordinates.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], end.asInstanceOf[js.Any], stride.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def linearRingLength(flatCoordinates: js.Array[Double], offset: Double, end: Double, stride: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("linearRingLength")(flatCoordinates.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], end.asInstanceOf[js.Any], stride.asInstanceOf[js.Any])).asInstanceOf[Double]
}
