package typings.octokitPluginRestEndpointMethods.restEndpointMethodsTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PullsListReviewRequestsResponse extends js.Object {
  var teams: js.Array[PullsListReviewRequestsResponseTeamsItem]
  var users: js.Array[PullsListReviewRequestsResponseUsersItem]
}

object PullsListReviewRequestsResponse {
  @scala.inline
  def apply(
    teams: js.Array[PullsListReviewRequestsResponseTeamsItem],
    users: js.Array[PullsListReviewRequestsResponseUsersItem]
  ): PullsListReviewRequestsResponse = {
    val __obj = js.Dynamic.literal(teams = teams.asInstanceOf[js.Any], users = users.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[PullsListReviewRequestsResponse]
  }
}

