package typings.octokitTypes.endpointsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TeamsUpdateDiscussionLegacyEndpoint extends js.Object {
  /**
    * The discussion post's body text.
    */
  var body: js.UndefOr[String] = js.native
  var discussion_number: Double = js.native
  var team_id: Double = js.native
  /**
    * The discussion post's title.
    */
  var title: js.UndefOr[String] = js.native
}

object TeamsUpdateDiscussionLegacyEndpoint {
  @scala.inline
  def apply(discussion_number: Double, team_id: Double): TeamsUpdateDiscussionLegacyEndpoint = {
    val __obj = js.Dynamic.literal(discussion_number = discussion_number.asInstanceOf[js.Any], team_id = team_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[TeamsUpdateDiscussionLegacyEndpoint]
  }
  @scala.inline
  implicit class TeamsUpdateDiscussionLegacyEndpointOps[Self <: TeamsUpdateDiscussionLegacyEndpoint] (val x: Self) extends AnyVal {
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
    def setDiscussion_number(value: Double): Self = this.set("discussion_number", value.asInstanceOf[js.Any])
    @scala.inline
    def setTeam_id(value: Double): Self = this.set("team_id", value.asInstanceOf[js.Any])
    @scala.inline
    def setBody(value: String): Self = this.set("body", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBody: Self = this.set("body", js.undefined)
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
  }
  
}

