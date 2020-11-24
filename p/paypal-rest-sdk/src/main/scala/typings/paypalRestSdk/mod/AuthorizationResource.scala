package typings.paypalRestSdk.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AuthorizationResource extends Resource {
  
  val reference_id: js.UndefOr[String] = js.native
  
  @JSName("update_time")
  val update_time_AuthorizationResource: String = js.native
  
  val valid_until: String = js.native
}
object AuthorizationResource {
  
  @scala.inline
  def apply(amount: Amount, id: String, update_time: String, valid_until: String): AuthorizationResource = {
    val __obj = js.Dynamic.literal(amount = amount.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], update_time = update_time.asInstanceOf[js.Any], valid_until = valid_until.asInstanceOf[js.Any])
    __obj.asInstanceOf[AuthorizationResource]
  }
  
  @scala.inline
  implicit class AuthorizationResourceOps[Self <: AuthorizationResource] (val x: Self) extends AnyVal {
    
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
    def setUpdate_time(value: String): Self = this.set("update_time", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValid_until(value: String): Self = this.set("valid_until", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReference_id(value: String): Self = this.set("reference_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReference_id: Self = this.set("reference_id", js.undefined)
  }
}
