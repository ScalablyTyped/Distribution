package typings.nvd3.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SankeyNodeStyleOptions extends js.Object {
  var fillColor: js.UndefOr[js.Any] = js.undefined
  var strokeColor: js.UndefOr[js.Any] = js.undefined
  var title: js.UndefOr[js.Any] = js.undefined
}

object SankeyNodeStyleOptions {
  @scala.inline
  def apply(fillColor: js.Any = null, strokeColor: js.Any = null, title: js.Any = null): SankeyNodeStyleOptions = {
    val __obj = js.Dynamic.literal()
    if (fillColor != null) __obj.updateDynamic("fillColor")(fillColor.asInstanceOf[js.Any])
    if (strokeColor != null) __obj.updateDynamic("strokeColor")(strokeColor.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[SankeyNodeStyleOptions]
  }
}

