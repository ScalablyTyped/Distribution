package typings.monacoDashEditor.monacoDashEditorMod.editor

import typings.monacoDashEditor.monacoDashEditorMod.Selection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICursorSelectionChangedEvent extends js.Object {
  /**
    * Reason.
    */
  val reason: CursorChangeReason
  /**
    * The secondary selections.
    */
  val secondarySelections: js.Array[Selection]
  /**
    * The primary selection.
    */
  val selection: Selection
  /**
    * Source of the call that caused the event.
    */
  val source: String
}

object ICursorSelectionChangedEvent {
  @scala.inline
  def apply(
    reason: CursorChangeReason,
    secondarySelections: js.Array[Selection],
    selection: Selection,
    source: String
  ): ICursorSelectionChangedEvent = {
    val __obj = js.Dynamic.literal(reason = reason.asInstanceOf[js.Any], secondarySelections = secondarySelections.asInstanceOf[js.Any], selection = selection.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ICursorSelectionChangedEvent]
  }
}

