package typings.maximMazurokGapiClientDocs.gapi.client.docs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Link extends StObject {
  
  /** The ID of a bookmark in this document. */
  var bookmarkId: js.UndefOr[String] = js.native
  
  /** The ID of a heading in this document. */
  var headingId: js.UndefOr[String] = js.native
  
  /** An external URL. */
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
    def setBookmarkId(value: String): Self = StObject.set(x, "bookmarkId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBookmarkIdUndefined: Self = StObject.set(x, "bookmarkId", js.undefined)
    
    @scala.inline
    def setHeadingId(value: String): Self = StObject.set(x, "headingId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeadingIdUndefined: Self = StObject.set(x, "headingId", js.undefined)
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
  }
}
