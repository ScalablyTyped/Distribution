package typings.octokitTypes.endpointsMod

import typings.octokitTypes.anon.`2`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined {  org  :string} & @octokit/types.@octokit/types/dist-types/generated/Endpoints.RequiredPreview<'machine-man'> */
trait AppsGetOrgInstallationEndpoint extends js.Object {
  var mediaType: `2`
  @JSName("org")
  var org_ : String
}

object AppsGetOrgInstallationEndpoint {
  @scala.inline
  def apply(mediaType: `2`, org_ : String): AppsGetOrgInstallationEndpoint = {
    val __obj = js.Dynamic.literal(mediaType = mediaType.asInstanceOf[js.Any])
    __obj.updateDynamic("org")(org_.asInstanceOf[js.Any])
    __obj.asInstanceOf[AppsGetOrgInstallationEndpoint]
  }
}

