package typings.officeDashJs.OneNote.Interfaces

import typings.officeDashJs.OneNote.NoteTagStatus
import typings.officeDashJs.OneNote.NoteTagType
import typings.officeDashJs.officeDashJsStrings.Address
import typings.officeDashJs.officeDashJsStrings.Completed
import typings.officeDashJs.officeDashJsStrings.Contact
import typings.officeDashJs.officeDashJsStrings.Critical
import typings.officeDashJs.officeDashJsStrings.Disabled
import typings.officeDashJs.officeDashJsStrings.Idea
import typings.officeDashJs.officeDashJsStrings.Important
import typings.officeDashJs.officeDashJsStrings.Normal
import typings.officeDashJs.officeDashJsStrings.OutlookTask
import typings.officeDashJs.officeDashJsStrings.PhoneNumber
import typings.officeDashJs.officeDashJsStrings.Question
import typings.officeDashJs.officeDashJsStrings.TaskNotSyncedYet
import typings.officeDashJs.officeDashJsStrings.TaskRemoved
import typings.officeDashJs.officeDashJsStrings.ToDo
import typings.officeDashJs.officeDashJsStrings.ToDoPriority1
import typings.officeDashJs.officeDashJsStrings.ToDoPriority2
import typings.officeDashJs.officeDashJsStrings.Unknown
import typings.officeDashJs.officeDashJsStrings.Website
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
    NoteTagStatus | Unknown | Normal | Completed | Disabled | OutlookTask | TaskNotSyncedYet | TaskRemoved
  ] = js.undefined
  /**
    *
    * Gets the type of the NoteTag object. Read-only.
    *
    * [Api set: OneNoteApi 1.1]
    */
  var `type`: js.UndefOr[
    NoteTagType | Unknown | ToDo | Important | Question | Contact | Address | PhoneNumber | Website | Idea | Critical | ToDoPriority1 | ToDoPriority2
  ] = js.undefined
}

object NoteTagData {
  @scala.inline
  def apply(
    id: String = null,
    status: NoteTagStatus | Unknown | Normal | Completed | Disabled | OutlookTask | TaskNotSyncedYet | TaskRemoved = null,
    `type`: NoteTagType | Unknown | ToDo | Important | Question | Contact | Address | PhoneNumber | Website | Idea | Critical | ToDoPriority1 | ToDoPriority2 = null
  ): NoteTagData = {
    val __obj = js.Dynamic.literal()
    if (id != null) __obj.updateDynamic("id")(id)
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[NoteTagData]
  }
}

