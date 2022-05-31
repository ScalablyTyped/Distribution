package typings.oracleOraclejet

import typings.oracleOraclejet.oracleOraclejetStrings.others
import typings.oracleOraclejet.oracleOraclejetStrings.phone
import typings.oracleOraclejet.oracleOraclejetStrings.tablet
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ojconfigMod {
  
  @JSImport("@oracle/oraclejet/ojconfig", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getAutomationMode(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getAutomationMode")().asInstanceOf[String]
  
  inline def getDeviceType(): phone | tablet | others = ^.asInstanceOf[js.Dynamic].applyDynamic("getDeviceType")().asInstanceOf[phone | tablet | others]
  
  inline def getLocale(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getLocale")().asInstanceOf[String]
  
  inline def getResourceUrl(relativePath: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getResourceUrl")(relativePath.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def getVersionInfo(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getVersionInfo")().asInstanceOf[String]
  
  inline def logVersionInfo(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("logVersionInfo")().asInstanceOf[Unit]
  
  inline def setAutomationMode(mode: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setAutomationMode")(mode.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def setLocale(locale: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setLocale")(locale.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def setLocale(locale: String, callback: js.Function0[Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setLocale")(locale.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def setResourceBaseUrl(baseUrl: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setResourceBaseUrl")(baseUrl.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
