package typings
package atOctokitRestLib.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChecksCreateResponsePullRequestsItem extends js.Object {
  var base: ChecksCreateResponsePullRequestsItemBase
  var head: ChecksCreateResponsePullRequestsItemHead
  var id: scala.Double
  var number: scala.Double
  var url: java.lang.String
}

object ChecksCreateResponsePullRequestsItem {
  @scala.inline
  def apply(
    base: ChecksCreateResponsePullRequestsItemBase,
    head: ChecksCreateResponsePullRequestsItemHead,
    id: scala.Double,
    number: scala.Double,
    url: java.lang.String
  ): ChecksCreateResponsePullRequestsItem = {
    val __obj = js.Dynamic.literal(base = base, head = head, id = id, number = number, url = url)
  
    __obj.asInstanceOf[ChecksCreateResponsePullRequestsItem]
  }
}

