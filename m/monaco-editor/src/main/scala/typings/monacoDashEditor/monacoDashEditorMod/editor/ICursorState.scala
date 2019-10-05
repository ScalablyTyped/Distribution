package typings.monacoDashEditor.monacoDashEditorMod.editor

import typings.monacoDashEditor.monacoDashEditorMod.IPosition
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
    val __obj = js.Dynamic.literal(inSelectionMode = inSelectionMode, position = position, selectionStart = selectionStart)
  
    __obj.asInstanceOf[ICursorState]
  }
}

