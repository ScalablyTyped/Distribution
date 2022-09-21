package typings.nginstackEngine

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object replaceAllMod {
  
  inline def apply(text: String, exp: String, replacement: String): String = (^.asInstanceOf[js.Dynamic].apply(text.asInstanceOf[js.Any], exp.asInstanceOf[js.Any], replacement.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def apply(text: String, exp: typings.nginstackEngine.regexMod.^, replacement: String): String = (^.asInstanceOf[js.Dynamic].apply(text.asInstanceOf[js.Any], exp.asInstanceOf[js.Any], replacement.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @JSImport("@nginstack/engine/lib/regexp/replaceAll", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
