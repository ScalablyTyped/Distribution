package typings.officeJsPreview.OneNote

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait EventType extends StObject
/**
  * [Api set: OneNoteApi 1.3]
  */
@JSGlobal("OneNote.EventType")
@js.native
object EventType extends StObject {
  
  @js.native
  sealed trait notebookChanged extends EventType
  
  @js.native
  sealed trait pageSelectionChanged extends EventType
  
  @js.native
  sealed trait sectionSelectionChanged extends EventType
  
  @js.native
  sealed trait stickyNotesContextMenuExecuted extends EventType
}
