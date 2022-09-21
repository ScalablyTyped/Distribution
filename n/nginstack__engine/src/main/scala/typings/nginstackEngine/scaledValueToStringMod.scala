package typings.nginstackEngine

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object scaledValueToStringMod {
  
  inline def apply(`val`: Double, conversion: Any): String = (^.asInstanceOf[js.Dynamic].apply(`val`.asInstanceOf[js.Any], conversion.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def apply(`val`: Double, conversion: Any, opt_decimals: Double): String = (^.asInstanceOf[js.Dynamic].apply(`val`.asInstanceOf[js.Any], conversion.asInstanceOf[js.Any], opt_decimals.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def apply(`val`: Double, conversion: Any, opt_decimals: Double, opt_suffix: String): String = (^.asInstanceOf[js.Dynamic].apply(`val`.asInstanceOf[js.Any], conversion.asInstanceOf[js.Any], opt_decimals.asInstanceOf[js.Any], opt_suffix.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def apply(`val`: Double, conversion: Any, opt_decimals: Unit, opt_suffix: String): String = (^.asInstanceOf[js.Dynamic].apply(`val`.asInstanceOf[js.Any], conversion.asInstanceOf[js.Any], opt_decimals.asInstanceOf[js.Any], opt_suffix.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @JSImport("@nginstack/engine/lib/format/scaledValueToString", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
