package typings.octokitTypes.endpointsMod

import typings.octokitTypes.anon.`9`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined {  owner  :string,   repo  :string,   comment_id  :number,   reaction_id  :number} & @octokit/types.@octokit/types/dist-types/generated/Endpoints.RequiredPreview<'squirrel-girl'> */
trait ReactionsDeleteForIssueCommentEndpoint extends js.Object {
  var comment_id: Double
  var mediaType: `9`
  var owner: String
  var reaction_id: Double
  var repo: String
}

object ReactionsDeleteForIssueCommentEndpoint {
  @scala.inline
  def apply(comment_id: Double, mediaType: `9`, owner: String, reaction_id: Double, repo: String): ReactionsDeleteForIssueCommentEndpoint = {
    val __obj = js.Dynamic.literal(comment_id = comment_id.asInstanceOf[js.Any], mediaType = mediaType.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], reaction_id = reaction_id.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReactionsDeleteForIssueCommentEndpoint]
  }
}

