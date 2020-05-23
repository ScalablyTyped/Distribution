package typings.plottable.anon

import typings.plottable.plottableStrings.horizontal
import typings.plottable.plottableStrings.vertical
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Horizontal extends js.Object {
  var horizontal: typings.plottable.plottableStrings.horizontal
  var vertical: typings.plottable.plottableStrings.vertical
}

object Horizontal {
  @scala.inline
  def apply(horizontal: horizontal, vertical: vertical): Horizontal = {
    val __obj = js.Dynamic.literal(horizontal = horizontal.asInstanceOf[js.Any], vertical = vertical.asInstanceOf[js.Any])
    __obj.asInstanceOf[Horizontal]
  }
}

