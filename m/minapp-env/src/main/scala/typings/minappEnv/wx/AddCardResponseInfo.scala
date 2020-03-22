package typings.minappEnv.wx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** 卡券添加结果列表 */
trait AddCardResponseInfo extends js.Object {
  /** 卡券的扩展参数，结构请参考前文 */
  var cardExt: String
  /** 用户领取到卡券的 ID */
  var cardId: String
  /** 加密 code，为用户领取到卡券的code加密后的字符串，解密请参照：[code 解码接口](https://mp.weixin.qq.com/wiki?t=resource/res_main&id=mp1499332673_Unm7V) */
  var code: String
  /** 是否成功 */
  var isSuccess: Boolean
}

object AddCardResponseInfo {
  @scala.inline
  def apply(cardExt: String, cardId: String, code: String, isSuccess: Boolean): AddCardResponseInfo = {
    val __obj = js.Dynamic.literal(cardExt = cardExt.asInstanceOf[js.Any], cardId = cardId.asInstanceOf[js.Any], code = code.asInstanceOf[js.Any], isSuccess = isSuccess.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AddCardResponseInfo]
  }
}

