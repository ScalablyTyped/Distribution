package typings.officeJsPreview.global.OneNote

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * [Api set: OneNoteApi 1.3]
  */
@JSGlobal("OneNote.EventType")
@js.native
object EventType extends js.Object {
  /* "NotebookChanged" */ val notebookChanged: typings.officeJsPreview.OneNote.EventType.notebookChanged with String = js.native
  /* "PageSelectionChanged" */ val pageSelectionChanged: typings.officeJsPreview.OneNote.EventType.pageSelectionChanged with String = js.native
  /* "SectionSelectionChanged" */ val sectionSelectionChanged: typings.officeJsPreview.OneNote.EventType.sectionSelectionChanged with String = js.native
  /* "StickyNotesContextMenuExecuted" */ val stickyNotesContextMenuExecuted: typings.officeJsPreview.OneNote.EventType.stickyNotesContextMenuExecuted with String = js.native
  @JSBracketAccess
  def apply(value: String): js.UndefOr[typings.officeJsPreview.OneNote.EventType with String] = js.native
}

