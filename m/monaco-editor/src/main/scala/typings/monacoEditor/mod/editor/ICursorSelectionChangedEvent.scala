package typings.monacoEditor.mod.editor

import typings.monacoEditor.mod.Selection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICursorSelectionChangedEvent extends js.Object {
  /**
    * The model version id.
    */
  val modelVersionId: Double
  /**
    * The model version id the that `oldSelections` refer to.
    */
  val oldModelVersionId: Double
  /**
    * The old selections.
    */
  val oldSelections: js.Array[Selection] | Null
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
    modelVersionId: Double,
    oldModelVersionId: Double,
    reason: CursorChangeReason,
    secondarySelections: js.Array[Selection],
    selection: Selection,
    source: String,
    oldSelections: js.Array[Selection] = null
  ): ICursorSelectionChangedEvent = {
    val __obj = js.Dynamic.literal(modelVersionId = modelVersionId.asInstanceOf[js.Any], oldModelVersionId = oldModelVersionId.asInstanceOf[js.Any], reason = reason.asInstanceOf[js.Any], secondarySelections = secondarySelections.asInstanceOf[js.Any], selection = selection.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    if (oldSelections != null) __obj.updateDynamic("oldSelections")(oldSelections.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICursorSelectionChangedEvent]
  }
}

