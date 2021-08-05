package typings.minappEnv.wx

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** 小程序帐号信息 */
trait MiniProgram extends StObject {
  
  /** 小程序 appId */
  var appId: String
}
object MiniProgram {
  
  inline def apply(appId: String): MiniProgram = {
    val __obj = js.Dynamic.literal(appId = appId.asInstanceOf[js.Any])
    __obj.asInstanceOf[MiniProgram]
  }
  
  extension [Self <: MiniProgram](x: Self) {
    
    inline def setAppId(value: String): Self = StObject.set(x, "appId", value.asInstanceOf[js.Any])
  }
}
