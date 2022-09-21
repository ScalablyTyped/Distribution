package typings.pixiCore.mod

import typings.pixiConstants.mod.ALPHA_MODES
import typings.pixiConstants.mod.FORMATS
import typings.pixiConstants.mod.MIPMAP_MODES
import typings.pixiConstants.mod.MSAA_QUALITY
import typings.pixiConstants.mod.SCALE_MODES
import typings.pixiConstants.mod.TARGETS
import typings.pixiConstants.mod.TYPES
import typings.pixiConstants.mod.WRAP_MODES
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IBaseTextureOptions[RO] extends StObject {
  
  var alphaMode: js.UndefOr[ALPHA_MODES] = js.undefined
  
  var anisotropicLevel: js.UndefOr[Double] = js.undefined
  
  var format: js.UndefOr[FORMATS] = js.undefined
  
  var height: js.UndefOr[Double] = js.undefined
  
  var mipmap: js.UndefOr[MIPMAP_MODES] = js.undefined
  
  var multisample: js.UndefOr[MSAA_QUALITY] = js.undefined
  
  var pixiIdPrefix: js.UndefOr[String] = js.undefined
  
  var resolution: js.UndefOr[Double] = js.undefined
  
  var resourceOptions: js.UndefOr[RO] = js.undefined
  
  var scaleMode: js.UndefOr[SCALE_MODES] = js.undefined
  
  var target: js.UndefOr[TARGETS] = js.undefined
  
  var `type`: js.UndefOr[TYPES] = js.undefined
  
  var width: js.UndefOr[Double] = js.undefined
  
  var wrapMode: js.UndefOr[WRAP_MODES] = js.undefined
}
object IBaseTextureOptions {
  
  inline def apply[RO](): IBaseTextureOptions[RO] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IBaseTextureOptions[RO]]
  }
  
  extension [Self <: IBaseTextureOptions[?], RO](x: Self & IBaseTextureOptions[RO]) {
    
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
    
    inline def setMultisample(value: MSAA_QUALITY): Self = StObject.set(x, "multisample", value.asInstanceOf[js.Any])
    
    inline def setMultisampleUndefined: Self = StObject.set(x, "multisample", js.undefined)
    
    inline def setPixiIdPrefix(value: String): Self = StObject.set(x, "pixiIdPrefix", value.asInstanceOf[js.Any])
    
    inline def setPixiIdPrefixUndefined: Self = StObject.set(x, "pixiIdPrefix", js.undefined)
    
    inline def setResolution(value: Double): Self = StObject.set(x, "resolution", value.asInstanceOf[js.Any])
    
    inline def setResolutionUndefined: Self = StObject.set(x, "resolution", js.undefined)
    
    inline def setResourceOptions(value: RO): Self = StObject.set(x, "resourceOptions", value.asInstanceOf[js.Any])
    
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
