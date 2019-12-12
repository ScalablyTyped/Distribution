package typings.officeDashJsDashPreview.OneNote

import org.scalablytyped.runtime.TopLevel
import typings.officeDashJsDashPreview.OneNote.NoteTagStatus.completed
import typings.officeDashJsDashPreview.OneNote.NoteTagStatus.disabled
import typings.officeDashJsDashPreview.OneNote.NoteTagStatus.normal
import typings.officeDashJsDashPreview.OneNote.NoteTagStatus.outlookTask
import typings.officeDashJsDashPreview.OneNote.NoteTagStatus.taskNotSyncedYet
import typings.officeDashJsDashPreview.OneNote.NoteTagStatus.taskRemoved
import typings.officeDashJsDashPreview.OneNote.NoteTagStatus.unknown
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
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[NoteTagStatus with String] = js.native
  /* "Completed" */ @js.native
  object completed extends TopLevel[completed with String]
  
  /* "Disabled" */ @js.native
  object disabled extends TopLevel[disabled with String]
  
  /* "Normal" */ @js.native
  object normal extends TopLevel[normal with String]
  
  /* "OutlookTask" */ @js.native
  object outlookTask extends TopLevel[outlookTask with String]
  
  /* "TaskNotSyncedYet" */ @js.native
  object taskNotSyncedYet extends TopLevel[taskNotSyncedYet with String]
  
  /* "TaskRemoved" */ @js.native
  object taskRemoved extends TopLevel[taskRemoved with String]
  
  /* "Unknown" */ @js.native
  object unknown extends TopLevel[unknown with String]
  
}

