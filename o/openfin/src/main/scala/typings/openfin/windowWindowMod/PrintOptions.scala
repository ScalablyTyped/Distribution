package typings.openfin.windowWindowMod

import typings.openfin.openfinStrings.longEdge
import typings.openfin.openfinStrings.shortEdge
import typings.openfin.openfinStrings.simplex
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PrintOptions extends js.Object {
  var collate: js.UndefOr[Boolean] = js.undefined
  var color: js.UndefOr[Boolean] = js.undefined
  var copies: js.UndefOr[Double] = js.undefined
  var deviceName: js.UndefOr[String] = js.undefined
  var dpi: js.UndefOr[Dpi] = js.undefined
  var duplexMode: js.UndefOr[simplex | shortEdge | longEdge] = js.undefined
  var landscape: js.UndefOr[Boolean] = js.undefined
  var margins: js.UndefOr[Margins] = js.undefined
  var pageRanges: js.UndefOr[Record[String, Double]] = js.undefined
  var pagesPerSheet: js.UndefOr[Double] = js.undefined
  var printBackground: js.UndefOr[Boolean] = js.undefined
  var scaleFactor: js.UndefOr[Double] = js.undefined
  var silent: js.UndefOr[Boolean] = js.undefined
}

object PrintOptions {
  @scala.inline
  def apply(
    collate: js.UndefOr[Boolean] = js.undefined,
    color: js.UndefOr[Boolean] = js.undefined,
    copies: Int | Double = null,
    deviceName: String = null,
    dpi: Dpi = null,
    duplexMode: simplex | shortEdge | longEdge = null,
    landscape: js.UndefOr[Boolean] = js.undefined,
    margins: Margins = null,
    pageRanges: Record[String, Double] = null,
    pagesPerSheet: Int | Double = null,
    printBackground: js.UndefOr[Boolean] = js.undefined,
    scaleFactor: Int | Double = null,
    silent: js.UndefOr[Boolean] = js.undefined
  ): PrintOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(collate)) __obj.updateDynamic("collate")(collate.asInstanceOf[js.Any])
    if (!js.isUndefined(color)) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (copies != null) __obj.updateDynamic("copies")(copies.asInstanceOf[js.Any])
    if (deviceName != null) __obj.updateDynamic("deviceName")(deviceName.asInstanceOf[js.Any])
    if (dpi != null) __obj.updateDynamic("dpi")(dpi.asInstanceOf[js.Any])
    if (duplexMode != null) __obj.updateDynamic("duplexMode")(duplexMode.asInstanceOf[js.Any])
    if (!js.isUndefined(landscape)) __obj.updateDynamic("landscape")(landscape.asInstanceOf[js.Any])
    if (margins != null) __obj.updateDynamic("margins")(margins.asInstanceOf[js.Any])
    if (pageRanges != null) __obj.updateDynamic("pageRanges")(pageRanges.asInstanceOf[js.Any])
    if (pagesPerSheet != null) __obj.updateDynamic("pagesPerSheet")(pagesPerSheet.asInstanceOf[js.Any])
    if (!js.isUndefined(printBackground)) __obj.updateDynamic("printBackground")(printBackground.asInstanceOf[js.Any])
    if (scaleFactor != null) __obj.updateDynamic("scaleFactor")(scaleFactor.asInstanceOf[js.Any])
    if (!js.isUndefined(silent)) __obj.updateDynamic("silent")(silent.asInstanceOf[js.Any])
    __obj.asInstanceOf[PrintOptions]
  }
}

