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
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AlphaMode extends StObject {
  
  var alphaMode: js.UndefOr[ALPHA_MODES] = js.native
  
  var anisotropicLevel: js.UndefOr[Double] = js.native
  
  var format: js.UndefOr[FORMATS] = js.native
  
  var height: js.UndefOr[Double] = js.native
  
  var mipmap: js.UndefOr[MIPMAP_MODES] = js.native
  
  var resolution: js.UndefOr[Double] = js.native
  
  var resourceOptions: js.UndefOr[js.Any] = js.native
  
  var scaleMode: js.UndefOr[SCALE_MODES] = js.native
  
  var target: js.UndefOr[TARGETS] = js.native
  
  var `type`: js.UndefOr[TYPES] = js.native
  
  var width: js.UndefOr[Double] = js.native
  
  var wrapMode: js.UndefOr[WRAP_MODES] = js.native
}
object AlphaMode {
  
  @scala.inline
  def apply(): AlphaMode = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AlphaMode]
  }
  
  @scala.inline
  implicit class AlphaModeMutableBuilder[Self <: AlphaMode] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAlphaMode(value: ALPHA_MODES): Self = StObject.set(x, "alphaMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAlphaModeUndefined: Self = StObject.set(x, "alphaMode", js.undefined)
    
    @scala.inline
    def setAnisotropicLevel(value: Double): Self = StObject.set(x, "anisotropicLevel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnisotropicLevelUndefined: Self = StObject.set(x, "anisotropicLevel", js.undefined)
    
    @scala.inline
    def setFormat(value: FORMATS): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
    
    @scala.inline
    def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    @scala.inline
    def setMipmap(value: MIPMAP_MODES): Self = StObject.set(x, "mipmap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMipmapUndefined: Self = StObject.set(x, "mipmap", js.undefined)
    
    @scala.inline
    def setResolution(value: Double): Self = StObject.set(x, "resolution", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResolutionUndefined: Self = StObject.set(x, "resolution", js.undefined)
    
    @scala.inline
    def setResourceOptions(value: js.Any): Self = StObject.set(x, "resourceOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceOptionsUndefined: Self = StObject.set(x, "resourceOptions", js.undefined)
    
    @scala.inline
    def setScaleMode(value: SCALE_MODES): Self = StObject.set(x, "scaleMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScaleModeUndefined: Self = StObject.set(x, "scaleMode", js.undefined)
    
    @scala.inline
    def setTarget(value: TARGETS): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
    
    @scala.inline
    def setType(value: TYPES): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    @scala.inline
    def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    
    @scala.inline
    def setWrapMode(value: WRAP_MODES): Self = StObject.set(x, "wrapMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWrapModeUndefined: Self = StObject.set(x, "wrapMode", js.undefined)
  }
}
