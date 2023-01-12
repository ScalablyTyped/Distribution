package typings.nodeBarion.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetAccountsRequest extends StObject {
  
  var Password: String
  
  var UserName: String
}
object GetAccountsRequest {
  
  inline def apply(Password: String, UserName: String): GetAccountsRequest = {
    val __obj = js.Dynamic.literal(Password = Password.asInstanceOf[js.Any], UserName = UserName.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetAccountsRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetAccountsRequest] (val x: Self) extends AnyVal {
    
    inline def setPassword(value: String): Self = StObject.set(x, "Password", value.asInstanceOf[js.Any])
    
    inline def setUserName(value: String): Self = StObject.set(x, "UserName", value.asInstanceOf[js.Any])
  }
}
