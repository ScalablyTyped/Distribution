package typings.next

import typings.node.urlMod.UrlObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSharedLibRouterUtilsFormatUrlMod {
  
  @JSImport("next/dist/shared/lib/router/utils/format-url", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def formatUrl(urlObj: UrlObject): String = ^.asInstanceOf[js.Dynamic].applyDynamic("formatUrl")(urlObj.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def formatWithValidation(url: UrlObject): String = ^.asInstanceOf[js.Dynamic].applyDynamic("formatWithValidation")(url.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @JSImport("next/dist/shared/lib/router/utils/format-url", "urlObjectKeys")
  @js.native
  val urlObjectKeys: js.Array[String] = js.native
}
