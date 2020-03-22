package typings.minappEnv.wx

import typings.minappEnv.minappEnvNumbers.`-1`
import typings.minappEnv.minappEnvNumbers.`10001`
import typings.minappEnv.minappEnvNumbers.`10002`
import typings.minappEnv.minappEnvNumbers.`10003`
import typings.minappEnv.minappEnvNumbers.`10004`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InnerAudioContextOnErrorCallbackResult extends js.Object {
  /**
    *
    * 可选值：
    * - 10001: 系统错误;
    * - 10002: 网络错误;
    * - 10003: 文件错误;
    * - 10004: 格式错误;
    * - -1: 未知错误; */
  var errCode: `10001` | `10002` | `10003` | `10004` | `-1`
}

object InnerAudioContextOnErrorCallbackResult {
  @scala.inline
  def apply(errCode: `10001` | `10002` | `10003` | `10004` | `-1`): InnerAudioContextOnErrorCallbackResult = {
    val __obj = js.Dynamic.literal(errCode = errCode.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[InnerAudioContextOnErrorCallbackResult]
  }
}

