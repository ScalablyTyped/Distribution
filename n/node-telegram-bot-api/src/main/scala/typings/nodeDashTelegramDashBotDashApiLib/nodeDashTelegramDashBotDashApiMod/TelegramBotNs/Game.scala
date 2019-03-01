package typings
package nodeDashTelegramDashBotDashApiLib.nodeDashTelegramDashBotDashApiMod.TelegramBotNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Game extends js.Object {
  var animation: js.UndefOr[Animation] = js.undefined
  var description: java.lang.String
  var photo: js.Array[PhotoSize]
  var text: js.UndefOr[java.lang.String] = js.undefined
  var text_entities: js.UndefOr[js.Array[MessageEntity]] = js.undefined
  var title: java.lang.String
}

object Game {
  @scala.inline
  def apply(
    description: java.lang.String,
    photo: js.Array[PhotoSize],
    title: java.lang.String,
    animation: Animation = null,
    text: java.lang.String = null,
    text_entities: js.Array[MessageEntity] = null
  ): Game = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("description")(description)
    __obj.updateDynamic("photo")(photo)
    __obj.updateDynamic("title")(title)
    if (animation != null) __obj.updateDynamic("animation")(animation)
    if (text != null) __obj.updateDynamic("text")(text)
    if (text_entities != null) __obj.updateDynamic("text_entities")(text_entities)
    __obj.asInstanceOf[Game]
  }
}

