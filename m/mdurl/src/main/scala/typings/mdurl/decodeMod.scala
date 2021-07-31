package typings.mdurl

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object decodeMod {
  
  @scala.inline
  def apply(input: String): String = ^.asInstanceOf[js.Dynamic].apply(input.asInstanceOf[js.Any]).asInstanceOf[String]
  @scala.inline
  def apply(input: String, exclude: String): String = (^.asInstanceOf[js.Dynamic].apply(input.asInstanceOf[js.Any], exclude.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @JSImport("mdurl/decode", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("mdurl/decode", "componentChars")
  @js.native
  val componentChars: String = js.native
  
  @JSImport("mdurl/decode", "defaultChars")
  @js.native
  val defaultChars: String = js.native
}
