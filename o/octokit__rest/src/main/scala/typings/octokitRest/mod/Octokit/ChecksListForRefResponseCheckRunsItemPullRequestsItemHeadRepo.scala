package typings.octokitRest.mod.Octokit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChecksListForRefResponseCheckRunsItemPullRequestsItemHeadRepo extends js.Object {
  var id: Double
  var name: String
  var url: String
}

object ChecksListForRefResponseCheckRunsItemPullRequestsItemHeadRepo {
  @scala.inline
  def apply(id: Double, name: String, url: String): ChecksListForRefResponseCheckRunsItemPullRequestsItemHeadRepo = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ChecksListForRefResponseCheckRunsItemPullRequestsItemHeadRepo]
  }
}

