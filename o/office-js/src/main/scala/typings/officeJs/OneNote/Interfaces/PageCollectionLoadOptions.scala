package typings.officeJs.OneNote.Interfaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  *
  * Represents a collection of pages.
  *
  * [Api set: OneNoteApi 1.1]
  */
@js.native
trait PageCollectionLoadOptions extends js.Object {
  
  @JSName("$all")
  var $all: js.UndefOr[Boolean] = js.native
  
  /**
    *
    * For EACH ITEM in the collection: Gets the ClassNotebookPageSource to the page.
    *
    * [Api set: OneNoteApi 1.1]
    */
  var classNotebookPageSource: js.UndefOr[Boolean] = js.native
  
  /**
    *
    * For EACH ITEM in the collection: The client url of the page. Read only
    *
    * [Api set: OneNoteApi 1.1]
    */
  var clientUrl: js.UndefOr[Boolean] = js.native
  
  /**
    *
    * For EACH ITEM in the collection: The collection of PageContent objects on the page. Read only
    *
    * [Api set: OneNoteApi 1.1]
    */
  var contents: js.UndefOr[PageContentCollectionLoadOptions] = js.native
  
  /**
    *
    * For EACH ITEM in the collection: Gets the ID of the page. Read-only.
    *
    * [Api set: OneNoteApi 1.1]
    */
  var id: js.UndefOr[Boolean] = js.native
  
  /**
    *
    * For EACH ITEM in the collection: Text interpretation for the ink on the page. Returns null if there is no ink analysis information. Read only.
    *
    * [Api set: OneNoteApi 1.1]
    */
  var inkAnalysisOrNull: js.UndefOr[InkAnalysisLoadOptions] = js.native
  
  /**
    *
    * For EACH ITEM in the collection: Gets or sets the indentation level of the page.
    *
    * [Api set: OneNoteApi 1.1]
    */
  var pageLevel: js.UndefOr[Boolean] = js.native
  
  /**
    *
    * For EACH ITEM in the collection: Gets the section that contains the page.
    *
    * [Api set: OneNoteApi 1.1]
    */
  var parentSection: js.UndefOr[SectionLoadOptions] = js.native
  
  /**
    *
    * For EACH ITEM in the collection: Gets or sets the title of the page.
    *
    * [Api set: OneNoteApi 1.1]
    */
  var title: js.UndefOr[Boolean] = js.native
  
  /**
    *
    * For EACH ITEM in the collection: The web url of the page. Read only
    *
    * [Api set: OneNoteApi 1.1]
    */
  var webUrl: js.UndefOr[Boolean] = js.native
}
object PageCollectionLoadOptions {
  
  @scala.inline
  def apply(): PageCollectionLoadOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PageCollectionLoadOptions]
  }
  
  @scala.inline
  implicit class PageCollectionLoadOptionsOps[Self <: PageCollectionLoadOptions] (val x: Self) extends AnyVal {
    
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
    def setClassNotebookPageSource(value: Boolean): Self = this.set("classNotebookPageSource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClassNotebookPageSource: Self = this.set("classNotebookPageSource", js.undefined)
    
    @scala.inline
    def setClientUrl(value: Boolean): Self = this.set("clientUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClientUrl: Self = this.set("clientUrl", js.undefined)
    
    @scala.inline
    def setContents(value: PageContentCollectionLoadOptions): Self = this.set("contents", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContents: Self = this.set("contents", js.undefined)
    
    @scala.inline
    def setId(value: Boolean): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    
    @scala.inline
    def setInkAnalysisOrNull(value: InkAnalysisLoadOptions): Self = this.set("inkAnalysisOrNull", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInkAnalysisOrNull: Self = this.set("inkAnalysisOrNull", js.undefined)
    
    @scala.inline
    def setPageLevel(value: Boolean): Self = this.set("pageLevel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePageLevel: Self = this.set("pageLevel", js.undefined)
    
    @scala.inline
    def setParentSection(value: SectionLoadOptions): Self = this.set("parentSection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParentSection: Self = this.set("parentSection", js.undefined)
    
    @scala.inline
    def setTitle(value: Boolean): Self = this.set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
    
    @scala.inline
    def setWebUrl(value: Boolean): Self = this.set("webUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWebUrl: Self = this.set("webUrl", js.undefined)
  }
}
