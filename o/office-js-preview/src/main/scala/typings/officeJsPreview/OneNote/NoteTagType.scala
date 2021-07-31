package typings.officeJsPreview.OneNote

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait NoteTagType extends StObject
/**
  * [Api set: OneNoteApi 1.1]
  */
@JSGlobal("OneNote.NoteTagType")
@js.native
object NoteTagType extends StObject {
  
  @js.native
  sealed trait address
    extends StObject
       with NoteTagType
  
  @js.native
  sealed trait contact
    extends StObject
       with NoteTagType
  
  @js.native
  sealed trait critical
    extends StObject
       with NoteTagType
  
  @js.native
  sealed trait idea
    extends StObject
       with NoteTagType
  
  @js.native
  sealed trait important
    extends StObject
       with NoteTagType
  
  @js.native
  sealed trait phoneNumber
    extends StObject
       with NoteTagType
  
  @js.native
  sealed trait question
    extends StObject
       with NoteTagType
  
  @js.native
  sealed trait toDo
    extends StObject
       with NoteTagType
  
  @js.native
  sealed trait toDoPriority1
    extends StObject
       with NoteTagType
  
  @js.native
  sealed trait toDoPriority2
    extends StObject
       with NoteTagType
  
  @js.native
  sealed trait unknown
    extends StObject
       with NoteTagType
  
  @js.native
  sealed trait website
    extends StObject
       with NoteTagType
}
