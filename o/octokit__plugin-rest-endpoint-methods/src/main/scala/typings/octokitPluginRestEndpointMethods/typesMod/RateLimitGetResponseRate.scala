package typings.octokitPluginRestEndpointMethods.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RateLimitGetResponseRate extends js.Object {
  var limit: Double
  var remaining: Double
  var reset: Double
}

object RateLimitGetResponseRate {
  @scala.inline
  def apply(limit: Double, remaining: Double, reset: Double): RateLimitGetResponseRate = {
    val __obj = js.Dynamic.literal(limit = limit.asInstanceOf[js.Any], remaining = remaining.asInstanceOf[js.Any], reset = reset.asInstanceOf[js.Any])
    __obj.asInstanceOf[RateLimitGetResponseRate]
  }
}

