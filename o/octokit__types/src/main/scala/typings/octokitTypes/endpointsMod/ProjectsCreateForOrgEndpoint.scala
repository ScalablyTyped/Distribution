package typings.octokitTypes.endpointsMod

import typings.octokitTypes.anon.`8`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined {  org  :string,   name  :string,   body ? :string} & @octokit/types.@octokit/types/dist-types/generated/Endpoints.RequiredPreview<'inertia'> */
trait ProjectsCreateForOrgEndpoint extends js.Object {
  /**
    * The description of the project.
    */
  var body: js.UndefOr[String] = js.undefined
  var mediaType: `8`
  /**
    * The name of the project.
    */
  var name: String
  @JSName("org")
  var org_ : String
}

object ProjectsCreateForOrgEndpoint {
  @scala.inline
  def apply(mediaType: `8`, name: String, org_ : String, body: String = null): ProjectsCreateForOrgEndpoint = {
    val __obj = js.Dynamic.literal(mediaType = mediaType.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("org")(org_.asInstanceOf[js.Any])
    if (body != null) __obj.updateDynamic("body")(body.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProjectsCreateForOrgEndpoint]
  }
}

