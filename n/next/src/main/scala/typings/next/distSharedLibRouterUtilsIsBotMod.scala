package typings.next

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSharedLibRouterUtilsIsBotMod {
  
  @JSImport("next/dist/shared/lib/router/utils/is-bot", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def isBot(userAgent: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isBot")(userAgent.asInstanceOf[js.Any]).asInstanceOf[Boolean]
}
