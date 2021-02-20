package typings.officeJsPreview.OneNote

import typings.officeJsPreview.officeJsPreviewStrings.StickyNotesContextMenuExecuted
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  *
  * Provides information about the binding that raised the StickyNotesContextMenuExecuted event
  *
  * [Api set: OneNoteApi 1.5]
  */
@js.native
trait StickyNotesContextMenuExecutedEventArgs extends StObject {
  
  /**
    *
    * Gets the type of the event. See EventType for details.
    *
    * [Api set: OneNoteApi 1.5]
    */
  var `type`: StickyNotesContextMenuExecuted = js.native
}
object StickyNotesContextMenuExecutedEventArgs {
  
  @scala.inline
  def apply(`type`: StickyNotesContextMenuExecuted): StickyNotesContextMenuExecutedEventArgs = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[StickyNotesContextMenuExecutedEventArgs]
  }
  
  @scala.inline
  implicit class StickyNotesContextMenuExecutedEventArgsMutableBuilder[Self <: StickyNotesContextMenuExecutedEventArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: StickyNotesContextMenuExecuted): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
