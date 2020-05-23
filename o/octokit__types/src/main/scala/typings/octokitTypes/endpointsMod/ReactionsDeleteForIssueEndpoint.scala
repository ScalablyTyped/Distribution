package typings.octokitTypes.endpointsMod

import typings.octokitTypes.anon.`9`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined {  owner  :string,   repo  :string,   issue_number  :number,   reaction_id  :number} & @octokit/types.@octokit/types/dist-types/generated/Endpoints.RequiredPreview<'squirrel-girl'> */
trait ReactionsDeleteForIssueEndpoint extends js.Object {
  var issue_number: Double
  var mediaType: `9`
  var owner: String
  var reaction_id: Double
  var repo: String
}

object ReactionsDeleteForIssueEndpoint {
  @scala.inline
  def apply(issue_number: Double, mediaType: `9`, owner: String, reaction_id: Double, repo: String): ReactionsDeleteForIssueEndpoint = {
    val __obj = js.Dynamic.literal(issue_number = issue_number.asInstanceOf[js.Any], mediaType = mediaType.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], reaction_id = reaction_id.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReactionsDeleteForIssueEndpoint]
  }
}

