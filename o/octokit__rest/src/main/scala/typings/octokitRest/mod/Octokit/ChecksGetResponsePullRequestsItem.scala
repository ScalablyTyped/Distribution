package typings.octokitRest.mod.Octokit

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
    val __obj = js.Dynamic.literal(base = base.asInstanceOf[js.Any], head = head.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], number = number.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ChecksGetResponsePullRequestsItem]
  }
}

