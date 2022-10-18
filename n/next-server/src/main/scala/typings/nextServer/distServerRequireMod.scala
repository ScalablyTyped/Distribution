package typings.nextServer

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distServerRequireMod {
  
  @JSImport("next-server/dist/server/require", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getPagePath(page: String, distDir: String, serverless: Boolean): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getPagePath")(page.asInstanceOf[js.Any], distDir.asInstanceOf[js.Any], serverless.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def getPagePath(page: String, distDir: String, serverless: Boolean, dev: Boolean): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getPagePath")(page.asInstanceOf[js.Any], distDir.asInstanceOf[js.Any], serverless.asInstanceOf[js.Any], dev.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def pageNotFoundError(page: String): js.Error = ^.asInstanceOf[js.Dynamic].applyDynamic("pageNotFoundError")(page.asInstanceOf[js.Any]).asInstanceOf[js.Error]
  
  inline def requirePage(page: String, distDir: String, serverless: Boolean): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("requirePage")(page.asInstanceOf[js.Any], distDir.asInstanceOf[js.Any], serverless.asInstanceOf[js.Any])).asInstanceOf[Any]
}
