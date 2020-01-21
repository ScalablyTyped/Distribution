package typings.monacoEditor.mod.editor

import typings.monacoEditor.mod.IMouseEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPartialEditorMouseEvent extends js.Object {
  val event: IMouseEvent
  val target: IMouseTarget | Null
}

object IPartialEditorMouseEvent {
  @scala.inline
  def apply(event: IMouseEvent, target: IMouseTarget = null): IPartialEditorMouseEvent = {
    val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any])
    if (target != null) __obj.updateDynamic("target")(target.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPartialEditorMouseEvent]
  }
}

