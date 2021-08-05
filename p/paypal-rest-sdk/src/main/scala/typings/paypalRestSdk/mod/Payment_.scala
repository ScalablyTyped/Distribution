package typings.paypalRestSdk.mod

import typings.paypalRestSdk.anon.Cancelurl
import typings.paypalRestSdk.anon.Paymentmethod
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Payment_ extends StObject {
  
  val create_time: js.UndefOr[String] = js.undefined
  
  var experience_profile_id: js.UndefOr[String] = js.undefined
  
  val failure_reason: js.UndefOr[String] = js.undefined
  
  val id: js.UndefOr[String] = js.undefined
  
  var intent: String
  
  val links: js.UndefOr[js.Array[Link]] = js.undefined
  
  var note_to_payer: js.UndefOr[String] = js.undefined
  
  var payer: Paymentmethod
  
  var redirect_urls: js.UndefOr[Cancelurl] = js.undefined
  
  val state: js.UndefOr[String] = js.undefined
  
  var transactions: js.Array[Transaction]
  
  val update_time: js.UndefOr[String] = js.undefined
}
object Payment_ {
  
  inline def apply(intent: String, payer: Paymentmethod, transactions: js.Array[Transaction]): Payment_ = {
    val __obj = js.Dynamic.literal(intent = intent.asInstanceOf[js.Any], payer = payer.asInstanceOf[js.Any], transactions = transactions.asInstanceOf[js.Any])
    __obj.asInstanceOf[Payment_]
  }
  
  extension [Self <: Payment_](x: Self) {
    
    inline def setCreate_time(value: String): Self = StObject.set(x, "create_time", value.asInstanceOf[js.Any])
    
    inline def setCreate_timeUndefined: Self = StObject.set(x, "create_time", js.undefined)
    
    inline def setExperience_profile_id(value: String): Self = StObject.set(x, "experience_profile_id", value.asInstanceOf[js.Any])
    
    inline def setExperience_profile_idUndefined: Self = StObject.set(x, "experience_profile_id", js.undefined)
    
    inline def setFailure_reason(value: String): Self = StObject.set(x, "failure_reason", value.asInstanceOf[js.Any])
    
    inline def setFailure_reasonUndefined: Self = StObject.set(x, "failure_reason", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setIntent(value: String): Self = StObject.set(x, "intent", value.asInstanceOf[js.Any])
    
    inline def setLinks(value: js.Array[Link]): Self = StObject.set(x, "links", value.asInstanceOf[js.Any])
    
    inline def setLinksUndefined: Self = StObject.set(x, "links", js.undefined)
    
    inline def setLinksVarargs(value: Link*): Self = StObject.set(x, "links", js.Array(value :_*))
    
    inline def setNote_to_payer(value: String): Self = StObject.set(x, "note_to_payer", value.asInstanceOf[js.Any])
    
    inline def setNote_to_payerUndefined: Self = StObject.set(x, "note_to_payer", js.undefined)
    
    inline def setPayer(value: Paymentmethod): Self = StObject.set(x, "payer", value.asInstanceOf[js.Any])
    
    inline def setRedirect_urls(value: Cancelurl): Self = StObject.set(x, "redirect_urls", value.asInstanceOf[js.Any])
    
    inline def setRedirect_urlsUndefined: Self = StObject.set(x, "redirect_urls", js.undefined)
    
    inline def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
    
    inline def setTransactions(value: js.Array[Transaction]): Self = StObject.set(x, "transactions", value.asInstanceOf[js.Any])
    
    inline def setTransactionsVarargs(value: Transaction*): Self = StObject.set(x, "transactions", js.Array(value :_*))
    
    inline def setUpdate_time(value: String): Self = StObject.set(x, "update_time", value.asInstanceOf[js.Any])
    
    inline def setUpdate_timeUndefined: Self = StObject.set(x, "update_time", js.undefined)
  }
}
