package typings.octokitTypes.endpointsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EnterpriseAdminProvisionAndInviteEnterpriseUserParamsName extends js.Object {
  var familyName: String = js.native
  var givenName: String = js.native
}

object EnterpriseAdminProvisionAndInviteEnterpriseUserParamsName {
  @scala.inline
  def apply(familyName: String, givenName: String): EnterpriseAdminProvisionAndInviteEnterpriseUserParamsName = {
    val __obj = js.Dynamic.literal(familyName = familyName.asInstanceOf[js.Any], givenName = givenName.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnterpriseAdminProvisionAndInviteEnterpriseUserParamsName]
  }
  @scala.inline
  implicit class EnterpriseAdminProvisionAndInviteEnterpriseUserParamsNameOps[Self <: EnterpriseAdminProvisionAndInviteEnterpriseUserParamsName] (val x: Self) extends AnyVal {
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
    def setFamilyName(value: String): Self = this.set("familyName", value.asInstanceOf[js.Any])
    @scala.inline
    def setGivenName(value: String): Self = this.set("givenName", value.asInstanceOf[js.Any])
  }
  
}

