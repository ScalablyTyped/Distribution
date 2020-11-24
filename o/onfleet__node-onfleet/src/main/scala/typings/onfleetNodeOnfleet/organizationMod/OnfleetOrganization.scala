package typings.onfleetNodeOnfleet.organizationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OnfleetOrganization extends js.Object {
  
  var country: String = js.native
  
  var delegatees: js.Array[String] = js.native
  
  var email: String = js.native
  
  var id: String = js.native
  
  var image: String = js.native
  
  var name: String = js.native
  
  var timeCreated: Double = js.native
  
  var timeLastModified: Double = js.native
  
  var timezone: String = js.native
}
object OnfleetOrganization {
  
  @scala.inline
  def apply(
    country: String,
    delegatees: js.Array[String],
    email: String,
    id: String,
    image: String,
    name: String,
    timeCreated: Double,
    timeLastModified: Double,
    timezone: String
  ): OnfleetOrganization = {
    val __obj = js.Dynamic.literal(country = country.asInstanceOf[js.Any], delegatees = delegatees.asInstanceOf[js.Any], email = email.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], image = image.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], timeCreated = timeCreated.asInstanceOf[js.Any], timeLastModified = timeLastModified.asInstanceOf[js.Any], timezone = timezone.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnfleetOrganization]
  }
  
  @scala.inline
  implicit class OnfleetOrganizationOps[Self <: OnfleetOrganization] (val x: Self) extends AnyVal {
    
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
    def setCountry(value: String): Self = this.set("country", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDelegateesVarargs(value: String*): Self = this.set("delegatees", js.Array(value :_*))
    
    @scala.inline
    def setDelegatees(value: js.Array[String]): Self = this.set("delegatees", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmail(value: String): Self = this.set("email", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImage(value: String): Self = this.set("image", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeCreated(value: Double): Self = this.set("timeCreated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeLastModified(value: Double): Self = this.set("timeLastModified", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimezone(value: String): Self = this.set("timezone", value.asInstanceOf[js.Any])
  }
}
