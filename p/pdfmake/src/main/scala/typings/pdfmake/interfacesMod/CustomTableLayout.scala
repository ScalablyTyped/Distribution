package typings.pdfmake.interfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CustomTableLayout extends _TableLayout {
  var defaultBorder: js.UndefOr[Boolean] = js.undefined
  var fillColor: js.UndefOr[String | DynamicLayout[String]] = js.undefined
  var fillOpacity: js.UndefOr[Double | DynamicLayout[Double]] = js.undefined
  var hLineColor: js.UndefOr[String | DynamicLayout[String]] = js.undefined
  var hLineStyle: js.UndefOr[DynamicLayout[LineStyle]] = js.undefined
  var hLineWidth: js.UndefOr[DynamicLayout[Double]] = js.undefined
  var paddingBottom: js.UndefOr[DynamicLayout[Double]] = js.undefined
  var paddingLeft: js.UndefOr[DynamicLayout[Double]] = js.undefined
  var paddingRight: js.UndefOr[DynamicLayout[Double]] = js.undefined
  var paddingTop: js.UndefOr[DynamicLayout[Double]] = js.undefined
  var vLineColor: js.UndefOr[String | DynamicLayout[String]] = js.undefined
  var vLineStyle: js.UndefOr[DynamicLayout[LineStyle]] = js.undefined
  var vLineWidth: js.UndefOr[DynamicLayout[Double]] = js.undefined
}

object CustomTableLayout {
  @scala.inline
  def apply(
    defaultBorder: js.UndefOr[Boolean] = js.undefined,
    fillColor: String | DynamicLayout[String] = null,
    fillOpacity: Double | DynamicLayout[Double] = null,
    hLineColor: String | DynamicLayout[String] = null,
    hLineStyle: (/* rowIndex */ Double, /* node */ ContentTable, /* columnIndex */ Double) => js.UndefOr[LineStyle | Null] = null,
    hLineWidth: (/* rowIndex */ Double, /* node */ ContentTable, /* columnIndex */ Double) => js.UndefOr[Double | Null] = null,
    paddingBottom: (/* rowIndex */ Double, /* node */ ContentTable, /* columnIndex */ Double) => js.UndefOr[Double | Null] = null,
    paddingLeft: (/* rowIndex */ Double, /* node */ ContentTable, /* columnIndex */ Double) => js.UndefOr[Double | Null] = null,
    paddingRight: (/* rowIndex */ Double, /* node */ ContentTable, /* columnIndex */ Double) => js.UndefOr[Double | Null] = null,
    paddingTop: (/* rowIndex */ Double, /* node */ ContentTable, /* columnIndex */ Double) => js.UndefOr[Double | Null] = null,
    vLineColor: String | DynamicLayout[String] = null,
    vLineStyle: (/* rowIndex */ Double, /* node */ ContentTable, /* columnIndex */ Double) => js.UndefOr[LineStyle | Null] = null,
    vLineWidth: (/* rowIndex */ Double, /* node */ ContentTable, /* columnIndex */ Double) => js.UndefOr[Double | Null] = null
  ): CustomTableLayout = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(defaultBorder)) __obj.updateDynamic("defaultBorder")(defaultBorder.get.asInstanceOf[js.Any])
    if (fillColor != null) __obj.updateDynamic("fillColor")(fillColor.asInstanceOf[js.Any])
    if (fillOpacity != null) __obj.updateDynamic("fillOpacity")(fillOpacity.asInstanceOf[js.Any])
    if (hLineColor != null) __obj.updateDynamic("hLineColor")(hLineColor.asInstanceOf[js.Any])
    if (hLineStyle != null) __obj.updateDynamic("hLineStyle")(js.Any.fromFunction3(hLineStyle))
    if (hLineWidth != null) __obj.updateDynamic("hLineWidth")(js.Any.fromFunction3(hLineWidth))
    if (paddingBottom != null) __obj.updateDynamic("paddingBottom")(js.Any.fromFunction3(paddingBottom))
    if (paddingLeft != null) __obj.updateDynamic("paddingLeft")(js.Any.fromFunction3(paddingLeft))
    if (paddingRight != null) __obj.updateDynamic("paddingRight")(js.Any.fromFunction3(paddingRight))
    if (paddingTop != null) __obj.updateDynamic("paddingTop")(js.Any.fromFunction3(paddingTop))
    if (vLineColor != null) __obj.updateDynamic("vLineColor")(vLineColor.asInstanceOf[js.Any])
    if (vLineStyle != null) __obj.updateDynamic("vLineStyle")(js.Any.fromFunction3(vLineStyle))
    if (vLineWidth != null) __obj.updateDynamic("vLineWidth")(js.Any.fromFunction3(vLineWidth))
    __obj.asInstanceOf[CustomTableLayout]
  }
}

