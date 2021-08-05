package typings.nanoid

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object nonSecureGenerateMod {
  
  inline def apply(alphabet: String): String = ^.asInstanceOf[js.Dynamic].apply(alphabet.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def apply(alphabet: String, size: Double): String = (^.asInstanceOf[js.Dynamic].apply(alphabet.asInstanceOf[js.Any], size.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @JSImport("nanoid/non-secure/generate", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
