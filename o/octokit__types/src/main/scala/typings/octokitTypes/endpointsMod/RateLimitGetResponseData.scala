package typings.octokitTypes.endpointsMod

import typings.octokitTypes.anon.Core
import typings.octokitTypes.anon.Limit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RateLimitGetResponseData extends js.Object {
  var rate: Limit
  var resources: Core
}

object RateLimitGetResponseData {
  @scala.inline
  def apply(rate: Limit, resources: Core): RateLimitGetResponseData = {
    val __obj = js.Dynamic.literal(rate = rate.asInstanceOf[js.Any], resources = resources.asInstanceOf[js.Any])
    __obj.asInstanceOf[RateLimitGetResponseData]
  }
}

