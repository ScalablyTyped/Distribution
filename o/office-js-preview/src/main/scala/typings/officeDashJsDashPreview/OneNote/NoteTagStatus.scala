package typings.officeDashJsDashPreview.OneNote

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait NoteTagStatus extends js.Object

/**
  * [Api set: OneNoteApi 1.1]
  */
@JSGlobal("OneNote.NoteTagStatus")
@js.native
object NoteTagStatus extends js.Object {
  @js.native
  sealed trait completed extends NoteTagStatus
  
  @js.native
  sealed trait disabled extends NoteTagStatus
  
  @js.native
  sealed trait normal extends NoteTagStatus
  
  @js.native
  sealed trait outlookTask extends NoteTagStatus
  
  @js.native
  sealed trait taskNotSyncedYet extends NoteTagStatus
  
  @js.native
  sealed trait taskRemoved extends NoteTagStatus
  
  @js.native
  sealed trait unknown extends NoteTagStatus
  
  /* "Completed" */ val completed: typings.officeDashJsDashPreview.OneNote.NoteTagStatus.completed with String = js.native
  /* "Disabled" */ val disabled: typings.officeDashJsDashPreview.OneNote.NoteTagStatus.disabled with String = js.native
  /* "Normal" */ val normal: typings.officeDashJsDashPreview.OneNote.NoteTagStatus.normal with String = js.native
  /* "OutlookTask" */ val outlookTask: typings.officeDashJsDashPreview.OneNote.NoteTagStatus.outlookTask with String = js.native
  /* "TaskNotSyncedYet" */ val taskNotSyncedYet: typings.officeDashJsDashPreview.OneNote.NoteTagStatus.taskNotSyncedYet with String = js.native
  /* "TaskRemoved" */ val taskRemoved: typings.officeDashJsDashPreview.OneNote.NoteTagStatus.taskRemoved with String = js.native
  /* "Unknown" */ val unknown: typings.officeDashJsDashPreview.OneNote.NoteTagStatus.unknown with String = js.native
  @JSBracketAccess
  def apply(value: String): js.UndefOr[NoteTagStatus with String] = js.native
}

