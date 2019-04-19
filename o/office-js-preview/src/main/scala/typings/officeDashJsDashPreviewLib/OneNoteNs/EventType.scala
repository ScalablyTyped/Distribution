package typings
package officeDashJsDashPreviewLib.OneNoteNs

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
  sealed trait notebookChanged
    extends officeDashJsDashPreviewLib.OneNoteNs.EventType
  
  @js.native
  sealed trait pageSelectionChanged
    extends officeDashJsDashPreviewLib.OneNoteNs.EventType
  
  @js.native
  sealed trait sectionSelectionChanged
    extends officeDashJsDashPreviewLib.OneNoteNs.EventType
  
  @js.native
  sealed trait stickyNotesContextMenuExecuted
    extends officeDashJsDashPreviewLib.OneNoteNs.EventType
  
  /* "NotebookChanged" */ val notebookChanged: notebookChanged with java.lang.String = js.native
  /* "PageSelectionChanged" */ val pageSelectionChanged: pageSelectionChanged with java.lang.String = js.native
  /* "SectionSelectionChanged" */ val sectionSelectionChanged: sectionSelectionChanged with java.lang.String = js.native
  /* "StickyNotesContextMenuExecuted" */ val stickyNotesContextMenuExecuted: stickyNotesContextMenuExecuted with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[officeDashJsDashPreviewLib.OneNoteNs.EventType with java.lang.String] = js.native
}

