package typings.atOctokitRest.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChecksListForRefResponseCheckRunsItemPullRequestsItem extends js.Object {
  var base: ChecksListForRefResponseCheckRunsItemPullRequestsItemBase
  var head: ChecksListForRefResponseCheckRunsItemPullRequestsItemHead
  var id: Double
  var number: Double
  var url: String
}

object ChecksListForRefResponseCheckRunsItemPullRequestsItem {
  @scala.inline
  def apply(
    base: ChecksListForRefResponseCheckRunsItemPullRequestsItemBase,
    head: ChecksListForRefResponseCheckRunsItemPullRequestsItemHead,
    id: Double,
    number: Double,
    url: String
  ): ChecksListForRefResponseCheckRunsItemPullRequestsItem = {
    val __obj = js.Dynamic.literal(base = base.asInstanceOf[js.Any], head = head.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], number = number.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ChecksListForRefResponseCheckRunsItemPullRequestsItem]
  }
}

