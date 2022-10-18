package typings.next

import typings.node.httpMod.IncomingMessage
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSharedLibI18nDetectLocaleCookieMod {
  
  @JSImport("next/dist/shared/lib/i18n/detect-locale-cookie", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def detectLocaleCookie(req: IncomingMessage, locales: js.Array[String]): js.UndefOr[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("detectLocaleCookie")(req.asInstanceOf[js.Any], locales.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[String]]
}
