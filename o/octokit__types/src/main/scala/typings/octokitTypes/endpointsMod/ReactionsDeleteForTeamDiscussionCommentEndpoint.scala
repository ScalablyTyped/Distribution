package typings.octokitTypes.endpointsMod

import typings.octokitTypes.anon.`9`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined {  org  :string,   team_slug  :string,   discussion_number  :number,   comment_number  :number,   reaction_id  :number} & @octokit/types.@octokit/types/dist-types/generated/Endpoints.RequiredPreview<'squirrel-girl'> */
trait ReactionsDeleteForTeamDiscussionCommentEndpoint extends js.Object {
  var comment_number: Double
  var discussion_number: Double
  var mediaType: `9`
  @JSName("org")
  var org_ : String
  var reaction_id: Double
  var team_slug: String
}

object ReactionsDeleteForTeamDiscussionCommentEndpoint {
  @scala.inline
  def apply(
    comment_number: Double,
    discussion_number: Double,
    mediaType: `9`,
    org_ : String,
    reaction_id: Double,
    team_slug: String
  ): ReactionsDeleteForTeamDiscussionCommentEndpoint = {
    val __obj = js.Dynamic.literal(comment_number = comment_number.asInstanceOf[js.Any], discussion_number = discussion_number.asInstanceOf[js.Any], mediaType = mediaType.asInstanceOf[js.Any], reaction_id = reaction_id.asInstanceOf[js.Any], team_slug = team_slug.asInstanceOf[js.Any])
    __obj.updateDynamic("org")(org_.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReactionsDeleteForTeamDiscussionCommentEndpoint]
  }
}

