package typings.next

import typings.std.URL
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSharedLibRouterUtilsRelativizeUrlMod {
  
  @JSImport("next/dist/shared/lib/router/utils/relativize-url", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def relativizeURL(url: String, base: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("relativizeURL")(url.asInstanceOf[js.Any], base.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def relativizeURL(url: String, base: URL): String = (^.asInstanceOf[js.Dynamic].applyDynamic("relativizeURL")(url.asInstanceOf[js.Any], base.asInstanceOf[js.Any])).asInstanceOf[String]
}
