package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OnenotePage extends OnenoteEntitySchemaObjectModel {
  
  // The page's HTML content.
  var content: js.UndefOr[NullableOption[_]] = js.native
  
  // The URL for the page's HTML content. Read-only.
  var contentUrl: js.UndefOr[NullableOption[String]] = js.native
  
  // The unique identifier of the application that created the page. Read-only.
  var createdByAppId: js.UndefOr[NullableOption[String]] = js.native
  
  /**
    * The date and time when the page was last modified. The timestamp represents date and time information using ISO 8601
    * format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 would look like this:
    * '2014-01-01T00:00:00Z'. Read-only.
    */
  var lastModifiedDateTime: js.UndefOr[NullableOption[String]] = js.native
  
  // The indentation level of the page. Read-only.
  var level: js.UndefOr[NullableOption[Double]] = js.native
  
  /**
    * Links for opening the page. The oneNoteClientURL link opens the page in the OneNote native client if it 's installed.
    * The oneNoteWebUrl link opens the page in OneNote on the web. Read-only.
    */
  var links: js.UndefOr[NullableOption[PageLinks]] = js.native
  
  // The order of the page within its parent section. Read-only.
  var order: js.UndefOr[NullableOption[Double]] = js.native
  
  // The notebook that contains the page. Read-only.
  var parentNotebook: js.UndefOr[NullableOption[Notebook]] = js.native
  
  // The section that contains the page. Read-only.
  var parentSection: js.UndefOr[NullableOption[OnenoteSection]] = js.native
  
  // The title of the page.
  var title: js.UndefOr[NullableOption[String]] = js.native
  
  var userTags: js.UndefOr[NullableOption[js.Array[String]]] = js.native
}
object OnenotePage {
  
  @scala.inline
  def apply(): OnenotePage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OnenotePage]
  }
  
  @scala.inline
  implicit class OnenotePageOps[Self <: OnenotePage] (val x: Self) extends AnyVal {
    
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
    def setContent(value: NullableOption[_]): Self = this.set("content", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContent: Self = this.set("content", js.undefined)
    
    @scala.inline
    def setContentNull: Self = this.set("content", null)
    
    @scala.inline
    def setContentUrl(value: NullableOption[String]): Self = this.set("contentUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContentUrl: Self = this.set("contentUrl", js.undefined)
    
    @scala.inline
    def setContentUrlNull: Self = this.set("contentUrl", null)
    
    @scala.inline
    def setCreatedByAppId(value: NullableOption[String]): Self = this.set("createdByAppId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreatedByAppId: Self = this.set("createdByAppId", js.undefined)
    
    @scala.inline
    def setCreatedByAppIdNull: Self = this.set("createdByAppId", null)
    
    @scala.inline
    def setLastModifiedDateTime(value: NullableOption[String]): Self = this.set("lastModifiedDateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLastModifiedDateTime: Self = this.set("lastModifiedDateTime", js.undefined)
    
    @scala.inline
    def setLastModifiedDateTimeNull: Self = this.set("lastModifiedDateTime", null)
    
    @scala.inline
    def setLevel(value: NullableOption[Double]): Self = this.set("level", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLevel: Self = this.set("level", js.undefined)
    
    @scala.inline
    def setLevelNull: Self = this.set("level", null)
    
    @scala.inline
    def setLinks(value: NullableOption[PageLinks]): Self = this.set("links", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLinks: Self = this.set("links", js.undefined)
    
    @scala.inline
    def setLinksNull: Self = this.set("links", null)
    
    @scala.inline
    def setOrder(value: NullableOption[Double]): Self = this.set("order", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOrder: Self = this.set("order", js.undefined)
    
    @scala.inline
    def setOrderNull: Self = this.set("order", null)
    
    @scala.inline
    def setParentNotebook(value: NullableOption[Notebook]): Self = this.set("parentNotebook", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParentNotebook: Self = this.set("parentNotebook", js.undefined)
    
    @scala.inline
    def setParentNotebookNull: Self = this.set("parentNotebook", null)
    
    @scala.inline
    def setParentSection(value: NullableOption[OnenoteSection]): Self = this.set("parentSection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParentSection: Self = this.set("parentSection", js.undefined)
    
    @scala.inline
    def setParentSectionNull: Self = this.set("parentSection", null)
    
    @scala.inline
    def setTitle(value: NullableOption[String]): Self = this.set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
    
    @scala.inline
    def setTitleNull: Self = this.set("title", null)
    
    @scala.inline
    def setUserTagsVarargs(value: String*): Self = this.set("userTags", js.Array(value :_*))
    
    @scala.inline
    def setUserTags(value: NullableOption[js.Array[String]]): Self = this.set("userTags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUserTags: Self = this.set("userTags", js.undefined)
    
    @scala.inline
    def setUserTagsNull: Self = this.set("userTags", null)
  }
}
