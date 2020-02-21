package typings.octokitRest.mod.Octokit

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
    val __obj = js.Dynamic.literal(core = core.asInstanceOf[js.Any], graphql = graphql.asInstanceOf[js.Any], integration_manifest = integration_manifest.asInstanceOf[js.Any], search = search.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[RateLimitGetResponseResources]
  }
}

