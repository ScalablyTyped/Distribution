package typings.officeJsPreview.OneNote.Interfaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Represents a collection of sections.
  *
  * [Api set: OneNoteApi 1.1]
  */
@js.native
trait SectionCollectionLoadOptions extends js.Object {
  @JSName("$all")
  var $all: js.UndefOr[Boolean] = js.native
  /**
    *
    * For EACH ITEM in the collection: The client url of the section. Read only
    *
    * [Api set: OneNoteApi 1.1]
    */
  var clientUrl: js.UndefOr[Boolean] = js.native
  /**
    *
    * For EACH ITEM in the collection: Gets the ID of the section. Read-only.
    *
    * [Api set: OneNoteApi 1.1]
    */
  var id: js.UndefOr[Boolean] = js.native
  /**
    *
    * For EACH ITEM in the collection: True if this section is encrypted with a password. Read only
    *
    * [Api set: OneNoteApi 1.2]
    */
  var isEncrypted: js.UndefOr[Boolean] = js.native
  /**
    *
    * For EACH ITEM in the collection: True if this section is locked. Read only
    *
    * [Api set: OneNoteApi 1.2]
    */
  var isLocked: js.UndefOr[Boolean] = js.native
  /**
    *
    * For EACH ITEM in the collection: Gets the name of the section. Read-only.
    *
    * [Api set: OneNoteApi 1.1]
    */
  var name: js.UndefOr[Boolean] = js.native
  /**
    *
    * For EACH ITEM in the collection: Gets the notebook that contains the section.
    *
    * [Api set: OneNoteApi 1.1]
    */
  var notebook: js.UndefOr[NotebookLoadOptions] = js.native
  /**
    *
    * For EACH ITEM in the collection: The collection of pages in the section. Read only
    *
    * [Api set: OneNoteApi 1.1]
    */
  var pages: js.UndefOr[PageCollectionLoadOptions] = js.native
  /**
    *
    * For EACH ITEM in the collection: Gets the section group that contains the section. Throws ItemNotFound if the section is a direct child of the notebook.
    *
    * [Api set: OneNoteApi 1.1]
    */
  var parentSectionGroup: js.UndefOr[SectionGroupLoadOptions] = js.native
  /**
    *
    * For EACH ITEM in the collection: Gets the section group that contains the section. Returns null if the section is a direct child of the notebook.
    *
    * [Api set: OneNoteApi 1.1]
    */
  var parentSectionGroupOrNull: js.UndefOr[SectionGroupLoadOptions] = js.native
  /**
    *
    * For EACH ITEM in the collection: The web url of the page. Read only
    *
    * [Api set: OneNoteApi 1.1]
    */
  var webUrl: js.UndefOr[Boolean] = js.native
}

object SectionCollectionLoadOptions {
  @scala.inline
  def apply(): SectionCollectionLoadOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SectionCollectionLoadOptions]
  }
  @scala.inline
  implicit class SectionCollectionLoadOptionsOps[Self <: SectionCollectionLoadOptions] (val x: Self) extends AnyVal {
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
    def set$all(value: Boolean): Self = this.set("$all", value.asInstanceOf[js.Any])
    @scala.inline
    def delete$all: Self = this.set("$all", js.undefined)
    @scala.inline
    def setClientUrl(value: Boolean): Self = this.set("clientUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClientUrl: Self = this.set("clientUrl", js.undefined)
    @scala.inline
    def setId(value: Boolean): Self = this.set("id", value.asInstanceOf[js.Any])
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
    def setName(value: Boolean): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setNotebook(value: NotebookLoadOptions): Self = this.set("notebook", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNotebook: Self = this.set("notebook", js.undefined)
    @scala.inline
    def setPages(value: PageCollectionLoadOptions): Self = this.set("pages", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePages: Self = this.set("pages", js.undefined)
    @scala.inline
    def setParentSectionGroup(value: SectionGroupLoadOptions): Self = this.set("parentSectionGroup", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteParentSectionGroup: Self = this.set("parentSectionGroup", js.undefined)
    @scala.inline
    def setParentSectionGroupOrNull(value: SectionGroupLoadOptions): Self = this.set("parentSectionGroupOrNull", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteParentSectionGroupOrNull: Self = this.set("parentSectionGroupOrNull", js.undefined)
    @scala.inline
    def setWebUrl(value: Boolean): Self = this.set("webUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWebUrl: Self = this.set("webUrl", js.undefined)
  }
  
}

