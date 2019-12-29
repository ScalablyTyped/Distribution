package typings.officeDashJsDashPreview.OneNote

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[EventType with String] = js.native
  /* "NotebookChanged" */ @js.native
  object notebookChanged extends TopLevel[notebookChanged with String]
  
  /* "PageSelectionChanged" */ @js.native
  object pageSelectionChanged extends TopLevel[pageSelectionChanged with String]
  
  /* "SectionSelectionChanged" */ @js.native
  object sectionSelectionChanged extends TopLevel[sectionSelectionChanged with String]
  
  /* "StickyNotesContextMenuExecuted" */ @js.native
  object stickyNotesContextMenuExecuted extends TopLevel[stickyNotesContextMenuExecuted with String]
  
}

