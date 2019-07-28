package typings.officeDashJs.OneNoteNs

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
  
  /* "Completed" */ val completed: typings.officeDashJs.OneNoteNs.NoteTagStatus.completed with String = js.native
  /* "Disabled" */ val disabled: typings.officeDashJs.OneNoteNs.NoteTagStatus.disabled with String = js.native
  /* "Normal" */ val normal: typings.officeDashJs.OneNoteNs.NoteTagStatus.normal with String = js.native
  /* "OutlookTask" */ val outlookTask: typings.officeDashJs.OneNoteNs.NoteTagStatus.outlookTask with String = js.native
  /* "TaskNotSyncedYet" */ val taskNotSyncedYet: typings.officeDashJs.OneNoteNs.NoteTagStatus.taskNotSyncedYet with String = js.native
  /* "TaskRemoved" */ val taskRemoved: typings.officeDashJs.OneNoteNs.NoteTagStatus.taskRemoved with String = js.native
  /* "Unknown" */ val unknown: typings.officeDashJs.OneNoteNs.NoteTagStatus.unknown with String = js.native
  @JSBracketAccess
  def apply(value: String): js.UndefOr[NoteTagStatus with String] = js.native
}

