package typings.pixiGraphics.mod

import typings.pixiCore.mod.Resource
import typings.pixiCore.mod.Texture
import typings.pixiMath.mod.Matrix
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IFillStyleOptions extends StObject {
  
  var alpha: js.UndefOr[Double] = js.undefined
  
  var color: js.UndefOr[Double] = js.undefined
  
  var matrix: js.UndefOr[Matrix] = js.undefined
  
  var texture: js.UndefOr[Texture[Resource]] = js.undefined
}
object IFillStyleOptions {
  
  inline def apply(): IFillStyleOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IFillStyleOptions]
  }
  
  extension [Self <: IFillStyleOptions](x: Self) {
    
    inline def setAlpha(value: Double): Self = StObject.set(x, "alpha", value.asInstanceOf[js.Any])
    
    inline def setAlphaUndefined: Self = StObject.set(x, "alpha", js.undefined)
    
    inline def setColor(value: Double): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    inline def setMatrix(value: Matrix): Self = StObject.set(x, "matrix", value.asInstanceOf[js.Any])
    
    inline def setMatrixUndefined: Self = StObject.set(x, "matrix", js.undefined)
    
    inline def setTexture(value: Texture[Resource]): Self = StObject.set(x, "texture", value.asInstanceOf[js.Any])
    
    inline def setTextureUndefined: Self = StObject.set(x, "texture", js.undefined)
  }
}
