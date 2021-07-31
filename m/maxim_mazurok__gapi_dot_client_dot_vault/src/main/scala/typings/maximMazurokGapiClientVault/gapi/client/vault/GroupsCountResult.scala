package typings.maximMazurokGapiClientVault.gapi.client.vault

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GroupsCountResult extends StObject {
  
  /** Error occurred when querying these accounts. */
  var accountCountErrors: js.UndefOr[js.Array[AccountCountError]] = js.undefined
  
  /** Subtotal count per matching account that have more than zero messages. */
  var accountCounts: js.UndefOr[js.Array[AccountCount]] = js.undefined
  
  /** Total number of accounts that can be queried and have more than zero messages. */
  var matchingAccountsCount: js.UndefOr[String] = js.undefined
  
  /** When data scope is HELD_DATA in the request Query, these accounts in the request are not queried because they are not on hold. For other data scope, this field is not set. */
  var nonQueryableAccounts: js.UndefOr[js.Array[String]] = js.undefined
  
  /** Total number of accounts involved in this count operation. */
  var queriedAccountsCount: js.UndefOr[String] = js.undefined
}
object GroupsCountResult {
  
  @scala.inline
  def apply(): GroupsCountResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GroupsCountResult]
  }
  
  @scala.inline
  implicit class GroupsCountResultMutableBuilder[Self <: GroupsCountResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccountCountErrors(value: js.Array[AccountCountError]): Self = StObject.set(x, "accountCountErrors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccountCountErrorsUndefined: Self = StObject.set(x, "accountCountErrors", js.undefined)
    
    @scala.inline
    def setAccountCountErrorsVarargs(value: AccountCountError*): Self = StObject.set(x, "accountCountErrors", js.Array(value :_*))
    
    @scala.inline
    def setAccountCounts(value: js.Array[AccountCount]): Self = StObject.set(x, "accountCounts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccountCountsUndefined: Self = StObject.set(x, "accountCounts", js.undefined)
    
    @scala.inline
    def setAccountCountsVarargs(value: AccountCount*): Self = StObject.set(x, "accountCounts", js.Array(value :_*))
    
    @scala.inline
    def setMatchingAccountsCount(value: String): Self = StObject.set(x, "matchingAccountsCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMatchingAccountsCountUndefined: Self = StObject.set(x, "matchingAccountsCount", js.undefined)
    
    @scala.inline
    def setNonQueryableAccounts(value: js.Array[String]): Self = StObject.set(x, "nonQueryableAccounts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNonQueryableAccountsUndefined: Self = StObject.set(x, "nonQueryableAccounts", js.undefined)
    
    @scala.inline
    def setNonQueryableAccountsVarargs(value: String*): Self = StObject.set(x, "nonQueryableAccounts", js.Array(value :_*))
    
    @scala.inline
    def setQueriedAccountsCount(value: String): Self = StObject.set(x, "queriedAccountsCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQueriedAccountsCountUndefined: Self = StObject.set(x, "queriedAccountsCount", js.undefined)
  }
}
