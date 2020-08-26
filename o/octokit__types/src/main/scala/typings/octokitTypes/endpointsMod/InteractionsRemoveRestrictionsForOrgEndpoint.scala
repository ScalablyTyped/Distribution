package typings.octokitTypes.endpointsMod

import typings.octokitTypes.anon.`6`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined {  org :string} & @octokit/types.@octokit/types/dist-types/generated/Endpoints.RequiredPreview<'sombra'> */
@js.native
trait InteractionsRemoveRestrictionsForOrgEndpoint extends js.Object {
  var mediaType: `6` = js.native
  @JSName("org")
  var org_ : String = js.native
}

object InteractionsRemoveRestrictionsForOrgEndpoint {
  @scala.inline
  def apply(mediaType: `6`, org_ : String): InteractionsRemoveRestrictionsForOrgEndpoint = {
    val __obj = js.Dynamic.literal(mediaType = mediaType.asInstanceOf[js.Any])
    __obj.updateDynamic("org")(org_.asInstanceOf[js.Any])
    __obj.asInstanceOf[InteractionsRemoveRestrictionsForOrgEndpoint]
  }
  @scala.inline
  implicit class InteractionsRemoveRestrictionsForOrgEndpointOps[Self <: InteractionsRemoveRestrictionsForOrgEndpoint] (val x: Self) extends AnyVal {
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
    def setMediaType(value: `6`): Self = this.set("mediaType", value.asInstanceOf[js.Any])
    @scala.inline
    def setOrg_(value: String): Self = this.set("org", value.asInstanceOf[js.Any])
  }
  
}

