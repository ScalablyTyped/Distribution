package typings.octokitRest.mod.Octokit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RateLimitGetResponse extends js.Object {
  var rate: RateLimitGetResponseRate
  var resources: RateLimitGetResponseResources
}

object RateLimitGetResponse {
  @scala.inline
  def apply(rate: RateLimitGetResponseRate, resources: RateLimitGetResponseResources): RateLimitGetResponse = {
    val __obj = js.Dynamic.literal(rate = rate.asInstanceOf[js.Any], resources = resources.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[RateLimitGetResponse]
  }
}

