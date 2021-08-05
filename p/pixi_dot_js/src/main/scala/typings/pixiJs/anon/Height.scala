package typings.pixiJs.anon

import typings.pixiJs.PIXI.SCALE_MODES
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Height extends StObject {
  
  var height: js.UndefOr[Double] = js.undefined
  
  var resolution: js.UndefOr[Double] = js.undefined
  
  var scaleMode: js.UndefOr[SCALE_MODES] = js.undefined
  
  var width: js.UndefOr[Double] = js.undefined
}
object Height {
  
  inline def apply(): Height = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Height]
  }
  
  extension [Self <: Height](x: Self) {
    
    inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    inline def setResolution(value: Double): Self = StObject.set(x, "resolution", value.asInstanceOf[js.Any])
    
    inline def setResolutionUndefined: Self = StObject.set(x, "resolution", js.undefined)
    
    inline def setScaleMode(value: SCALE_MODES): Self = StObject.set(x, "scaleMode", value.asInstanceOf[js.Any])
    
    inline def setScaleModeUndefined: Self = StObject.set(x, "scaleMode", js.undefined)
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
