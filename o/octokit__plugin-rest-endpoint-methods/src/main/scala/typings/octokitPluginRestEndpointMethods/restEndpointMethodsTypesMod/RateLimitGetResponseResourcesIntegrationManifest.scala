package typings.octokitPluginRestEndpointMethods.restEndpointMethodsTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RateLimitGetResponseResourcesIntegrationManifest extends js.Object {
  var limit: Double
  var remaining: Double
  var reset: Double
}

object RateLimitGetResponseResourcesIntegrationManifest {
  @scala.inline
  def apply(limit: Double, remaining: Double, reset: Double): RateLimitGetResponseResourcesIntegrationManifest = {
    val __obj = js.Dynamic.literal(limit = limit.asInstanceOf[js.Any], remaining = remaining.asInstanceOf[js.Any], reset = reset.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[RateLimitGetResponseResourcesIntegrationManifest]
  }
}

