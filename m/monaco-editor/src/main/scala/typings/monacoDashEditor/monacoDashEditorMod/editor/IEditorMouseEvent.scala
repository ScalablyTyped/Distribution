package typings.monacoDashEditor.monacoDashEditorMod.editor

import typings.monacoDashEditor.monacoDashEditorMod.IMouseEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IEditorMouseEvent extends js.Object {
  val event: IMouseEvent
  val target: IMouseTarget
}

object IEditorMouseEvent {
  @scala.inline
  def apply(event: IMouseEvent, target: IMouseTarget): IEditorMouseEvent = {
    val __obj = js.Dynamic.literal(event = event, target = target)
  
    __obj.asInstanceOf[IEditorMouseEvent]
  }
}

