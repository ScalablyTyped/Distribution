package typings.plotlyJs

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
    b: Int | Double = null,
    editType: arraydraw = null,
    l: Int | Double = null,
    r: Int | Double = null,
    t: Int | Double = null
  ): PartialPadding = {
    val __obj = js.Dynamic.literal()
    if (b != null) __obj.updateDynamic("b")(b.asInstanceOf[js.Any])
    if (editType != null) __obj.updateDynamic("editType")(editType.asInstanceOf[js.Any])
    if (l != null) __obj.updateDynamic("l")(l.asInstanceOf[js.Any])
    if (r != null) __obj.updateDynamic("r")(r.asInstanceOf[js.Any])
    if (t != null) __obj.updateDynamic("t")(t.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialPadding]
  }
}

