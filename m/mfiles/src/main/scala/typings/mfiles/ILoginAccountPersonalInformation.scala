package typings.mfiles

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ILoginAccountPersonalInformation extends StObject {
  
  val AccountName: String = js.native
  
  val Email: String = js.native
  
  val FullName: String = js.native
}
object ILoginAccountPersonalInformation {
  
  @scala.inline
  def apply(AccountName: String, Email: String, FullName: String): ILoginAccountPersonalInformation = {
    val __obj = js.Dynamic.literal(AccountName = AccountName.asInstanceOf[js.Any], Email = Email.asInstanceOf[js.Any], FullName = FullName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ILoginAccountPersonalInformation]
  }
  
  @scala.inline
  implicit class ILoginAccountPersonalInformationMutableBuilder[Self <: ILoginAccountPersonalInformation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccountName(value: String): Self = StObject.set(x, "AccountName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmail(value: String): Self = StObject.set(x, "Email", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFullName(value: String): Self = StObject.set(x, "FullName", value.asInstanceOf[js.Any])
  }
}
