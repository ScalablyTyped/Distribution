package typings.officeJsPreview.global.OneNote

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * [Api set: OneNoteApi 1.3]
  */
@JSGlobal("OneNote.EventType")
@js.native
object EventType extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[typings.officeJsPreview.OneNote.EventType with String] = js.native
  
  /* "NotebookChanged" */ val notebookChanged: typings.officeJsPreview.OneNote.EventType.notebookChanged with String = js.native
  
  /* "PageSelectionChanged" */ val pageSelectionChanged: typings.officeJsPreview.OneNote.EventType.pageSelectionChanged with String = js.native
  
  /* "SectionSelectionChanged" */ val sectionSelectionChanged: typings.officeJsPreview.OneNote.EventType.sectionSelectionChanged with String = js.native
  
  /* "StickyNotesContextMenuExecuted" */ val stickyNotesContextMenuExecuted: typings.officeJsPreview.OneNote.EventType.stickyNotesContextMenuExecuted with String = js.native
}
