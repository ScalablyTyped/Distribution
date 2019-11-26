package typings.officeDashJsDashPreview.OneNote.Interfaces

import typings.officeDashJsDashPreview.OneNote.NoteTagStatus
import typings.officeDashJsDashPreview.OneNote.NoteTagType
import typings.officeDashJsDashPreview.officeDashJsDashPreviewStrings.Address
import typings.officeDashJsDashPreview.officeDashJsDashPreviewStrings.Completed
import typings.officeDashJsDashPreview.officeDashJsDashPreviewStrings.Contact
import typings.officeDashJsDashPreview.officeDashJsDashPreviewStrings.Critical
import typings.officeDashJsDashPreview.officeDashJsDashPreviewStrings.Disabled
import typings.officeDashJsDashPreview.officeDashJsDashPreviewStrings.Idea
import typings.officeDashJsDashPreview.officeDashJsDashPreviewStrings.Important
import typings.officeDashJsDashPreview.officeDashJsDashPreviewStrings.Normal
import typings.officeDashJsDashPreview.officeDashJsDashPreviewStrings.OutlookTask
import typings.officeDashJsDashPreview.officeDashJsDashPreviewStrings.PhoneNumber
import typings.officeDashJsDashPreview.officeDashJsDashPreviewStrings.Question
import typings.officeDashJsDashPreview.officeDashJsDashPreviewStrings.TaskNotSyncedYet
import typings.officeDashJsDashPreview.officeDashJsDashPreviewStrings.TaskRemoved
import typings.officeDashJsDashPreview.officeDashJsDashPreviewStrings.ToDo
import typings.officeDashJsDashPreview.officeDashJsDashPreviewStrings.ToDoPriority1
import typings.officeDashJsDashPreview.officeDashJsDashPreviewStrings.ToDoPriority2
import typings.officeDashJsDashPreview.officeDashJsDashPreviewStrings.Unknown_
import typings.officeDashJsDashPreview.officeDashJsDashPreviewStrings.Website
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

