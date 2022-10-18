package typings.next

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSharedLibRouterUtilsMod {
  
  @JSImport("next/dist/shared/lib/router/utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getSortedRoutes(normalizedPages: js.Array[String]): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getSortedRoutes")(normalizedPages.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
  
  inline def isDynamicRoute(route: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isDynamicRoute")(route.asInstanceOf[js.Any]).asInstanceOf[Boolean]
}
