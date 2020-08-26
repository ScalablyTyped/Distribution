package typings.monacoEditor.mod.editor

import typings.monacoEditor.mod.Selection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ICursorSelectionChangedEvent extends js.Object {
  /**
    * The model version id.
    */
  val modelVersionId: Double = js.native
  /**
    * The model version id the that `oldSelections` refer to.
    */
  val oldModelVersionId: Double = js.native
  /**
    * The old selections.
    */
  val oldSelections: js.Array[Selection] | Null = js.native
  /**
    * Reason.
    */
  val reason: CursorChangeReason = js.native
  /**
    * The secondary selections.
    */
  val secondarySelections: js.Array[Selection] = js.native
  /**
    * The primary selection.
    */
  val selection: Selection = js.native
  /**
    * Source of the call that caused the event.
    */
  val source: String = js.native
}

object ICursorSelectionChangedEvent {
  @scala.inline
  def apply(
    modelVersionId: Double,
    oldModelVersionId: Double,
    reason: CursorChangeReason,
    secondarySelections: js.Array[Selection],
    selection: Selection,
    source: String
  ): ICursorSelectionChangedEvent = {
    val __obj = js.Dynamic.literal(modelVersionId = modelVersionId.asInstanceOf[js.Any], oldModelVersionId = oldModelVersionId.asInstanceOf[js.Any], reason = reason.asInstanceOf[js.Any], secondarySelections = secondarySelections.asInstanceOf[js.Any], selection = selection.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICursorSelectionChangedEvent]
  }
  @scala.inline
  implicit class ICursorSelectionChangedEventOps[Self <: ICursorSelectionChangedEvent] (val x: Self) extends AnyVal {
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
    def setModelVersionId(value: Double): Self = this.set("modelVersionId", value.asInstanceOf[js.Any])
    @scala.inline
    def setOldModelVersionId(value: Double): Self = this.set("oldModelVersionId", value.asInstanceOf[js.Any])
    @scala.inline
    def setReason(value: CursorChangeReason): Self = this.set("reason", value.asInstanceOf[js.Any])
    @scala.inline
    def setSecondarySelectionsVarargs(value: Selection*): Self = this.set("secondarySelections", js.Array(value :_*))
    @scala.inline
    def setSecondarySelections(value: js.Array[Selection]): Self = this.set("secondarySelections", value.asInstanceOf[js.Any])
    @scala.inline
    def setSelection(value: Selection): Self = this.set("selection", value.asInstanceOf[js.Any])
    @scala.inline
    def setSource(value: String): Self = this.set("source", value.asInstanceOf[js.Any])
    @scala.inline
    def setOldSelectionsVarargs(value: Selection*): Self = this.set("oldSelections", js.Array(value :_*))
    @scala.inline
    def setOldSelections(value: js.Array[Selection]): Self = this.set("oldSelections", value.asInstanceOf[js.Any])
    @scala.inline
    def setOldSelectionsNull: Self = this.set("oldSelections", null)
  }
  
}

