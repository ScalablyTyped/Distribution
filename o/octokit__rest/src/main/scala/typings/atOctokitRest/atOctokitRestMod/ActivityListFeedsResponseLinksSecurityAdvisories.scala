package typings.atOctokitRest.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ActivityListFeedsResponseLinksSecurityAdvisories extends js.Object {
  var href: String
  var `type`: String
}

object ActivityListFeedsResponseLinksSecurityAdvisories {
  @scala.inline
  def apply(href: String, `type`: String): ActivityListFeedsResponseLinksSecurityAdvisories = {
    val __obj = js.Dynamic.literal(href = href.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActivityListFeedsResponseLinksSecurityAdvisories]
  }
}

