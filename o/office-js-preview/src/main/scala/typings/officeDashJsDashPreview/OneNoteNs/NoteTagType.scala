package typings.officeDashJsDashPreview.OneNoteNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait NoteTagType extends js.Object

/**
  * [Api set: OneNoteApi 1.1]
  */
@JSGlobal("OneNote.NoteTagType")
@js.native
object NoteTagType extends js.Object {
  @js.native
  sealed trait address extends NoteTagType
  
  @js.native
  sealed trait contact extends NoteTagType
  
  @js.native
  sealed trait critical extends NoteTagType
  
  @js.native
  sealed trait idea extends NoteTagType
  
  @js.native
  sealed trait important extends NoteTagType
  
  @js.native
  sealed trait phoneNumber extends NoteTagType
  
  @js.native
  sealed trait question extends NoteTagType
  
  @js.native
  sealed trait toDo extends NoteTagType
  
  @js.native
  sealed trait toDoPriority1 extends NoteTagType
  
  @js.native
  sealed trait toDoPriority2 extends NoteTagType
  
  @js.native
  sealed trait unknown extends NoteTagType
  
  @js.native
  sealed trait website extends NoteTagType
  
  /* "Address" */ val address: typings.officeDashJsDashPreview.OneNoteNs.NoteTagType.address with String = js.native
  /* "Contact" */ val contact: typings.officeDashJsDashPreview.OneNoteNs.NoteTagType.contact with String = js.native
  /* "Critical" */ val critical: typings.officeDashJsDashPreview.OneNoteNs.NoteTagType.critical with String = js.native
  /* "Idea" */ val idea: typings.officeDashJsDashPreview.OneNoteNs.NoteTagType.idea with String = js.native
  /* "Important" */ val important: typings.officeDashJsDashPreview.OneNoteNs.NoteTagType.important with String = js.native
  /* "PhoneNumber" */ val phoneNumber: typings.officeDashJsDashPreview.OneNoteNs.NoteTagType.phoneNumber with String = js.native
  /* "Question" */ val question: typings.officeDashJsDashPreview.OneNoteNs.NoteTagType.question with String = js.native
  /* "ToDo" */ val toDo: typings.officeDashJsDashPreview.OneNoteNs.NoteTagType.toDo with String = js.native
  /* "ToDoPriority1" */ val toDoPriority1: typings.officeDashJsDashPreview.OneNoteNs.NoteTagType.toDoPriority1 with String = js.native
  /* "ToDoPriority2" */ val toDoPriority2: typings.officeDashJsDashPreview.OneNoteNs.NoteTagType.toDoPriority2 with String = js.native
  /* "Unknown" */ val unknown: typings.officeDashJsDashPreview.OneNoteNs.NoteTagType.unknown with String = js.native
  /* "Website" */ val website: typings.officeDashJsDashPreview.OneNoteNs.NoteTagType.website with String = js.native
  @JSBracketAccess
  def apply(value: String): js.UndefOr[NoteTagType with String] = js.native
}

