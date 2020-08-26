package typings.octokitTypes.endpointsMod

import typings.octokitTypes.anon.`12`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined {  owner :string,   repo :string,   comment_id :number,   reaction_id :number} & @octokit/types.@octokit/types/dist-types/generated/Endpoints.RequiredPreview<'squirrel-girl'> */
@js.native
trait ReactionsDeleteForIssueCommentEndpoint extends js.Object {
  var comment_id: Double = js.native
  var mediaType: `12` = js.native
  var owner: String = js.native
  var reaction_id: Double = js.native
  var repo: String = js.native
}

object ReactionsDeleteForIssueCommentEndpoint {
  @scala.inline
  def apply(comment_id: Double, mediaType: `12`, owner: String, reaction_id: Double, repo: String): ReactionsDeleteForIssueCommentEndpoint = {
    val __obj = js.Dynamic.literal(comment_id = comment_id.asInstanceOf[js.Any], mediaType = mediaType.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], reaction_id = reaction_id.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReactionsDeleteForIssueCommentEndpoint]
  }
  @scala.inline
  implicit class ReactionsDeleteForIssueCommentEndpointOps[Self <: ReactionsDeleteForIssueCommentEndpoint] (val x: Self) extends AnyVal {
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
    def setComment_id(value: Double): Self = this.set("comment_id", value.asInstanceOf[js.Any])
    @scala.inline
    def setMediaType(value: `12`): Self = this.set("mediaType", value.asInstanceOf[js.Any])
    @scala.inline
    def setOwner(value: String): Self = this.set("owner", value.asInstanceOf[js.Any])
    @scala.inline
    def setReaction_id(value: Double): Self = this.set("reaction_id", value.asInstanceOf[js.Any])
    @scala.inline
    def setRepo(value: String): Self = this.set("repo", value.asInstanceOf[js.Any])
  }
  
}

