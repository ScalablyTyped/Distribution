package typings.maximMazurokGapiClientSlides.gapi.client.slides

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Link extends StObject {
  
  /** If set, indicates this is a link to the specific page in this presentation with this ID. A page with this ID may not exist. */
  var pageObjectId: js.UndefOr[String] = js.native
  
  /** If set, indicates this is a link to a slide in this presentation, addressed by its position. */
  var relativeLink: js.UndefOr[String] = js.native
  
  /** If set, indicates this is a link to the slide at this zero-based index in the presentation. There may not be a slide at this index. */
  var slideIndex: js.UndefOr[Double] = js.native
  
  /** If set, indicates this is a link to the external web page at this URL. */
  var url: js.UndefOr[String] = js.native
}
object Link {
  
  @scala.inline
  def apply(): Link = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Link]
  }
  
  @scala.inline
  implicit class LinkMutableBuilder[Self <: Link] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPageObjectId(value: String): Self = StObject.set(x, "pageObjectId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageObjectIdUndefined: Self = StObject.set(x, "pageObjectId", js.undefined)
    
    @scala.inline
    def setRelativeLink(value: String): Self = StObject.set(x, "relativeLink", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRelativeLinkUndefined: Self = StObject.set(x, "relativeLink", js.undefined)
    
    @scala.inline
    def setSlideIndex(value: Double): Self = StObject.set(x, "slideIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSlideIndexUndefined: Self = StObject.set(x, "slideIndex", js.undefined)
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
  }
}
