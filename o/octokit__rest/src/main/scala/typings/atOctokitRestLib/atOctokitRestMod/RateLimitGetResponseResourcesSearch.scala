package typings
package atOctokitRestLib.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RateLimitGetResponseResourcesSearch extends js.Object {
  var limit: scala.Double
  var remaining: scala.Double
  var reset: scala.Double
}

object RateLimitGetResponseResourcesSearch {
  @scala.inline
  def apply(limit: scala.Double, remaining: scala.Double, reset: scala.Double): RateLimitGetResponseResourcesSearch = {
    val __obj = js.Dynamic.literal(limit = limit, remaining = remaining, reset = reset)
  
    __obj.asInstanceOf[RateLimitGetResponseResourcesSearch]
  }
}

