package typings.ow

import typings.std.Map
import typings.std.Set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distUtilsGenerateArgumentErrorMessageMod {
  
  @JSImport("ow/dist/utils/generate-argument-error-message", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def generateArgumentErrorMessage(errors: Map[String, Set[String]]): String = ^.asInstanceOf[js.Dynamic].applyDynamic("generateArgumentErrorMessage")(errors.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def generateArgumentErrorMessage(errors: Map[String, Set[String]], isAny: Boolean): String = (^.asInstanceOf[js.Dynamic].applyDynamic("generateArgumentErrorMessage")(errors.asInstanceOf[js.Any], isAny.asInstanceOf[js.Any])).asInstanceOf[String]
}
