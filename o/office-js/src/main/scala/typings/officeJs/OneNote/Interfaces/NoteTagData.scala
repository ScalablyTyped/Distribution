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
@js.native
trait NoteTagData extends js.Object {
  /**
    *
    * Gets the Id of the NoteTag object. Read-only.
    *
    * [Api set: OneNoteApi 1.1]
    */
  var id: js.UndefOr[String] = js.native
  /**
    *
    * Gets the status of the NoteTag object. Read-only.
    *
    * [Api set: OneNoteApi 1.1]
    */
  var status: js.UndefOr[
    NoteTagStatus | Unknown_ | Normal | Completed | Disabled | OutlookTask | TaskNotSyncedYet | TaskRemoved
  ] = js.native
  /**
    *
    * Gets the type of the NoteTag object. Read-only.
    *
    * [Api set: OneNoteApi 1.1]
    */
  var `type`: js.UndefOr[
    NoteTagType | Unknown_ | ToDo | Important | Question | Contact | Address | PhoneNumber | Website | Idea | Critical | ToDoPriority1 | ToDoPriority2
  ] = js.native
}

object NoteTagData {
  @scala.inline
  def apply(): NoteTagData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NoteTagData]
  }
  @scala.inline
  implicit class NoteTagDataOps[Self <: NoteTagData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    @scala.inline
    def setStatus(
      value: NoteTagStatus | Unknown_ | Normal | Completed | Disabled | OutlookTask | TaskNotSyncedYet | TaskRemoved
    ): Self = this.set("status", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatus: Self = this.set("status", js.undefined)
    @scala.inline
    def setType(
      value: NoteTagType | Unknown_ | ToDo | Important | Question | Contact | Address | PhoneNumber | Website | Idea | Critical | ToDoPriority1 | ToDoPriority2
    ): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
  
}

