package typings.octokitTypes.endpointsMod

import typings.octokitTypes.anon.`2`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined {  username :string} & @octokit/types.@octokit/types/dist-types/generated/Endpoints.RequiredPreview<'machine-man'> */
@js.native
trait AppsGetUserInstallationEndpoint extends js.Object {
  var mediaType: `2` = js.native
  var username: String = js.native
}

object AppsGetUserInstallationEndpoint {
  @scala.inline
  def apply(mediaType: `2`, username: String): AppsGetUserInstallationEndpoint = {
    val __obj = js.Dynamic.literal(mediaType = mediaType.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any])
    __obj.asInstanceOf[AppsGetUserInstallationEndpoint]
  }
  @scala.inline
  implicit class AppsGetUserInstallationEndpointOps[Self <: AppsGetUserInstallationEndpoint] (val x: Self) extends AnyVal {
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
    def setUsername(value: String): Self = this.set("username", value.asInstanceOf[js.Any])
  }
  
}

