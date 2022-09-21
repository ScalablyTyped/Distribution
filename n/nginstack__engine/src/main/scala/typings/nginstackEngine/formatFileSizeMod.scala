package typings.nginstackEngine

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object formatFileSizeMod {
  
  inline def apply(bytes: Double): String = ^.asInstanceOf[js.Dynamic].apply(bytes.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def apply(bytes: Double, opt_decimals: Double): String = (^.asInstanceOf[js.Dynamic].apply(bytes.asInstanceOf[js.Any], opt_decimals.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @JSImport("@nginstack/engine/lib/format/formatFileSize", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
