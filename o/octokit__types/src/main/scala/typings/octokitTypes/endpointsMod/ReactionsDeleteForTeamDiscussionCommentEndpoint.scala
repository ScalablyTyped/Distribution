package typings.octokitTypes.endpointsMod

import typings.octokitTypes.anon.`12`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined {  org :string,   team_slug :string,   discussion_number :number,   comment_number :number,   reaction_id :number} & @octokit/types.@octokit/types/dist-types/generated/Endpoints.RequiredPreview<'squirrel-girl'> */
@js.native
trait ReactionsDeleteForTeamDiscussionCommentEndpoint extends js.Object {
  var comment_number: Double = js.native
  var discussion_number: Double = js.native
  var mediaType: `12` = js.native
  @JSName("org")
  var org_ : String = js.native
  var reaction_id: Double = js.native
  var team_slug: String = js.native
}

object ReactionsDeleteForTeamDiscussionCommentEndpoint {
  @scala.inline
  def apply(
    comment_number: Double,
    discussion_number: Double,
    mediaType: `12`,
    org_ : String,
    reaction_id: Double,
    team_slug: String
  ): ReactionsDeleteForTeamDiscussionCommentEndpoint = {
    val __obj = js.Dynamic.literal(comment_number = comment_number.asInstanceOf[js.Any], discussion_number = discussion_number.asInstanceOf[js.Any], mediaType = mediaType.asInstanceOf[js.Any], reaction_id = reaction_id.asInstanceOf[js.Any], team_slug = team_slug.asInstanceOf[js.Any])
    __obj.updateDynamic("org")(org_.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReactionsDeleteForTeamDiscussionCommentEndpoint]
  }
  @scala.inline
  implicit class ReactionsDeleteForTeamDiscussionCommentEndpointOps[Self <: ReactionsDeleteForTeamDiscussionCommentEndpoint] (val x: Self) extends AnyVal {
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
    def setComment_number(value: Double): Self = this.set("comment_number", value.asInstanceOf[js.Any])
    @scala.inline
    def setDiscussion_number(value: Double): Self = this.set("discussion_number", value.asInstanceOf[js.Any])
    @scala.inline
    def setMediaType(value: `12`): Self = this.set("mediaType", value.asInstanceOf[js.Any])
    @scala.inline
    def setOrg_(value: String): Self = this.set("org", value.asInstanceOf[js.Any])
    @scala.inline
    def setReaction_id(value: Double): Self = this.set("reaction_id", value.asInstanceOf[js.Any])
    @scala.inline
    def setTeam_slug(value: String): Self = this.set("team_slug", value.asInstanceOf[js.Any])
  }
  
}

