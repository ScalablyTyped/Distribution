package typings.octokitTypes.endpointsMod

import typings.octokitTypes.anon.`6`
import typings.octokitTypes.octokitTypesStrings.collaborators_only
import typings.octokitTypes.octokitTypesStrings.contributors_only
import typings.octokitTypes.octokitTypesStrings.existing_users
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined {  org :string,   limit :'existing_users' | 'contributors_only' | 'collaborators_only'} & @octokit/types.@octokit/types/dist-types/generated/Endpoints.RequiredPreview<'sombra'> */
@js.native
trait InteractionsSetRestrictionsForOrgEndpoint extends js.Object {
  /**
    * Specifies the group of GitHub users who can comment, open issues, or create pull requests in public repositories for the given organization. Must be one of: `existing_users`, `contributors_only`, or `collaborators_only`.
    */
  var limit: existing_users | contributors_only | collaborators_only = js.native
  var mediaType: `6` = js.native
  @JSName("org")
  var org_ : String = js.native
}

object InteractionsSetRestrictionsForOrgEndpoint {
  @scala.inline
  def apply(limit: existing_users | contributors_only | collaborators_only, mediaType: `6`, org_ : String): InteractionsSetRestrictionsForOrgEndpoint = {
    val __obj = js.Dynamic.literal(limit = limit.asInstanceOf[js.Any], mediaType = mediaType.asInstanceOf[js.Any])
    __obj.updateDynamic("org")(org_.asInstanceOf[js.Any])
    __obj.asInstanceOf[InteractionsSetRestrictionsForOrgEndpoint]
  }
  @scala.inline
  implicit class InteractionsSetRestrictionsForOrgEndpointOps[Self <: InteractionsSetRestrictionsForOrgEndpoint] (val x: Self) extends AnyVal {
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
    def setLimit(value: existing_users | contributors_only | collaborators_only): Self = this.set("limit", value.asInstanceOf[js.Any])
    @scala.inline
    def setMediaType(value: `6`): Self = this.set("mediaType", value.asInstanceOf[js.Any])
    @scala.inline
    def setOrg_(value: String): Self = this.set("org", value.asInstanceOf[js.Any])
  }
  
}

