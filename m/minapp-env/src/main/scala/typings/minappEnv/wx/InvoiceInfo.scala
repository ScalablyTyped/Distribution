package typings.minappEnv.wx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** 用户选中的发票列表 */
trait InvoiceInfo extends js.Object {
  /** 所选发票卡券的 cardId */
  var cardId: String
  /** 所选发票卡券的加密 code，报销方可以通过 cardId 和 encryptCode 获得报销发票的信息。 */
  var encryptCode: String
  /** 发票方的 appId */
  var publisherAppId: String
}

object InvoiceInfo {
  @scala.inline
  def apply(cardId: String, encryptCode: String, publisherAppId: String): InvoiceInfo = {
    val __obj = js.Dynamic.literal(cardId = cardId.asInstanceOf[js.Any], encryptCode = encryptCode.asInstanceOf[js.Any], publisherAppId = publisherAppId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[InvoiceInfo]
  }
}

