package typings.pixiCore.mod

import typings.pixiConstants.mod.ALPHA_MODES
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IImageResourceOptions
  extends StObject
     with _IAutoDetectOptions {
  
  /** Premultiply image alpha in bitmap. */
  var alphaMode: js.UndefOr[ALPHA_MODES] = js.undefined
  
  /** Start loading process */
  var autoLoad: js.UndefOr[Boolean] = js.undefined
  
  /** Whether its required to create a bitmap before upload. */
  var createBitmap: js.UndefOr[Boolean] = js.undefined
  
  /** Load image using cross origin. */
  var crossorigin: js.UndefOr[Boolean | String] = js.undefined
}
object IImageResourceOptions {
  
  inline def apply(): IImageResourceOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IImageResourceOptions]
  }
  
  extension [Self <: IImageResourceOptions](x: Self) {
    
    inline def setAlphaMode(value: ALPHA_MODES): Self = StObject.set(x, "alphaMode", value.asInstanceOf[js.Any])
    
    inline def setAlphaModeUndefined: Self = StObject.set(x, "alphaMode", js.undefined)
    
    inline def setAutoLoad(value: Boolean): Self = StObject.set(x, "autoLoad", value.asInstanceOf[js.Any])
    
    inline def setAutoLoadUndefined: Self = StObject.set(x, "autoLoad", js.undefined)
    
    inline def setCreateBitmap(value: Boolean): Self = StObject.set(x, "createBitmap", value.asInstanceOf[js.Any])
    
    inline def setCreateBitmapUndefined: Self = StObject.set(x, "createBitmap", js.undefined)
    
    inline def setCrossorigin(value: Boolean | String): Self = StObject.set(x, "crossorigin", value.asInstanceOf[js.Any])
    
    inline def setCrossoriginUndefined: Self = StObject.set(x, "crossorigin", js.undefined)
  }
}
