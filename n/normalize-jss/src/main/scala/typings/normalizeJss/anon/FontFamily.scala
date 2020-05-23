package typings.normalizeJss.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FontFamily extends js.Object {
  var fontFamily: String
  var fontSize: String
  var lineHeight: String
  var margin: Double
}

object FontFamily {
  @scala.inline
  def apply(fontFamily: String, fontSize: String, lineHeight: String, margin: Double): FontFamily = {
    val __obj = js.Dynamic.literal(fontFamily = fontFamily.asInstanceOf[js.Any], fontSize = fontSize.asInstanceOf[js.Any], lineHeight = lineHeight.asInstanceOf[js.Any], margin = margin.asInstanceOf[js.Any])
    __obj.asInstanceOf[FontFamily]
  }
}

