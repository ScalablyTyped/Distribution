package typings.pixiJs.PIXI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * BitmapFont represents a typeface available for use with the BitmapText class. Use the `install`
  * method for adding a font to be used.
  *
  * @class
  * @memberof PIXI
  */
@js.native
trait BitmapFont extends js.Object {
  
  /**
    * The map of characters by character code.
    *
    * @member {object} PIXI.BitmapFont#chars
    * @readonly
    */
  val chars: js.Any = js.native
  
  /**
    * Remove references to created glyph textures.
    */
  def destroy(): Unit = js.native
  
  /**
    * The name of the font face.
    *
    * @member {string} PIXI.BitmapFont#font
    * @readonly
    */
  val font: String = js.native
  
  /**
    * The line-height of the font face in pixels.
    *
    * @member {number} PIXI.BitmapFont#lineHeight
    * @readonly
    */
  val lineHeight: Double = js.native
  
  /**
    * The size of the font face in pixels.
    *
    * @member {number} PIXI.BitmapFont#size
    * @readonly
    */
  val size: Double = js.native
}
object BitmapFont {
  
  @scala.inline
  def apply(chars: js.Any, destroy: () => Unit, font: String, lineHeight: Double, size: Double): BitmapFont = {
    val __obj = js.Dynamic.literal(chars = chars.asInstanceOf[js.Any], destroy = js.Any.fromFunction0(destroy), font = font.asInstanceOf[js.Any], lineHeight = lineHeight.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
    __obj.asInstanceOf[BitmapFont]
  }
  
  @scala.inline
  implicit class BitmapFontOps[Self <: BitmapFont] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setChars(value: js.Any): Self = this.set("chars", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDestroy(value: () => Unit): Self = this.set("destroy", js.Any.fromFunction0(value))
    
    @scala.inline
    def setFont(value: String): Self = this.set("font", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLineHeight(value: Double): Self = this.set("lineHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSize(value: Double): Self = this.set("size", value.asInstanceOf[js.Any])
  }
}
