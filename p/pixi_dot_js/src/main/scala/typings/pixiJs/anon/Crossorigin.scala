package typings.pixiJs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Crossorigin extends StObject {
  
  var autoLoad: js.UndefOr[Boolean] = js.undefined
  
  var autoPlay: js.UndefOr[Boolean] = js.undefined
  
  var createBitmap: js.UndefOr[Boolean] = js.undefined
  
  var crossorigin: js.UndefOr[Boolean] = js.undefined
  
  var height: js.UndefOr[Double] = js.undefined
  
  var scale: js.UndefOr[Double] = js.undefined
  
  var updateFPS: js.UndefOr[Double] = js.undefined
  
  var width: js.UndefOr[Double] = js.undefined
}
object Crossorigin {
  
  inline def apply(): Crossorigin = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Crossorigin]
  }
  
  extension [Self <: Crossorigin](x: Self) {
    
    inline def setAutoLoad(value: Boolean): Self = StObject.set(x, "autoLoad", value.asInstanceOf[js.Any])
    
    inline def setAutoLoadUndefined: Self = StObject.set(x, "autoLoad", js.undefined)
    
    inline def setAutoPlay(value: Boolean): Self = StObject.set(x, "autoPlay", value.asInstanceOf[js.Any])
    
    inline def setAutoPlayUndefined: Self = StObject.set(x, "autoPlay", js.undefined)
    
    inline def setCreateBitmap(value: Boolean): Self = StObject.set(x, "createBitmap", value.asInstanceOf[js.Any])
    
    inline def setCreateBitmapUndefined: Self = StObject.set(x, "createBitmap", js.undefined)
    
    inline def setCrossorigin(value: Boolean): Self = StObject.set(x, "crossorigin", value.asInstanceOf[js.Any])
    
    inline def setCrossoriginUndefined: Self = StObject.set(x, "crossorigin", js.undefined)
    
    inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    inline def setScale(value: Double): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
    
    inline def setScaleUndefined: Self = StObject.set(x, "scale", js.undefined)
    
    inline def setUpdateFPS(value: Double): Self = StObject.set(x, "updateFPS", value.asInstanceOf[js.Any])
    
    inline def setUpdateFPSUndefined: Self = StObject.set(x, "updateFPS", js.undefined)
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
