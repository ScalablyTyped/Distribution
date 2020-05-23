package typings.plottable.anon

import typings.plottable.plottableStrings.end
import typings.plottable.plottableStrings.middle
import typings.plottable.plottableStrings.outside
import typings.plottable.plottableStrings.start
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait End extends js.Object {
  var end: typings.plottable.plottableStrings.end
  var middle: typings.plottable.plottableStrings.middle
  var outside: typings.plottable.plottableStrings.outside
  var start: typings.plottable.plottableStrings.start
}

object End {
  @scala.inline
  def apply(end: end, middle: middle, outside: outside, start: start): End = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], middle = middle.asInstanceOf[js.Any], outside = outside.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.asInstanceOf[End]
  }
}

