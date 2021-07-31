package typings.plaidLink.mod.Plaid

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Institution extends StObject {
  
  var auth: Boolean
  
  var institution_id: String
  
  var name: String
  
  var transactions: Boolean
}
object Institution {
  
  @scala.inline
  def apply(auth: Boolean, institution_id: String, name: String, transactions: Boolean): Institution = {
    val __obj = js.Dynamic.literal(auth = auth.asInstanceOf[js.Any], institution_id = institution_id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], transactions = transactions.asInstanceOf[js.Any])
    __obj.asInstanceOf[Institution]
  }
  
  @scala.inline
  implicit class InstitutionMutableBuilder[Self <: Institution] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuth(value: Boolean): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstitution_id(value: String): Self = StObject.set(x, "institution_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransactions(value: Boolean): Self = StObject.set(x, "transactions", value.asInstanceOf[js.Any])
  }
}
