package typings.minappEnv.wx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** 需要打开的卡券列表 */
trait OpenCardRequestInfo extends js.Object {
  /** 卡券 ID */
  var cardId: String
  /** 由 [wx.addCard](https://developers.weixin.qq.com/miniprogram/dev/api/open-api/card/wx.addCard.html) 的返回对象中的加密 code 通过解密后得到，解密请参照：[code 解码接口](https://mp.weixin.qq.com/wiki?t=resource/res_main&id=mp1499332673_Unm7V) */
  var code: String
}

object OpenCardRequestInfo {
  @scala.inline
  def apply(cardId: String, code: String): OpenCardRequestInfo = {
    val __obj = js.Dynamic.literal(cardId = cardId.asInstanceOf[js.Any], code = code.asInstanceOf[js.Any])
    __obj.asInstanceOf[OpenCardRequestInfo]
  }
}

