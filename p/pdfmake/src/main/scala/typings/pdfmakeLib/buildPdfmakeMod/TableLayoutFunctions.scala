package typings
package pdfmakeLib.buildPdfmakeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TableLayoutFunctions extends js.Object {
  var fillColor: js.UndefOr[js.Function2[/* i */ scala.Double, /* node */ js.Any, java.lang.String]] = js.undefined
  var hLineColor: js.UndefOr[js.Function2[/* i */ scala.Double, /* node */ js.Any, java.lang.String]] = js.undefined
  var hLineWidth: js.UndefOr[js.Function2[/* i */ scala.Double, /* node */ js.Any, scala.Double]] = js.undefined
  var paddingBottom: js.UndefOr[js.Function2[/* i */ scala.Double, /* node */ js.Any, scala.Double]] = js.undefined
  var paddingLeft: js.UndefOr[js.Function2[/* i */ scala.Double, /* node */ js.Any, scala.Double]] = js.undefined
  var paddingRight: js.UndefOr[js.Function2[/* i */ scala.Double, /* node */ js.Any, scala.Double]] = js.undefined
  var paddingTop: js.UndefOr[js.Function2[/* i */ scala.Double, /* node */ js.Any, scala.Double]] = js.undefined
  var vLineColor: js.UndefOr[js.Function2[/* i */ scala.Double, /* node */ js.Any, java.lang.String]] = js.undefined
  var vLineWidth: js.UndefOr[js.Function2[/* i */ scala.Double, /* node */ js.Any, scala.Double]] = js.undefined
}

object TableLayoutFunctions {
  @scala.inline
  def apply(
    fillColor: (/* i */ scala.Double, /* node */ js.Any) => java.lang.String = null,
    hLineColor: (/* i */ scala.Double, /* node */ js.Any) => java.lang.String = null,
    hLineWidth: (/* i */ scala.Double, /* node */ js.Any) => scala.Double = null,
    paddingBottom: (/* i */ scala.Double, /* node */ js.Any) => scala.Double = null,
    paddingLeft: (/* i */ scala.Double, /* node */ js.Any) => scala.Double = null,
    paddingRight: (/* i */ scala.Double, /* node */ js.Any) => scala.Double = null,
    paddingTop: (/* i */ scala.Double, /* node */ js.Any) => scala.Double = null,
    vLineColor: (/* i */ scala.Double, /* node */ js.Any) => java.lang.String = null,
    vLineWidth: (/* i */ scala.Double, /* node */ js.Any) => scala.Double = null
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

