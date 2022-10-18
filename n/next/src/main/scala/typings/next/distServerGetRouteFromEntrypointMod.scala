package typings.next

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distServerGetRouteFromEntrypointMod {
  
  @JSImport("next/dist/server/get-route-from-entrypoint", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(entryFile: String): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(entryFile.asInstanceOf[js.Any]).asInstanceOf[String | Null]
  inline def default(entryFile: String, app: Boolean): String | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(entryFile.asInstanceOf[js.Any], app.asInstanceOf[js.Any])).asInstanceOf[String | Null]
}
