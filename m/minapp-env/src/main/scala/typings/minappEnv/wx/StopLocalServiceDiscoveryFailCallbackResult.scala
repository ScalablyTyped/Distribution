package typings.minappEnv.wx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StopLocalServiceDiscoveryFailCallbackResult extends js.Object {
  /** 错误信息
    *
    * 可选值：
    * - 'task not found': 在当前没有处在搜索服务中的情况下调用 stopLocalServiceDiscovery; */
  var errMsg: String
}

object StopLocalServiceDiscoveryFailCallbackResult {
  @scala.inline
  def apply(errMsg: String): StopLocalServiceDiscoveryFailCallbackResult = {
    val __obj = js.Dynamic.literal(errMsg = errMsg.asInstanceOf[js.Any])
    __obj.asInstanceOf[StopLocalServiceDiscoveryFailCallbackResult]
  }
}

