package typings.maximMazurokGapiClientWebsecurityscanner.gapi.client.websecurityscanner

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ViolatingResource extends StObject {
  
  /** The MIME type of this resource. */
  var contentType: js.UndefOr[String] = js.undefined
  
  /** URL of this violating resource. */
  var resourceUrl: js.UndefOr[String] = js.undefined
}
object ViolatingResource {
  
  @scala.inline
  def apply(): ViolatingResource = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ViolatingResource]
  }
  
  @scala.inline
  implicit class ViolatingResourceMutableBuilder[Self <: ViolatingResource] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContentType(value: String): Self = StObject.set(x, "contentType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentTypeUndefined: Self = StObject.set(x, "contentType", js.undefined)
    
    @scala.inline
    def setResourceUrl(value: String): Self = StObject.set(x, "resourceUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceUrlUndefined: Self = StObject.set(x, "resourceUrl", js.undefined)
  }
}
