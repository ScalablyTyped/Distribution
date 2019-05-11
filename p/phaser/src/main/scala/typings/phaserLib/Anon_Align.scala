package typings
package phaserLib

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
  var font: java.lang.String
  /**
    * The size of the font.
    */
  var fontSize: scala.Double
  /**
    * Adds / Removes spacing between characters.
    */
  var letterSpacing: scala.Double
  /**
    * The text that this Bitmap Text displays.
    */
  var text: java.lang.String
}

object Anon_Align {
  @scala.inline
  def apply(
    align: integer,
    font: java.lang.String,
    fontSize: scala.Double,
    letterSpacing: scala.Double,
    text: java.lang.String
  ): Anon_Align = {
    val __obj = js.Dynamic.literal(align = align, font = font, fontSize = fontSize, letterSpacing = letterSpacing, text = text)
  
    __obj.asInstanceOf[Anon_Align]
  }
}

