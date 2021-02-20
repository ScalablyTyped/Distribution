package typings.minappEnv.wx

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StartLocalServiceDiscoveryFailCallbackResult extends StObject {
  
  /** 错误信息
    *
    * 可选值：
    * - 'invalid param': serviceType 为空;
    * - 'scan task already exist': 在当前 startLocalServiceDiscovery 发起的搜索未停止的情况下，再次调用 startLocalServiceDiscovery; */
  var errMsg: String = js.native
}
object StartLocalServiceDiscoveryFailCallbackResult {
  
  @scala.inline
  def apply(errMsg: String): StartLocalServiceDiscoveryFailCallbackResult = {
    val __obj = js.Dynamic.literal(errMsg = errMsg.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartLocalServiceDiscoveryFailCallbackResult]
  }
  
  @scala.inline
  implicit class StartLocalServiceDiscoveryFailCallbackResultMutableBuilder[Self <: StartLocalServiceDiscoveryFailCallbackResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setErrMsg(value: String): Self = StObject.set(x, "errMsg", value.asInstanceOf[js.Any])
  }
}
