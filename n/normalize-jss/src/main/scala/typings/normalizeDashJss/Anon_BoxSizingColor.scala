package typings.normalizeDashJss

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BoxSizingColor extends js.Object {
  var boxSizing: String
  var color: String
  var display: String
  var maxWidth: String
  var padding: Double
  var whiteSpace: String
}

object Anon_BoxSizingColor {
  @scala.inline
  def apply(
    boxSizing: String,
    color: String,
    display: String,
    maxWidth: String,
    padding: Double,
    whiteSpace: String
  ): Anon_BoxSizingColor = {
    val __obj = js.Dynamic.literal(boxSizing = boxSizing, color = color, display = display, maxWidth = maxWidth, padding = padding, whiteSpace = whiteSpace)
  
    __obj.asInstanceOf[Anon_BoxSizingColor]
  }
}

