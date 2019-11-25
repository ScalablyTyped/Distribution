package typings.phaser

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Align extends js.Object {
  /**
    * The alignment of the text in a multi-line BitmapText object.
    */
  var align: integer
  /**
    * The name of the font.
    */
  var font: String
  /**
    * The size of the font.
    */
  var fontSize: Double
  /**
    * Adds / Removes spacing between characters.
    */
  var letterSpacing: Double
  /**
    * The text that this Bitmap Text displays.
    */
  var text: String
}

object Anon_Align {
  @scala.inline
  def apply(align: integer, font: String, fontSize: Double, letterSpacing: Double, text: String): Anon_Align = {
    val __obj = js.Dynamic.literal(align = align.asInstanceOf[js.Any], font = font.asInstanceOf[js.Any], fontSize = fontSize.asInstanceOf[js.Any], letterSpacing = letterSpacing.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Align]
  }
}

