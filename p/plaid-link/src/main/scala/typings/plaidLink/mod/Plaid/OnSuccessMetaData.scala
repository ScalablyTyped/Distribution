package typings.plaidLink.mod.Plaid

import typings.plaidLink.anon.Name
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OnSuccessMetaData extends StObject {
  
  var accounts: js.Array[Account]
  
  var institution: Institution | Null
  
  var link_session_id: String
  
  var transfer_status: TransferStatus | Null
  
  var wallet: Name | Null
}
object OnSuccessMetaData {
  
  inline def apply(accounts: js.Array[Account], link_session_id: String): OnSuccessMetaData = {
    val __obj = js.Dynamic.literal(accounts = accounts.asInstanceOf[js.Any], link_session_id = link_session_id.asInstanceOf[js.Any], institution = null, transfer_status = null, wallet = null)
    __obj.asInstanceOf[OnSuccessMetaData]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OnSuccessMetaData] (val x: Self) extends AnyVal {
    
    inline def setAccounts(value: js.Array[Account]): Self = StObject.set(x, "accounts", value.asInstanceOf[js.Any])
    
    inline def setAccountsVarargs(value: Account*): Self = StObject.set(x, "accounts", js.Array(value*))
    
    inline def setInstitution(value: Institution): Self = StObject.set(x, "institution", value.asInstanceOf[js.Any])
    
    inline def setInstitutionNull: Self = StObject.set(x, "institution", null)
    
    inline def setLink_session_id(value: String): Self = StObject.set(x, "link_session_id", value.asInstanceOf[js.Any])
    
    inline def setTransfer_status(value: TransferStatus): Self = StObject.set(x, "transfer_status", value.asInstanceOf[js.Any])
    
    inline def setTransfer_statusNull: Self = StObject.set(x, "transfer_status", null)
    
    inline def setWallet(value: Name): Self = StObject.set(x, "wallet", value.asInstanceOf[js.Any])
    
    inline def setWalletNull: Self = StObject.set(x, "wallet", null)
  }
}
