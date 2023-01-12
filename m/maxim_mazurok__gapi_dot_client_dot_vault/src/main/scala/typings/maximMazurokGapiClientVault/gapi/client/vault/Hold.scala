package typings.maximMazurokGapiClientVault.gapi.client.vault

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Hold extends StObject {
  
  /** If set, the hold applies to the specified accounts and **orgUnit** must be empty. */
  var accounts: js.UndefOr[js.Array[HeldAccount]] = js.undefined
  
  /** The service to be searched. */
  var corpus: js.UndefOr[String] = js.undefined
  
  /** The unique immutable ID of the hold. Assigned during creation. */
  var holdId: js.UndefOr[String] = js.undefined
  
  /** The name of the hold. */
  var name: js.UndefOr[String] = js.undefined
  
  /** If set, the hold applies to all members of the organizational unit and **accounts** must be empty. This property is mutable. For Groups holds, set **accounts**. */
  var orgUnit: js.UndefOr[HeldOrgUnit] = js.undefined
  
  /** Service-specific options. If set, **CorpusQuery** must match **CorpusType**. */
  var query: js.UndefOr[CorpusQuery] = js.undefined
  
  /** The last time this hold was modified. */
  var updateTime: js.UndefOr[String] = js.undefined
}
object Hold {
  
  inline def apply(): Hold = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Hold]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Hold] (val x: Self) extends AnyVal {
    
    inline def setAccounts(value: js.Array[HeldAccount]): Self = StObject.set(x, "accounts", value.asInstanceOf[js.Any])
    
    inline def setAccountsUndefined: Self = StObject.set(x, "accounts", js.undefined)
    
    inline def setAccountsVarargs(value: HeldAccount*): Self = StObject.set(x, "accounts", js.Array(value*))
    
    inline def setCorpus(value: String): Self = StObject.set(x, "corpus", value.asInstanceOf[js.Any])
    
    inline def setCorpusUndefined: Self = StObject.set(x, "corpus", js.undefined)
    
    inline def setHoldId(value: String): Self = StObject.set(x, "holdId", value.asInstanceOf[js.Any])
    
    inline def setHoldIdUndefined: Self = StObject.set(x, "holdId", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setOrgUnit(value: HeldOrgUnit): Self = StObject.set(x, "orgUnit", value.asInstanceOf[js.Any])
    
    inline def setOrgUnitUndefined: Self = StObject.set(x, "orgUnit", js.undefined)
    
    inline def setQuery(value: CorpusQuery): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
    
    inline def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
    
    inline def setUpdateTime(value: String): Self = StObject.set(x, "updateTime", value.asInstanceOf[js.Any])
    
    inline def setUpdateTimeUndefined: Self = StObject.set(x, "updateTime", js.undefined)
  }
}
