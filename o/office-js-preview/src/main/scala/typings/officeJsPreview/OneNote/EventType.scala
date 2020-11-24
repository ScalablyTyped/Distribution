package typings.officeJsPreview.OneNote

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait EventType extends js.Object
/**
  * [Api set: OneNoteApi 1.3]
  */
@JSGlobal("OneNote.EventType")
@js.native
object EventType extends js.Object {
  
  @js.native
  sealed trait notebookChanged extends EventType
  
  @js.native
  sealed trait pageSelectionChanged extends EventType
  
  @js.native
  sealed trait sectionSelectionChanged extends EventType
  
  @js.native
  sealed trait stickyNotesContextMenuExecuted extends EventType
}
