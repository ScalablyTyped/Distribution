package typings
package nodeDashTelegramDashBotDashApiLib.nodeDashTelegramDashBotDashApiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MessageEntity extends js.Object {
  var length: scala.Double
  var offset: scala.Double
  var `type`: MessageEntityType
  var url: js.UndefOr[java.lang.String] = js.undefined
  var user: js.UndefOr[User] = js.undefined
}

object MessageEntity {
  @scala.inline
  def apply(
    length: scala.Double,
    offset: scala.Double,
    `type`: MessageEntityType,
    url: java.lang.String = null,
    user: User = null
  ): MessageEntity = {
    val __obj = js.Dynamic.literal(length = length, offset = offset)
    __obj.updateDynamic("type")(`type`)
    if (url != null) __obj.updateDynamic("url")(url)
    if (user != null) __obj.updateDynamic("user")(user)
    __obj.asInstanceOf[MessageEntity]
  }
}

