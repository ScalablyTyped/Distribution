package typings.minappEnv.wx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetUserInfoSuccessCallbackResult extends js.Object {
  /** 包括敏感数据在内的完整用户信息的加密数据，详见 [用户数据的签名验证和加解密]((signature#加密数据解密算法)) */
  var encryptedData: String
  /** 加密算法的初始向量，详见 [用户数据的签名验证和加解密]((signature#加密数据解密算法)) */
  var iv: String
  /** 不包括敏感信息的原始数据字符串，用于计算签名 */
  var rawData: String
  /** 使用 sha1( rawData + sessionkey ) 得到字符串，用于校验用户信息，详见 [用户数据的签名验证和加解密]((signature)) */
  var signature: String
  /** [UserInfo](https://developers.weixin.qq.com/miniprogram/dev/api/open-api/user-info/UserInfo.html)
    *
    * 用户信息对象，不包含 openid 等敏感信息 */
  var userInfo: UserInfo
}

object GetUserInfoSuccessCallbackResult {
  @scala.inline
  def apply(encryptedData: String, iv: String, rawData: String, signature: String, userInfo: UserInfo): GetUserInfoSuccessCallbackResult = {
    val __obj = js.Dynamic.literal(encryptedData = encryptedData.asInstanceOf[js.Any], iv = iv.asInstanceOf[js.Any], rawData = rawData.asInstanceOf[js.Any], signature = signature.asInstanceOf[js.Any], userInfo = userInfo.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GetUserInfoSuccessCallbackResult]
  }
}

