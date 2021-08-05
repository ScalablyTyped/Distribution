package typings.minappEnv.wx

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StopLocalServiceDiscoveryFailCallbackResult extends StObject {
  
  /** 错误信息
    *
    * 可选值：
    * - 'task not found': 在当前没有处在搜索服务中的情况下调用 stopLocalServiceDiscovery; */
  var errMsg: String
}
object StopLocalServiceDiscoveryFailCallbackResult {
  
  inline def apply(errMsg: String): StopLocalServiceDiscoveryFailCallbackResult = {
    val __obj = js.Dynamic.literal(errMsg = errMsg.asInstanceOf[js.Any])
    __obj.asInstanceOf[StopLocalServiceDiscoveryFailCallbackResult]
  }
  
  extension [Self <: StopLocalServiceDiscoveryFailCallbackResult](x: Self) {
    
    inline def setErrMsg(value: String): Self = StObject.set(x, "errMsg", value.asInstanceOf[js.Any])
  }
}
