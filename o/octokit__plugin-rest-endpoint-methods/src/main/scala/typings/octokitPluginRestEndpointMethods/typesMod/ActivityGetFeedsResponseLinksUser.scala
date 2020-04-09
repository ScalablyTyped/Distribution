package typings.octokitPluginRestEndpointMethods.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ActivityGetFeedsResponseLinksUser extends js.Object {
  var href: String
  var `type`: String
}

object ActivityGetFeedsResponseLinksUser {
  @scala.inline
  def apply(href: String, `type`: String): ActivityGetFeedsResponseLinksUser = {
    val __obj = js.Dynamic.literal(href = href.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActivityGetFeedsResponseLinksUser]
  }
}

