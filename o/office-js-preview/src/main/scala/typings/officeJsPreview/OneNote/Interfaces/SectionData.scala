package typings.officeJsPreview.OneNote.Interfaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface describing the data returned by calling "section.toJSON()". */
@js.native
trait SectionData extends js.Object {
  /**
    *
    * The client url of the section. Read only
    *
    * [Api set: OneNoteApi 1.1]
    */
  var clientUrl: js.UndefOr[String] = js.native
  /**
    *
    * Gets the ID of the section. Read-only.
    *
    * [Api set: OneNoteApi 1.1]
    */
  var id: js.UndefOr[String] = js.native
  /**
    *
    * True if this section is encrypted with a password. Read only
    *
    * [Api set: OneNoteApi 1.2]
    */
  var isEncrypted: js.UndefOr[Boolean] = js.native
  /**
    *
    * True if this section is locked. Read only
    *
    * [Api set: OneNoteApi 1.2]
    */
  var isLocked: js.UndefOr[Boolean] = js.native
  /**
    *
    * Gets the name of the section. Read-only.
    *
    * [Api set: OneNoteApi 1.1]
    */
  var name: js.UndefOr[String] = js.native
  /**
    *
    * The collection of pages in the section. Read only
    *
    * [Api set: OneNoteApi 1.1]
    */
  var pages: js.UndefOr[js.Array[PageData]] = js.native
  /**
    *
    * The web url of the page. Read only
    *
    * [Api set: OneNoteApi 1.1]
    */
  var webUrl: js.UndefOr[String] = js.native
}

object SectionData {
  @scala.inline
  def apply(): SectionData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SectionData]
  }
  @scala.inline
  implicit class SectionDataOps[Self <: SectionData] (val x: Self) extends AnyVal {
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
    def setClientUrl(value: String): Self = this.set("clientUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClientUrl: Self = this.set("clientUrl", js.undefined)
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    @scala.inline
    def setIsEncrypted(value: Boolean): Self = this.set("isEncrypted", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsEncrypted: Self = this.set("isEncrypted", js.undefined)
    @scala.inline
    def setIsLocked(value: Boolean): Self = this.set("isLocked", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsLocked: Self = this.set("isLocked", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setPagesVarargs(value: PageData*): Self = this.set("pages", js.Array(value :_*))
    @scala.inline
    def setPages(value: js.Array[PageData]): Self = this.set("pages", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePages: Self = this.set("pages", js.undefined)
    @scala.inline
    def setWebUrl(value: String): Self = this.set("webUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWebUrl: Self = this.set("webUrl", js.undefined)
  }
  
}

