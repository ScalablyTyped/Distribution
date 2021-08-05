package typings.pixiJs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Chars extends StObject {
  
  var chars: js.UndefOr[String | (js.Array[js.Array[String] | String])] = js.undefined
  
  var padding: js.UndefOr[Double] = js.undefined
  
  var resolution: js.UndefOr[Double] = js.undefined
  
  var textureHeight: js.UndefOr[Double] = js.undefined
  
  var textureWidth: js.UndefOr[Double] = js.undefined
}
object Chars {
  
  inline def apply(): Chars = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Chars]
  }
  
  extension [Self <: Chars](x: Self) {
    
    inline def setChars(value: String | (js.Array[js.Array[String] | String])): Self = StObject.set(x, "chars", value.asInstanceOf[js.Any])
    
    inline def setCharsUndefined: Self = StObject.set(x, "chars", js.undefined)
    
    inline def setCharsVarargs(value: (js.Array[String] | String)*): Self = StObject.set(x, "chars", js.Array(value :_*))
    
    inline def setPadding(value: Double): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
    
    inline def setPaddingUndefined: Self = StObject.set(x, "padding", js.undefined)
    
    inline def setResolution(value: Double): Self = StObject.set(x, "resolution", value.asInstanceOf[js.Any])
    
    inline def setResolutionUndefined: Self = StObject.set(x, "resolution", js.undefined)
    
    inline def setTextureHeight(value: Double): Self = StObject.set(x, "textureHeight", value.asInstanceOf[js.Any])
    
    inline def setTextureHeightUndefined: Self = StObject.set(x, "textureHeight", js.undefined)
    
    inline def setTextureWidth(value: Double): Self = StObject.set(x, "textureWidth", value.asInstanceOf[js.Any])
    
    inline def setTextureWidthUndefined: Self = StObject.set(x, "textureWidth", js.undefined)
  }
}
