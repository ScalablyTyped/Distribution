package typings.pixiJs.anon

import typings.pixiJs.PIXI.ALPHA_MODES
import typings.pixiJs.PIXI.FORMATS
import typings.pixiJs.PIXI.MIPMAP_MODES
import typings.pixiJs.PIXI.SCALE_MODES
import typings.pixiJs.PIXI.TARGETS
import typings.pixiJs.PIXI.TYPES
import typings.pixiJs.PIXI.WRAP_MODES
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AlphaMode extends StObject {
  
  var alphaMode: js.UndefOr[ALPHA_MODES] = js.undefined
  
  var anisotropicLevel: js.UndefOr[Double] = js.undefined
  
  var format: js.UndefOr[FORMATS] = js.undefined
  
  var height: js.UndefOr[Double] = js.undefined
  
  var mipmap: js.UndefOr[MIPMAP_MODES] = js.undefined
  
  var resolution: js.UndefOr[Double] = js.undefined
  
  var resourceOptions: js.UndefOr[js.Any] = js.undefined
  
  var scaleMode: js.UndefOr[SCALE_MODES] = js.undefined
  
  var target: js.UndefOr[TARGETS] = js.undefined
  
  var `type`: js.UndefOr[TYPES] = js.undefined
  
  var width: js.UndefOr[Double] = js.undefined
  
  var wrapMode: js.UndefOr[WRAP_MODES] = js.undefined
}
object AlphaMode {
  
  inline def apply(): AlphaMode = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AlphaMode]
  }
  
  extension [Self <: AlphaMode](x: Self) {
    
    inline def setAlphaMode(value: ALPHA_MODES): Self = StObject.set(x, "alphaMode", value.asInstanceOf[js.Any])
    
    inline def setAlphaModeUndefined: Self = StObject.set(x, "alphaMode", js.undefined)
    
    inline def setAnisotropicLevel(value: Double): Self = StObject.set(x, "anisotropicLevel", value.asInstanceOf[js.Any])
    
    inline def setAnisotropicLevelUndefined: Self = StObject.set(x, "anisotropicLevel", js.undefined)
    
    inline def setFormat(value: FORMATS): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
    
    inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    inline def setMipmap(value: MIPMAP_MODES): Self = StObject.set(x, "mipmap", value.asInstanceOf[js.Any])
    
    inline def setMipmapUndefined: Self = StObject.set(x, "mipmap", js.undefined)
    
    inline def setResolution(value: Double): Self = StObject.set(x, "resolution", value.asInstanceOf[js.Any])
    
    inline def setResolutionUndefined: Self = StObject.set(x, "resolution", js.undefined)
    
    inline def setResourceOptions(value: js.Any): Self = StObject.set(x, "resourceOptions", value.asInstanceOf[js.Any])
    
    inline def setResourceOptionsUndefined: Self = StObject.set(x, "resourceOptions", js.undefined)
    
    inline def setScaleMode(value: SCALE_MODES): Self = StObject.set(x, "scaleMode", value.asInstanceOf[js.Any])
    
    inline def setScaleModeUndefined: Self = StObject.set(x, "scaleMode", js.undefined)
    
    inline def setTarget(value: TARGETS): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    inline def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
    
    inline def setType(value: TYPES): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    
    inline def setWrapMode(value: WRAP_MODES): Self = StObject.set(x, "wrapMode", value.asInstanceOf[js.Any])
    
    inline def setWrapModeUndefined: Self = StObject.set(x, "wrapMode", js.undefined)
  }
}
