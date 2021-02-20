package typings.maximMazurokGapiClientDisplayvideo.gapi.client.displayvideo

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ObaIcon extends StObject {
  
  /** Required. The click tracking URL of the OBA icon. Only URLs of the following domains are allowed: * https://info.evidon.com * https://l.betrad.com */
  var clickTrackingUrl: js.UndefOr[String] = js.native
  
  /** The dimensions of the OBA icon. */
  var dimensions: js.UndefOr[Dimensions] = js.native
  
  /** Required. The landing page URL of the OBA icon. Only URLs of the following domains are allowed: * https://info.evidon.com * https://l.betrad.com */
  var landingPageUrl: js.UndefOr[String] = js.native
  
  /** The position of the OBA icon on the creative. */
  var position: js.UndefOr[String] = js.native
  
  /** The program of the OBA icon. For example: “AdChoices”. */
  var program: js.UndefOr[String] = js.native
  
  /** The MIME type of the OBA icon resource. */
  var resourceMimeType: js.UndefOr[String] = js.native
  
  /** The URL of the OBA icon resource. */
  var resourceUrl: js.UndefOr[String] = js.native
  
  /** Required. The view tracking URL of the OBA icon. Only URLs of the following domains are allowed: * https://info.evidon.com * https://l.betrad.com */
  var viewTrackingUrl: js.UndefOr[String] = js.native
}
object ObaIcon {
  
  @scala.inline
  def apply(): ObaIcon = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ObaIcon]
  }
  
  @scala.inline
  implicit class ObaIconMutableBuilder[Self <: ObaIcon] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClickTrackingUrl(value: String): Self = StObject.set(x, "clickTrackingUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClickTrackingUrlUndefined: Self = StObject.set(x, "clickTrackingUrl", js.undefined)
    
    @scala.inline
    def setDimensions(value: Dimensions): Self = StObject.set(x, "dimensions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDimensionsUndefined: Self = StObject.set(x, "dimensions", js.undefined)
    
    @scala.inline
    def setLandingPageUrl(value: String): Self = StObject.set(x, "landingPageUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLandingPageUrlUndefined: Self = StObject.set(x, "landingPageUrl", js.undefined)
    
    @scala.inline
    def setPosition(value: String): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
    
    @scala.inline
    def setProgram(value: String): Self = StObject.set(x, "program", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProgramUndefined: Self = StObject.set(x, "program", js.undefined)
    
    @scala.inline
    def setResourceMimeType(value: String): Self = StObject.set(x, "resourceMimeType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceMimeTypeUndefined: Self = StObject.set(x, "resourceMimeType", js.undefined)
    
    @scala.inline
    def setResourceUrl(value: String): Self = StObject.set(x, "resourceUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceUrlUndefined: Self = StObject.set(x, "resourceUrl", js.undefined)
    
    @scala.inline
    def setViewTrackingUrl(value: String): Self = StObject.set(x, "viewTrackingUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setViewTrackingUrlUndefined: Self = StObject.set(x, "viewTrackingUrl", js.undefined)
  }
}
