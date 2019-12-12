package typings.officeDashJsDashPreview.OneNote

import org.scalablytyped.runtime.TopLevel
import typings.officeDashJsDashPreview.OneNote.NoteTagType.address
import typings.officeDashJsDashPreview.OneNote.NoteTagType.contact
import typings.officeDashJsDashPreview.OneNote.NoteTagType.critical
import typings.officeDashJsDashPreview.OneNote.NoteTagType.idea
import typings.officeDashJsDashPreview.OneNote.NoteTagType.important
import typings.officeDashJsDashPreview.OneNote.NoteTagType.phoneNumber
import typings.officeDashJsDashPreview.OneNote.NoteTagType.question
import typings.officeDashJsDashPreview.OneNote.NoteTagType.toDo
import typings.officeDashJsDashPreview.OneNote.NoteTagType.toDoPriority1
import typings.officeDashJsDashPreview.OneNote.NoteTagType.toDoPriority2
import typings.officeDashJsDashPreview.OneNote.NoteTagType.unknown
import typings.officeDashJsDashPreview.OneNote.NoteTagType.website
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
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[NoteTagType with String] = js.native
  /* "Address" */ @js.native
  object address extends TopLevel[address with String]
  
  /* "Contact" */ @js.native
  object contact extends TopLevel[contact with String]
  
  /* "Critical" */ @js.native
  object critical extends TopLevel[critical with String]
  
  /* "Idea" */ @js.native
  object idea extends TopLevel[idea with String]
  
  /* "Important" */ @js.native
  object important extends TopLevel[important with String]
  
  /* "PhoneNumber" */ @js.native
  object phoneNumber extends TopLevel[phoneNumber with String]
  
  /* "Question" */ @js.native
  object question extends TopLevel[question with String]
  
  /* "ToDo" */ @js.native
  object toDo extends TopLevel[toDo with String]
  
  /* "ToDoPriority1" */ @js.native
  object toDoPriority1 extends TopLevel[toDoPriority1 with String]
  
  /* "ToDoPriority2" */ @js.native
  object toDoPriority2 extends TopLevel[toDoPriority2 with String]
  
  /* "Unknown" */ @js.native
  object unknown extends TopLevel[unknown with String]
  
  /* "Website" */ @js.native
  object website extends TopLevel[website with String]
  
}

