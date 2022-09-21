package typings.mraid.mod

import typings.mraid.mraidStrings.`bottom-left`
import typings.mraid.mraidStrings.`bottom-right`
import typings.mraid.mraidStrings.`top-left`
import typings.mraid.mraidStrings.`top-right`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MRAIDResizeProperties
  extends StObject
     with MRAIDSize {
  
  var allowOffscreen: Boolean
  
  // Deprecated in MRAID 3.0; should still be provided by SDKs for backwards compatibility, but may not be honoured
  var customClosePosition: js.UndefOr[`top-left` | `top-right` | `bottom-right` | `bottom-left`] = js.undefined
}
object MRAIDResizeProperties {
  
  inline def apply(allowOffscreen: Boolean, height: Double, width: Double): MRAIDResizeProperties = {
    val __obj = js.Dynamic.literal(allowOffscreen = allowOffscreen.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[MRAIDResizeProperties]
  }
  
  extension [Self <: MRAIDResizeProperties](x: Self) {
    
    inline def setAllowOffscreen(value: Boolean): Self = StObject.set(x, "allowOffscreen", value.asInstanceOf[js.Any])
    
    inline def setCustomClosePosition(value: `top-left` | `top-right` | `bottom-right` | `bottom-left`): Self = StObject.set(x, "customClosePosition", value.asInstanceOf[js.Any])
    
    inline def setCustomClosePositionUndefined: Self = StObject.set(x, "customClosePosition", js.undefined)
  }
}
