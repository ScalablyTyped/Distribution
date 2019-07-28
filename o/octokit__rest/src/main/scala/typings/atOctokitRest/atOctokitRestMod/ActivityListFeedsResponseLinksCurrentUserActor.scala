package typings.atOctokitRest.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ActivityListFeedsResponseLinksCurrentUserActor extends js.Object {
  var href: String
  var `type`: String
}

object ActivityListFeedsResponseLinksCurrentUserActor {
  @scala.inline
  def apply(href: String, `type`: String): ActivityListFeedsResponseLinksCurrentUserActor = {
    val __obj = js.Dynamic.literal(href = href)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[ActivityListFeedsResponseLinksCurrentUserActor]
  }
}

