package typings.plaidLink.mod.Plaid

import typings.plaidLink.anon.Institutionid
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OnSuccessMetaData extends js.Object {
  
  var accounts: js.Array[Account] = js.native
  
  var institution: Institutionid = js.native
  
  var link_session_id: String = js.native
}
object OnSuccessMetaData {
  
  @scala.inline
  def apply(accounts: js.Array[Account], institution: Institutionid, link_session_id: String): OnSuccessMetaData = {
    val __obj = js.Dynamic.literal(accounts = accounts.asInstanceOf[js.Any], institution = institution.asInstanceOf[js.Any], link_session_id = link_session_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnSuccessMetaData]
  }
  
  @scala.inline
  implicit class OnSuccessMetaDataOps[Self <: OnSuccessMetaData] (val x: Self) extends AnyVal {
    
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
    def setAccountsVarargs(value: Account*): Self = this.set("accounts", js.Array(value :_*))
    
    @scala.inline
    def setAccounts(value: js.Array[Account]): Self = this.set("accounts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstitution(value: Institutionid): Self = this.set("institution", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLink_session_id(value: String): Self = this.set("link_session_id", value.asInstanceOf[js.Any])
  }
}
