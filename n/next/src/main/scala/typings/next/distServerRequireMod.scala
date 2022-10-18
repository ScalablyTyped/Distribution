package typings.next

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distServerRequireMod {
  
  @JSImport("next/dist/server/require", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getPagePath(page: String, distDir: String, serverless: Boolean): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getPagePath")(page.asInstanceOf[js.Any], distDir.asInstanceOf[js.Any], serverless.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def getPagePath(page: String, distDir: String, serverless: Boolean, dev: Boolean): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getPagePath")(page.asInstanceOf[js.Any], distDir.asInstanceOf[js.Any], serverless.asInstanceOf[js.Any], dev.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def getPagePath(page: String, distDir: String, serverless: Boolean, dev: Boolean, locales: js.Array[String]): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getPagePath")(page.asInstanceOf[js.Any], distDir.asInstanceOf[js.Any], serverless.asInstanceOf[js.Any], dev.asInstanceOf[js.Any], locales.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def getPagePath(
    page: String,
    distDir: String,
    serverless: Boolean,
    dev: Boolean,
    locales: js.Array[String],
    appDirEnabled: Boolean
  ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getPagePath")(page.asInstanceOf[js.Any], distDir.asInstanceOf[js.Any], serverless.asInstanceOf[js.Any], dev.asInstanceOf[js.Any], locales.asInstanceOf[js.Any], appDirEnabled.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def getPagePath(
    page: String,
    distDir: String,
    serverless: Boolean,
    dev: Boolean,
    locales: Unit,
    appDirEnabled: Boolean
  ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getPagePath")(page.asInstanceOf[js.Any], distDir.asInstanceOf[js.Any], serverless.asInstanceOf[js.Any], dev.asInstanceOf[js.Any], locales.asInstanceOf[js.Any], appDirEnabled.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def getPagePath(page: String, distDir: String, serverless: Boolean, dev: Unit, locales: js.Array[String]): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getPagePath")(page.asInstanceOf[js.Any], distDir.asInstanceOf[js.Any], serverless.asInstanceOf[js.Any], dev.asInstanceOf[js.Any], locales.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def getPagePath(
    page: String,
    distDir: String,
    serverless: Boolean,
    dev: Unit,
    locales: js.Array[String],
    appDirEnabled: Boolean
  ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getPagePath")(page.asInstanceOf[js.Any], distDir.asInstanceOf[js.Any], serverless.asInstanceOf[js.Any], dev.asInstanceOf[js.Any], locales.asInstanceOf[js.Any], appDirEnabled.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def getPagePath(
    page: String,
    distDir: String,
    serverless: Boolean,
    dev: Unit,
    locales: Unit,
    appDirEnabled: Boolean
  ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getPagePath")(page.asInstanceOf[js.Any], distDir.asInstanceOf[js.Any], serverless.asInstanceOf[js.Any], dev.asInstanceOf[js.Any], locales.asInstanceOf[js.Any], appDirEnabled.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def requireFontManifest(distDir: String, serverless: Boolean): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("requireFontManifest")(distDir.asInstanceOf[js.Any], serverless.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def requirePage(page: String, distDir: String, serverless: Boolean): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("requirePage")(page.asInstanceOf[js.Any], distDir.asInstanceOf[js.Any], serverless.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def requirePage(page: String, distDir: String, serverless: Boolean, appDirEnabled: Boolean): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("requirePage")(page.asInstanceOf[js.Any], distDir.asInstanceOf[js.Any], serverless.asInstanceOf[js.Any], appDirEnabled.asInstanceOf[js.Any])).asInstanceOf[Any]
}
