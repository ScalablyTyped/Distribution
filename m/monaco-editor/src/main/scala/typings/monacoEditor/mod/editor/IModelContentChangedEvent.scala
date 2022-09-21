package typings.monacoEditor.mod.editor

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IModelContentChangedEvent extends StObject {
  
  val changes: js.Array[IModelContentChange]
  
  /**
    * The (new) end-of-line character.
    */
  val eol: String
  
  /**
    * Flag that indicates that all decorations were lost with this edit.
    * The model has been reset to a new value.
    */
  val isFlush: Boolean
  
  /**
    * Flag that indicates that this event was generated while redoing.
    */
  val isRedoing: Boolean
  
  /**
    * Flag that indicates that this event was generated while undoing.
    */
  val isUndoing: Boolean
  
  /**
    * The new version id the model has transitioned to.
    */
  val versionId: Double
}
object IModelContentChangedEvent {
  
  inline def apply(
    changes: js.Array[IModelContentChange],
    eol: String,
    isFlush: Boolean,
    isRedoing: Boolean,
    isUndoing: Boolean,
    versionId: Double
  ): IModelContentChangedEvent = {
    val __obj = js.Dynamic.literal(changes = changes.asInstanceOf[js.Any], eol = eol.asInstanceOf[js.Any], isFlush = isFlush.asInstanceOf[js.Any], isRedoing = isRedoing.asInstanceOf[js.Any], isUndoing = isUndoing.asInstanceOf[js.Any], versionId = versionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[IModelContentChangedEvent]
  }
  
  extension [Self <: IModelContentChangedEvent](x: Self) {
    
    inline def setChanges(value: js.Array[IModelContentChange]): Self = StObject.set(x, "changes", value.asInstanceOf[js.Any])
    
    inline def setChangesVarargs(value: IModelContentChange*): Self = StObject.set(x, "changes", js.Array(value*))
    
    inline def setEol(value: String): Self = StObject.set(x, "eol", value.asInstanceOf[js.Any])
    
    inline def setIsFlush(value: Boolean): Self = StObject.set(x, "isFlush", value.asInstanceOf[js.Any])
    
    inline def setIsRedoing(value: Boolean): Self = StObject.set(x, "isRedoing", value.asInstanceOf[js.Any])
    
    inline def setIsUndoing(value: Boolean): Self = StObject.set(x, "isUndoing", value.asInstanceOf[js.Any])
    
    inline def setVersionId(value: Double): Self = StObject.set(x, "versionId", value.asInstanceOf[js.Any])
  }
}
