package typings.plotlyJs.anon

import typings.plotlyJs.plotlyJsStrings.arraydraw
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<plotly.js.plotly.js.Padding> */
trait PartialPadding extends js.Object {
  var b: js.UndefOr[Double] = js.undefined
  var editType: js.UndefOr[arraydraw] = js.undefined
  var l: js.UndefOr[Double] = js.undefined
  var r: js.UndefOr[Double] = js.undefined
  var t: js.UndefOr[Double] = js.undefined
}

object PartialPadding {
  @scala.inline
  def apply(
    b: js.UndefOr[Double] = js.undefined,
    editType: arraydraw = null,
    l: js.UndefOr[Double] = js.undefined,
    r: js.UndefOr[Double] = js.undefined,
    t: js.UndefOr[Double] = js.undefined
  ): PartialPadding = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(b)) __obj.updateDynamic("b")(b.get.asInstanceOf[js.Any])
    if (editType != null) __obj.updateDynamic("editType")(editType.asInstanceOf[js.Any])
    if (!js.isUndefined(l)) __obj.updateDynamic("l")(l.get.asInstanceOf[js.Any])
    if (!js.isUndefined(r)) __obj.updateDynamic("r")(r.get.asInstanceOf[js.Any])
    if (!js.isUndefined(t)) __obj.updateDynamic("t")(t.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialPadding]
  }
}

