package typings.maximMazurokGapiClientDisplayvideo.gapi.client.displayvideo

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ObaIcon extends StObject {
  
  /** Required. The click tracking URL of the OBA icon. Only URLs of the following domains are allowed: * https://info.evidon.com * https://l.betrad.com */
  var clickTrackingUrl: js.UndefOr[String] = js.undefined
  
  /** The dimensions of the OBA icon. */
  var dimensions: js.UndefOr[Dimensions] = js.undefined
  
  /** Required. The landing page URL of the OBA icon. Only URLs of the following domains are allowed: * https://info.evidon.com * https://l.betrad.com */
  var landingPageUrl: js.UndefOr[String] = js.undefined
  
  /** The position of the OBA icon on the creative. */
  var position: js.UndefOr[String] = js.undefined
  
  /** The program of the OBA icon. For example: “AdChoices”. */
  var program: js.UndefOr[String] = js.undefined
  
  /** The MIME type of the OBA icon resource. */
  var resourceMimeType: js.UndefOr[String] = js.undefined
  
  /** The URL of the OBA icon resource. */
  var resourceUrl: js.UndefOr[String] = js.undefined
  
  /** Required. The view tracking URL of the OBA icon. Only URLs of the following domains are allowed: * https://info.evidon.com * https://l.betrad.com */
  var viewTrackingUrl: js.UndefOr[String] = js.undefined
}
object ObaIcon {
  
  inline def apply(): ObaIcon = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ObaIcon]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ObaIcon] (val x: Self) extends AnyVal {
    
    inline def setClickTrackingUrl(value: String): Self = StObject.set(x, "clickTrackingUrl", value.asInstanceOf[js.Any])
    
    inline def setClickTrackingUrlUndefined: Self = StObject.set(x, "clickTrackingUrl", js.undefined)
    
    inline def setDimensions(value: Dimensions): Self = StObject.set(x, "dimensions", value.asInstanceOf[js.Any])
    
    inline def setDimensionsUndefined: Self = StObject.set(x, "dimensions", js.undefined)
    
    inline def setLandingPageUrl(value: String): Self = StObject.set(x, "landingPageUrl", value.asInstanceOf[js.Any])
    
    inline def setLandingPageUrlUndefined: Self = StObject.set(x, "landingPageUrl", js.undefined)
    
    inline def setPosition(value: String): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
    
    inline def setProgram(value: String): Self = StObject.set(x, "program", value.asInstanceOf[js.Any])
    
    inline def setProgramUndefined: Self = StObject.set(x, "program", js.undefined)
    
    inline def setResourceMimeType(value: String): Self = StObject.set(x, "resourceMimeType", value.asInstanceOf[js.Any])
    
    inline def setResourceMimeTypeUndefined: Self = StObject.set(x, "resourceMimeType", js.undefined)
    
    inline def setResourceUrl(value: String): Self = StObject.set(x, "resourceUrl", value.asInstanceOf[js.Any])
    
    inline def setResourceUrlUndefined: Self = StObject.set(x, "resourceUrl", js.undefined)
    
    inline def setViewTrackingUrl(value: String): Self = StObject.set(x, "viewTrackingUrl", value.asInstanceOf[js.Any])
    
    inline def setViewTrackingUrlUndefined: Self = StObject.set(x, "viewTrackingUrl", js.undefined)
  }
}
