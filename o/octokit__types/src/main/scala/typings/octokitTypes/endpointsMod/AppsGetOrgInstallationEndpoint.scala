package typings.octokitTypes.endpointsMod

import typings.octokitTypes.anon.`2`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined {  org :string} & @octokit/types.@octokit/types/dist-types/generated/Endpoints.RequiredPreview<'machine-man'> */
@js.native
trait AppsGetOrgInstallationEndpoint extends js.Object {
  var mediaType: `2` = js.native
  @JSName("org")
  var org_ : String = js.native
}

object AppsGetOrgInstallationEndpoint {
  @scala.inline
  def apply(mediaType: `2`, org_ : String): AppsGetOrgInstallationEndpoint = {
    val __obj = js.Dynamic.literal(mediaType = mediaType.asInstanceOf[js.Any])
    __obj.updateDynamic("org")(org_.asInstanceOf[js.Any])
    __obj.asInstanceOf[AppsGetOrgInstallationEndpoint]
  }
  @scala.inline
  implicit class AppsGetOrgInstallationEndpointOps[Self <: AppsGetOrgInstallationEndpoint] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setMediaType(value: `2`): Self = this.set("mediaType", value.asInstanceOf[js.Any])
    @scala.inline
    def setOrg_(value: String): Self = this.set("org", value.asInstanceOf[js.Any])
  }
  
}

