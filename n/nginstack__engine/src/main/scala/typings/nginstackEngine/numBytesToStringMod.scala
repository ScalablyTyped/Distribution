package typings.nginstackEngine

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object numBytesToStringMod {
  
  inline def apply(`val`: Double): String = ^.asInstanceOf[js.Dynamic].apply(`val`.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def apply(`val`: Double, opt_decimals: Double): String = (^.asInstanceOf[js.Dynamic].apply(`val`.asInstanceOf[js.Any], opt_decimals.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def apply(`val`: Double, opt_decimals: Double, opt_suffix: Boolean): String = (^.asInstanceOf[js.Dynamic].apply(`val`.asInstanceOf[js.Any], opt_decimals.asInstanceOf[js.Any], opt_suffix.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def apply(`val`: Double, opt_decimals: Unit, opt_suffix: Boolean): String = (^.asInstanceOf[js.Dynamic].apply(`val`.asInstanceOf[js.Any], opt_decimals.asInstanceOf[js.Any], opt_suffix.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @JSImport("@nginstack/engine/lib/format/numBytesToString", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
