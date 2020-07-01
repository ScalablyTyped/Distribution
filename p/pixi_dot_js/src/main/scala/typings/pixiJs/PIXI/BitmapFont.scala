package typings.pixiJs.PIXI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * BitmapFont represents a typeface available for use with the BitmapText class. Use the `install`
  * method for adding a font to be used.
  *
  * @class
  * @memberof PIXI
  */
trait BitmapFont extends js.Object {
  /**
    * The map of characters by character code.
    *
    * @member {object} PIXI.BitmapFont#chars
    * @readonly
    */
  val chars: js.Any
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
  /**
    * Remove references to created glyph textures.
    */
  def destroy(): Unit
}

object BitmapFont {
  @scala.inline
  def apply(chars: js.Any, destroy: () => Unit, font: String, lineHeight: Double, size: Double): BitmapFont = {
    val __obj = js.Dynamic.literal(chars = chars.asInstanceOf[js.Any], destroy = js.Any.fromFunction0(destroy), font = font.asInstanceOf[js.Any], lineHeight = lineHeight.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
    __obj.asInstanceOf[BitmapFont]
  }
}

