package typings.pickadate.Pickadate

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SetObject extends js.Object {
  var clear: js.UndefOr[js.Any] = js.undefined
  var disable: js.UndefOr[js.Any] = js.undefined
  var enable: js.UndefOr[js.Any] = js.undefined
  var highlight: js.UndefOr[js.Any] = js.undefined
  var max: js.UndefOr[js.Any] = js.undefined
  var min: js.UndefOr[js.Any] = js.undefined
  var select: js.UndefOr[js.Any] = js.undefined
  var view: js.UndefOr[js.Any] = js.undefined
}

object SetObject {
  @scala.inline
  def apply(
    clear: js.Any = null,
    disable: js.Any = null,
    enable: js.Any = null,
    highlight: js.Any = null,
    max: js.Any = null,
    min: js.Any = null,
    select: js.Any = null,
    view: js.Any = null
  ): SetObject = {
    val __obj = js.Dynamic.literal()
    if (clear != null) __obj.updateDynamic("clear")(clear.asInstanceOf[js.Any])
    if (disable != null) __obj.updateDynamic("disable")(disable.asInstanceOf[js.Any])
    if (enable != null) __obj.updateDynamic("enable")(enable.asInstanceOf[js.Any])
    if (highlight != null) __obj.updateDynamic("highlight")(highlight.asInstanceOf[js.Any])
    if (max != null) __obj.updateDynamic("max")(max.asInstanceOf[js.Any])
    if (min != null) __obj.updateDynamic("min")(min.asInstanceOf[js.Any])
    if (select != null) __obj.updateDynamic("select")(select.asInstanceOf[js.Any])
    if (view != null) __obj.updateDynamic("view")(view.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetObject]
  }
}

