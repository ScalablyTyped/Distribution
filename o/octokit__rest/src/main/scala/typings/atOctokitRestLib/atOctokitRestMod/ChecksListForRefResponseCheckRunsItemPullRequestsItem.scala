package typings
package atOctokitRestLib.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChecksListForRefResponseCheckRunsItemPullRequestsItem extends js.Object {
  var base: ChecksListForRefResponseCheckRunsItemPullRequestsItemBase
  var head: ChecksListForRefResponseCheckRunsItemPullRequestsItemHead
  var id: scala.Double
  var number: scala.Double
  var url: java.lang.String
}

object ChecksListForRefResponseCheckRunsItemPullRequestsItem {
  @scala.inline
  def apply(
    base: ChecksListForRefResponseCheckRunsItemPullRequestsItemBase,
    head: ChecksListForRefResponseCheckRunsItemPullRequestsItemHead,
    id: scala.Double,
    number: scala.Double,
    url: java.lang.String
  ): ChecksListForRefResponseCheckRunsItemPullRequestsItem = {
    val __obj = js.Dynamic.literal(base = base, head = head, id = id, number = number, url = url)
  
    __obj.asInstanceOf[ChecksListForRefResponseCheckRunsItemPullRequestsItem]
  }
}

