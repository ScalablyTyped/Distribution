package typings.atOctokitRest.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ActivityListFeedsResponseLinksUser extends js.Object {
  var href: String
  var `type`: String
}

object ActivityListFeedsResponseLinksUser {
  @scala.inline
  def apply(href: String, `type`: String): ActivityListFeedsResponseLinksUser = {
    val __obj = js.Dynamic.literal(href = href)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[ActivityListFeedsResponseLinksUser]
  }
}

