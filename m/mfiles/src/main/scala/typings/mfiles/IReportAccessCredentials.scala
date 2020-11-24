package typings.mfiles

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IReportAccessCredentials extends js.Object {
  
  val Domain: String = js.native
  
  val ExtAccount: Boolean = js.native
  
  val Password: String = js.native
  
  val UserName: String = js.native
}
object IReportAccessCredentials {
  
  @scala.inline
  def apply(Domain: String, ExtAccount: Boolean, Password: String, UserName: String): IReportAccessCredentials = {
    val __obj = js.Dynamic.literal(Domain = Domain.asInstanceOf[js.Any], ExtAccount = ExtAccount.asInstanceOf[js.Any], Password = Password.asInstanceOf[js.Any], UserName = UserName.asInstanceOf[js.Any])
    __obj.asInstanceOf[IReportAccessCredentials]
  }
  
  @scala.inline
  implicit class IReportAccessCredentialsOps[Self <: IReportAccessCredentials] (val x: Self) extends AnyVal {
    
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
    def setDomain(value: String): Self = this.set("Domain", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExtAccount(value: Boolean): Self = this.set("ExtAccount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPassword(value: String): Self = this.set("Password", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserName(value: String): Self = this.set("UserName", value.asInstanceOf[js.Any])
  }
}
