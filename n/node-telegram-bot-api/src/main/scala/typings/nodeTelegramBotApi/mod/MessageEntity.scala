package typings.nodeTelegramBotApi.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MessageEntity extends js.Object {
  var length: Double
  var offset: Double
  var `type`: MessageEntityType
  var url: js.UndefOr[String] = js.undefined
  var user: js.UndefOr[User] = js.undefined
}

object MessageEntity {
  @scala.inline
  def apply(length: Double, offset: Double, `type`: MessageEntityType, url: String = null, user: User = null): MessageEntity = {
    val __obj = js.Dynamic.literal(length = length.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    if (user != null) __obj.updateDynamic("user")(user.asInstanceOf[js.Any])
    __obj.asInstanceOf[MessageEntity]
  }
}

