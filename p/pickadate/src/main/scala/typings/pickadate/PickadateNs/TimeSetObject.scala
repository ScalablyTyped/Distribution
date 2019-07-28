package typings.pickadate.PickadateNs

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
    if (clear != null) __obj.updateDynamic("clear")(clear)
    if (disable != null) __obj.updateDynamic("disable")(disable)
    if (enable != null) __obj.updateDynamic("enable")(enable)
    if (highlight != null) __obj.updateDynamic("highlight")(highlight)
    if (interval != null) __obj.updateDynamic("interval")(interval.asInstanceOf[js.Any])
    if (max != null) __obj.updateDynamic("max")(max)
    if (min != null) __obj.updateDynamic("min")(min)
    if (select != null) __obj.updateDynamic("select")(select)
    if (view != null) __obj.updateDynamic("view")(view)
    __obj.asInstanceOf[TimeSetObject]
  }
}

