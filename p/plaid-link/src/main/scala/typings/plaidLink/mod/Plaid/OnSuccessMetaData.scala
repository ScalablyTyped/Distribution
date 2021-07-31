package typings.plaidLink.mod.Plaid

import typings.plaidLink.anon.Institutionid
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OnSuccessMetaData extends StObject {
  
  var accounts: js.Array[Account]
  
  var institution: Institutionid
  
  var link_session_id: String
}
object OnSuccessMetaData {
  
  @scala.inline
  def apply(accounts: js.Array[Account], institution: Institutionid, link_session_id: String): OnSuccessMetaData = {
    val __obj = js.Dynamic.literal(accounts = accounts.asInstanceOf[js.Any], institution = institution.asInstanceOf[js.Any], link_session_id = link_session_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnSuccessMetaData]
  }
  
  @scala.inline
  implicit class OnSuccessMetaDataMutableBuilder[Self <: OnSuccessMetaData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccounts(value: js.Array[Account]): Self = StObject.set(x, "accounts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccountsVarargs(value: Account*): Self = StObject.set(x, "accounts", js.Array(value :_*))
    
    @scala.inline
    def setInstitution(value: Institutionid): Self = StObject.set(x, "institution", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLink_session_id(value: String): Self = StObject.set(x, "link_session_id", value.asInstanceOf[js.Any])
  }
}
