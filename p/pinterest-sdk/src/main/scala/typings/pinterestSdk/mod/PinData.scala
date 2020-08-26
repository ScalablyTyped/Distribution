package typings.pinterestSdk.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PinData extends js.Object {
  var board: String = js.native
  var image_url: String = js.native
  var link: String = js.native
  var note: String = js.native
}

object PinData {
  @scala.inline
  def apply(board: String, image_url: String, link: String, note: String): PinData = {
    val __obj = js.Dynamic.literal(board = board.asInstanceOf[js.Any], image_url = image_url.asInstanceOf[js.Any], link = link.asInstanceOf[js.Any], note = note.asInstanceOf[js.Any])
    __obj.asInstanceOf[PinData]
  }
  @scala.inline
  implicit class PinDataOps[Self <: PinData] (val x: Self) extends AnyVal {
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
    def setBoard(value: String): Self = this.set("board", value.asInstanceOf[js.Any])
    @scala.inline
    def setImage_url(value: String): Self = this.set("image_url", value.asInstanceOf[js.Any])
    @scala.inline
    def setLink(value: String): Self = this.set("link", value.asInstanceOf[js.Any])
    @scala.inline
    def setNote(value: String): Self = this.set("note", value.asInstanceOf[js.Any])
  }
  
}

