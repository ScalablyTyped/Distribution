package typings.octokitTypes.endpointsMod

import typings.octokitTypes.anon.`8`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined {  name  :string,   body ? :string} & @octokit/types.@octokit/types/dist-types/generated/Endpoints.RequiredPreview<'inertia'> */
trait ProjectsCreateForAuthenticatedUserEndpoint extends js.Object {
  /**
    * The description of the project.
    */
  var body: js.UndefOr[String] = js.undefined
  var mediaType: `8`
  /**
    * The name of the project.
    */
  var name: String
}

object ProjectsCreateForAuthenticatedUserEndpoint {
  @scala.inline
  def apply(mediaType: `8`, name: String, body: String = null): ProjectsCreateForAuthenticatedUserEndpoint = {
    val __obj = js.Dynamic.literal(mediaType = mediaType.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (body != null) __obj.updateDynamic("body")(body.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProjectsCreateForAuthenticatedUserEndpoint]
  }
}

