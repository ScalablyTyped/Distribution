package typings.nodeTelegramBotApi.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Game extends js.Object {
  var animation: js.UndefOr[Animation] = js.native
  var description: String = js.native
  var photo: js.Array[PhotoSize] = js.native
  var text: js.UndefOr[String] = js.native
  var text_entities: js.UndefOr[js.Array[MessageEntity]] = js.native
  var title: String = js.native
}

object Game {
  @scala.inline
  def apply(description: String, photo: js.Array[PhotoSize], title: String): Game = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], photo = photo.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[Game]
  }
  @scala.inline
  implicit class GameOps[Self <: Game] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def setPhotoVarargs(value: PhotoSize*): Self = this.set("photo", js.Array(value :_*))
    @scala.inline
    def setPhoto(value: js.Array[PhotoSize]): Self = this.set("photo", value.asInstanceOf[js.Any])
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def setAnimation(value: Animation): Self = this.set("animation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAnimation: Self = this.set("animation", js.undefined)
    @scala.inline
    def setText(value: String): Self = this.set("text", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteText: Self = this.set("text", js.undefined)
    @scala.inline
    def setText_entitiesVarargs(value: MessageEntity*): Self = this.set("text_entities", js.Array(value :_*))
    @scala.inline
    def setText_entities(value: js.Array[MessageEntity]): Self = this.set("text_entities", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteText_entities: Self = this.set("text_entities", js.undefined)
  }
  
}

