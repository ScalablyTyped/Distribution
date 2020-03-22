package typings.octokitPluginRestEndpointMethods.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ActivityListFeedsResponseLinksCurrentUserOrganizationsItem extends js.Object {
  var href: String
  var `type`: String
}

object ActivityListFeedsResponseLinksCurrentUserOrganizationsItem {
  @scala.inline
  def apply(href: String, `type`: String): ActivityListFeedsResponseLinksCurrentUserOrganizationsItem = {
    val __obj = js.Dynamic.literal(href = href.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActivityListFeedsResponseLinksCurrentUserOrganizationsItem]
  }
}

