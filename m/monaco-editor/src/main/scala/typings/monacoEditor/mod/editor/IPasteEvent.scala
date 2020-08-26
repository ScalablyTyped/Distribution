package typings.monacoEditor.mod.editor

import typings.monacoEditor.mod.Range
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IPasteEvent extends js.Object {
  val mode: String | Null = js.native
  val range: Range = js.native
}

object IPasteEvent {
  @scala.inline
  def apply(range: Range): IPasteEvent = {
    val __obj = js.Dynamic.literal(range = range.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPasteEvent]
  }
  @scala.inline
  implicit class IPasteEventOps[Self <: IPasteEvent] (val x: Self) extends AnyVal {
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
    def setRange(value: Range): Self = this.set("range", value.asInstanceOf[js.Any])
    @scala.inline
    def setMode(value: String): Self = this.set("mode", value.asInstanceOf[js.Any])
    @scala.inline
    def setModeNull: Self = this.set("mode", null)
  }
  
}

