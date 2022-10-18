package typings.nextAuth

import typings.nextAuth.coreLibCookieMod.Cookie
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object nextUtilsMod {
  
  @JSImport("next-auth/next/utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def setCookie(res: Any, cookie: Cookie): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setCookie")(res.asInstanceOf[js.Any], cookie.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
