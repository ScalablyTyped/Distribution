package typings.officeJs.OneNote.Interfaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  *
  * Represents a collection of section groups.
  *
  * [Api set: OneNoteApi 1.1]
  */
@js.native
trait SectionGroupCollectionLoadOptions extends js.Object {
  
  @JSName("$all")
  var $all: js.UndefOr[Boolean] = js.native
  
  /**
    *
    * For EACH ITEM in the collection: The client url of the section group. Read only
    *
    * [Api set: OneNoteApi 1.1]
    */
  var clientUrl: js.UndefOr[Boolean] = js.native
  
  /**
    *
    * For EACH ITEM in the collection: Gets the ID of the section group. Read-only.
    *
    * [Api set: OneNoteApi 1.1]
    */
  var id: js.UndefOr[Boolean] = js.native
  
  /**
    *
    * For EACH ITEM in the collection: Gets the name of the section group. Read-only.
    *
    * [Api set: OneNoteApi 1.1]
    */
  var name: js.UndefOr[Boolean] = js.native
  
  /**
    *
    * For EACH ITEM in the collection: Gets the notebook that contains the section group.
    *
    * [Api set: OneNoteApi 1.1]
    */
  var notebook: js.UndefOr[NotebookLoadOptions] = js.native
  
  /**
    *
    * For EACH ITEM in the collection: Gets the section group that contains the section group. Throws ItemNotFound if the section group is a direct child of the notebook.
    *
    * [Api set: OneNoteApi 1.1]
    */
  var parentSectionGroup: js.UndefOr[SectionGroupLoadOptions] = js.native
  
  /**
    *
    * For EACH ITEM in the collection: Gets the section group that contains the section group. Returns null if the section group is a direct child of the notebook.
    *
    * [Api set: OneNoteApi 1.1]
    */
  var parentSectionGroupOrNull: js.UndefOr[SectionGroupLoadOptions] = js.native
  
  /**
    *
    * For EACH ITEM in the collection: The collection of section groups in the section group. Read only
    *
    * [Api set: OneNoteApi 1.1]
    */
  var sectionGroups: js.UndefOr[SectionGroupCollectionLoadOptions] = js.native
  
  /**
    *
    * For EACH ITEM in the collection: The collection of sections in the section group. Read only
    *
    * [Api set: OneNoteApi 1.1]
    */
  var sections: js.UndefOr[SectionCollectionLoadOptions] = js.native
}
object SectionGroupCollectionLoadOptions {
  
  @scala.inline
  def apply(): SectionGroupCollectionLoadOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SectionGroupCollectionLoadOptions]
  }
  
  @scala.inline
  implicit class SectionGroupCollectionLoadOptionsOps[Self <: SectionGroupCollectionLoadOptions] (val x: Self) extends AnyVal {
    
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
    def setName(value: Boolean): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setNotebook(value: NotebookLoadOptions): Self = this.set("notebook", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNotebook: Self = this.set("notebook", js.undefined)
    
    @scala.inline
    def setParentSectionGroup(value: SectionGroupLoadOptions): Self = this.set("parentSectionGroup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParentSectionGroup: Self = this.set("parentSectionGroup", js.undefined)
    
    @scala.inline
    def setParentSectionGroupOrNull(value: SectionGroupLoadOptions): Self = this.set("parentSectionGroupOrNull", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParentSectionGroupOrNull: Self = this.set("parentSectionGroupOrNull", js.undefined)
    
    @scala.inline
    def setSectionGroups(value: SectionGroupCollectionLoadOptions): Self = this.set("sectionGroups", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSectionGroups: Self = this.set("sectionGroups", js.undefined)
    
    @scala.inline
    def setSections(value: SectionCollectionLoadOptions): Self = this.set("sections", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSections: Self = this.set("sections", js.undefined)
  }
}
