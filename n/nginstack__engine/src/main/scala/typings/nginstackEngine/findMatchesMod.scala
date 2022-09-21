package typings.nginstackEngine

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object findMatchesMod {
  
  inline def apply(text: String, exp: String): js.Array[String] = (^.asInstanceOf[js.Dynamic].apply(text.asInstanceOf[js.Any], exp.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
  inline def apply(text: String, exp: typings.nginstackEngine.regexMod.^): js.Array[String] = (^.asInstanceOf[js.Dynamic].apply(text.asInstanceOf[js.Any], exp.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
  
  @JSImport("@nginstack/engine/lib/regexp/findMatches", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
