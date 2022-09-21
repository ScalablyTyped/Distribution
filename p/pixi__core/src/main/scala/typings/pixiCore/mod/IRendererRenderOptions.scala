package typings.pixiCore.mod

import typings.pixiMath.mod.Matrix
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IRendererRenderOptions extends StObject {
  
  var clear: js.UndefOr[Boolean] = js.undefined
  
  var renderTexture: js.UndefOr[RenderTexture] = js.undefined
  
  var skipUpdateTransform: js.UndefOr[Boolean] = js.undefined
  
  var transform: js.UndefOr[Matrix] = js.undefined
}
object IRendererRenderOptions {
  
  inline def apply(): IRendererRenderOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IRendererRenderOptions]
  }
  
  extension [Self <: IRendererRenderOptions](x: Self) {
    
    inline def setClear(value: Boolean): Self = StObject.set(x, "clear", value.asInstanceOf[js.Any])
    
    inline def setClearUndefined: Self = StObject.set(x, "clear", js.undefined)
    
    inline def setRenderTexture(value: RenderTexture): Self = StObject.set(x, "renderTexture", value.asInstanceOf[js.Any])
    
    inline def setRenderTextureUndefined: Self = StObject.set(x, "renderTexture", js.undefined)
    
    inline def setSkipUpdateTransform(value: Boolean): Self = StObject.set(x, "skipUpdateTransform", value.asInstanceOf[js.Any])
    
    inline def setSkipUpdateTransformUndefined: Self = StObject.set(x, "skipUpdateTransform", js.undefined)
    
    inline def setTransform(value: Matrix): Self = StObject.set(x, "transform", value.asInstanceOf[js.Any])
    
    inline def setTransformUndefined: Self = StObject.set(x, "transform", js.undefined)
  }
}
