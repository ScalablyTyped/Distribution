package typings.octokitTypes.endpointsMod

import typings.octokitTypes.anon.`8`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined {  column_id  :number} & @octokit/types.@octokit/types/dist-types/generated/Endpoints.RequiredPreview<'inertia'> */
trait ProjectsDeleteColumnEndpoint extends js.Object {
  var column_id: Double
  var mediaType: `8`
}

object ProjectsDeleteColumnEndpoint {
  @scala.inline
  def apply(column_id: Double, mediaType: `8`): ProjectsDeleteColumnEndpoint = {
    val __obj = js.Dynamic.literal(column_id = column_id.asInstanceOf[js.Any], mediaType = mediaType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProjectsDeleteColumnEndpoint]
  }
}

