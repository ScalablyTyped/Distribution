package typings.maximMazurokGapiClientSlides.gapi.client.slides

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Page extends js.Object {
  
  /** Layout specific properties. Only set if page_type = LAYOUT. */
  var layoutProperties: js.UndefOr[LayoutProperties] = js.native
  
  /** Master specific properties. Only set if page_type = MASTER. */
  var masterProperties: js.UndefOr[MasterProperties] = js.native
  
  /** Notes specific properties. Only set if page_type = NOTES. */
  var notesProperties: js.UndefOr[NotesProperties] = js.native
  
  /** The object ID for this page. Object IDs used by Page and PageElement share the same namespace. */
  var objectId: js.UndefOr[String] = js.native
  
  /** The page elements rendered on the page. */
  var pageElements: js.UndefOr[js.Array[PageElement]] = js.native
  
  /** The properties of the page. */
  var pageProperties: js.UndefOr[PageProperties] = js.native
  
  /** The type of the page. */
  var pageType: js.UndefOr[String] = js.native
  
  /**
    * The revision ID of the presentation containing this page. Can be used in update requests to assert that the presentation revision hasn't changed since the last read operation. Only
    * populated if the user has edit access to the presentation. The format of the revision ID may change over time, so it should be treated opaquely. A returned revision ID is only
    * guaranteed to be valid for 24 hours after it has been returned and cannot be shared across users. If the revision ID is unchanged between calls, then the presentation has not
    * changed. Conversely, a changed ID (for the same presentation and user) usually means the presentation has been updated; however, a changed ID can also be due to internal factors
    * such as ID format changes.
    */
  var revisionId: js.UndefOr[String] = js.native
  
  /** Slide specific properties. Only set if page_type = SLIDE. */
  var slideProperties: js.UndefOr[SlideProperties] = js.native
}
object Page {
  
  @scala.inline
  def apply(): Page = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Page]
  }
  
  @scala.inline
  implicit class PageOps[Self <: Page] (val x: Self) extends AnyVal {
    
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
    def setLayoutProperties(value: LayoutProperties): Self = this.set("layoutProperties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLayoutProperties: Self = this.set("layoutProperties", js.undefined)
    
    @scala.inline
    def setMasterProperties(value: MasterProperties): Self = this.set("masterProperties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMasterProperties: Self = this.set("masterProperties", js.undefined)
    
    @scala.inline
    def setNotesProperties(value: NotesProperties): Self = this.set("notesProperties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNotesProperties: Self = this.set("notesProperties", js.undefined)
    
    @scala.inline
    def setObjectId(value: String): Self = this.set("objectId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteObjectId: Self = this.set("objectId", js.undefined)
    
    @scala.inline
    def setPageElementsVarargs(value: PageElement*): Self = this.set("pageElements", js.Array(value :_*))
    
    @scala.inline
    def setPageElements(value: js.Array[PageElement]): Self = this.set("pageElements", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePageElements: Self = this.set("pageElements", js.undefined)
    
    @scala.inline
    def setPageProperties(value: PageProperties): Self = this.set("pageProperties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePageProperties: Self = this.set("pageProperties", js.undefined)
    
    @scala.inline
    def setPageType(value: String): Self = this.set("pageType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePageType: Self = this.set("pageType", js.undefined)
    
    @scala.inline
    def setRevisionId(value: String): Self = this.set("revisionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRevisionId: Self = this.set("revisionId", js.undefined)
    
    @scala.inline
    def setSlideProperties(value: SlideProperties): Self = this.set("slideProperties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSlideProperties: Self = this.set("slideProperties", js.undefined)
  }
}
