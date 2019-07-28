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
    val __obj = js.Dynamic.literal(base = base, head = head, id = id, number = number, url = url)
  
    __obj.asInstanceOf[ChecksListForRefResponseCheckRunsItemPullRequestsItem]
  }
}

