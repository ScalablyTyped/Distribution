package typings.pixiTextBitmap.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IBitmapFontOptions extends StObject {
  
  /**
    * The character set to generate.
    * @default PIXI.BitmapFont.ALPHANUMERIC
    */
  var chars: js.UndefOr[String | (js.Array[String | js.Array[String]])] = js.undefined
  
  /**
    * The padding between glyphs in the atlas.
    * @default 4
    */
  var padding: js.UndefOr[Double] = js.undefined
  
  /**
    * The resolution for rendering.
    * @default 1
    */
  var resolution: js.UndefOr[Double] = js.undefined
  
  /**
    * The height of the texture atlas.
    * @default 512
    */
  var textureHeight: js.UndefOr[Double] = js.undefined
  
  /**
    * The width of the texture atlas.
    * @default 512
    */
  var textureWidth: js.UndefOr[Double] = js.undefined
}
object IBitmapFontOptions {
  
  inline def apply(): IBitmapFontOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IBitmapFontOptions]
  }
  
  extension [Self <: IBitmapFontOptions](x: Self) {
    
    inline def setChars(value: String | (js.Array[String | js.Array[String]])): Self = StObject.set(x, "chars", value.asInstanceOf[js.Any])
    
    inline def setCharsUndefined: Self = StObject.set(x, "chars", js.undefined)
    
    inline def setCharsVarargs(value: (String | js.Array[String])*): Self = StObject.set(x, "chars", js.Array(value*))
    
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
