package typings.plottable.anon

import typings.plottable.plottableStrings.end
import typings.plottable.plottableStrings.middle
import typings.plottable.plottableStrings.start
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Middle extends js.Object {
  var end: typings.plottable.plottableStrings.end
  var middle: typings.plottable.plottableStrings.middle
  var start: typings.plottable.plottableStrings.start
}

object Middle {
  @scala.inline
  def apply(end: end, middle: middle, start: start): Middle = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], middle = middle.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.asInstanceOf[Middle]
  }
}

