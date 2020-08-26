package typings.monacoEditor.mod.editor

import typings.monacoEditor.mod.IMouseEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IPartialEditorMouseEvent extends js.Object {
  val event: IMouseEvent = js.native
  val target: IMouseTarget | Null = js.native
}

object IPartialEditorMouseEvent {
  @scala.inline
  def apply(event: IMouseEvent): IPartialEditorMouseEvent = {
    val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPartialEditorMouseEvent]
  }
  @scala.inline
  implicit class IPartialEditorMouseEventOps[Self <: IPartialEditorMouseEvent] (val x: Self) extends AnyVal {
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
    def setEvent(value: IMouseEvent): Self = this.set("event", value.asInstanceOf[js.Any])
    @scala.inline
    def setTarget(value: IMouseTarget): Self = this.set("target", value.asInstanceOf[js.Any])
    @scala.inline
    def setTargetNull: Self = this.set("target", null)
  }
  
}

