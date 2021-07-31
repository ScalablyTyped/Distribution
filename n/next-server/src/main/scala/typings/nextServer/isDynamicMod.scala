package typings.nextServer

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object isDynamicMod {
  
  @JSImport("next-server/dist/lib/router/utils/is-dynamic", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def isDynamicRoute(route: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isDynamicRoute")(route.asInstanceOf[js.Any]).asInstanceOf[Boolean]
}
