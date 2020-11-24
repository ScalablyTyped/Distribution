package typings.minappEnv.wx

import typings.minappEnv.minappEnvNumbers.`-1`
import typings.minappEnv.minappEnvNumbers.`10001`
import typings.minappEnv.minappEnvNumbers.`10002`
import typings.minappEnv.minappEnvNumbers.`10003`
import typings.minappEnv.minappEnvNumbers.`10004`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InnerAudioContextOnErrorCallbackResult extends js.Object {
  
  /**
    *
    * 可选值：
    * - 10001: 系统错误;
    * - 10002: 网络错误;
    * - 10003: 文件错误;
    * - 10004: 格式错误;
    * - -1: 未知错误; */
  var errCode: `10001` | `10002` | `10003` | `10004` | `-1` = js.native
}
object InnerAudioContextOnErrorCallbackResult {
  
  @scala.inline
  def apply(errCode: `10001` | `10002` | `10003` | `10004` | `-1`): InnerAudioContextOnErrorCallbackResult = {
    val __obj = js.Dynamic.literal(errCode = errCode.asInstanceOf[js.Any])
    __obj.asInstanceOf[InnerAudioContextOnErrorCallbackResult]
  }
  
  @scala.inline
  implicit class InnerAudioContextOnErrorCallbackResultOps[Self <: InnerAudioContextOnErrorCallbackResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setErrCode(value: `10001` | `10002` | `10003` | `10004` | `-1`): Self = this.set("errCode", value.asInstanceOf[js.Any])
  }
}
