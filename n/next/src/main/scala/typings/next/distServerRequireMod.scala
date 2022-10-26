package typings.next

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distServerRequireMod {
  
  @JSImport("next/dist/server/require", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getMaybePagePath(page: String, distDir: String): String | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("getMaybePagePath")(page.asInstanceOf[js.Any], distDir.asInstanceOf[js.Any])).asInstanceOf[String | Null]
  inline def getMaybePagePath(page: String, distDir: String, locales: js.Array[String]): String | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("getMaybePagePath")(page.asInstanceOf[js.Any], distDir.asInstanceOf[js.Any], locales.asInstanceOf[js.Any])).asInstanceOf[String | Null]
  inline def getMaybePagePath(page: String, distDir: String, locales: js.Array[String], appDirEnabled: Boolean): String | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("getMaybePagePath")(page.asInstanceOf[js.Any], distDir.asInstanceOf[js.Any], locales.asInstanceOf[js.Any], appDirEnabled.asInstanceOf[js.Any])).asInstanceOf[String | Null]
  inline def getMaybePagePath(page: String, distDir: String, locales: Unit, appDirEnabled: Boolean): String | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("getMaybePagePath")(page.asInstanceOf[js.Any], distDir.asInstanceOf[js.Any], locales.asInstanceOf[js.Any], appDirEnabled.asInstanceOf[js.Any])).asInstanceOf[String | Null]
  
  inline def getPagePath(page: String, distDir: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getPagePath")(page.asInstanceOf[js.Any], distDir.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def getPagePath(page: String, distDir: String, locales: js.Array[String]): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getPagePath")(page.asInstanceOf[js.Any], distDir.asInstanceOf[js.Any], locales.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def getPagePath(page: String, distDir: String, locales: js.Array[String], appDirEnabled: Boolean): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getPagePath")(page.asInstanceOf[js.Any], distDir.asInstanceOf[js.Any], locales.asInstanceOf[js.Any], appDirEnabled.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def getPagePath(page: String, distDir: String, locales: Unit, appDirEnabled: Boolean): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getPagePath")(page.asInstanceOf[js.Any], distDir.asInstanceOf[js.Any], locales.asInstanceOf[js.Any], appDirEnabled.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def requireFontManifest(distDir: String): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("requireFontManifest")(distDir.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  inline def requirePage(page: String, distDir: String): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("requirePage")(page.asInstanceOf[js.Any], distDir.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def requirePage(page: String, distDir: String, appDirEnabled: Boolean): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("requirePage")(page.asInstanceOf[js.Any], distDir.asInstanceOf[js.Any], appDirEnabled.asInstanceOf[js.Any])).asInstanceOf[Any]
}
