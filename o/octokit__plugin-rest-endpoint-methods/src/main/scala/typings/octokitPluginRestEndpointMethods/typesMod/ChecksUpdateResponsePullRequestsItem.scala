package typings.octokitPluginRestEndpointMethods.typesMod

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
    val __obj = js.Dynamic.literal(base = base.asInstanceOf[js.Any], head = head.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], number = number.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChecksUpdateResponsePullRequestsItem]
  }
}

