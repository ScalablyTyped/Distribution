package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OnenotePage
  extends StObject
     with OnenoteEntitySchemaObjectModel {
  
  // The page's HTML content.
  var content: js.UndefOr[NullableOption[js.Any]] = js.undefined
  
  // The URL for the page's HTML content. Read-only.
  var contentUrl: js.UndefOr[NullableOption[String]] = js.undefined
  
  // The unique identifier of the application that created the page. Read-only.
  var createdByAppId: js.UndefOr[NullableOption[String]] = js.undefined
  
  /**
    * The date and time when the page was last modified. The timestamp represents date and time information using ISO 8601
    * format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 would look like this:
    * '2014-01-01T00:00:00Z'. Read-only.
    */
  var lastModifiedDateTime: js.UndefOr[NullableOption[String]] = js.undefined
  
  // The indentation level of the page. Read-only.
  var level: js.UndefOr[NullableOption[Double]] = js.undefined
  
  /**
    * Links for opening the page. The oneNoteClientURL link opens the page in the OneNote native client if it 's installed.
    * The oneNoteWebUrl link opens the page in OneNote on the web. Read-only.
    */
  var links: js.UndefOr[NullableOption[PageLinks]] = js.undefined
  
  // The order of the page within its parent section. Read-only.
  var order: js.UndefOr[NullableOption[Double]] = js.undefined
  
  // The notebook that contains the page. Read-only.
  var parentNotebook: js.UndefOr[NullableOption[Notebook]] = js.undefined
  
  // The section that contains the page. Read-only.
  var parentSection: js.UndefOr[NullableOption[OnenoteSection]] = js.undefined
  
  // The title of the page.
  var title: js.UndefOr[NullableOption[String]] = js.undefined
  
  var userTags: js.UndefOr[NullableOption[js.Array[String]]] = js.undefined
}
object OnenotePage {
  
  @scala.inline
  def apply(): OnenotePage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OnenotePage]
  }
  
  @scala.inline
  implicit class OnenotePageMutableBuilder[Self <: OnenotePage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContent(value: NullableOption[js.Any]): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentNull: Self = StObject.set(x, "content", null)
    
    @scala.inline
    def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
    
    @scala.inline
    def setContentUrl(value: NullableOption[String]): Self = StObject.set(x, "contentUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentUrlNull: Self = StObject.set(x, "contentUrl", null)
    
    @scala.inline
    def setContentUrlUndefined: Self = StObject.set(x, "contentUrl", js.undefined)
    
    @scala.inline
    def setCreatedByAppId(value: NullableOption[String]): Self = StObject.set(x, "createdByAppId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreatedByAppIdNull: Self = StObject.set(x, "createdByAppId", null)
    
    @scala.inline
    def setCreatedByAppIdUndefined: Self = StObject.set(x, "createdByAppId", js.undefined)
    
    @scala.inline
    def setLastModifiedDateTime(value: NullableOption[String]): Self = StObject.set(x, "lastModifiedDateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastModifiedDateTimeNull: Self = StObject.set(x, "lastModifiedDateTime", null)
    
    @scala.inline
    def setLastModifiedDateTimeUndefined: Self = StObject.set(x, "lastModifiedDateTime", js.undefined)
    
    @scala.inline
    def setLevel(value: NullableOption[Double]): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLevelNull: Self = StObject.set(x, "level", null)
    
    @scala.inline
    def setLevelUndefined: Self = StObject.set(x, "level", js.undefined)
    
    @scala.inline
    def setLinks(value: NullableOption[PageLinks]): Self = StObject.set(x, "links", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLinksNull: Self = StObject.set(x, "links", null)
    
    @scala.inline
    def setLinksUndefined: Self = StObject.set(x, "links", js.undefined)
    
    @scala.inline
    def setOrder(value: NullableOption[Double]): Self = StObject.set(x, "order", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrderNull: Self = StObject.set(x, "order", null)
    
    @scala.inline
    def setOrderUndefined: Self = StObject.set(x, "order", js.undefined)
    
    @scala.inline
    def setParentNotebook(value: NullableOption[Notebook]): Self = StObject.set(x, "parentNotebook", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParentNotebookNull: Self = StObject.set(x, "parentNotebook", null)
    
    @scala.inline
    def setParentNotebookUndefined: Self = StObject.set(x, "parentNotebook", js.undefined)
    
    @scala.inline
    def setParentSection(value: NullableOption[OnenoteSection]): Self = StObject.set(x, "parentSection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParentSectionNull: Self = StObject.set(x, "parentSection", null)
    
    @scala.inline
    def setParentSectionUndefined: Self = StObject.set(x, "parentSection", js.undefined)
    
    @scala.inline
    def setTitle(value: NullableOption[String]): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleNull: Self = StObject.set(x, "title", null)
    
    @scala.inline
    def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    @scala.inline
    def setUserTags(value: NullableOption[js.Array[String]]): Self = StObject.set(x, "userTags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserTagsNull: Self = StObject.set(x, "userTags", null)
    
    @scala.inline
    def setUserTagsUndefined: Self = StObject.set(x, "userTags", js.undefined)
    
    @scala.inline
    def setUserTagsVarargs(value: String*): Self = StObject.set(x, "userTags", js.Array(value :_*))
  }
}
