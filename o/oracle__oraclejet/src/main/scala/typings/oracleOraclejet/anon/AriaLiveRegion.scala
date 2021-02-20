package typings.oracleOraclejet.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AriaLiveRegion extends StObject {
  
  var ariaLiveRegion: js.UndefOr[NavigationFromKeyboard] = js.native
  
  var labelLandmark: js.UndefOr[String] = js.native
}
object AriaLiveRegion {
  
  @scala.inline
  def apply(): AriaLiveRegion = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AriaLiveRegion]
  }
  
  @scala.inline
  implicit class AriaLiveRegionMutableBuilder[Self <: AriaLiveRegion] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAriaLiveRegion(value: NavigationFromKeyboard): Self = StObject.set(x, "ariaLiveRegion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAriaLiveRegionUndefined: Self = StObject.set(x, "ariaLiveRegion", js.undefined)
    
    @scala.inline
    def setLabelLandmark(value: String): Self = StObject.set(x, "labelLandmark", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelLandmarkUndefined: Self = StObject.set(x, "labelLandmark", js.undefined)
  }
}
