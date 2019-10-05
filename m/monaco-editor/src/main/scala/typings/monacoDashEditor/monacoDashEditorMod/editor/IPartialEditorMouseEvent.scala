package typings.monacoDashEditor.monacoDashEditorMod.editor

import typings.monacoDashEditor.monacoDashEditorMod.IMouseEvent
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
    val __obj = js.Dynamic.literal(event = event)
    if (target != null) __obj.updateDynamic("target")(target)
    __obj.asInstanceOf[IPartialEditorMouseEvent]
  }
}

