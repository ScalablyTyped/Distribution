package typings.maximMazurokGapiClientDocs.gapi.client.docs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RichLinkProperties extends StObject {
  
  /** Output only. The [MIME type](https://developers.google.com/drive/api/v3/mime-types) of the RichLink, if there is one (i.e., when it is a file in Drive). */
  var mimeType: js.UndefOr[String] = js.undefined
  
  /**
    * Output only. The title of the RichLink as displayed in the link. This title matches the title of the linked resource at the time of the insertion or last update of the link. This
    * field is always present.
    */
  var title: js.UndefOr[String] = js.undefined
  
  /** Output only. The URI to the RichLink. This is always present. */
  var uri: js.UndefOr[String] = js.undefined
}
object RichLinkProperties {
  
  inline def apply(): RichLinkProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RichLinkProperties]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RichLinkProperties] (val x: Self) extends AnyVal {
    
    inline def setMimeType(value: String): Self = StObject.set(x, "mimeType", value.asInstanceOf[js.Any])
    
    inline def setMimeTypeUndefined: Self = StObject.set(x, "mimeType", js.undefined)
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    inline def setUri(value: String): Self = StObject.set(x, "uri", value.asInstanceOf[js.Any])
    
    inline def setUriUndefined: Self = StObject.set(x, "uri", js.undefined)
  }
}
