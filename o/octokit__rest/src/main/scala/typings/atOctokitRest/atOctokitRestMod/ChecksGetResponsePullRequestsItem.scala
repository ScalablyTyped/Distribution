package typings.atOctokitRest.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChecksGetResponsePullRequestsItem extends js.Object {
  var base: ChecksGetResponsePullRequestsItemBase
  var head: ChecksGetResponsePullRequestsItemHead
  var id: Double
  var number: Double
  var url: String
}

object ChecksGetResponsePullRequestsItem {
  @scala.inline
  def apply(
    base: ChecksGetResponsePullRequestsItemBase,
    head: ChecksGetResponsePullRequestsItemHead,
    id: Double,
    number: Double,
    url: String
  ): ChecksGetResponsePullRequestsItem = {
    val __obj = js.Dynamic.literal(base = base, head = head, id = id, number = number, url = url)
  
    __obj.asInstanceOf[ChecksGetResponsePullRequestsItem]
  }
}

