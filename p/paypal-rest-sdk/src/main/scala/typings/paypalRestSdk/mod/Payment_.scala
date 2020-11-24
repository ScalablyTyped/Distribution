package typings.paypalRestSdk.mod

import typings.paypalRestSdk.anon.Cancelurl
import typings.paypalRestSdk.anon.Paymentmethod
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Payment_ extends js.Object {
  
  val create_time: js.UndefOr[String] = js.native
  
  var experience_profile_id: js.UndefOr[String] = js.native
  
  val failure_reason: js.UndefOr[String] = js.native
  
  val id: js.UndefOr[String] = js.native
  
  var intent: String = js.native
  
  val links: js.UndefOr[js.Array[Link]] = js.native
  
  var note_to_payer: js.UndefOr[String] = js.native
  
  var payer: Paymentmethod = js.native
  
  var redirect_urls: js.UndefOr[Cancelurl] = js.native
  
  val state: js.UndefOr[String] = js.native
  
  var transactions: js.Array[Transaction] = js.native
  
  val update_time: js.UndefOr[String] = js.native
}
object Payment_ {
  
  @scala.inline
  def apply(intent: String, payer: Paymentmethod, transactions: js.Array[Transaction]): Payment_ = {
    val __obj = js.Dynamic.literal(intent = intent.asInstanceOf[js.Any], payer = payer.asInstanceOf[js.Any], transactions = transactions.asInstanceOf[js.Any])
    __obj.asInstanceOf[Payment_]
  }
  
  @scala.inline
  implicit class Payment_Ops[Self <: Payment_] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setIntent(value: String): Self = this.set("intent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPayer(value: Paymentmethod): Self = this.set("payer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransactionsVarargs(value: Transaction*): Self = this.set("transactions", js.Array(value :_*))
    
    @scala.inline
    def setTransactions(value: js.Array[Transaction]): Self = this.set("transactions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreate_time(value: String): Self = this.set("create_time", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreate_time: Self = this.set("create_time", js.undefined)
    
    @scala.inline
    def setExperience_profile_id(value: String): Self = this.set("experience_profile_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExperience_profile_id: Self = this.set("experience_profile_id", js.undefined)
    
    @scala.inline
    def setFailure_reason(value: String): Self = this.set("failure_reason", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFailure_reason: Self = this.set("failure_reason", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    
    @scala.inline
    def setLinksVarargs(value: Link*): Self = this.set("links", js.Array(value :_*))
    
    @scala.inline
    def setLinks(value: js.Array[Link]): Self = this.set("links", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLinks: Self = this.set("links", js.undefined)
    
    @scala.inline
    def setNote_to_payer(value: String): Self = this.set("note_to_payer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNote_to_payer: Self = this.set("note_to_payer", js.undefined)
    
    @scala.inline
    def setRedirect_urls(value: Cancelurl): Self = this.set("redirect_urls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRedirect_urls: Self = this.set("redirect_urls", js.undefined)
    
    @scala.inline
    def setState(value: String): Self = this.set("state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteState: Self = this.set("state", js.undefined)
    
    @scala.inline
    def setUpdate_time(value: String): Self = this.set("update_time", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUpdate_time: Self = this.set("update_time", js.undefined)
  }
}
