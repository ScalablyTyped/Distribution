package typings.minappEnv.wx

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** 用户选中的发票列表 */
@js.native
trait InvoiceInfo extends StObject {
  
  /** 所选发票卡券的 cardId */
  var cardId: String = js.native
  
  /** 所选发票卡券的加密 code，报销方可以通过 cardId 和 encryptCode 获得报销发票的信息。 */
  var encryptCode: String = js.native
  
  /** 发票方的 appId */
  var publisherAppId: String = js.native
}
object InvoiceInfo {
  
  @scala.inline
  def apply(cardId: String, encryptCode: String, publisherAppId: String): InvoiceInfo = {
    val __obj = js.Dynamic.literal(cardId = cardId.asInstanceOf[js.Any], encryptCode = encryptCode.asInstanceOf[js.Any], publisherAppId = publisherAppId.asInstanceOf[js.Any])
    __obj.asInstanceOf[InvoiceInfo]
  }
  
  @scala.inline
  implicit class InvoiceInfoMutableBuilder[Self <: InvoiceInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCardId(value: String): Self = StObject.set(x, "cardId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEncryptCode(value: String): Self = StObject.set(x, "encryptCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPublisherAppId(value: String): Self = StObject.set(x, "publisherAppId", value.asInstanceOf[js.Any])
  }
}
