package typings.nodeDashTelegramDashBotDashApi.nodeDashTelegramDashBotDashApiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Game extends js.Object {
  var animation: js.UndefOr[Animation] = js.undefined
  var description: String
  var photo: js.Array[PhotoSize]
  var text: js.UndefOr[String] = js.undefined
  var text_entities: js.UndefOr[js.Array[MessageEntity]] = js.undefined
  var title: String
}

object Game {
  @scala.inline
  def apply(
    description: String,
    photo: js.Array[PhotoSize],
    title: String,
    animation: Animation = null,
    text: String = null,
    text_entities: js.Array[MessageEntity] = null
  ): Game = {
    val __obj = js.Dynamic.literal(description = description, photo = photo, title = title)
    if (animation != null) __obj.updateDynamic("animation")(animation)
    if (text != null) __obj.updateDynamic("text")(text)
    if (text_entities != null) __obj.updateDynamic("text_entities")(text_entities)
    __obj.asInstanceOf[Game]
  }
}

