package typings.octokitTypes.endpointsMod

import typings.octokitTypes.anon.`12`
import typings.octokitTypes.octokitTypesStrings.Plussign1
import typings.octokitTypes.octokitTypesStrings.`-1`
import typings.octokitTypes.octokitTypesStrings.confused
import typings.octokitTypes.octokitTypesStrings.eyes
import typings.octokitTypes.octokitTypesStrings.heart
import typings.octokitTypes.octokitTypesStrings.hooray
import typings.octokitTypes.octokitTypesStrings.laugh
import typings.octokitTypes.octokitTypesStrings.rocket
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined {  team_id :number,   discussion_number :number,   content :'+1' | '-1' | 'laugh' | 'confused' | 'heart' | 'hooray' | 'rocket' | 'eyes'} & @octokit/types.@octokit/types/dist-types/generated/Endpoints.RequiredPreview<'squirrel-girl'> */
@js.native
trait ReactionsCreateForTeamDiscussionLegacyEndpoint extends js.Object {
  /**
    * The [reaction type](https://developer.github.com/v3/reactions/#reaction-types) to add to the team discussion.
    */
  var content: Plussign1 | `-1` | laugh | confused | heart | hooray | rocket | eyes = js.native
  var discussion_number: Double = js.native
  var mediaType: `12` = js.native
  var team_id: Double = js.native
}

object ReactionsCreateForTeamDiscussionLegacyEndpoint {
  @scala.inline
  def apply(
    content: Plussign1 | `-1` | laugh | confused | heart | hooray | rocket | eyes,
    discussion_number: Double,
    mediaType: `12`,
    team_id: Double
  ): ReactionsCreateForTeamDiscussionLegacyEndpoint = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], discussion_number = discussion_number.asInstanceOf[js.Any], mediaType = mediaType.asInstanceOf[js.Any], team_id = team_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReactionsCreateForTeamDiscussionLegacyEndpoint]
  }
  @scala.inline
  implicit class ReactionsCreateForTeamDiscussionLegacyEndpointOps[Self <: ReactionsCreateForTeamDiscussionLegacyEndpoint] (val x: Self) extends AnyVal {
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
    def setContent(value: Plussign1 | `-1` | laugh | confused | heart | hooray | rocket | eyes): Self = this.set("content", value.asInstanceOf[js.Any])
    @scala.inline
    def setDiscussion_number(value: Double): Self = this.set("discussion_number", value.asInstanceOf[js.Any])
    @scala.inline
    def setMediaType(value: `12`): Self = this.set("mediaType", value.asInstanceOf[js.Any])
    @scala.inline
    def setTeam_id(value: Double): Self = this.set("team_id", value.asInstanceOf[js.Any])
  }
  
}

