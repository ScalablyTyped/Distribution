package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OnenoteSection extends OnenoteEntityHierarchyModel {
  
  // Indicates whether this is the user's default section. Read-only.
  var isDefault: js.UndefOr[NullableOption[Boolean]] = js.native
  
  /**
    * Links for opening the section. The oneNoteClientURL link opens the section in the OneNote native client if it's
    * installed. The oneNoteWebURL link opens the section in OneNote on the web.
    */
  var links: js.UndefOr[NullableOption[SectionLinks]] = js.native
  
  // The collection of pages in the section. Read-only. Nullable.
  var pages: js.UndefOr[NullableOption[js.Array[OnenotePage]]] = js.native
  
  // The pages endpoint where you can get details for all the pages in the section. Read-only.
  var pagesUrl: js.UndefOr[NullableOption[String]] = js.native
  
  // The notebook that contains the section. Read-only.
  var parentNotebook: js.UndefOr[NullableOption[Notebook]] = js.native
  
  // The section group that contains the section. Read-only.
  var parentSectionGroup: js.UndefOr[NullableOption[SectionGroup]] = js.native
}
object OnenoteSection {
  
  @scala.inline
  def apply(): OnenoteSection = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OnenoteSection]
  }
  
  @scala.inline
  implicit class OnenoteSectionOps[Self <: OnenoteSection] (val x: Self) extends AnyVal {
    
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
    def setIsDefault(value: NullableOption[Boolean]): Self = this.set("isDefault", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsDefault: Self = this.set("isDefault", js.undefined)
    
    @scala.inline
    def setIsDefaultNull: Self = this.set("isDefault", null)
    
    @scala.inline
    def setLinks(value: NullableOption[SectionLinks]): Self = this.set("links", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLinks: Self = this.set("links", js.undefined)
    
    @scala.inline
    def setLinksNull: Self = this.set("links", null)
    
    @scala.inline
    def setPagesVarargs(value: OnenotePage*): Self = this.set("pages", js.Array(value :_*))
    
    @scala.inline
    def setPages(value: NullableOption[js.Array[OnenotePage]]): Self = this.set("pages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePages: Self = this.set("pages", js.undefined)
    
    @scala.inline
    def setPagesNull: Self = this.set("pages", null)
    
    @scala.inline
    def setPagesUrl(value: NullableOption[String]): Self = this.set("pagesUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePagesUrl: Self = this.set("pagesUrl", js.undefined)
    
    @scala.inline
    def setPagesUrlNull: Self = this.set("pagesUrl", null)
    
    @scala.inline
    def setParentNotebook(value: NullableOption[Notebook]): Self = this.set("parentNotebook", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParentNotebook: Self = this.set("parentNotebook", js.undefined)
    
    @scala.inline
    def setParentNotebookNull: Self = this.set("parentNotebook", null)
    
    @scala.inline
    def setParentSectionGroup(value: NullableOption[SectionGroup]): Self = this.set("parentSectionGroup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParentSectionGroup: Self = this.set("parentSectionGroup", js.undefined)
    
    @scala.inline
    def setParentSectionGroupNull: Self = this.set("parentSectionGroup", null)
  }
}
