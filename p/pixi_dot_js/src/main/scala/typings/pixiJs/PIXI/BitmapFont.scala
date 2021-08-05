package typings.pixiJs.PIXI

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * BitmapFont represents a typeface available for use with the BitmapText class. Use the `install`
  * method for adding a font to be used.
  *
  * @class
  * @memberof PIXI
  */
trait BitmapFont extends StObject {
  
  /**
    * The map of characters by character code.
    *
    * @member {object} PIXI.BitmapFont#chars
    * @readonly
    */
  val chars: js.Any
  
  /**
    * Remove references to created glyph textures.
    */
  def destroy(): Unit
  
  /**
    * The name of the font face.
    *
    * @member {string} PIXI.BitmapFont#font
    * @readonly
    */
  val font: String
  
  /**
    * The line-height of the font face in pixels.
    *
    * @member {number} PIXI.BitmapFont#lineHeight
    * @readonly
    */
  val lineHeight: Double
  
  /**
    * The size of the font face in pixels.
    *
    * @member {number} PIXI.BitmapFont#size
    * @readonly
    */
  val size: Double
}
object BitmapFont {
  
  inline def apply(chars: js.Any, destroy: () => Unit, font: String, lineHeight: Double, size: Double): BitmapFont = {
    val __obj = js.Dynamic.literal(chars = chars.asInstanceOf[js.Any], destroy = js.Any.fromFunction0(destroy), font = font.asInstanceOf[js.Any], lineHeight = lineHeight.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
    __obj.asInstanceOf[BitmapFont]
  }
  
  extension [Self <: BitmapFont](x: Self) {
    
    inline def setChars(value: js.Any): Self = StObject.set(x, "chars", value.asInstanceOf[js.Any])
    
    inline def setDestroy(value: () => Unit): Self = StObject.set(x, "destroy", js.Any.fromFunction0(value))
    
    inline def setFont(value: String): Self = StObject.set(x, "font", value.asInstanceOf[js.Any])
    
    inline def setLineHeight(value: Double): Self = StObject.set(x, "lineHeight", value.asInstanceOf[js.Any])
    
    inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
  }
}
