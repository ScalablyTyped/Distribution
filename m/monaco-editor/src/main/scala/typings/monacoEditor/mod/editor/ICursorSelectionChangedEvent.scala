package typings.monacoEditor.mod.editor

import typings.monacoEditor.mod.Selection
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ICursorSelectionChangedEvent extends StObject {
  
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
    source: String
  ): ICursorSelectionChangedEvent = {
    val __obj = js.Dynamic.literal(modelVersionId = modelVersionId.asInstanceOf[js.Any], oldModelVersionId = oldModelVersionId.asInstanceOf[js.Any], reason = reason.asInstanceOf[js.Any], secondarySelections = secondarySelections.asInstanceOf[js.Any], selection = selection.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], oldSelections = null)
    __obj.asInstanceOf[ICursorSelectionChangedEvent]
  }
  
  @scala.inline
  implicit class ICursorSelectionChangedEventMutableBuilder[Self <: ICursorSelectionChangedEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setModelVersionId(value: Double): Self = StObject.set(x, "modelVersionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOldModelVersionId(value: Double): Self = StObject.set(x, "oldModelVersionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOldSelections(value: js.Array[Selection]): Self = StObject.set(x, "oldSelections", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOldSelectionsNull: Self = StObject.set(x, "oldSelections", null)
    
    @scala.inline
    def setOldSelectionsVarargs(value: Selection*): Self = StObject.set(x, "oldSelections", js.Array(value :_*))
    
    @scala.inline
    def setReason(value: CursorChangeReason): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecondarySelections(value: js.Array[Selection]): Self = StObject.set(x, "secondarySelections", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecondarySelectionsVarargs(value: Selection*): Self = StObject.set(x, "secondarySelections", js.Array(value :_*))
    
    @scala.inline
    def setSelection(value: Selection): Self = StObject.set(x, "selection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
  }
}
