package typings.maximMazurokGapiClientVault.gapi.client.vault

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MailCountResult extends js.Object {
  
  /** Error occurred when querying these accounts. */
  var accountCountErrors: js.UndefOr[js.Array[AccountCountError]] = js.native
  
  /** Subtotal count per matching account that have more than zero messages. */
  var accountCounts: js.UndefOr[js.Array[AccountCount]] = js.native
  
  /** Total number of accounts that can be queried and have more than zero messages. */
  var matchingAccountsCount: js.UndefOr[String] = js.native
  
  /** When data scope is HELD_DATA in the request Query, these accounts in the request are not queried because they are not on hold. For other data scope, this field is not set. */
  var nonQueryableAccounts: js.UndefOr[js.Array[String]] = js.native
  
  /** Total number of accounts involved in this count operation. */
  var queriedAccountsCount: js.UndefOr[String] = js.native
}
object MailCountResult {
  
  @scala.inline
  def apply(): MailCountResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MailCountResult]
  }
  
  @scala.inline
  implicit class MailCountResultOps[Self <: MailCountResult] (val x: Self) extends AnyVal {
    
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
    def setAccountCountErrorsVarargs(value: AccountCountError*): Self = this.set("accountCountErrors", js.Array(value :_*))
    
    @scala.inline
    def setAccountCountErrors(value: js.Array[AccountCountError]): Self = this.set("accountCountErrors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAccountCountErrors: Self = this.set("accountCountErrors", js.undefined)
    
    @scala.inline
    def setAccountCountsVarargs(value: AccountCount*): Self = this.set("accountCounts", js.Array(value :_*))
    
    @scala.inline
    def setAccountCounts(value: js.Array[AccountCount]): Self = this.set("accountCounts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAccountCounts: Self = this.set("accountCounts", js.undefined)
    
    @scala.inline
    def setMatchingAccountsCount(value: String): Self = this.set("matchingAccountsCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMatchingAccountsCount: Self = this.set("matchingAccountsCount", js.undefined)
    
    @scala.inline
    def setNonQueryableAccountsVarargs(value: String*): Self = this.set("nonQueryableAccounts", js.Array(value :_*))
    
    @scala.inline
    def setNonQueryableAccounts(value: js.Array[String]): Self = this.set("nonQueryableAccounts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNonQueryableAccounts: Self = this.set("nonQueryableAccounts", js.undefined)
    
    @scala.inline
    def setQueriedAccountsCount(value: String): Self = this.set("queriedAccountsCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteQueriedAccountsCount: Self = this.set("queriedAccountsCount", js.undefined)
  }
}
