package typings
package atOctokitRestLib.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChecksListForSuiteResponseCheckRunsItemPullRequestsItem extends js.Object {
  var base: ChecksListForSuiteResponseCheckRunsItemPullRequestsItemBase
  var head: ChecksListForSuiteResponseCheckRunsItemPullRequestsItemHead
  var id: scala.Double
  var number: scala.Double
  var url: java.lang.String
}

object ChecksListForSuiteResponseCheckRunsItemPullRequestsItem {
  @scala.inline
  def apply(
    base: ChecksListForSuiteResponseCheckRunsItemPullRequestsItemBase,
    head: ChecksListForSuiteResponseCheckRunsItemPullRequestsItemHead,
    id: scala.Double,
    number: scala.Double,
    url: java.lang.String
  ): ChecksListForSuiteResponseCheckRunsItemPullRequestsItem = {
    val __obj = js.Dynamic.literal(base = base, head = head, id = id, number = number, url = url)
  
    __obj.asInstanceOf[ChecksListForSuiteResponseCheckRunsItemPullRequestsItem]
  }
}

