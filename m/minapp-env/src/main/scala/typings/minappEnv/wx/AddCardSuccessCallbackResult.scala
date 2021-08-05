package typings.minappEnv.wx

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AddCardSuccessCallbackResult extends StObject {
  
  /** 卡券添加结果列表 */
  var cardList: AddCardResponseInfo
}
object AddCardSuccessCallbackResult {
  
  inline def apply(cardList: AddCardResponseInfo): AddCardSuccessCallbackResult = {
    val __obj = js.Dynamic.literal(cardList = cardList.asInstanceOf[js.Any])
    __obj.asInstanceOf[AddCardSuccessCallbackResult]
  }
  
  extension [Self <: AddCardSuccessCallbackResult](x: Self) {
    
    inline def setCardList(value: AddCardResponseInfo): Self = StObject.set(x, "cardList", value.asInstanceOf[js.Any])
  }
}
