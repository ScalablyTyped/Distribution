package typings.octokitRest.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChecksCreateResponsePullRequestsItem extends js.Object {
  var base: ChecksCreateResponsePullRequestsItemBase
  var head: ChecksCreateResponsePullRequestsItemHead
  var id: Double
  var number: Double
  var url: String
}

object ChecksCreateResponsePullRequestsItem {
  @scala.inline
  def apply(
    base: ChecksCreateResponsePullRequestsItemBase,
    head: ChecksCreateResponsePullRequestsItemHead,
    id: Double,
    number: Double,
    url: String
  ): ChecksCreateResponsePullRequestsItem = {
    val __obj = js.Dynamic.literal(base = base.asInstanceOf[js.Any], head = head.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], number = number.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ChecksCreateResponsePullRequestsItem]
  }
}

