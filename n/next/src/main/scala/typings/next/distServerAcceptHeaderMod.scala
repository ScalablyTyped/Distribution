package typings.next

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distServerAcceptHeaderMod {
  
  @JSImport("next/dist/server/accept-header", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def acceptLanguage(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("acceptLanguage")().asInstanceOf[String]
  inline def acceptLanguage(header: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("acceptLanguage")(header.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def acceptLanguage(header: String, preferences: js.Array[String]): String = (^.asInstanceOf[js.Dynamic].applyDynamic("acceptLanguage")(header.asInstanceOf[js.Any], preferences.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def acceptLanguage(header: Unit, preferences: js.Array[String]): String = (^.asInstanceOf[js.Dynamic].applyDynamic("acceptLanguage")(header.asInstanceOf[js.Any], preferences.asInstanceOf[js.Any])).asInstanceOf[String]
}
