package typings.officeJs.global.OneNote

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * @remarks
  * [Api set: OneNoteApi 1.1]
  */
@JSGlobal("OneNote.NoteTagStatus")
@js.native
object NoteTagStatus extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[typings.officeJs.OneNote.NoteTagStatus & String] = js.native
  
  /* "Completed" */ val completed: typings.officeJs.OneNote.NoteTagStatus.completed & String = js.native
  
  /* "Disabled" */ val disabled: typings.officeJs.OneNote.NoteTagStatus.disabled & String = js.native
  
  /* "Normal" */ val normal: typings.officeJs.OneNote.NoteTagStatus.normal & String = js.native
  
  /* "OutlookTask" */ val outlookTask: typings.officeJs.OneNote.NoteTagStatus.outlookTask & String = js.native
  
  /* "TaskNotSyncedYet" */ val taskNotSyncedYet: typings.officeJs.OneNote.NoteTagStatus.taskNotSyncedYet & String = js.native
  
  /* "TaskRemoved" */ val taskRemoved: typings.officeJs.OneNote.NoteTagStatus.taskRemoved & String = js.native
  
  /* "Unknown" */ val unknown: typings.officeJs.OneNote.NoteTagStatus.unknown & String = js.native
}
