package typings.oracleOraclejet

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ojthemeutilsMod {
  
  @JSImport("@oracle/oraclejet/ojthemeutils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def clearCache(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("clearCache")().asInstanceOf[Unit]
  
  inline def getThemeName(): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("getThemeName")().asInstanceOf[String | Null]
  
  inline def getThemeTargetPlatform(): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("getThemeTargetPlatform")().asInstanceOf[String | Null]
  
  inline def parseJSONFromFontFamily(selector: String): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("parseJSONFromFontFamily")(selector.asInstanceOf[js.Any]).asInstanceOf[js.Any]
}
