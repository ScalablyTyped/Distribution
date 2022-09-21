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
  
  inline def apply(accounts: js.Array[Account], institution: Institutionid, link_session_id: String): OnSuccessMetaData = {
    val __obj = js.Dynamic.literal(accounts = accounts.asInstanceOf[js.Any], institution = institution.asInstanceOf[js.Any], link_session_id = link_session_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnSuccessMetaData]
  }
  
  extension [Self <: OnSuccessMetaData](x: Self) {
    
    inline def setAccounts(value: js.Array[Account]): Self = StObject.set(x, "accounts", value.asInstanceOf[js.Any])
    
    inline def setAccountsVarargs(value: Account*): Self = StObject.set(x, "accounts", js.Array(value*))
    
    inline def setInstitution(value: Institutionid): Self = StObject.set(x, "institution", value.asInstanceOf[js.Any])
    
    inline def setLink_session_id(value: String): Self = StObject.set(x, "link_session_id", value.asInstanceOf[js.Any])
  }
}
