package typings.nextServer

import typings.nextServer.anon.Groups
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object routeRegexMod {
  
  @JSImport("next-server/dist/lib/router/utils/route-regex", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getRouteRegex(normalizedRoute: String): Groups = ^.asInstanceOf[js.Dynamic].applyDynamic("getRouteRegex")(normalizedRoute.asInstanceOf[js.Any]).asInstanceOf[Groups]
}
