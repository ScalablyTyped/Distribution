package typings.nginstackEngine

import typings.nginstackEngine.anon.Comment
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libCompressJsminMod {
  
  inline def apply(input: String): String = ^.asInstanceOf[js.Dynamic].apply(input.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def apply(input: String, opt_options: Comment): String = (^.asInstanceOf[js.Dynamic].apply(input.asInstanceOf[js.Any], opt_options.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @JSImport("@nginstack/engine/lib/compress/jsmin", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
