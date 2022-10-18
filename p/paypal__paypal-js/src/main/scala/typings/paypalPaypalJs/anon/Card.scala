package typings.paypalPaypalJs.anon

import typings.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Card extends StObject {
  
  /** The payment card used to fund the payment. Card can be a credit or debit card. */
  var card: js.UndefOr[Partial[typings.paypalPaypalJs.typesApisCommonsMod.Card]] = js.undefined
}
object Card {
  
  inline def apply(): Card = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Card]
  }
  
  extension [Self <: Card](x: Self) {
    
    inline def setCard(value: Partial[typings.paypalPaypalJs.typesApisCommonsMod.Card]): Self = StObject.set(x, "card", value.asInstanceOf[js.Any])
    
    inline def setCardUndefined: Self = StObject.set(x, "card", js.undefined)
  }
}
