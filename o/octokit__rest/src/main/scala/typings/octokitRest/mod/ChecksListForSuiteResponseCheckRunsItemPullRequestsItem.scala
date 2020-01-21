package typings.octokitRest.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChecksListForSuiteResponseCheckRunsItemPullRequestsItem extends js.Object {
  var base: ChecksListForSuiteResponseCheckRunsItemPullRequestsItemBase
  var head: ChecksListForSuiteResponseCheckRunsItemPullRequestsItemHead
  var id: Double
  var number: Double
  var url: String
}

object ChecksListForSuiteResponseCheckRunsItemPullRequestsItem {
  @scala.inline
  def apply(
    base: ChecksListForSuiteResponseCheckRunsItemPullRequestsItemBase,
    head: ChecksListForSuiteResponseCheckRunsItemPullRequestsItemHead,
    id: Double,
    number: Double,
    url: String
  ): ChecksListForSuiteResponseCheckRunsItemPullRequestsItem = {
    val __obj = js.Dynamic.literal(base = base.asInstanceOf[js.Any], head = head.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], number = number.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ChecksListForSuiteResponseCheckRunsItemPullRequestsItem]
  }
}

