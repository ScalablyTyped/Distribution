package typings.ol

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object areaMod {
  
  @JSImport("ol/geom/flat/area", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def linearRing(flatCoordinates: js.Array[Double], offset: Double, end: Double, stride: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("linearRing")(flatCoordinates.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], end.asInstanceOf[js.Any], stride.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def linearRings(flatCoordinates: js.Array[Double], offset: Double, ends: js.Array[Double], stride: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("linearRings")(flatCoordinates.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], ends.asInstanceOf[js.Any], stride.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def linearRingss(
    flatCoordinates: js.Array[Double],
    offset: Double,
    endss: js.Array[js.Array[Double]],
    stride: Double
  ): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("linearRingss")(flatCoordinates.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], endss.asInstanceOf[js.Any], stride.asInstanceOf[js.Any])).asInstanceOf[Double]
}
