package typings.octokitPluginPaginateRest

import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object normalizePaginatedListResponseMod {
  
  @JSImport("@octokit/plugin-paginate-rest/dist-types/normalize-paginated-list-response", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def normalizePaginatedListResponse(response: OctokitResponse[js.Any]): OctokitResponse[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("normalizePaginatedListResponse")(response.asInstanceOf[js.Any]).asInstanceOf[OctokitResponse[js.Any]]
}
