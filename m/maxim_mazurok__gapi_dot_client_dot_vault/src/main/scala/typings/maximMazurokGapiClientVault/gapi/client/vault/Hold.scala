package typings.maximMazurokGapiClientVault.gapi.client.vault

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Hold extends js.Object {
  
  /** If set, the hold applies to the enumerated accounts and org_unit must be empty. */
  var accounts: js.UndefOr[js.Array[HeldAccount]] = js.native
  
  /** The corpus to be searched. */
  var corpus: js.UndefOr[String] = js.native
  
  /** The unique immutable ID of the hold. Assigned during creation. */
  var holdId: js.UndefOr[String] = js.native
  
  /** The name of the hold. */
  var name: js.UndefOr[String] = js.native
  
  /** If set, the hold applies to all members of the organizational unit and accounts must be empty. This property is mutable. For groups holds, set the accounts field. */
  var orgUnit: js.UndefOr[HeldOrgUnit] = js.native
  
  /** The corpus-specific query. If set, the corpusQuery must match corpus type. */
  var query: js.UndefOr[CorpusQuery] = js.native
  
  /** The last time this hold was modified. */
  var updateTime: js.UndefOr[String] = js.native
}
object Hold {
  
  @scala.inline
  def apply(): Hold = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Hold]
  }
  
  @scala.inline
  implicit class HoldOps[Self <: Hold] (val x: Self) extends AnyVal {
    
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
    def setAccountsVarargs(value: HeldAccount*): Self = this.set("accounts", js.Array(value :_*))
    
    @scala.inline
    def setAccounts(value: js.Array[HeldAccount]): Self = this.set("accounts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAccounts: Self = this.set("accounts", js.undefined)
    
    @scala.inline
    def setCorpus(value: String): Self = this.set("corpus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCorpus: Self = this.set("corpus", js.undefined)
    
    @scala.inline
    def setHoldId(value: String): Self = this.set("holdId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHoldId: Self = this.set("holdId", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setOrgUnit(value: HeldOrgUnit): Self = this.set("orgUnit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOrgUnit: Self = this.set("orgUnit", js.undefined)
    
    @scala.inline
    def setQuery(value: CorpusQuery): Self = this.set("query", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteQuery: Self = this.set("query", js.undefined)
    
    @scala.inline
    def setUpdateTime(value: String): Self = this.set("updateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUpdateTime: Self = this.set("updateTime", js.undefined)
  }
}
