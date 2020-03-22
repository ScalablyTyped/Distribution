package typings.minappEnv.wx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** 需要添加的卡券列表 */
trait AddCardRequestInfo extends js.Object {
  /** 卡券的扩展参数。需进行 JSON 序列化为**字符串**传入 */
  var cardExt: CardExt
  /** 卡券 ID */
  var cardId: String
}

object AddCardRequestInfo {
  @scala.inline
  def apply(cardExt: CardExt, cardId: String): AddCardRequestInfo = {
    val __obj = js.Dynamic.literal(cardExt = cardExt.asInstanceOf[js.Any], cardId = cardId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AddCardRequestInfo]
  }
}

