package typings.ol

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object stringMod {
  
  @JSImport("ol/string", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def compareVersions(v1: String, v2: String): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("compareVersions")(v1.asInstanceOf[js.Any], v2.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def compareVersions(v1: String, v2: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("compareVersions")(v1.asInstanceOf[js.Any], v2.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def compareVersions(v1: Double, v2: String): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("compareVersions")(v1.asInstanceOf[js.Any], v2.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def compareVersions(v1: Double, v2: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("compareVersions")(v1.asInstanceOf[js.Any], v2.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def padNumber(number: Double, width: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("padNumber")(number.asInstanceOf[js.Any], width.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def padNumber(number: Double, width: Double, precision: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("padNumber")(number.asInstanceOf[js.Any], width.asInstanceOf[js.Any], precision.asInstanceOf[js.Any])).asInstanceOf[String]
}
