package typings.octokitTypes.endpointsMod

import typings.octokitTypes.anon.Core
import typings.octokitTypes.anon.Limit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RateLimitGetResponseData extends js.Object {
  var rate: Limit = js.native
  var resources: Core = js.native
}

object RateLimitGetResponseData {
  @scala.inline
  def apply(rate: Limit, resources: Core): RateLimitGetResponseData = {
    val __obj = js.Dynamic.literal(rate = rate.asInstanceOf[js.Any], resources = resources.asInstanceOf[js.Any])
    __obj.asInstanceOf[RateLimitGetResponseData]
  }
  @scala.inline
  implicit class RateLimitGetResponseDataOps[Self <: RateLimitGetResponseData] (val x: Self) extends AnyVal {
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
    def setRate(value: Limit): Self = this.set("rate", value.asInstanceOf[js.Any])
    @scala.inline
    def setResources(value: Core): Self = this.set("resources", value.asInstanceOf[js.Any])
  }
  
}

