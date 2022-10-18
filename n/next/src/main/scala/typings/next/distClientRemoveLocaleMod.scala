package typings.next

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distClientRemoveLocaleMod {
  
  @JSImport("next/dist/client/remove-locale", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def removeLocale(path: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("removeLocale")(path.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def removeLocale(path: String, locale: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("removeLocale")(path.asInstanceOf[js.Any], locale.asInstanceOf[js.Any])).asInstanceOf[String]
}
