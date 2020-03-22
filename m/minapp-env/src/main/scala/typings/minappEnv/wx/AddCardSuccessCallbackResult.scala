package typings.minappEnv.wx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AddCardSuccessCallbackResult extends js.Object {
  /** 卡券添加结果列表 */
  var cardList: AddCardResponseInfo
}

object AddCardSuccessCallbackResult {
  @scala.inline
  def apply(cardList: AddCardResponseInfo): AddCardSuccessCallbackResult = {
    val __obj = js.Dynamic.literal(cardList = cardList.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AddCardSuccessCallbackResult]
  }
}

