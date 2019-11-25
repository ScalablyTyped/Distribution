package typings.pickadate.Pickadate

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TimeSetObject extends SetObject {
  /**
    * Choose the minutes interval between each time in the list.
    * Defaults to 30.
    */
  var interval: js.UndefOr[Double] = js.undefined
}

object TimeSetObject {
  @scala.inline
  def apply(
    clear: js.Any = null,
    disable: js.Any = null,
    enable: js.Any = null,
    highlight: js.Any = null,
    interval: Int | Double = null,
    max: js.Any = null,
    min: js.Any = null,
    select: js.Any = null,
    view: js.Any = null
  ): TimeSetObject = {
    val __obj = js.Dynamic.literal()
    if (clear != null) __obj.updateDynamic("clear")(clear.asInstanceOf[js.Any])
    if (disable != null) __obj.updateDynamic("disable")(disable.asInstanceOf[js.Any])
    if (enable != null) __obj.updateDynamic("enable")(enable.asInstanceOf[js.Any])
    if (highlight != null) __obj.updateDynamic("highlight")(highlight.asInstanceOf[js.Any])
    if (interval != null) __obj.updateDynamic("interval")(interval.asInstanceOf[js.Any])
    if (max != null) __obj.updateDynamic("max")(max.asInstanceOf[js.Any])
    if (min != null) __obj.updateDynamic("min")(min.asInstanceOf[js.Any])
    if (select != null) __obj.updateDynamic("select")(select.asInstanceOf[js.Any])
    if (view != null) __obj.updateDynamic("view")(view.asInstanceOf[js.Any])
    __obj.asInstanceOf[TimeSetObject]
  }
}

