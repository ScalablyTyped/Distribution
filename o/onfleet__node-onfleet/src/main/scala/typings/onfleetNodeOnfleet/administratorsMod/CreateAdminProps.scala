package typings.onfleetNodeOnfleet.administratorsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * @prop email - The administrator’s complete name.
  * @prop name - The administrator’s email address.
  * @prop phone - Optional. The administrator's phone number.
  * @prop isReadOnly - Optional. Whether this administrator can perform write operations.
  */
@js.native
trait CreateAdminProps extends js.Object {
  
  var email: String = js.native
  
  var isReadOnly: js.UndefOr[Boolean] = js.native
  
  var name: String = js.native
  
  var phone: js.UndefOr[String] = js.native
}
object CreateAdminProps {
  
  @scala.inline
  def apply(email: String, name: String): CreateAdminProps = {
    val __obj = js.Dynamic.literal(email = email.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateAdminProps]
  }
  
  @scala.inline
  implicit class CreateAdminPropsOps[Self <: CreateAdminProps] (val x: Self) extends AnyVal {
    
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
    def setEmail(value: String): Self = this.set("email", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsReadOnly(value: Boolean): Self = this.set("isReadOnly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsReadOnly: Self = this.set("isReadOnly", js.undefined)
    
    @scala.inline
    def setPhone(value: String): Self = this.set("phone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePhone: Self = this.set("phone", js.undefined)
  }
}
