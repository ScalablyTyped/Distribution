package typings
package officeDashJsLib.ExcelNs.InterfacesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface describing the data returned by calling "pageLayout.toJSON()". */
trait PageLayoutData extends js.Object {
  /**
    *
    * Gets or sets the worksheet's black and white print option.
    *
    * [Api set: ExcelApi 1.9]
    */
  var blackAndWhite: js.UndefOr[scala.Boolean] = js.undefined
  /**
    *
    * Gets or sets the worksheet's bottom page margin to use for printing in points.
    *
    * [Api set: ExcelApi 1.9]
    */
  var bottomMargin: js.UndefOr[scala.Double] = js.undefined
  /**
    *
    * Gets or sets the worksheet's center horizontally flag. This flag determines whether the worksheet will be centered horizontally when it's printed.
    *
    * [Api set: ExcelApi 1.9]
    */
  var centerHorizontally: js.UndefOr[scala.Boolean] = js.undefined
  /**
    *
    * Gets or sets the worksheet's center vertically flag. This flag determines whether the worksheet will be centered vertically when it's printed.
    *
    * [Api set: ExcelApi 1.9]
    */
  var centerVertically: js.UndefOr[scala.Boolean] = js.undefined
  /**
    *
    * Gets or sets the worksheet's draft mode option. If true the sheet will be printed without graphics.
    *
    * [Api set: ExcelApi 1.9]
    */
  var draftMode: js.UndefOr[scala.Boolean] = js.undefined
  /**
    *
    * Gets or sets the worksheet's first page number to print. Null value represents "auto" page numbering.
    *
    * [Api set: ExcelApi 1.9]
    */
  var firstPageNumber: js.UndefOr[scala.Double | officeDashJsLib.officeDashJsLibStrings.Empty] = js.undefined
  /**
    *
    * Gets or sets the worksheet's footer margin, in points, for use when printing.
    *
    * [Api set: ExcelApi 1.9]
    */
  var footerMargin: js.UndefOr[scala.Double] = js.undefined
  /**
    *
    * Gets or sets the worksheet's header margin, in points, for use when printing.
    *
    * [Api set: ExcelApi 1.9]
    */
  var headerMargin: js.UndefOr[scala.Double] = js.undefined
  /**
    *
    * Header and footer configuration for the worksheet.
    *
    * [Api set: ExcelApi 1.9]
    */
  var headersFooters: js.UndefOr[HeaderFooterGroupData] = js.undefined
  /**
    *
    * Gets or sets the worksheet's left margin, in points, for use when printing.
    *
    * [Api set: ExcelApi 1.9]
    */
  var leftMargin: js.UndefOr[scala.Double] = js.undefined
  /**
    *
    * Gets or sets the worksheet's orientation of the page.
    *
    * [Api set: ExcelApi 1.9]
    */
  var orientation: js.UndefOr[
    officeDashJsLib.ExcelNs.PageOrientation | officeDashJsLib.officeDashJsLibStrings.Portrait | officeDashJsLib.officeDashJsLibStrings.Landscape
  ] = js.undefined
  /**
    *
    * Gets or sets the worksheet's paper size of the page.
    *
    * [Api set: ExcelApi 1.9]
    */
  var paperSize: js.UndefOr[
    officeDashJsLib.ExcelNs.PaperType | officeDashJsLib.officeDashJsLibStrings.Letter | officeDashJsLib.officeDashJsLibStrings.LetterSmall | officeDashJsLib.officeDashJsLibStrings.Tabloid | officeDashJsLib.officeDashJsLibStrings.Ledger | officeDashJsLib.officeDashJsLibStrings.Legal | officeDashJsLib.officeDashJsLibStrings.Statement | officeDashJsLib.officeDashJsLibStrings.Executive | officeDashJsLib.officeDashJsLibStrings.A3 | officeDashJsLib.officeDashJsLibStrings.A4 | officeDashJsLib.officeDashJsLibStrings.A4Small | officeDashJsLib.officeDashJsLibStrings.A5 | officeDashJsLib.officeDashJsLibStrings.B4 | officeDashJsLib.officeDashJsLibStrings.B5 | officeDashJsLib.officeDashJsLibStrings.Folio | officeDashJsLib.officeDashJsLibStrings.Quatro | officeDashJsLib.officeDashJsLibStrings.Paper10x14 | officeDashJsLib.officeDashJsLibStrings.Paper11x17 | officeDashJsLib.officeDashJsLibStrings.Note | officeDashJsLib.officeDashJsLibStrings.Envelope9 | officeDashJsLib.officeDashJsLibStrings.Envelope10 | officeDashJsLib.officeDashJsLibStrings.Envelope11 | officeDashJsLib.officeDashJsLibStrings.Envelope12 | officeDashJsLib.officeDashJsLibStrings.Envelope14 | officeDashJsLib.officeDashJsLibStrings.Csheet | officeDashJsLib.officeDashJsLibStrings.Dsheet | officeDashJsLib.officeDashJsLibStrings.Esheet | officeDashJsLib.officeDashJsLibStrings.EnvelopeDL | officeDashJsLib.officeDashJsLibStrings.EnvelopeC5 | officeDashJsLib.officeDashJsLibStrings.EnvelopeC3 | officeDashJsLib.officeDashJsLibStrings.EnvelopeC4 | officeDashJsLib.officeDashJsLibStrings.EnvelopeC6 | officeDashJsLib.officeDashJsLibStrings.EnvelopeC65 | officeDashJsLib.officeDashJsLibStrings.EnvelopeB4 | officeDashJsLib.officeDashJsLibStrings.EnvelopeB5 | officeDashJsLib.officeDashJsLibStrings.EnvelopeB6 | officeDashJsLib.officeDashJsLibStrings.EnvelopeItaly | officeDashJsLib.officeDashJsLibStrings.EnvelopeMonarch | officeDashJsLib.officeDashJsLibStrings.EnvelopePersonal | officeDashJsLib.officeDashJsLibStrings.FanfoldUS | officeDashJsLib.officeDashJsLibStrings.FanfoldStdGerman | officeDashJsLib.officeDashJsLibStrings.FanfoldLegalGerman
  ] = js.undefined
  /**
    *
    * Gets or sets whether the worksheet's comments should be displayed when printing.
    *
    * [Api set: ExcelApi 1.9]
    */
  var printComments: js.UndefOr[
    officeDashJsLib.ExcelNs.PrintComments | officeDashJsLib.officeDashJsLibStrings.NoComments | officeDashJsLib.officeDashJsLibStrings.EndSheet | officeDashJsLib.officeDashJsLibStrings.InPlace
  ] = js.undefined
  /**
    *
    * Gets or sets the worksheet's print errors option.
    *
    * [Api set: ExcelApi 1.9]
    */
  var printErrors: js.UndefOr[
    officeDashJsLib.ExcelNs.PrintErrorType | officeDashJsLib.officeDashJsLibStrings.AsDisplayed | officeDashJsLib.officeDashJsLibStrings.Blank | officeDashJsLib.officeDashJsLibStrings.Dash | officeDashJsLib.officeDashJsLibStrings.NotAvailable
  ] = js.undefined
  /**
    *
    * Gets or sets the worksheet's print gridlines flag. This flag determines whether gridlines will be printed or not.
    *
    * [Api set: ExcelApi 1.9]
    */
  var printGridlines: js.UndefOr[scala.Boolean] = js.undefined
  /**
    *
    * Gets or sets the worksheet's print headings flag. This flag determines whether headings will be printed or not.
    *
    * [Api set: ExcelApi 1.9]
    */
  var printHeadings: js.UndefOr[scala.Boolean] = js.undefined
  /**
    *
    * Gets or sets the worksheet's page print order option. This specifies the order to use for processing the page number printed.
    *
    * [Api set: ExcelApi 1.9]
    */
  var printOrder: js.UndefOr[
    officeDashJsLib.ExcelNs.PrintOrder | officeDashJsLib.officeDashJsLibStrings.DownThenOver | officeDashJsLib.officeDashJsLibStrings.OverThenDown
  ] = js.undefined
  /**
    *
    * Gets or sets the worksheet's right margin, in points, for use when printing.
    *
    * [Api set: ExcelApi 1.9]
    */
  var rightMargin: js.UndefOr[scala.Double] = js.undefined
  /**
    *
    * Gets or sets the worksheet's top margin, in points, for use when printing.
    *
    * [Api set: ExcelApi 1.9]
    */
  var topMargin: js.UndefOr[scala.Double] = js.undefined
  /**
    *
    * Gets or sets the worksheet's print zoom options.
    *
    * [Api set: ExcelApi 1.9]
    */
  var zoom: js.UndefOr[officeDashJsLib.ExcelNs.PageLayoutZoomOptions] = js.undefined
}

