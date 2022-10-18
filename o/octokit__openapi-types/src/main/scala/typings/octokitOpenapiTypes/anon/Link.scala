package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Link extends StObject {
  
  var `content-type`: js.UndefOr[String] = js.undefined
  
  var link: js.UndefOr[String] = js.undefined
  
  var location: js.UndefOr[String] = js.undefined
  
  var `x-common-marker-version`: js.UndefOr[String] = js.undefined
  
  var `x-rate-limit-limit`: js.UndefOr[Double] = js.undefined
  
  var `x-rate-limit-remaining`: js.UndefOr[Double] = js.undefined
  
  var `x-rate-limit-reset`: js.UndefOr[Double] = js.undefined
}
object Link {
  
  inline def apply(): Link = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Link]
  }
  
  extension [Self <: Link](x: Self) {
    
    inline def `setContent-type`(value: String): Self = StObject.set(x, "content-type", value.asInstanceOf[js.Any])
    
    inline def `setContent-typeUndefined`: Self = StObject.set(x, "content-type", js.undefined)
    
    inline def setLink(value: String): Self = StObject.set(x, "link", value.asInstanceOf[js.Any])
    
    inline def setLinkUndefined: Self = StObject.set(x, "link", js.undefined)
    
    inline def setLocation(value: String): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    inline def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
    
    inline def `setX-common-marker-version`(value: String): Self = StObject.set(x, "x-common-marker-version", value.asInstanceOf[js.Any])
    
    inline def `setX-common-marker-versionUndefined`: Self = StObject.set(x, "x-common-marker-version", js.undefined)
    
    inline def `setX-rate-limit-limit`(value: Double): Self = StObject.set(x, "x-rate-limit-limit", value.asInstanceOf[js.Any])
    
    inline def `setX-rate-limit-limitUndefined`: Self = StObject.set(x, "x-rate-limit-limit", js.undefined)
    
    inline def `setX-rate-limit-remaining`(value: Double): Self = StObject.set(x, "x-rate-limit-remaining", value.asInstanceOf[js.Any])
    
    inline def `setX-rate-limit-remainingUndefined`: Self = StObject.set(x, "x-rate-limit-remaining", js.undefined)
    
    inline def `setX-rate-limit-reset`(value: Double): Self = StObject.set(x, "x-rate-limit-reset", value.asInstanceOf[js.Any])
    
    inline def `setX-rate-limit-resetUndefined`: Self = StObject.set(x, "x-rate-limit-reset", js.undefined)
  }
}
