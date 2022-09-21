package typings.pixiCore.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IVideoResourceOptions
  extends StObject
     with _IAutoDetectOptions {
  
  var autoLoad: js.UndefOr[Boolean] = js.undefined
  
  var autoPlay: js.UndefOr[Boolean] = js.undefined
  
  var crossorigin: js.UndefOr[Boolean | String] = js.undefined
  
  var updateFPS: js.UndefOr[Double] = js.undefined
}
object IVideoResourceOptions {
  
  inline def apply(): IVideoResourceOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IVideoResourceOptions]
  }
  
  extension [Self <: IVideoResourceOptions](x: Self) {
    
    inline def setAutoLoad(value: Boolean): Self = StObject.set(x, "autoLoad", value.asInstanceOf[js.Any])
    
    inline def setAutoLoadUndefined: Self = StObject.set(x, "autoLoad", js.undefined)
    
    inline def setAutoPlay(value: Boolean): Self = StObject.set(x, "autoPlay", value.asInstanceOf[js.Any])
    
    inline def setAutoPlayUndefined: Self = StObject.set(x, "autoPlay", js.undefined)
    
    inline def setCrossorigin(value: Boolean | String): Self = StObject.set(x, "crossorigin", value.asInstanceOf[js.Any])
    
    inline def setCrossoriginUndefined: Self = StObject.set(x, "crossorigin", js.undefined)
    
    inline def setUpdateFPS(value: Double): Self = StObject.set(x, "updateFPS", value.asInstanceOf[js.Any])
    
    inline def setUpdateFPSUndefined: Self = StObject.set(x, "updateFPS", js.undefined)
  }
}
