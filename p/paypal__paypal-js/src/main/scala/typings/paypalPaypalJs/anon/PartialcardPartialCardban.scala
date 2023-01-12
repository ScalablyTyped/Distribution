package typings.paypalPaypalJs.anon

import typings.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<{  card :std.Partial<@paypal/paypal-js.@paypal/paypal-js/types/apis/commons.Card>,   bank_account :{  id :string,   last_n_chars :string,   bank_name :string,   account_type :string | undefined,   country_code :string},   credit :{  id :string,   type :string | undefined},   balance :{  id :string | undefined}}> */
trait PartialcardPartialCardban extends StObject {
  
  var balance: js.UndefOr[`0`] = js.undefined
  
  var bank_account: js.UndefOr[Accounttype] = js.undefined
  
  var card: js.UndefOr[Partial[typings.paypalPaypalJs.typesApisCommonsMod.Card]] = js.undefined
  
  var credit: js.UndefOr[Id] = js.undefined
}
object PartialcardPartialCardban {
  
  inline def apply(): PartialcardPartialCardban = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialcardPartialCardban]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PartialcardPartialCardban] (val x: Self) extends AnyVal {
    
    inline def setBalance(value: `0`): Self = StObject.set(x, "balance", value.asInstanceOf[js.Any])
    
    inline def setBalanceUndefined: Self = StObject.set(x, "balance", js.undefined)
    
    inline def setBank_account(value: Accounttype): Self = StObject.set(x, "bank_account", value.asInstanceOf[js.Any])
    
    inline def setBank_accountUndefined: Self = StObject.set(x, "bank_account", js.undefined)
    
    inline def setCard(value: Partial[typings.paypalPaypalJs.typesApisCommonsMod.Card]): Self = StObject.set(x, "card", value.asInstanceOf[js.Any])
    
    inline def setCardUndefined: Self = StObject.set(x, "card", js.undefined)
    
    inline def setCredit(value: Id): Self = StObject.set(x, "credit", value.asInstanceOf[js.Any])
    
    inline def setCreditUndefined: Self = StObject.set(x, "credit", js.undefined)
  }
}
