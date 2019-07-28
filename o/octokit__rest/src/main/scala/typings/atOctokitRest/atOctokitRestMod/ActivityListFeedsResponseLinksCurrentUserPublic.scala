package typings.atOctokitRest.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ActivityListFeedsResponseLinksCurrentUserPublic extends js.Object {
  var href: String
  var `type`: String
}

object ActivityListFeedsResponseLinksCurrentUserPublic {
  @scala.inline
  def apply(href: String, `type`: String): ActivityListFeedsResponseLinksCurrentUserPublic = {
    val __obj = js.Dynamic.literal(href = href)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[ActivityListFeedsResponseLinksCurrentUserPublic]
  }
}

