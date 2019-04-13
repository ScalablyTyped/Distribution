package typings
package atOctokitRestLib.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ActivityListFeedsResponseLinksCurrentUserOrganizationsItem extends js.Object {
  var href: java.lang.String
  var `type`: java.lang.String
}

object ActivityListFeedsResponseLinksCurrentUserOrganizationsItem {
  @scala.inline
  def apply(href: java.lang.String, `type`: java.lang.String): ActivityListFeedsResponseLinksCurrentUserOrganizationsItem = {
    val __obj = js.Dynamic.literal(href = href)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[ActivityListFeedsResponseLinksCurrentUserOrganizationsItem]
  }
}

