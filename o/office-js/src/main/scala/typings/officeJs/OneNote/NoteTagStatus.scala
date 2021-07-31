package typings.officeJs.OneNote

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait NoteTagStatus extends StObject
/**
  * [Api set: OneNoteApi 1.1]
  */
@JSGlobal("OneNote.NoteTagStatus")
@js.native
object NoteTagStatus extends StObject {
  
  @js.native
  sealed trait completed
    extends StObject
       with NoteTagStatus
  
  @js.native
  sealed trait disabled
    extends StObject
       with NoteTagStatus
  
  @js.native
  sealed trait normal
    extends StObject
       with NoteTagStatus
  
  @js.native
  sealed trait outlookTask
    extends StObject
       with NoteTagStatus
  
  @js.native
  sealed trait taskNotSyncedYet
    extends StObject
       with NoteTagStatus
  
  @js.native
  sealed trait taskRemoved
    extends StObject
       with NoteTagStatus
  
  @js.native
  sealed trait unknown
    extends StObject
       with NoteTagStatus
}
