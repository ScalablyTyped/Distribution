package typings.octokitTypes.endpointsMod

import typings.octokitTypes.anon.`6`
import typings.octokitTypes.octokitTypesStrings.collaborators_only
import typings.octokitTypes.octokitTypesStrings.contributors_only
import typings.octokitTypes.octokitTypesStrings.existing_users
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined {  owner  :string,   repo  :string,   limit  :'existing_users' | 'contributors_only' | 'collaborators_only'} & @octokit/types.@octokit/types/dist-types/generated/Endpoints.RequiredPreview<'sombra'> */
trait InteractionsAddOrUpdateRestrictionsForRepoEndpoint extends js.Object {
  /**
    * Specifies the group of GitHub users who can comment, open issues, or create pull requests for the given repository. Must be one of: `existing_users`, `contributors_only`, or `collaborators_only`.
    */
  var limit: existing_users | contributors_only | collaborators_only
  var mediaType: `6`
  var owner: String
  var repo: String
}

object InteractionsAddOrUpdateRestrictionsForRepoEndpoint {
  @scala.inline
  def apply(
    limit: existing_users | contributors_only | collaborators_only,
    mediaType: `6`,
    owner: String,
    repo: String
  ): InteractionsAddOrUpdateRestrictionsForRepoEndpoint = {
    val __obj = js.Dynamic.literal(limit = limit.asInstanceOf[js.Any], mediaType = mediaType.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any])
    __obj.asInstanceOf[InteractionsAddOrUpdateRestrictionsForRepoEndpoint]
  }
}

