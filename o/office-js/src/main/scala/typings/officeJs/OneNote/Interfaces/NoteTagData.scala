package typings.officeJs.OneNote.Interfaces

import typings.officeJs.OneNote.NoteTagStatus
import typings.officeJs.OneNote.NoteTagType
import typings.officeJs.officeJsStrings.Address
import typings.officeJs.officeJsStrings.Completed
import typings.officeJs.officeJsStrings.Contact
import typings.officeJs.officeJsStrings.Critical
import typings.officeJs.officeJsStrings.Disabled
import typings.officeJs.officeJsStrings.Idea
import typings.officeJs.officeJsStrings.Important
import typings.officeJs.officeJsStrings.Normal
import typings.officeJs.officeJsStrings.OutlookTask
import typings.officeJs.officeJsStrings.PhoneNumber
import typings.officeJs.officeJsStrings.Question
import typings.officeJs.officeJsStrings.TaskNotSyncedYet
import typings.officeJs.officeJsStrings.TaskRemoved
import typings.officeJs.officeJsStrings.ToDo
import typings.officeJs.officeJsStrings.ToDoPriority1
import typings.officeJs.officeJsStrings.ToDoPriority2
import typings.officeJs.officeJsStrings.Unknown_
import typings.officeJs.officeJsStrings.Website
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface describing the data returned by calling "noteTag.toJSON()". */
trait NoteTagData extends js.Object {
  /**
    *
    * Gets the Id of the NoteTag object. Read-only.
    *
    * [Api set: OneNoteApi 1.1]
    */
  var id: js.UndefOr[String] = js.undefined
  /**
    *
    * Gets the status of the NoteTag object. Read-only.
    *
    * [Api set: OneNoteApi 1.1]
    */
  var status: js.UndefOr[
    NoteTagStatus | Unknown_ | Normal | Completed | Disabled | OutlookTask | TaskNotSyncedYet | TaskRemoved
  ] = js.undefined
  /**
    *
    * Gets the type of the NoteTag object. Read-only.
    *
    * [Api set: OneNoteApi 1.1]
    */
  var `type`: js.UndefOr[
    NoteTagType | Unknown_ | ToDo | Important | Question | Contact | Address | PhoneNumber | Website | Idea | Critical | ToDoPriority1 | ToDoPriority2
  ] = js.undefined
}

object NoteTagData {
  @scala.inline
  def apply(
    id: String = null,
    status: NoteTagStatus | Unknown_ | Normal | Completed | Disabled | OutlookTask | TaskNotSyncedYet | TaskRemoved = null,
    `type`: NoteTagType | Unknown_ | ToDo | Important | Question | Contact | Address | PhoneNumber | Website | Idea | Critical | ToDoPriority1 | ToDoPriority2 = null
  ): NoteTagData = {
    val __obj = js.Dynamic.literal()
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[NoteTagData]
  }
}

