package typings.monacoEditor.mod.editor

import typings.monacoEditor.mod.IMouseEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IEditorMouseEvent extends js.Object {
  val event: IMouseEvent = js.native
  val target: IMouseTarget = js.native
}

object IEditorMouseEvent {
  @scala.inline
  def apply(event: IMouseEvent, target: IMouseTarget): IEditorMouseEvent = {
    val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    __obj.asInstanceOf[IEditorMouseEvent]
  }
  @scala.inline
  implicit class IEditorMouseEventOps[Self <: IEditorMouseEvent] (val x: Self) extends AnyVal {
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
  }
  
}

