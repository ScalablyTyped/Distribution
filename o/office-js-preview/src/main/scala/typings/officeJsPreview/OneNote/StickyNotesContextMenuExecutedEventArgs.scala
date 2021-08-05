package typings.officeJsPreview.OneNote

import typings.officeJsPreview.officeJsPreviewStrings.StickyNotesContextMenuExecuted
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  *
  * Provides information about the binding that raised the StickyNotesContextMenuExecuted event
  *
  * [Api set: OneNoteApi 1.5]
  */
trait StickyNotesContextMenuExecutedEventArgs extends StObject {
  
  /**
    *
    * Gets the type of the event. See EventType for details.
    *
    * [Api set: OneNoteApi 1.5]
    */
  var `type`: StickyNotesContextMenuExecuted
}
object StickyNotesContextMenuExecutedEventArgs {
  
  inline def apply(): StickyNotesContextMenuExecutedEventArgs = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("StickyNotesContextMenuExecuted")
    __obj.asInstanceOf[StickyNotesContextMenuExecutedEventArgs]
  }
  
  extension [Self <: StickyNotesContextMenuExecutedEventArgs](x: Self) {
    
    inline def setType(value: StickyNotesContextMenuExecuted): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
