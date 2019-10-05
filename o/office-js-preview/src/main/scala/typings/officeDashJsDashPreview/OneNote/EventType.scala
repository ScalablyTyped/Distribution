package typings.officeDashJsDashPreview.OneNote

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  
  /* "NotebookChanged" */ val notebookChanged: typings.officeDashJsDashPreview.OneNote.EventType.notebookChanged with String = js.native
  /* "PageSelectionChanged" */ val pageSelectionChanged: typings.officeDashJsDashPreview.OneNote.EventType.pageSelectionChanged with String = js.native
  /* "SectionSelectionChanged" */ val sectionSelectionChanged: typings.officeDashJsDashPreview.OneNote.EventType.sectionSelectionChanged with String = js.native
  /* "StickyNotesContextMenuExecuted" */ val stickyNotesContextMenuExecuted: typings.officeDashJsDashPreview.OneNote.EventType.stickyNotesContextMenuExecuted with String = js.native
  @JSBracketAccess
  def apply(value: String): js.UndefOr[EventType with String] = js.native
}

