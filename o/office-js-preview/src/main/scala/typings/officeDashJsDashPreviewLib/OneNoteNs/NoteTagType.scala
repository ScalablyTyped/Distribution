package typings
package officeDashJsDashPreviewLib.OneNoteNs

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
  sealed trait address
    extends officeDashJsDashPreviewLib.OneNoteNs.NoteTagType
  
  @js.native
  sealed trait contact
    extends officeDashJsDashPreviewLib.OneNoteNs.NoteTagType
  
  @js.native
  sealed trait critical
    extends officeDashJsDashPreviewLib.OneNoteNs.NoteTagType
  
  @js.native
  sealed trait idea
    extends officeDashJsDashPreviewLib.OneNoteNs.NoteTagType
  
  @js.native
  sealed trait important
    extends officeDashJsDashPreviewLib.OneNoteNs.NoteTagType
  
  @js.native
  sealed trait phoneNumber
    extends officeDashJsDashPreviewLib.OneNoteNs.NoteTagType
  
  @js.native
  sealed trait question
    extends officeDashJsDashPreviewLib.OneNoteNs.NoteTagType
  
  @js.native
  sealed trait toDo
    extends officeDashJsDashPreviewLib.OneNoteNs.NoteTagType
  
  @js.native
  sealed trait toDoPriority1
    extends officeDashJsDashPreviewLib.OneNoteNs.NoteTagType
  
  @js.native
  sealed trait toDoPriority2
    extends officeDashJsDashPreviewLib.OneNoteNs.NoteTagType
  
  @js.native
  sealed trait unknown
    extends officeDashJsDashPreviewLib.OneNoteNs.NoteTagType
  
  @js.native
  sealed trait website
    extends officeDashJsDashPreviewLib.OneNoteNs.NoteTagType
  
  /* "Address" */ val address: address with java.lang.String = js.native
  /* "Contact" */ val contact: contact with java.lang.String = js.native
  /* "Critical" */ val critical: critical with java.lang.String = js.native
  /* "Idea" */ val idea: idea with java.lang.String = js.native
  /* "Important" */ val important: important with java.lang.String = js.native
  /* "PhoneNumber" */ val phoneNumber: phoneNumber with java.lang.String = js.native
  /* "Question" */ val question: question with java.lang.String = js.native
  /* "ToDo" */ val toDo: toDo with java.lang.String = js.native
  /* "ToDoPriority1" */ val toDoPriority1: toDoPriority1 with java.lang.String = js.native
  /* "ToDoPriority2" */ val toDoPriority2: toDoPriority2 with java.lang.String = js.native
  /* "Unknown" */ val unknown: unknown with java.lang.String = js.native
  /* "Website" */ val website: website with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[officeDashJsDashPreviewLib.OneNoteNs.NoteTagType with java.lang.String] = js.native
}

