package typings.atOctokitRest.atOctokitRestMod

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
    val __obj = js.Dynamic.literal(base = base, head = head, id = id, number = number, url = url)
  
    __obj.asInstanceOf[ChecksListForSuiteResponseCheckRunsItemPullRequestsItem]
  }
}

