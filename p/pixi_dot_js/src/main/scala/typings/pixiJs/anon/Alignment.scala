package typings.pixiJs.anon

import typings.pixiJs.PIXI.LINE_CAP
import typings.pixiJs.PIXI.LINE_JOIN
import typings.pixiJs.PIXI.Matrix
import typings.pixiJs.PIXI.Texture
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Alignment extends StObject {
  
  var alignment: js.UndefOr[Double] = js.undefined
  
  var alpha: js.UndefOr[Double] = js.undefined
  
  var cap: js.UndefOr[LINE_CAP] = js.undefined
  
  var color: js.UndefOr[Double] = js.undefined
  
  var join: js.UndefOr[LINE_JOIN] = js.undefined
  
  var matrix: js.UndefOr[Matrix] = js.undefined
  
  var miterLimit: js.UndefOr[Double] = js.undefined
  
  var native: js.UndefOr[Boolean] = js.undefined
  
  var texture: js.UndefOr[Texture] = js.undefined
  
  var width: js.UndefOr[Double] = js.undefined
}
object Alignment {
  
  inline def apply(): Alignment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Alignment]
  }
  
  extension [Self <: Alignment](x: Self) {
    
    inline def setAlignment(value: Double): Self = StObject.set(x, "alignment", value.asInstanceOf[js.Any])
    
    inline def setAlignmentUndefined: Self = StObject.set(x, "alignment", js.undefined)
    
    inline def setAlpha(value: Double): Self = StObject.set(x, "alpha", value.asInstanceOf[js.Any])
    
    inline def setAlphaUndefined: Self = StObject.set(x, "alpha", js.undefined)
    
    inline def setCap(value: LINE_CAP): Self = StObject.set(x, "cap", value.asInstanceOf[js.Any])
    
    inline def setCapUndefined: Self = StObject.set(x, "cap", js.undefined)
    
    inline def setColor(value: Double): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    inline def setJoin(value: LINE_JOIN): Self = StObject.set(x, "join", value.asInstanceOf[js.Any])
    
    inline def setJoinUndefined: Self = StObject.set(x, "join", js.undefined)
    
    inline def setMatrix(value: Matrix): Self = StObject.set(x, "matrix", value.asInstanceOf[js.Any])
    
    inline def setMatrixUndefined: Self = StObject.set(x, "matrix", js.undefined)
    
    inline def setMiterLimit(value: Double): Self = StObject.set(x, "miterLimit", value.asInstanceOf[js.Any])
    
    inline def setMiterLimitUndefined: Self = StObject.set(x, "miterLimit", js.undefined)
    
    inline def setNative(value: Boolean): Self = StObject.set(x, "native", value.asInstanceOf[js.Any])
    
    inline def setNativeUndefined: Self = StObject.set(x, "native", js.undefined)
    
    inline def setTexture(value: Texture): Self = StObject.set(x, "texture", value.asInstanceOf[js.Any])
    
    inline def setTextureUndefined: Self = StObject.set(x, "texture", js.undefined)
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
