package typings.octokitTypes.endpointsMod

import typings.octokitTypes.anon.`8`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined {  owner  :string,   repo  :string,   name  :string,   body ? :string} & @octokit/types.@octokit/types/dist-types/generated/Endpoints.RequiredPreview<'inertia'> */
trait ProjectsCreateForRepoEndpoint extends js.Object {
  /**
    * The description of the project.
    */
  var body: js.UndefOr[String] = js.undefined
  var mediaType: `8`
  /**
    * The name of the project.
    */
  var name: String
  var owner: String
  var repo: String
}

object ProjectsCreateForRepoEndpoint {
  @scala.inline
  def apply(mediaType: `8`, name: String, owner: String, repo: String, body: String = null): ProjectsCreateForRepoEndpoint = {
    val __obj = js.Dynamic.literal(mediaType = mediaType.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any])
    if (body != null) __obj.updateDynamic("body")(body.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProjectsCreateForRepoEndpoint]
  }
}

