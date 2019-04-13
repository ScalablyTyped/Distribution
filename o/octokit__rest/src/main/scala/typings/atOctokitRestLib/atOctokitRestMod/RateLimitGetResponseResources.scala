package typings
package atOctokitRestLib.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RateLimitGetResponseResources extends js.Object {
  var core: RateLimitGetResponseResourcesCore
  var graphql: RateLimitGetResponseResourcesGraphql
  var integration_manifest: RateLimitGetResponseResourcesIntegrationManifest
  var search: RateLimitGetResponseResourcesSearch
}

object RateLimitGetResponseResources {
  @scala.inline
  def apply(
    core: RateLimitGetResponseResourcesCore,
    graphql: RateLimitGetResponseResourcesGraphql,
    integration_manifest: RateLimitGetResponseResourcesIntegrationManifest,
    search: RateLimitGetResponseResourcesSearch
  ): RateLimitGetResponseResources = {
    val __obj = js.Dynamic.literal(core = core, graphql = graphql, integration_manifest = integration_manifest, search = search)
  
    __obj.asInstanceOf[RateLimitGetResponseResources]
  }
}

