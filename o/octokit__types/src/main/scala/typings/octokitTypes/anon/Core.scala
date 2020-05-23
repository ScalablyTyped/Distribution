package typings.octokitTypes.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Core extends js.Object {
  var core: Limit
  var graphql: Limit
  var integration_manifest: Limit
  var search: Limit
}

object Core {
  @scala.inline
  def apply(core: Limit, graphql: Limit, integration_manifest: Limit, search: Limit): Core = {
    val __obj = js.Dynamic.literal(core = core.asInstanceOf[js.Any], graphql = graphql.asInstanceOf[js.Any], integration_manifest = integration_manifest.asInstanceOf[js.Any], search = search.asInstanceOf[js.Any])
    __obj.asInstanceOf[Core]
  }
}

