package typings.oracleOraclejet.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AriaLiveRegion extends StObject {
  
  var ariaLiveRegion: js.UndefOr[NavigationFromKeyboard] = js.undefined
  
  var labelLandmark: js.UndefOr[String] = js.undefined
}
object AriaLiveRegion {
  
  inline def apply(): AriaLiveRegion = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AriaLiveRegion]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AriaLiveRegion] (val x: Self) extends AnyVal {
    
    inline def setAriaLiveRegion(value: NavigationFromKeyboard): Self = StObject.set(x, "ariaLiveRegion", value.asInstanceOf[js.Any])
    
    inline def setAriaLiveRegionUndefined: Self = StObject.set(x, "ariaLiveRegion", js.undefined)
    
    inline def setLabelLandmark(value: String): Self = StObject.set(x, "labelLandmark", value.asInstanceOf[js.Any])
    
    inline def setLabelLandmarkUndefined: Self = StObject.set(x, "labelLandmark", js.undefined)
  }
}
