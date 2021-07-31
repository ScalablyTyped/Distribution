package typings.mfiles

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IReportAccessCredentials extends StObject {
  
  val Domain: String
  
  val ExtAccount: Boolean
  
  val Password: String
  
  val UserName: String
}
object IReportAccessCredentials {
  
  @scala.inline
  def apply(Domain: String, ExtAccount: Boolean, Password: String, UserName: String): IReportAccessCredentials = {
    val __obj = js.Dynamic.literal(Domain = Domain.asInstanceOf[js.Any], ExtAccount = ExtAccount.asInstanceOf[js.Any], Password = Password.asInstanceOf[js.Any], UserName = UserName.asInstanceOf[js.Any])
    __obj.asInstanceOf[IReportAccessCredentials]
  }
  
  @scala.inline
  implicit class IReportAccessCredentialsMutableBuilder[Self <: IReportAccessCredentials] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDomain(value: String): Self = StObject.set(x, "Domain", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExtAccount(value: Boolean): Self = StObject.set(x, "ExtAccount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPassword(value: String): Self = StObject.set(x, "Password", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserName(value: String): Self = StObject.set(x, "UserName", value.asInstanceOf[js.Any])
  }
}
