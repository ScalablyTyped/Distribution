package typings.microsoftLiveConnect.anon

import typings.microsoftLiveConnect.Microsoft.Live.IPostalAddress
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Personal extends js.Object {
  
  /**
    * The user's business postal address.
    */
  var business: IPostalAddress = js.native
  
  /**
    * The user's personal postal address.
    */
  var personal: IPostalAddress = js.native
}
object Personal {
  
  @scala.inline
  def apply(business: IPostalAddress, personal: IPostalAddress): Personal = {
    val __obj = js.Dynamic.literal(business = business.asInstanceOf[js.Any], personal = personal.asInstanceOf[js.Any])
    __obj.asInstanceOf[Personal]
  }
  
  @scala.inline
  implicit class PersonalOps[Self <: Personal] (val x: Self) extends AnyVal {
    
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
    def setBusiness(value: IPostalAddress): Self = this.set("business", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPersonal(value: IPostalAddress): Self = this.set("personal", value.asInstanceOf[js.Any])
  }
}
