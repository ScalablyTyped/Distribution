package typings.minappEnv.wx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetShareInfoSuccessCallbackResult extends js.Object {
  /** 包括敏感数据在内的完整转发信息的加密数据，详细见[加密数据解密算法]((开放数据校验与解密)) */
  var encryptedData: String = js.native
  /** 错误信息 */
  var errMsg: String = js.native
  /** 加密算法的初始向量，详细见[加密数据解密算法]((开放数据校验与解密)) */
  var iv: String = js.native
}

object GetShareInfoSuccessCallbackResult {
  @scala.inline
  def apply(encryptedData: String, errMsg: String, iv: String): GetShareInfoSuccessCallbackResult = {
    val __obj = js.Dynamic.literal(encryptedData = encryptedData.asInstanceOf[js.Any], errMsg = errMsg.asInstanceOf[js.Any], iv = iv.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetShareInfoSuccessCallbackResult]
  }
  @scala.inline
  implicit class GetShareInfoSuccessCallbackResultOps[Self <: GetShareInfoSuccessCallbackResult] (val x: Self) extends AnyVal {
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
    def setEncryptedData(value: String): Self = this.set("encryptedData", value.asInstanceOf[js.Any])
    @scala.inline
    def setErrMsg(value: String): Self = this.set("errMsg", value.asInstanceOf[js.Any])
    @scala.inline
    def setIv(value: String): Self = this.set("iv", value.asInstanceOf[js.Any])
  }
  
}

