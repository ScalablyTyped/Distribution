package typings.officeJsPreview.OneNote.Interfaces

import typings.officeJsPreview.OneNote.NoteTagStatus
import typings.officeJsPreview.OneNote.NoteTagType
import typings.officeJsPreview.officeJsPreviewStrings.Address
import typings.officeJsPreview.officeJsPreviewStrings.Completed
import typings.officeJsPreview.officeJsPreviewStrings.Contact
import typings.officeJsPreview.officeJsPreviewStrings.Critical
import typings.officeJsPreview.officeJsPreviewStrings.Disabled
import typings.officeJsPreview.officeJsPreviewStrings.Idea
import typings.officeJsPreview.officeJsPreviewStrings.Important
import typings.officeJsPreview.officeJsPreviewStrings.Normal
import typings.officeJsPreview.officeJsPreviewStrings.OutlookTask
import typings.officeJsPreview.officeJsPreviewStrings.PhoneNumber
import typings.officeJsPreview.officeJsPreviewStrings.Question
import typings.officeJsPreview.officeJsPreviewStrings.TaskNotSyncedYet
import typings.officeJsPreview.officeJsPreviewStrings.TaskRemoved
import typings.officeJsPreview.officeJsPreviewStrings.ToDo
import typings.officeJsPreview.officeJsPreviewStrings.ToDoPriority1
import typings.officeJsPreview.officeJsPreviewStrings.ToDoPriority2
import typings.officeJsPreview.officeJsPreviewStrings.Unknown_
import typings.officeJsPreview.officeJsPreviewStrings.Website
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

