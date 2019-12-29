package typings.officeDashJs.Excel.Interfaces

import typings.officeDashJs.Excel.PageLayoutZoomOptions
import typings.officeDashJs.Excel.PageOrientation
import typings.officeDashJs.Excel.PaperType
import typings.officeDashJs.Excel.PrintComments
import typings.officeDashJs.Excel.PrintErrorType
import typings.officeDashJs.Excel.PrintOrder
import typings.officeDashJs.officeDashJsStrings.A3
import typings.officeDashJs.officeDashJsStrings.A4
import typings.officeDashJs.officeDashJsStrings.A4Small
import typings.officeDashJs.officeDashJsStrings.A5
import typings.officeDashJs.officeDashJsStrings.AsDisplayed
import typings.officeDashJs.officeDashJsStrings.B4
import typings.officeDashJs.officeDashJsStrings.B5
import typings.officeDashJs.officeDashJsStrings.Blank
import typings.officeDashJs.officeDashJsStrings.Csheet
import typings.officeDashJs.officeDashJsStrings.Dash
import typings.officeDashJs.officeDashJsStrings.DownThenOver
import typings.officeDashJs.officeDashJsStrings.Dsheet
import typings.officeDashJs.officeDashJsStrings.EndSheet
import typings.officeDashJs.officeDashJsStrings.Envelope10
import typings.officeDashJs.officeDashJsStrings.Envelope11
import typings.officeDashJs.officeDashJsStrings.Envelope12
import typings.officeDashJs.officeDashJsStrings.Envelope14
import typings.officeDashJs.officeDashJsStrings.Envelope9
import typings.officeDashJs.officeDashJsStrings.EnvelopeB4
import typings.officeDashJs.officeDashJsStrings.EnvelopeB5
import typings.officeDashJs.officeDashJsStrings.EnvelopeB6
import typings.officeDashJs.officeDashJsStrings.EnvelopeC3
import typings.officeDashJs.officeDashJsStrings.EnvelopeC4
import typings.officeDashJs.officeDashJsStrings.EnvelopeC5
import typings.officeDashJs.officeDashJsStrings.EnvelopeC6
import typings.officeDashJs.officeDashJsStrings.EnvelopeC65
import typings.officeDashJs.officeDashJsStrings.EnvelopeDL
import typings.officeDashJs.officeDashJsStrings.EnvelopeItaly
import typings.officeDashJs.officeDashJsStrings.EnvelopeMonarch
import typings.officeDashJs.officeDashJsStrings.EnvelopePersonal
import typings.officeDashJs.officeDashJsStrings.Esheet
import typings.officeDashJs.officeDashJsStrings.Executive
import typings.officeDashJs.officeDashJsStrings.FanfoldLegalGerman
import typings.officeDashJs.officeDashJsStrings.FanfoldStdGerman
import typings.officeDashJs.officeDashJsStrings.FanfoldUS
import typings.officeDashJs.officeDashJsStrings.Folio
import typings.officeDashJs.officeDashJsStrings.InPlace
import typings.officeDashJs.officeDashJsStrings.Landscape
import typings.officeDashJs.officeDashJsStrings.Ledger
import typings.officeDashJs.officeDashJsStrings.Legal
import typings.officeDashJs.officeDashJsStrings.Letter
import typings.officeDashJs.officeDashJsStrings.LetterSmall
import typings.officeDashJs.officeDashJsStrings.NoComments
import typings.officeDashJs.officeDashJsStrings.NotAvailable
import typings.officeDashJs.officeDashJsStrings.Note
import typings.officeDashJs.officeDashJsStrings.OverThenDown
import typings.officeDashJs.officeDashJsStrings.Paper10x14
import typings.officeDashJs.officeDashJsStrings.Paper11x17
import typings.officeDashJs.officeDashJsStrings.Portrait
import typings.officeDashJs.officeDashJsStrings.Quatro
import typings.officeDashJs.officeDashJsStrings.Statement
import typings.officeDashJs.officeDashJsStrings.Tabloid
import typings.officeDashJs.officeDashJsStrings._empty
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface for updating data on the PageLayout object, for use in `pageLayout.set({ ... })`. */
trait PageLayoutUpdateData extends js.Object {
  /**
    *
    * Gets or sets the worksheet's black and white print option.
    *
    * [Api set: ExcelApi 1.9]
    */
  var blackAndWhite: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * Gets or sets the worksheet's bottom page margin to use for printing in points.
    *
    * [Api set: ExcelApi 1.9]
    */
  var bottomMargin: js.UndefOr[Double] = js.undefined
  /**
    *
    * Gets or sets the worksheet's center horizontally flag. This flag determines whether the worksheet will be centered horizontally when it's printed.
    *
    * [Api set: ExcelApi 1.9]
    */
  var centerHorizontally: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * Gets or sets the worksheet's center vertically flag. This flag determines whether the worksheet will be centered vertically when it's printed.
    *
    * [Api set: ExcelApi 1.9]
    */
  var centerVertically: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * Gets or sets the worksheet's draft mode option. If true the sheet will be printed without graphics.
    *
    * [Api set: ExcelApi 1.9]
    */
  var draftMode: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * Gets or sets the worksheet's first page number to print. Null value represents "auto" page numbering.
    *
    * [Api set: ExcelApi 1.9]
    */
  var firstPageNumber: js.UndefOr[Double | _empty] = js.undefined
  /**
    *
    * Gets or sets the worksheet's footer margin, in points, for use when printing.
    *
    * [Api set: ExcelApi 1.9]
    */
  var footerMargin: js.UndefOr[Double] = js.undefined
  /**
    *
    * Gets or sets the worksheet's header margin, in points, for use when printing.
    *
    * [Api set: ExcelApi 1.9]
    */
  var headerMargin: js.UndefOr[Double] = js.undefined
  /**
    *
    * Header and footer configuration for the worksheet.
    *
    * [Api set: ExcelApi 1.9]
    */
  var headersFooters: js.UndefOr[HeaderFooterGroupUpdateData] = js.undefined
  /**
    *
    * Gets or sets the worksheet's left margin, in points, for use when printing.
    *
    * [Api set: ExcelApi 1.9]
    */
  var leftMargin: js.UndefOr[Double] = js.undefined
  /**
    *
    * Gets or sets the worksheet's orientation of the page.
    *
    * [Api set: ExcelApi 1.9]
    */
  var orientation: js.UndefOr[PageOrientation | Portrait | Landscape] = js.undefined
  /**
    *
    * Gets or sets the worksheet's paper size of the page.
    *
    * [Api set: ExcelApi 1.9]
    */
  var paperSize: js.UndefOr[
    PaperType | Letter | LetterSmall | Tabloid | Ledger | Legal | Statement | Executive | A3 | A4 | A4Small | A5 | B4 | B5 | Folio | Quatro | Paper10x14 | Paper11x17 | Note | Envelope9 | Envelope10 | Envelope11 | Envelope12 | Envelope14 | Csheet | Dsheet | Esheet | EnvelopeDL | EnvelopeC5 | EnvelopeC3 | EnvelopeC4 | EnvelopeC6 | EnvelopeC65 | EnvelopeB4 | EnvelopeB5 | EnvelopeB6 | EnvelopeItaly | EnvelopeMonarch | EnvelopePersonal | FanfoldUS | FanfoldStdGerman | FanfoldLegalGerman
  ] = js.undefined
  /**
    *
    * Gets or sets whether the worksheet's comments should be displayed when printing.
    *
    * [Api set: ExcelApi 1.9]
    */
  var printComments: js.UndefOr[PrintComments | NoComments | EndSheet | InPlace] = js.undefined
  /**
    *
    * Gets or sets the worksheet's print errors option.
    *
    * [Api set: ExcelApi 1.9]
    */
  var printErrors: js.UndefOr[PrintErrorType | AsDisplayed | Blank | Dash | NotAvailable] = js.undefined
  /**
    *
    * Gets or sets the worksheet's print gridlines flag. This flag determines whether gridlines will be printed or not.
    *
    * [Api set: ExcelApi 1.9]
    */
  var printGridlines: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * Gets or sets the worksheet's print headings flag. This flag determines whether headings will be printed or not.
    *
    * [Api set: ExcelApi 1.9]
    */
  var printHeadings: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * Gets or sets the worksheet's page print order option. This specifies the order to use for processing the page number printed.
    *
    * [Api set: ExcelApi 1.9]
    */
  var printOrder: js.UndefOr[PrintOrder | DownThenOver | OverThenDown] = js.undefined
  /**
    *
    * Gets or sets the worksheet's right margin, in points, for use when printing.
    *
    * [Api set: ExcelApi 1.9]
    */
  var rightMargin: js.UndefOr[Double] = js.undefined
  /**
    *
    * Gets or sets the worksheet's top margin, in points, for use when printing.
    *
    * [Api set: ExcelApi 1.9]
    */
  var topMargin: js.UndefOr[Double] = js.undefined
  /**
    *
    * Gets or sets the worksheet's print zoom options.
    The `PageLayoutZoomOptions` object must be set as a JSON object (use `x.zoom = {...}` instead of `x.zoom.scale = ...`).
    *
    * [Api set: ExcelApi 1.9]
    */
  var zoom: js.UndefOr[PageLayoutZoomOptions] = js.undefined
}

