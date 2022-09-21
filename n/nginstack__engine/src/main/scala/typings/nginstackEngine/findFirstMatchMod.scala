package typings.nginstackEngine

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object findFirstMatchMod {
  
  inline def apply(text: String, exp: String): String = (^.asInstanceOf[js.Dynamic].apply(text.asInstanceOf[js.Any], exp.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def apply(text: String, exp: typings.nginstackEngine.regexMod.^): String = (^.asInstanceOf[js.Dynamic].apply(text.asInstanceOf[js.Any], exp.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @JSImport("@nginstack/engine/lib/regexp/findFirstMatch", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
