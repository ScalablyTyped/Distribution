package typings.normalizeJss

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonBoxSizingColor extends js.Object {
  var boxSizing: String
  var color: String
  var display: String
  var maxWidth: String
  var padding: Double
  var whiteSpace: String
}

object AnonBoxSizingColor {
  @scala.inline
  def apply(
    boxSizing: String,
    color: String,
    display: String,
    maxWidth: String,
    padding: Double,
    whiteSpace: String
  ): AnonBoxSizingColor = {
    val __obj = js.Dynamic.literal(boxSizing = boxSizing.asInstanceOf[js.Any], color = color.asInstanceOf[js.Any], display = display.asInstanceOf[js.Any], maxWidth = maxWidth.asInstanceOf[js.Any], padding = padding.asInstanceOf[js.Any], whiteSpace = whiteSpace.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonBoxSizingColor]
  }
}

