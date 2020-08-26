package typings.octokitTypes.endpointsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EnterpriseAdminProvisionAndInviteEnterpriseGroupParamsMembers extends js.Object {
  var value: String = js.native
}

object EnterpriseAdminProvisionAndInviteEnterpriseGroupParamsMembers {
  @scala.inline
  def apply(value: String): EnterpriseAdminProvisionAndInviteEnterpriseGroupParamsMembers = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnterpriseAdminProvisionAndInviteEnterpriseGroupParamsMembers]
  }
  @scala.inline
  implicit class EnterpriseAdminProvisionAndInviteEnterpriseGroupParamsMembersOps[Self <: EnterpriseAdminProvisionAndInviteEnterpriseGroupParamsMembers] (val x: Self) extends AnyVal {
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
    def setValue(value: String): Self = this.set("value", value.asInstanceOf[js.Any])
  }
  
}

