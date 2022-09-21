package typings.pixiCore.mod

import typings.pixiConstants.mod.MSAA_QUALITY
import typings.pixiConstants.mod.SCALE_MODES
import typings.pixiMath.mod.Rectangle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IGenerateTextureOptions extends StObject {
  
  var multisample: js.UndefOr[MSAA_QUALITY] = js.undefined
  
  var region: js.UndefOr[Rectangle] = js.undefined
  
  var resolution: js.UndefOr[Double] = js.undefined
  
  var scaleMode: js.UndefOr[SCALE_MODES] = js.undefined
}
object IGenerateTextureOptions {
  
  inline def apply(): IGenerateTextureOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IGenerateTextureOptions]
  }
  
  extension [Self <: IGenerateTextureOptions](x: Self) {
    
    inline def setMultisample(value: MSAA_QUALITY): Self = StObject.set(x, "multisample", value.asInstanceOf[js.Any])
    
    inline def setMultisampleUndefined: Self = StObject.set(x, "multisample", js.undefined)
    
    inline def setRegion(value: Rectangle): Self = StObject.set(x, "region", value.asInstanceOf[js.Any])
    
    inline def setRegionUndefined: Self = StObject.set(x, "region", js.undefined)
    
    inline def setResolution(value: Double): Self = StObject.set(x, "resolution", value.asInstanceOf[js.Any])
    
    inline def setResolutionUndefined: Self = StObject.set(x, "resolution", js.undefined)
    
    inline def setScaleMode(value: SCALE_MODES): Self = StObject.set(x, "scaleMode", value.asInstanceOf[js.Any])
    
    inline def setScaleModeUndefined: Self = StObject.set(x, "scaleMode", js.undefined)
  }
}
