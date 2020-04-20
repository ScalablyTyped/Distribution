package typings.monacoEditor.mod.editor

import typings.monacoEditor.mod.IPosition
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICursorState extends js.Object {
  var inSelectionMode: Boolean
  var position: IPosition
  var selectionStart: IPosition
}

object ICursorState {
  @scala.inline
  def apply(inSelectionMode: Boolean, position: IPosition, selectionStart: IPosition): ICursorState = {
    val __obj = js.Dynamic.literal(inSelectionMode = inSelectionMode.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], selectionStart = selectionStart.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICursorState]
  }
}

