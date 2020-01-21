package typings.pdfmake.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TableLayoutFunctions extends js.Object {
  var fillColor: js.UndefOr[js.Function2[/* i */ Double, /* node */ js.Any, String]] = js.undefined
  var hLineColor: js.UndefOr[js.Function2[/* i */ Double, /* node */ js.Any, String]] = js.undefined
  var hLineWidth: js.UndefOr[js.Function2[/* i */ Double, /* node */ js.Any, Double]] = js.undefined
  var paddingBottom: js.UndefOr[js.Function2[/* i */ Double, /* node */ js.Any, Double]] = js.undefined
  var paddingLeft: js.UndefOr[js.Function2[/* i */ Double, /* node */ js.Any, Double]] = js.undefined
  var paddingRight: js.UndefOr[js.Function2[/* i */ Double, /* node */ js.Any, Double]] = js.undefined
  var paddingTop: js.UndefOr[js.Function2[/* i */ Double, /* node */ js.Any, Double]] = js.undefined
  var vLineColor: js.UndefOr[js.Function2[/* i */ Double, /* node */ js.Any, String]] = js.undefined
  var vLineWidth: js.UndefOr[js.Function2[/* i */ Double, /* node */ js.Any, Double]] = js.undefined
}

object TableLayoutFunctions {
  @scala.inline
  def apply(
    fillColor: (/* i */ Double, /* node */ js.Any) => String = null,
    hLineColor: (/* i */ Double, /* node */ js.Any) => String = null,
    hLineWidth: (/* i */ Double, /* node */ js.Any) => Double = null,
    paddingBottom: (/* i */ Double, /* node */ js.Any) => Double = null,
    paddingLeft: (/* i */ Double, /* node */ js.Any) => Double = null,
    paddingRight: (/* i */ Double, /* node */ js.Any) => Double = null,
    paddingTop: (/* i */ Double, /* node */ js.Any) => Double = null,
    vLineColor: (/* i */ Double, /* node */ js.Any) => String = null,
    vLineWidth: (/* i */ Double, /* node */ js.Any) => Double = null
  ): TableLayoutFunctions = {
    val __obj = js.Dynamic.literal()
    if (fillColor != null) __obj.updateDynamic("fillColor")(js.Any.fromFunction2(fillColor))
    if (hLineColor != null) __obj.updateDynamic("hLineColor")(js.Any.fromFunction2(hLineColor))
    if (hLineWidth != null) __obj.updateDynamic("hLineWidth")(js.Any.fromFunction2(hLineWidth))
    if (paddingBottom != null) __obj.updateDynamic("paddingBottom")(js.Any.fromFunction2(paddingBottom))
    if (paddingLeft != null) __obj.updateDynamic("paddingLeft")(js.Any.fromFunction2(paddingLeft))
    if (paddingRight != null) __obj.updateDynamic("paddingRight")(js.Any.fromFunction2(paddingRight))
    if (paddingTop != null) __obj.updateDynamic("paddingTop")(js.Any.fromFunction2(paddingTop))
    if (vLineColor != null) __obj.updateDynamic("vLineColor")(js.Any.fromFunction2(vLineColor))
    if (vLineWidth != null) __obj.updateDynamic("vLineWidth")(js.Any.fromFunction2(vLineWidth))
    __obj.asInstanceOf[TableLayoutFunctions]
  }
}

