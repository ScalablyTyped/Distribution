package typings.minappEnv.wx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetWeRunDataSuccessCallbackResult extends js.Object {
  /** 包括敏感数据在内的完整用户信息的加密数据，详细见[加密数据解密算法]((signature))。解密后得到的数据结构见后文 */
  var encryptedData: String
  /** 加密算法的初始向量，详细见[加密数据解密算法]((signature)) */
  var iv: String
}

object GetWeRunDataSuccessCallbackResult {
  @scala.inline
  def apply(encryptedData: String, iv: String): GetWeRunDataSuccessCallbackResult = {
    val __obj = js.Dynamic.literal(encryptedData = encryptedData.asInstanceOf[js.Any], iv = iv.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GetWeRunDataSuccessCallbackResult]
  }
}

