package typings
package atOctokitRestLib.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ActivityListFeedsResponseLinksCurrentUser extends js.Object {
  var href: java.lang.String
  var `type`: java.lang.String
}

object ActivityListFeedsResponseLinksCurrentUser {
  @scala.inline
  def apply(href: java.lang.String, `type`: java.lang.String): ActivityListFeedsResponseLinksCurrentUser = {
    val __obj = js.Dynamic.literal(href = href)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[ActivityListFeedsResponseLinksCurrentUser]
  }
}