object PageLayoutUpdateData {
  @scala.inline
  def apply(
    blackAndWhite: js.UndefOr[Boolean] = js.undefined,
    bottomMargin: Int | Double = null,
    centerHorizontally: js.UndefOr[Boolean] = js.undefined,
    centerVertically: js.UndefOr[Boolean] = js.undefined,
    draftMode: js.UndefOr[Boolean] = js.undefined,
    firstPageNumber: Double | _empty = null,
    footerMargin: Int | Double = null,
    headerMargin: Int | Double = null,
    headersFooters: HeaderFooterGroupUpdateData = null,
    leftMargin: Int | Double = null,
    orientation: PageOrientation | Portrait | Landscape = null,
    paperSize: PaperType | Letter | LetterSmall | Tabloid | Ledger | Legal | Statement | Executive | A3 | A4 | A4Small | A5 | B4 | B5 | Folio | Quatro | Paper10x14 | Paper11x17 | Note | Envelope9 | Envelope10 | Envelope11 | Envelope12 | Envelope14 | Csheet | Dsheet | Esheet | EnvelopeDL | EnvelopeC5 | EnvelopeC3 | EnvelopeC4 | EnvelopeC6 | EnvelopeC65 | EnvelopeB4 | EnvelopeB5 | EnvelopeB6 | EnvelopeItaly | EnvelopeMonarch | EnvelopePersonal | FanfoldUS | FanfoldStdGerman | FanfoldLegalGerman = null,
    printComments: PrintComments | NoComments | EndSheet | InPlace = null,
    printErrors: PrintErrorType | AsDisplayed | Blank | Dash | NotAvailable = null,
    printGridlines: js.UndefOr[Boolean] = js.undefined,
    printHeadings: js.UndefOr[Boolean] = js.undefined,
    printOrder: PrintOrder | DownThenOver | OverThenDown = null,
    rightMargin: Int | Double = null,
    topMargin: Int | Double = null,
    zoom: PageLayoutZoomOptions = null
  ): PageLayoutUpdateData = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(blackAndWhite)) __obj.updateDynamic("blackAndWhite")(blackAndWhite.asInstanceOf[js.Any])
    if (bottomMargin != null) __obj.updateDynamic("bottomMargin")(bottomMargin.asInstanceOf[js.Any])
    if (!js.isUndefined(centerHorizontally)) __obj.updateDynamic("centerHorizontally")(centerHorizontally.asInstanceOf[js.Any])
    if (!js.isUndefined(centerVertically)) __obj.updateDynamic("centerVertically")(centerVertically.asInstanceOf[js.Any])
    if (!js.isUndefined(draftMode)) __obj.updateDynamic("draftMode")(draftMode.asInstanceOf[js.Any])
    if (firstPageNumber != null) __obj.updateDynamic("firstPageNumber")(firstPageNumber.asInstanceOf[js.Any])
    if (footerMargin != null) __obj.updateDynamic("footerMargin")(footerMargin.asInstanceOf[js.Any])
    if (headerMargin != null) __obj.updateDynamic("headerMargin")(headerMargin.asInstanceOf[js.Any])
    if (headersFooters != null) __obj.updateDynamic("headersFooters")(headersFooters.asInstanceOf[js.Any])
    if (leftMargin != null) __obj.updateDynamic("leftMargin")(leftMargin.asInstanceOf[js.Any])
    if (orientation != null) __obj.updateDynamic("orientation")(orientation.asInstanceOf[js.Any])
    if (paperSize != null) __obj.updateDynamic("paperSize")(paperSize.asInstanceOf[js.Any])
    if (printComments != null) __obj.updateDynamic("printComments")(printComments.asInstanceOf[js.Any])
    if (printErrors != null) __obj.updateDynamic("printErrors")(printErrors.asInstanceOf[js.Any])
    if (!js.isUndefined(printGridlines)) __obj.updateDynamic("printGridlines")(printGridlines.asInstanceOf[js.Any])
    if (!js.isUndefined(printHeadings)) __obj.updateDynamic("printHeadings")(printHeadings.asInstanceOf[js.Any])
    if (printOrder != null) __obj.updateDynamic("printOrder")(printOrder.asInstanceOf[js.Any])
    if (rightMargin != null) __obj.updateDynamic("rightMargin")(rightMargin.asInstanceOf[js.Any])
    if (topMargin != null) __obj.updateDynamic("topMargin")(topMargin.asInstanceOf[js.Any])
    if (zoom != null) __obj.updateDynamic("zoom")(zoom.asInstanceOf[js.Any])
    __obj.asInstanceOf[PageLayoutUpdateData]
  }
}

