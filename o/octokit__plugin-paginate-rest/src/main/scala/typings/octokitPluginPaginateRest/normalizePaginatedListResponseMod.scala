package typings.octokitPluginPaginateRest

import typings.octokitCore.mod.Octokit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@octokit/plugin-paginate-rest/dist-types/normalize-paginated-list-response", JSImport.Namespace)
@js.native
object normalizePaginatedListResponseMod extends js.Object {
  def normalizePaginatedListResponse(
    octokit: Octokit,
    url: String,
    response: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitResponse<any> */ js.Any
  ): Unit = js.native
}

