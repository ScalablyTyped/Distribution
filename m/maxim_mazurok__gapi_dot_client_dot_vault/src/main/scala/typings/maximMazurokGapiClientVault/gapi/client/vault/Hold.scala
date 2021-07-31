package typings.maximMazurokGapiClientVault.gapi.client.vault

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Hold extends StObject {
  
  /** If set, the hold applies to the enumerated accounts and org_unit must be empty. */
  var accounts: js.UndefOr[js.Array[HeldAccount]] = js.undefined
  
  /** The corpus to be searched. */
  var corpus: js.UndefOr[String] = js.undefined
  
  /** The unique immutable ID of the hold. Assigned during creation. */
  var holdId: js.UndefOr[String] = js.undefined
  
  /** The name of the hold. */
  var name: js.UndefOr[String] = js.undefined
  
  /** If set, the hold applies to all members of the organizational unit and accounts must be empty. This property is mutable. For groups holds, set the accounts field. */
  var orgUnit: js.UndefOr[HeldOrgUnit] = js.undefined
  
  /** The corpus-specific query. If set, the corpusQuery must match corpus type. */
  var query: js.UndefOr[CorpusQuery] = js.undefined
  
  /** The last time this hold was modified. */
  var updateTime: js.UndefOr[String] = js.undefined
}
object Hold {
  
  @scala.inline
  def apply(): Hold = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Hold]
  }
  
  @scala.inline
  implicit class HoldMutableBuilder[Self <: Hold] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccounts(value: js.Array[HeldAccount]): Self = StObject.set(x, "accounts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccountsUndefined: Self = StObject.set(x, "accounts", js.undefined)
    
    @scala.inline
    def setAccountsVarargs(value: HeldAccount*): Self = StObject.set(x, "accounts", js.Array(value :_*))
    
    @scala.inline
    def setCorpus(value: String): Self = StObject.set(x, "corpus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCorpusUndefined: Self = StObject.set(x, "corpus", js.undefined)
    
    @scala.inline
    def setHoldId(value: String): Self = StObject.set(x, "holdId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHoldIdUndefined: Self = StObject.set(x, "holdId", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setOrgUnit(value: HeldOrgUnit): Self = StObject.set(x, "orgUnit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrgUnitUndefined: Self = StObject.set(x, "orgUnit", js.undefined)
    
    @scala.inline
    def setQuery(value: CorpusQuery): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
    
    @scala.inline
    def setUpdateTime(value: String): Self = StObject.set(x, "updateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdateTimeUndefined: Self = StObject.set(x, "updateTime", js.undefined)
  }
}
