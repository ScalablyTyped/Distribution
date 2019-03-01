package typings
package officeDashJsDashPreviewLib.ExcelNs.InterfacesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * [Api set: ExcelApi BETA (PREVIEW ONLY)]
  * @beta
  */
trait PageLayoutLoadOptions extends js.Object {
  @JSName("$all")
  var $all: js.UndefOr[scala.Boolean] = js.undefined
  /**
    *
    * Gets or sets the worksheet's black and white print option.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var blackAndWhite: js.UndefOr[scala.Boolean] = js.undefined
  /**
    *
    * Gets or sets the worksheet's bottom page margin to use for printing in points.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var bottomMargin: js.UndefOr[scala.Boolean] = js.undefined
  /**
    *
    * Gets or sets the worksheet's center horizontally flag. This flag determines whether the worksheet will be centered horizontally when it's printed.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var centerHorizontally: js.UndefOr[scala.Boolean] = js.undefined
  /**
    *
    * Gets or sets the worksheet's center vertically flag. This flag determines whether the worksheet will be centered vertically when it's printed.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var centerVertically: js.UndefOr[scala.Boolean] = js.undefined
  /**
    *
    * Gets or sets the worksheet's draft mode option. If true the sheet will be printed without graphics.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var draftMode: js.UndefOr[scala.Boolean] = js.undefined
  /**
    *
    * Gets or sets the worksheet's first page number to print. Null value represents "auto" page numbering.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var firstPageNumber: js.UndefOr[scala.Boolean] = js.undefined
  /**
    *
    * Gets or sets the worksheet's footer margin, in points, for use when printing.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var footerMargin: js.UndefOr[scala.Boolean] = js.undefined
  /**
    *
    * Gets or sets the worksheet's header margin, in points, for use when printing.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var headerMargin: js.UndefOr[scala.Boolean] = js.undefined
  /**
    *
    * Header and footer configuration for the worksheet.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var headersFooters: js.UndefOr[HeaderFooterGroupLoadOptions] = js.undefined
  /**
    *
    * Gets or sets the worksheet's left margin, in points, for use when printing.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var leftMargin: js.UndefOr[scala.Boolean] = js.undefined
  /**
    *
    * Gets or sets the worksheet's orientation of the page.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var orientation: js.UndefOr[scala.Boolean] = js.undefined
  /**
    *
    * Gets or sets the worksheet's paper size of the page.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var paperSize: js.UndefOr[scala.Boolean] = js.undefined
  /**
    *
    * Gets or sets whether the worksheet's comments should be displayed when printing.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var printComments: js.UndefOr[scala.Boolean] = js.undefined
  /**
    *
    * Gets or sets the worksheet's print errors option.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var printErrors: js.UndefOr[scala.Boolean] = js.undefined
  /**
    *
    * Gets or sets the worksheet's print gridlines flag. This flag determines whether gridlines will be printed or not.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var printGridlines: js.UndefOr[scala.Boolean] = js.undefined
  /**
    *
    * Gets or sets the worksheet's print headings flag. This flag determines whether headings will be printed or not.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var printHeadings: js.UndefOr[scala.Boolean] = js.undefined
  /**
    *
    * Gets or sets the worksheet's page print order option. This specifies the order to use for processing the page number printed.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var printOrder: js.UndefOr[scala.Boolean] = js.undefined
  /**
    *
    * Gets or sets the worksheet's right margin, in points, for use when printing.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var rightMargin: js.UndefOr[scala.Boolean] = js.undefined
  /**
    *
    * Gets or sets the worksheet's top margin, in points, for use when printing.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var topMargin: js.UndefOr[scala.Boolean] = js.undefined
  /**
    *
    * Gets or sets the worksheet's print zoom options.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var zoom: js.UndefOr[scala.Boolean] = js.undefined
}

object PageLayoutLoadOptions {
  @scala.inline
  def apply(
    $all: js.UndefOr[scala.Boolean] = js.undefined,
    blackAndWhite: js.UndefOr[scala.Boolean] = js.undefined,
    bottomMargin: js.UndefOr[scala.Boolean] = js.undefined,
    centerHorizontally: js.UndefOr[scala.Boolean] = js.undefined,
    centerVertically: js.UndefOr[scala.Boolean] = js.undefined,
    draftMode: js.UndefOr[scala.Boolean] = js.undefined,
    firstPageNumber: js.UndefOr[scala.Boolean] = js.undefined,
    footerMargin: js.UndefOr[scala.Boolean] = js.undefined,
    headerMargin: js.UndefOr[scala.Boolean] = js.undefined,
    headersFooters: HeaderFooterGroupLoadOptions = null,
    leftMargin: js.UndefOr[scala.Boolean] = js.undefined,
    orientation: js.UndefOr[scala.Boolean] = js.undefined,
    paperSize: js.UndefOr[scala.Boolean] = js.undefined,
    printComments: js.UndefOr[scala.Boolean] = js.undefined,
    printErrors: js.UndefOr[scala.Boolean] = js.undefined,
    printGridlines: js.UndefOr[scala.Boolean] = js.undefined,
    printHeadings: js.UndefOr[scala.Boolean] = js.undefined,
    printOrder: js.UndefOr[scala.Boolean] = js.undefined,
    rightMargin: js.UndefOr[scala.Boolean] = js.undefined,
    topMargin: js.UndefOr[scala.Boolean] = js.undefined,
    zoom: js.UndefOr[scala.Boolean] = js.undefined
  ): PageLayoutLoadOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined($all)) __obj.updateDynamic("$all")($all)
    if (!js.isUndefined(blackAndWhite)) __obj.updateDynamic("blackAndWhite")(blackAndWhite)
    if (!js.isUndefined(bottomMargin)) __obj.updateDynamic("bottomMargin")(bottomMargin)
    if (!js.isUndefined(centerHorizontally)) __obj.updateDynamic("centerHorizontally")(centerHorizontally)
    if (!js.isUndefined(centerVertically)) __obj.updateDynamic("centerVertically")(centerVertically)
    if (!js.isUndefined(draftMode)) __obj.updateDynamic("draftMode")(draftMode)
    if (!js.isUndefined(firstPageNumber)) __obj.updateDynamic("firstPageNumber")(firstPageNumber)
    if (!js.isUndefined(footerMargin)) __obj.updateDynamic("footerMargin")(footerMargin)
    if (!js.isUndefined(headerMargin)) __obj.updateDynamic("headerMargin")(headerMargin)
    if (headersFooters != null) __obj.updateDynamic("headersFooters")(headersFooters)
    if (!js.isUndefined(leftMargin)) __obj.updateDynamic("leftMargin")(leftMargin)
    if (!js.isUndefined(orientation)) __obj.updateDynamic("orientation")(orientation)
    if (!js.isUndefined(paperSize)) __obj.updateDynamic("paperSize")(paperSize)
    if (!js.isUndefined(printComments)) __obj.updateDynamic("printComments")(printComments)
    if (!js.isUndefined(printErrors)) __obj.updateDynamic("printErrors")(printErrors)
    if (!js.isUndefined(printGridlines)) __obj.updateDynamic("printGridlines")(printGridlines)
    if (!js.isUndefined(printHeadings)) __obj.updateDynamic("printHeadings")(printHeadings)
    if (!js.isUndefined(printOrder)) __obj.updateDynamic("printOrder")(printOrder)
    if (!js.isUndefined(rightMargin)) __obj.updateDynamic("rightMargin")(rightMargin)
    if (!js.isUndefined(topMargin)) __obj.updateDynamic("topMargin")(topMargin)
    if (!js.isUndefined(zoom)) __obj.updateDynamic("zoom")(zoom)
    __obj.asInstanceOf[PageLayoutLoadOptions]
  }
}

