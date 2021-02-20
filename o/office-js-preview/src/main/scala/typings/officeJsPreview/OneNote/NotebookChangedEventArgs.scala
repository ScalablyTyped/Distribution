package typings.officeJsPreview.OneNote

import typings.officeJsPreview.officeJsPreviewStrings.NotebookChanged
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  *
  * Provides information about the binding that raised the DataChanged event
  *
  * [Api set: OneNoteApi 1.1]
  */
@js.native
trait NotebookChangedEventArgs extends StObject {
  
  /**
    *
    * Notebook id before change
    *
    * [Api set: OneNoteApi 1.3]
    */
  var oldId: String = js.native
  
  /**
    *
    * Gets the type of the event. See EventType for details.
    *
    * [Api set: OneNoteApi 1.3]
    */
  var `type`: NotebookChanged = js.native
}
object NotebookChangedEventArgs {
  
  @scala.inline
  def apply(oldId: String, `type`: NotebookChanged): NotebookChangedEventArgs = {
    val __obj = js.Dynamic.literal(oldId = oldId.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[NotebookChangedEventArgs]
  }
  
  @scala.inline
  implicit class NotebookChangedEventArgsMutableBuilder[Self <: NotebookChangedEventArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOldId(value: String): Self = StObject.set(x, "oldId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: NotebookChanged): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
