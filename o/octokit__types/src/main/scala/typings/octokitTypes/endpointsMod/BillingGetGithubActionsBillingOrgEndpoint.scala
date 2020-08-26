package typings.octokitTypes.endpointsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BillingGetGithubActionsBillingOrgEndpoint extends js.Object {
  @JSName("org")
  var org_ : String = js.native
}

object BillingGetGithubActionsBillingOrgEndpoint {
  @scala.inline
  def apply(org_ : String): BillingGetGithubActionsBillingOrgEndpoint = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("org")(org_.asInstanceOf[js.Any])
    __obj.asInstanceOf[BillingGetGithubActionsBillingOrgEndpoint]
  }
  @scala.inline
  implicit class BillingGetGithubActionsBillingOrgEndpointOps[Self <: BillingGetGithubActionsBillingOrgEndpoint] (val x: Self) extends AnyVal {
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
    def setOrg_(value: String): Self = this.set("org", value.asInstanceOf[js.Any])
  }
  
}

