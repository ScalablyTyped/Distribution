package typings.octokitPluginRestEndpointMethods.restEndpointMethodsTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SearchReposLegacyResponse extends js.Object {
  var repositories: js.Array[SearchReposLegacyResponseRepositoriesItem]
}

object SearchReposLegacyResponse {
  @scala.inline
  def apply(repositories: js.Array[SearchReposLegacyResponseRepositoriesItem]): SearchReposLegacyResponse = {
    val __obj = js.Dynamic.literal(repositories = repositories.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[SearchReposLegacyResponse]
  }
}

