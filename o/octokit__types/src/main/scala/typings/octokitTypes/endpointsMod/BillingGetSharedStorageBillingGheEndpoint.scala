package typings.octokitTypes.endpointsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BillingGetSharedStorageBillingGheEndpoint extends js.Object {
  /**
    * Unique identifier of the GitHub Enterprise Cloud instance.
    */
  var enterprise_id: Double = js.native
}

object BillingGetSharedStorageBillingGheEndpoint {
  @scala.inline
  def apply(enterprise_id: Double): BillingGetSharedStorageBillingGheEndpoint = {
    val __obj = js.Dynamic.literal(enterprise_id = enterprise_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[BillingGetSharedStorageBillingGheEndpoint]
  }
  @scala.inline
  implicit class BillingGetSharedStorageBillingGheEndpointOps[Self <: BillingGetSharedStorageBillingGheEndpoint] (val x: Self) extends AnyVal {
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
    def setEnterprise_id(value: Double): Self = this.set("enterprise_id", value.asInstanceOf[js.Any])
  }
  
}

