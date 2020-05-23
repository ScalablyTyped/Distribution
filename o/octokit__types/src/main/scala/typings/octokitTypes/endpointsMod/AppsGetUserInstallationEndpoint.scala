package typings.octokitTypes.endpointsMod

import typings.octokitTypes.anon.`2`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined {  username  :string} & @octokit/types.@octokit/types/dist-types/generated/Endpoints.RequiredPreview<'machine-man'> */
trait AppsGetUserInstallationEndpoint extends js.Object {
  var mediaType: `2`
  var username: String
}

object AppsGetUserInstallationEndpoint {
  @scala.inline
  def apply(mediaType: `2`, username: String): AppsGetUserInstallationEndpoint = {
    val __obj = js.Dynamic.literal(mediaType = mediaType.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any])
    __obj.asInstanceOf[AppsGetUserInstallationEndpoint]
  }
}

