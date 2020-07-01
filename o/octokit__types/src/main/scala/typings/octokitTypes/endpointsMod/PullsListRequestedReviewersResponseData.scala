package typings.octokitTypes.endpointsMod

import typings.octokitTypes.anon.Description
import typings.octokitTypes.anon.Eventsurl
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PullsListRequestedReviewersResponseData extends js.Object {
  var teams: js.Array[Description]
  var users: js.Array[Eventsurl]
}

object PullsListRequestedReviewersResponseData {
  @scala.inline
  def apply(teams: js.Array[Description], users: js.Array[Eventsurl]): PullsListRequestedReviewersResponseData = {
    val __obj = js.Dynamic.literal(teams = teams.asInstanceOf[js.Any], users = users.asInstanceOf[js.Any])
    __obj.asInstanceOf[PullsListRequestedReviewersResponseData]
  }
}

