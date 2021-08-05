package typings.pixiJs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Resolution extends StObject {
  
  var height: js.UndefOr[Double] = js.undefined
  
  var resolution: js.UndefOr[Double] = js.undefined
  
  var scaleMode: js.UndefOr[Double] = js.undefined
  
  var width: js.UndefOr[Double] = js.undefined
}
object Resolution {
  
  inline def apply(): Resolution = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Resolution]
  }
  
  extension [Self <: Resolution](x: Self) {
    
    inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    inline def setResolution(value: Double): Self = StObject.set(x, "resolution", value.asInstanceOf[js.Any])
    
    inline def setResolutionUndefined: Self = StObject.set(x, "resolution", js.undefined)
    
    inline def setScaleMode(value: Double): Self = StObject.set(x, "scaleMode", value.asInstanceOf[js.Any])
    
    inline def setScaleModeUndefined: Self = StObject.set(x, "scaleMode", js.undefined)
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
