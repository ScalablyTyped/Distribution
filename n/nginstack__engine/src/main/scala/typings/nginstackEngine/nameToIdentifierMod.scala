package typings.nginstackEngine

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object nameToIdentifierMod {
  
  inline def apply(name: String): String = ^.asInstanceOf[js.Dynamic].apply(name.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def apply(name: String, opt_capitalize: Boolean): String = (^.asInstanceOf[js.Dynamic].apply(name.asInstanceOf[js.Any], opt_capitalize.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def apply(name: String, opt_capitalize: Boolean, opt_preserveCaseIfOnlyAWord: Boolean): String = (^.asInstanceOf[js.Dynamic].apply(name.asInstanceOf[js.Any], opt_capitalize.asInstanceOf[js.Any], opt_preserveCaseIfOnlyAWord.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def apply(name: String, opt_capitalize: Unit, opt_preserveCaseIfOnlyAWord: Boolean): String = (^.asInstanceOf[js.Dynamic].apply(name.asInstanceOf[js.Any], opt_capitalize.asInstanceOf[js.Any], opt_preserveCaseIfOnlyAWord.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @JSImport("@nginstack/engine/lib/string/nameToIdentifier", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
