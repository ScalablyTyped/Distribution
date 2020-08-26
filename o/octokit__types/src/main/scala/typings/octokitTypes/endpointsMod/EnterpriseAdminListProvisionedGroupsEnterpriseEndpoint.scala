package typings.octokitTypes.endpointsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EnterpriseAdminListProvisionedGroupsEnterpriseEndpoint extends js.Object {
  /**
    * Used for pagination: the number of results to return.
    */
  var count: js.UndefOr[Double] = js.native
  var enterprise: String = js.native
  /**
    * Used for pagination: the index of the first result to return.
    */
  var startIndex: js.UndefOr[Double] = js.native
}

object EnterpriseAdminListProvisionedGroupsEnterpriseEndpoint {
  @scala.inline
  def apply(enterprise: String): EnterpriseAdminListProvisionedGroupsEnterpriseEndpoint = {
    val __obj = js.Dynamic.literal(enterprise = enterprise.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnterpriseAdminListProvisionedGroupsEnterpriseEndpoint]
  }
  @scala.inline
  implicit class EnterpriseAdminListProvisionedGroupsEnterpriseEndpointOps[Self <: EnterpriseAdminListProvisionedGroupsEnterpriseEndpoint] (val x: Self) extends AnyVal {
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
    def setEnterprise(value: String): Self = this.set("enterprise", value.asInstanceOf[js.Any])
    @scala.inline
    def setCount(value: Double): Self = this.set("count", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCount: Self = this.set("count", js.undefined)
    @scala.inline
    def setStartIndex(value: Double): Self = this.set("startIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStartIndex: Self = this.set("startIndex", js.undefined)
  }
  
}

