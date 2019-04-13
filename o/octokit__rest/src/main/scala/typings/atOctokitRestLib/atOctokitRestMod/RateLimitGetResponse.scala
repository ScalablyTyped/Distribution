package typings
package atOctokitRestLib.atOctokitRestMod

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
    val __obj = js.Dynamic.literal(rate = rate, resources = resources)
  
    __obj.asInstanceOf[RateLimitGetResponse]
  }
}

