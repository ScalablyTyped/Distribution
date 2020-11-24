package typings.minappEnv.wx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetUserInfoSuccessCallbackResult extends js.Object {
  
  /** 包括敏感数据在内的完整用户信息的加密数据，详见 [用户数据的签名验证和加解密]((signature#加密数据解密算法)) */
  var encryptedData: String = js.native
  
  /** 加密算法的初始向量，详见 [用户数据的签名验证和加解密]((signature#加密数据解密算法)) */
  var iv: String = js.native
  
  /** 不包括敏感信息的原始数据字符串，用于计算签名 */
  var rawData: String = js.native
  
  /** 使用 sha1( rawData + sessionkey ) 得到字符串，用于校验用户信息，详见 [用户数据的签名验证和加解密]((signature)) */
  var signature: String = js.native
  
  /** [UserInfo](https://developers.weixin.qq.com/miniprogram/dev/api/open-api/user-info/UserInfo.html)
    *
    * 用户信息对象，不包含 openid 等敏感信息 */
  var userInfo: UserInfo = js.native
}
object GetUserInfoSuccessCallbackResult {
  
  @scala.inline
  def apply(encryptedData: String, iv: String, rawData: String, signature: String, userInfo: UserInfo): GetUserInfoSuccessCallbackResult = {
    val __obj = js.Dynamic.literal(encryptedData = encryptedData.asInstanceOf[js.Any], iv = iv.asInstanceOf[js.Any], rawData = rawData.asInstanceOf[js.Any], signature = signature.asInstanceOf[js.Any], userInfo = userInfo.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetUserInfoSuccessCallbackResult]
  }
  
  @scala.inline
  implicit class GetUserInfoSuccessCallbackResultOps[Self <: GetUserInfoSuccessCallbackResult] (val x: Self) extends AnyVal {
    
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
    def setIv(value: String): Self = this.set("iv", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRawData(value: String): Self = this.set("rawData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSignature(value: String): Self = this.set("signature", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserInfo(value: UserInfo): Self = this.set("userInfo", value.asInstanceOf[js.Any])
  }
}
