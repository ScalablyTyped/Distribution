package typings
package atOctokitRestLib.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChecksGetResponsePullRequestsItem extends js.Object {
  var base: ChecksGetResponsePullRequestsItemBase
  var head: ChecksGetResponsePullRequestsItemHead
  var id: scala.Double
  var number: scala.Double
  var url: java.lang.String
}

object ChecksGetResponsePullRequestsItem {
  @scala.inline
  def apply(
    base: ChecksGetResponsePullRequestsItemBase,
    head: ChecksGetResponsePullRequestsItemHead,
    id: scala.Double,
    number: scala.Double,
    url: java.lang.String
  ): ChecksGetResponsePullRequestsItem = {
    val __obj = js.Dynamic.literal(base = base, head = head, id = id, number = number, url = url)
  
    __obj.asInstanceOf[ChecksGetResponsePullRequestsItem]
  }
}

