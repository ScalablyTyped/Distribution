package typings.plotlyDotJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Font extends js.Object {
  var font: Anon_ColorFamily
  var prefix: String
  var suffix: String
  var valueformat: String
}

object Anon_Font {
  @scala.inline
  def apply(font: Anon_ColorFamily, prefix: String, suffix: String, valueformat: String): Anon_Font = {
    val __obj = js.Dynamic.literal(font = font, prefix = prefix, suffix = suffix, valueformat = valueformat)
  
    __obj.asInstanceOf[Anon_Font]
  }
}

