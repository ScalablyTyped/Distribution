package typings.octokitTypes.endpointsMod

import typings.octokitTypes.anon.`8`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined {  project_id  :number,   name  :string} & @octokit/types.@octokit/types/dist-types/generated/Endpoints.RequiredPreview<'inertia'> */
trait ProjectsCreateColumnEndpoint extends js.Object {
  var mediaType: `8`
  /**
    * The name of the column.
    */
  var name: String
  var project_id: Double
}

object ProjectsCreateColumnEndpoint {
  @scala.inline
  def apply(mediaType: `8`, name: String, project_id: Double): ProjectsCreateColumnEndpoint = {
    val __obj = js.Dynamic.literal(mediaType = mediaType.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], project_id = project_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProjectsCreateColumnEndpoint]
  }
}

