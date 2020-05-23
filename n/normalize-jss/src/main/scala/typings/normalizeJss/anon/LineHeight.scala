package typings.normalizeJss.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LineHeight extends js.Object {
  var fontFamily: String
  var lineHeight: String
  var textSizeAdjust: String
}

object LineHeight {
  @scala.inline
  def apply(fontFamily: String, lineHeight: String, textSizeAdjust: String): LineHeight = {
    val __obj = js.Dynamic.literal(fontFamily = fontFamily.asInstanceOf[js.Any], lineHeight = lineHeight.asInstanceOf[js.Any], textSizeAdjust = textSizeAdjust.asInstanceOf[js.Any])
    __obj.asInstanceOf[LineHeight]
  }
}

