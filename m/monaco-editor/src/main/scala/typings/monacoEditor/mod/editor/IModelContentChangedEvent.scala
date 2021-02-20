package typings.monacoEditor.mod.editor

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IModelContentChangedEvent extends StObject {
  
  val changes: js.Array[IModelContentChange] = js.native
  
  /**
    * The (new) end-of-line character.
    */
  val eol: String = js.native
  
  /**
    * Flag that indicates that all decorations were lost with this edit.
    * The model has been reset to a new value.
    */
  val isFlush: Boolean = js.native
  
  /**
    * Flag that indicates that this event was generated while redoing.
    */
  val isRedoing: Boolean = js.native
  
  /**
    * Flag that indicates that this event was generated while undoing.
    */
  val isUndoing: Boolean = js.native
  
  /**
    * The new version id the model has transitioned to.
    */
  val versionId: Double = js.native
}
object IModelContentChangedEvent {
  
  @scala.inline
  def apply(
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
  
  @scala.inline
  implicit class IModelContentChangedEventMutableBuilder[Self <: IModelContentChangedEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChanges(value: js.Array[IModelContentChange]): Self = StObject.set(x, "changes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChangesVarargs(value: IModelContentChange*): Self = StObject.set(x, "changes", js.Array(value :_*))
    
    @scala.inline
    def setEol(value: String): Self = StObject.set(x, "eol", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsFlush(value: Boolean): Self = StObject.set(x, "isFlush", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsRedoing(value: Boolean): Self = StObject.set(x, "isRedoing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsUndoing(value: Boolean): Self = StObject.set(x, "isUndoing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersionId(value: Double): Self = StObject.set(x, "versionId", value.asInstanceOf[js.Any])
  }
}
