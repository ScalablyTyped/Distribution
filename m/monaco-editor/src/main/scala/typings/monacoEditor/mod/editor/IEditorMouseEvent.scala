package typings.monacoEditor.mod.editor

import typings.monacoEditor.mod.IMouseEvent
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
    val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IEditorMouseEvent]
  }
}

