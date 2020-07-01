package typings.octokitTypes.endpointsMod

import typings.octokitTypes.anon.`8`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined {  org  :string,   team_slug  :string,   project_id  :number} & @octokit/types.@octokit/types/dist-types/generated/Endpoints.RequiredPreview<'inertia'> */
trait TeamsCheckPermissionsForProjectInOrgEndpoint extends js.Object {
  var mediaType: `8`
  @JSName("org")
  var org_ : String
  var project_id: Double
  var team_slug: String
}

object TeamsCheckPermissionsForProjectInOrgEndpoint {
  @scala.inline
  def apply(mediaType: `8`, org_ : String, project_id: Double, team_slug: String): TeamsCheckPermissionsForProjectInOrgEndpoint = {
    val __obj = js.Dynamic.literal(mediaType = mediaType.asInstanceOf[js.Any], project_id = project_id.asInstanceOf[js.Any], team_slug = team_slug.asInstanceOf[js.Any])
    __obj.updateDynamic("org")(org_.asInstanceOf[js.Any])
    __obj.asInstanceOf[TeamsCheckPermissionsForProjectInOrgEndpoint]
  }
}

