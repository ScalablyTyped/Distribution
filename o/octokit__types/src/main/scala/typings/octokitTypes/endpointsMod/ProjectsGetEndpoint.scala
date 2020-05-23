package typings.octokitTypes.endpointsMod

import typings.octokitTypes.anon.`8`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined {  project_id  :number} & @octokit/types.@octokit/types/dist-types/generated/Endpoints.RequiredPreview<'inertia'> */
trait ProjectsGetEndpoint extends js.Object {
  var mediaType: `8`
  var project_id: Double
}

object ProjectsGetEndpoint {
  @scala.inline
  def apply(mediaType: `8`, project_id: Double): ProjectsGetEndpoint = {
    val __obj = js.Dynamic.literal(mediaType = mediaType.asInstanceOf[js.Any], project_id = project_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProjectsGetEndpoint]
  }
}

