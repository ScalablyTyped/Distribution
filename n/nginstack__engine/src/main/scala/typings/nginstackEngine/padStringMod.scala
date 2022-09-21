package typings.nginstackEngine

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object padStringMod {
  
  inline def apply(content: String, size: Any): String = (^.asInstanceOf[js.Dynamic].apply(content.asInstanceOf[js.Any], size.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def apply(content: String, size: Any, align: String): String = (^.asInstanceOf[js.Dynamic].apply(content.asInstanceOf[js.Any], size.asInstanceOf[js.Any], align.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def apply(content: String, size: Any, align: String, padChar: String): String = (^.asInstanceOf[js.Dynamic].apply(content.asInstanceOf[js.Any], size.asInstanceOf[js.Any], align.asInstanceOf[js.Any], padChar.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def apply(content: String, size: Any, align: Unit, padChar: String): String = (^.asInstanceOf[js.Dynamic].apply(content.asInstanceOf[js.Any], size.asInstanceOf[js.Any], align.asInstanceOf[js.Any], padChar.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @JSImport("@nginstack/engine/lib/string/padString", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
