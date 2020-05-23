package typings.octokitTypes.endpointsMod

import typings.octokitTypes.anon.`6`
import typings.octokitTypes.octokitTypesStrings.collaborators_only
import typings.octokitTypes.octokitTypesStrings.contributors_only
import typings.octokitTypes.octokitTypesStrings.existing_users
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined {  org  :string,   limit  :'existing_users' | 'contributors_only' | 'collaborators_only'} & @octokit/types.@octokit/types/dist-types/generated/Endpoints.RequiredPreview<'sombra'> */
trait InteractionsAddOrUpdateRestrictionsForOrgEndpoint extends js.Object {
  /**
    * Specifies the group of GitHub users who can comment, open issues, or create pull requests in public repositories for the given organization. Must be one of: `existing_users`, `contributors_only`, or `collaborators_only`.
    */
  var limit: existing_users | contributors_only | collaborators_only
  var mediaType: `6`
  @JSName("org")
  var org_ : String
}

object InteractionsAddOrUpdateRestrictionsForOrgEndpoint {
  @scala.inline
  def apply(limit: existing_users | contributors_only | collaborators_only, mediaType: `6`, org_ : String): InteractionsAddOrUpdateRestrictionsForOrgEndpoint = {
    val __obj = js.Dynamic.literal(limit = limit.asInstanceOf[js.Any], mediaType = mediaType.asInstanceOf[js.Any])
    __obj.updateDynamic("org")(org_.asInstanceOf[js.Any])
    __obj.asInstanceOf[InteractionsAddOrUpdateRestrictionsForOrgEndpoint]
  }
}

