package typings.atOctokitRest.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChecksUpdateResponsePullRequestsItem extends js.Object {
  var base: ChecksUpdateResponsePullRequestsItemBase
  var head: ChecksUpdateResponsePullRequestsItemHead
  var id: Double
  var number: Double
  var url: String
}

object ChecksUpdateResponsePullRequestsItem {
  @scala.inline
  def apply(
    base: ChecksUpdateResponsePullRequestsItemBase,
    head: ChecksUpdateResponsePullRequestsItemHead,
    id: Double,
    number: Double,
    url: String
  ): ChecksUpdateResponsePullRequestsItem = {
    val __obj = js.Dynamic.literal(base = base, head = head, id = id, number = number, url = url)
  
    __obj.asInstanceOf[ChecksUpdateResponsePullRequestsItem]
  }
}

