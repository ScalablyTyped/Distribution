package typings.postmark.outboundMessageOpenMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ClientDetails extends js.Object {
  
  var Company: String = js.native
  
  var Family: String = js.native
  
  var Name: String = js.native
}
object ClientDetails {
  
  @scala.inline
  def apply(Company: String, Family: String, Name: String): ClientDetails = {
    val __obj = js.Dynamic.literal(Company = Company.asInstanceOf[js.Any], Family = Family.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClientDetails]
  }
  
  @scala.inline
  implicit class ClientDetailsOps[Self <: ClientDetails] (val x: Self) extends AnyVal {
    
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
    def setCompany(value: String): Self = this.set("Company", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFamily(value: String): Self = this.set("Family", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = this.set("Name", value.asInstanceOf[js.Any])
  }
}