object PageLayoutData {
  @scala.inline
  def apply(
    blackAndWhite: js.UndefOr[scala.Boolean] = js.undefined,
    bottomMargin: scala.Int | scala.Double = null,
    centerHorizontally: js.UndefOr[scala.Boolean] = js.undefined,
    centerVertically: js.UndefOr[scala.Boolean] = js.undefined,
    draftMode: js.UndefOr[scala.Boolean] = js.undefined,
    firstPageNumber: scala.Double | officeDashJsLib.officeDashJsLibStrings.Empty = null,
    footerMargin: scala.Int | scala.Double = null,
    headerMargin: scala.Int | scala.Double = null,
    headersFooters: HeaderFooterGroupData = null,
    leftMargin: scala.Int | scala.Double = null,
    orientation: officeDashJsLib.ExcelNs.PageOrientation | officeDashJsLib.officeDashJsLibStrings.Portrait | officeDashJsLib.officeDashJsLibStrings.Landscape = null,
    paperSize: officeDashJsLib.ExcelNs.PaperType | officeDashJsLib.officeDashJsLibStrings.Letter | officeDashJsLib.officeDashJsLibStrings.LetterSmall | officeDashJsLib.officeDashJsLibStrings.Tabloid | officeDashJsLib.officeDashJsLibStrings.Ledger | officeDashJsLib.officeDashJsLibStrings.Legal | officeDashJsLib.officeDashJsLibStrings.Statement | officeDashJsLib.officeDashJsLibStrings.Executive | officeDashJsLib.officeDashJsLibStrings.A3 | officeDashJsLib.officeDashJsLibStrings.A4 | officeDashJsLib.officeDashJsLibStrings.A4Small | officeDashJsLib.officeDashJsLibStrings.A5 | officeDashJsLib.officeDashJsLibStrings.B4 | officeDashJsLib.officeDashJsLibStrings.B5 | officeDashJsLib.officeDashJsLibStrings.Folio | officeDashJsLib.officeDashJsLibStrings.Quatro | officeDashJsLib.officeDashJsLibStrings.Paper10x14 | officeDashJsLib.officeDashJsLibStrings.Paper11x17 | officeDashJsLib.officeDashJsLibStrings.Note | officeDashJsLib.officeDashJsLibStrings.Envelope9 | officeDashJsLib.officeDashJsLibStrings.Envelope10 | officeDashJsLib.officeDashJsLibStrings.Envelope11 | officeDashJsLib.officeDashJsLibStrings.Envelope12 | officeDashJsLib.officeDashJsLibStrings.Envelope14 | officeDashJsLib.officeDashJsLibStrings.Csheet | officeDashJsLib.officeDashJsLibStrings.Dsheet | officeDashJsLib.officeDashJsLibStrings.Esheet | officeDashJsLib.officeDashJsLibStrings.EnvelopeDL | officeDashJsLib.officeDashJsLibStrings.EnvelopeC5 | officeDashJsLib.officeDashJsLibStrings.EnvelopeC3 | officeDashJsLib.officeDashJsLibStrings.EnvelopeC4 | officeDashJsLib.officeDashJsLibStrings.EnvelopeC6 | officeDashJsLib.officeDashJsLibStrings.EnvelopeC65 | officeDashJsLib.officeDashJsLibStrings.EnvelopeB4 | officeDashJsLib.officeDashJsLibStrings.EnvelopeB5 | officeDashJsLib.officeDashJsLibStrings.EnvelopeB6 | officeDashJsLib.officeDashJsLibStrings.EnvelopeItaly | officeDashJsLib.officeDashJsLibStrings.EnvelopeMonarch | officeDashJsLib.officeDashJsLibStrings.EnvelopePersonal | officeDashJsLib.officeDashJsLibStrings.FanfoldUS | officeDashJsLib.officeDashJsLibStrings.FanfoldStdGerman | officeDashJsLib.officeDashJsLibStrings.FanfoldLegalGerman = null,
    printComments: officeDashJsLib.ExcelNs.PrintComments | officeDashJsLib.officeDashJsLibStrings.NoComments | officeDashJsLib.officeDashJsLibStrings.EndSheet | officeDashJsLib.officeDashJsLibStrings.InPlace = null,
    printErrors: officeDashJsLib.ExcelNs.PrintErrorType | officeDashJsLib.officeDashJsLibStrings.AsDisplayed | officeDashJsLib.officeDashJsLibStrings.Blank | officeDashJsLib.officeDashJsLibStrings.Dash | officeDashJsLib.officeDashJsLibStrings.NotAvailable = null,
    printGridlines: js.UndefOr[scala.Boolean] = js.undefined,
    printHeadings: js.UndefOr[scala.Boolean] = js.undefined,
    printOrder: officeDashJsLib.ExcelNs.PrintOrder | officeDashJsLib.officeDashJsLibStrings.DownThenOver | officeDashJsLib.officeDashJsLibStrings.OverThenDown = null,
    rightMargin: scala.Int | scala.Double = null,
    topMargin: scala.Int | scala.Double = null,
    zoom: officeDashJsLib.ExcelNs.PageLayoutZoomOptions = null
  ): PageLayoutData = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(blackAndWhite)) __obj.updateDynamic("blackAndWhite")(blackAndWhite)
    if (bottomMargin != null) __obj.updateDynamic("bottomMargin")(bottomMargin.asInstanceOf[js.Any])
    if (!js.isUndefined(centerHorizontally)) __obj.updateDynamic("centerHorizontally")(centerHorizontally)
    if (!js.isUndefined(centerVertically)) __obj.updateDynamic("centerVertically")(centerVertically)
    if (!js.isUndefined(draftMode)) __obj.updateDynamic("draftMode")(draftMode)
    if (firstPageNumber != null) __obj.updateDynamic("firstPageNumber")(firstPageNumber.asInstanceOf[js.Any])
    if (footerMargin != null) __obj.updateDynamic("footerMargin")(footerMargin.asInstanceOf[js.Any])
    if (headerMargin != null) __obj.updateDynamic("headerMargin")(headerMargin.asInstanceOf[js.Any])
    if (headersFooters != null) __obj.updateDynamic("headersFooters")(headersFooters)
    if (leftMargin != null) __obj.updateDynamic("leftMargin")(leftMargin.asInstanceOf[js.Any])
    if (orientation != null) __obj.updateDynamic("orientation")(orientation.asInstanceOf[js.Any])
    if (paperSize != null) __obj.updateDynamic("paperSize")(paperSize.asInstanceOf[js.Any])
    if (printComments != null) __obj.updateDynamic("printComments")(printComments.asInstanceOf[js.Any])
    if (printErrors != null) __obj.updateDynamic("printErrors")(printErrors.asInstanceOf[js.Any])
    if (!js.isUndefined(printGridlines)) __obj.updateDynamic("printGridlines")(printGridlines)
    if (!js.isUndefined(printHeadings)) __obj.updateDynamic("printHeadings")(printHeadings)
    if (printOrder != null) __obj.updateDynamic("printOrder")(printOrder.asInstanceOf[js.Any])
    if (rightMargin != null) __obj.updateDynamic("rightMargin")(rightMargin.asInstanceOf[js.Any])
    if (topMargin != null) __obj.updateDynamic("topMargin")(topMargin.asInstanceOf[js.Any])
    if (zoom != null) __obj.updateDynamic("zoom")(zoom)
    __obj.asInstanceOf[PageLayoutData]
  }
}

