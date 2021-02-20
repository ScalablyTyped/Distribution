package typings.minappEnv.wx

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AddCardSuccessCallbackResult extends StObject {
  
  /** 卡券添加结果列表 */
  var cardList: AddCardResponseInfo = js.native
}
object AddCardSuccessCallbackResult {
  
  @scala.inline
  def apply(cardList: AddCardResponseInfo): AddCardSuccessCallbackResult = {
    val __obj = js.Dynamic.literal(cardList = cardList.asInstanceOf[js.Any])
    __obj.asInstanceOf[AddCardSuccessCallbackResult]
  }
  
  @scala.inline
  implicit class AddCardSuccessCallbackResultMutableBuilder[Self <: AddCardSuccessCallbackResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCardList(value: AddCardResponseInfo): Self = StObject.set(x, "cardList", value.asInstanceOf[js.Any])
  }
}
