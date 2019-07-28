package typings.atOctokitRest.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ActivityListFeedsResponseLinksTimeline extends js.Object {
  var href: String
  var `type`: String
}

object ActivityListFeedsResponseLinksTimeline {
  @scala.inline
  def apply(href: String, `type`: String): ActivityListFeedsResponseLinksTimeline = {
    val __obj = js.Dynamic.literal(href = href)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[ActivityListFeedsResponseLinksTimeline]
  }
}

