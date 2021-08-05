package typings.minappEnv.wx

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** 插件帐号信息（仅在插件中调用时包含这一项） */
trait Plugin extends StObject {
  
  /** 插件 appId */
  var appId: String
  
  /** 插件版本号 */
  var version: String
}
object Plugin {
  
  inline def apply(appId: String, version: String): Plugin = {
    val __obj = js.Dynamic.literal(appId = appId.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[Plugin]
  }
  
  extension [Self <: Plugin](x: Self) {
    
    inline def setAppId(value: String): Self = StObject.set(x, "appId", value.asInstanceOf[js.Any])
    
    inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
  }
}
