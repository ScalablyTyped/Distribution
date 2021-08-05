package typings.mdurl

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object encodeMod {
  
  inline def apply(str: String): String = ^.asInstanceOf[js.Dynamic].apply(str.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def apply(str: String, exclude: String): String = (^.asInstanceOf[js.Dynamic].apply(str.asInstanceOf[js.Any], exclude.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def apply(str: String, exclude: String, keepEscaped: Boolean): String = (^.asInstanceOf[js.Dynamic].apply(str.asInstanceOf[js.Any], exclude.asInstanceOf[js.Any], keepEscaped.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def apply(str: String, exclude: Unit, keepEscaped: Boolean): String = (^.asInstanceOf[js.Dynamic].apply(str.asInstanceOf[js.Any], exclude.asInstanceOf[js.Any], keepEscaped.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @JSImport("mdurl/encode", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("mdurl/encode", "componentChars")
  @js.native
  val componentChars: String = js.native
  
  @JSImport("mdurl/encode", "defaultChars")
  @js.native
  val defaultChars: String = js.native
}
