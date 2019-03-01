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
    fillColor: js.Function2[/* i */ scala.Double, /* node */ js.Any, java.lang.String] = null,
    hLineColor: js.Function2[/* i */ scala.Double, /* node */ js.Any, java.lang.String] = null,
    hLineWidth: js.Function2[/* i */ scala.Double, /* node */ js.Any, scala.Double] = null,
    paddingBottom: js.Function2[/* i */ scala.Double, /* node */ js.Any, scala.Double] = null,
    paddingLeft: js.Function2[/* i */ scala.Double, /* node */ js.Any, scala.Double] = null,
    paddingRight: js.Function2[/* i */ scala.Double, /* node */ js.Any, scala.Double] = null,
    paddingTop: js.Function2[/* i */ scala.Double, /* node */ js.Any, scala.Double] = null,
    vLineColor: js.Function2[/* i */ scala.Double, /* node */ js.Any, java.lang.String] = null,
    vLineWidth: js.Function2[/* i */ scala.Double, /* node */ js.Any, scala.Double] = null
  ): TableLayoutFunctions = {
    val __obj = js.Dynamic.literal()
    if (fillColor != null) __obj.updateDynamic("fillColor")(fillColor)
    if (hLineColor != null) __obj.updateDynamic("hLineColor")(hLineColor)
    if (hLineWidth != null) __obj.updateDynamic("hLineWidth")(hLineWidth)
    if (paddingBottom != null) __obj.updateDynamic("paddingBottom")(paddingBottom)
    if (paddingLeft != null) __obj.updateDynamic("paddingLeft")(paddingLeft)
    if (paddingRight != null) __obj.updateDynamic("paddingRight")(paddingRight)
    if (paddingTop != null) __obj.updateDynamic("paddingTop")(paddingTop)
    if (vLineColor != null) __obj.updateDynamic("vLineColor")(vLineColor)
    if (vLineWidth != null) __obj.updateDynamic("vLineWidth")(vLineWidth)
    __obj.asInstanceOf[TableLayoutFunctions]
  }
}

