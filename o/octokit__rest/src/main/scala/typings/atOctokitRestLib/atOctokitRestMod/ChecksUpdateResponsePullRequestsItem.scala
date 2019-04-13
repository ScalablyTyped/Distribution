package typings
package atOctokitRestLib.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChecksUpdateResponsePullRequestsItem extends js.Object {
  var base: ChecksUpdateResponsePullRequestsItemBase
  var head: ChecksUpdateResponsePullRequestsItemHead
  var id: scala.Double
  var number: scala.Double
  var url: java.lang.String
}

object ChecksUpdateResponsePullRequestsItem {
  @scala.inline
  def apply(
    base: ChecksUpdateResponsePullRequestsItemBase,
    head: ChecksUpdateResponsePullRequestsItemHead,
    id: scala.Double,
    number: scala.Double,
    url: java.lang.String
  ): ChecksUpdateResponsePullRequestsItem = {
    val __obj = js.Dynamic.literal(base = base, head = head, id = id, number = number, url = url)
  
    __obj.asInstanceOf[ChecksUpdateResponsePullRequestsItem]
  }
}

