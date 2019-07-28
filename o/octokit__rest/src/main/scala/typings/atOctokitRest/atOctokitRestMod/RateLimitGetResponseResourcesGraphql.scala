package typings.atOctokitRest.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RateLimitGetResponseResourcesGraphql extends js.Object {
  var limit: Double
  var remaining: Double
  var reset: Double
}

object RateLimitGetResponseResourcesGraphql {
  @scala.inline
  def apply(limit: Double, remaining: Double, reset: Double): RateLimitGetResponseResourcesGraphql = {
    val __obj = js.Dynamic.literal(limit = limit, remaining = remaining, reset = reset)
  
    __obj.asInstanceOf[RateLimitGetResponseResourcesGraphql]
  }
}

