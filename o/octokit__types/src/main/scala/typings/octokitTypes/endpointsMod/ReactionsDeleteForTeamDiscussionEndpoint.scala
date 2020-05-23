package typings.octokitTypes.endpointsMod

import typings.octokitTypes.anon.`9`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined {  org  :string,   team_slug  :string,   discussion_number  :number,   reaction_id  :number} & @octokit/types.@octokit/types/dist-types/generated/Endpoints.RequiredPreview<'squirrel-girl'> */
trait ReactionsDeleteForTeamDiscussionEndpoint extends js.Object {
  var discussion_number: Double
  var mediaType: `9`
  @JSName("org")
  var org_ : String
  var reaction_id: Double
  var team_slug: String
}

object ReactionsDeleteForTeamDiscussionEndpoint {
  @scala.inline
  def apply(discussion_number: Double, mediaType: `9`, org_ : String, reaction_id: Double, team_slug: String): ReactionsDeleteForTeamDiscussionEndpoint = {
    val __obj = js.Dynamic.literal(discussion_number = discussion_number.asInstanceOf[js.Any], mediaType = mediaType.asInstanceOf[js.Any], reaction_id = reaction_id.asInstanceOf[js.Any], team_slug = team_slug.asInstanceOf[js.Any])
    __obj.updateDynamic("org")(org_.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReactionsDeleteForTeamDiscussionEndpoint]
  }
}

