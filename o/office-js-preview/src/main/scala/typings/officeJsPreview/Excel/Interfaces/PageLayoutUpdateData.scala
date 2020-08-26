package typings.officeJsPreview.Excel.Interfaces

import typings.officeJsPreview.Excel.PageLayoutZoomOptions
import typings.officeJsPreview.Excel.PageOrientation
import typings.officeJsPreview.Excel.PaperType
import typings.officeJsPreview.Excel.PrintComments
import typings.officeJsPreview.Excel.PrintErrorType
import typings.officeJsPreview.Excel.PrintOrder
import typings.officeJsPreview.officeJsPreviewStrings.A3
import typings.officeJsPreview.officeJsPreviewStrings.A4
import typings.officeJsPreview.officeJsPreviewStrings.A4Small
import typings.officeJsPreview.officeJsPreviewStrings.A5
import typings.officeJsPreview.officeJsPreviewStrings.AsDisplayed
import typings.officeJsPreview.officeJsPreviewStrings.B4
import typings.officeJsPreview.officeJsPreviewStrings.B5
import typings.officeJsPreview.officeJsPreviewStrings.Blank
import typings.officeJsPreview.officeJsPreviewStrings.Csheet
import typings.officeJsPreview.officeJsPreviewStrings.Dash
import typings.officeJsPreview.officeJsPreviewStrings.DownThenOver
import typings.officeJsPreview.officeJsPreviewStrings.Dsheet
import typings.officeJsPreview.officeJsPreviewStrings.EndSheet
import typings.officeJsPreview.officeJsPreviewStrings.Envelope10
import typings.officeJsPreview.officeJsPreviewStrings.Envelope11
import typings.officeJsPreview.officeJsPreviewStrings.Envelope12
import typings.officeJsPreview.officeJsPreviewStrings.Envelope14
import typings.officeJsPreview.officeJsPreviewStrings.Envelope9
import typings.officeJsPreview.officeJsPreviewStrings.EnvelopeB4
import typings.officeJsPreview.officeJsPreviewStrings.EnvelopeB5
import typings.officeJsPreview.officeJsPreviewStrings.EnvelopeB6
import typings.officeJsPreview.officeJsPreviewStrings.EnvelopeC3
import typings.officeJsPreview.officeJsPreviewStrings.EnvelopeC4
import typings.officeJsPreview.officeJsPreviewStrings.EnvelopeC5
import typings.officeJsPreview.officeJsPreviewStrings.EnvelopeC6
import typings.officeJsPreview.officeJsPreviewStrings.EnvelopeC65
import typings.officeJsPreview.officeJsPreviewStrings.EnvelopeDL
import typings.officeJsPreview.officeJsPreviewStrings.EnvelopeItaly
import typings.officeJsPreview.officeJsPreviewStrings.EnvelopeMonarch
import typings.officeJsPreview.officeJsPreviewStrings.EnvelopePersonal
import typings.officeJsPreview.officeJsPreviewStrings.Esheet
import typings.officeJsPreview.officeJsPreviewStrings.Executive
import typings.officeJsPreview.officeJsPreviewStrings.FanfoldLegalGerman
import typings.officeJsPreview.officeJsPreviewStrings.FanfoldStdGerman
import typings.officeJsPreview.officeJsPreviewStrings.FanfoldUS
import typings.officeJsPreview.officeJsPreviewStrings.Folio
import typings.officeJsPreview.officeJsPreviewStrings.InPlace
import typings.officeJsPreview.officeJsPreviewStrings.Landscape
import typings.officeJsPreview.officeJsPreviewStrings.Ledger
import typings.officeJsPreview.officeJsPreviewStrings.Legal
import typings.officeJsPreview.officeJsPreviewStrings.Letter
import typings.officeJsPreview.officeJsPreviewStrings.LetterSmall
import typings.officeJsPreview.officeJsPreviewStrings.NoComments
import typings.officeJsPreview.officeJsPreviewStrings.NotAvailable
import typings.officeJsPreview.officeJsPreviewStrings.Note
import typings.officeJsPreview.officeJsPreviewStrings.OverThenDown
import typings.officeJsPreview.officeJsPreviewStrings.Paper10x14
import typings.officeJsPreview.officeJsPreviewStrings.Paper11x17
import typings.officeJsPreview.officeJsPreviewStrings.Portrait
import typings.officeJsPreview.officeJsPreviewStrings.Quatro
import typings.officeJsPreview.officeJsPreviewStrings.Statement
import typings.officeJsPreview.officeJsPreviewStrings.Tabloid
import typings.officeJsPreview.officeJsPreviewStrings._empty
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface for updating data on the PageLayout object, for use in `pageLayout.set({ ... })`. */
@js.native
trait PageLayoutUpdateData extends js.Object {
  /**
    *
    * The worksheet's black and white print option.
    *
    * [Api set: ExcelApi 1.9]
    */
  var blackAndWhite: js.UndefOr[Boolean] = js.native
  /**
    *
    * The worksheet's bottom page margin to use for printing in points.
    *
    * [Api set: ExcelApi 1.9]
    */
  var bottomMargin: js.UndefOr[Double] = js.native
  /**
    *
    * The worksheet's center horizontally flag. This flag determines whether the worksheet will be centered horizontally when it's printed.
    *
    * [Api set: ExcelApi 1.9]
    */
  var centerHorizontally: js.UndefOr[Boolean] = js.native
  /**
    *
    * The worksheet's center vertically flag. This flag determines whether the worksheet will be centered vertically when it's printed.
    *
    * [Api set: ExcelApi 1.9]
    */
  var centerVertically: js.UndefOr[Boolean] = js.native
  /**
    *
    * The worksheet's draft mode option. If true the sheet will be printed without graphics.
    *
    * [Api set: ExcelApi 1.9]
    */
  var draftMode: js.UndefOr[Boolean] = js.native
  /**
    *
    * The worksheet's first page number to print. Null value represents "auto" page numbering.
    *
    * [Api set: ExcelApi 1.9]
    */
  var firstPageNumber: js.UndefOr[Double | _empty] = js.native
  /**
    *
    * The worksheet's footer margin, in points, for use when printing.
    *
    * [Api set: ExcelApi 1.9]
    */
  var footerMargin: js.UndefOr[Double] = js.native
  /**
    *
    * The worksheet's header margin, in points, for use when printing.
    *
    * [Api set: ExcelApi 1.9]
    */
  var headerMargin: js.UndefOr[Double] = js.native
  /**
    *
    * Header and footer configuration for the worksheet.
    *
    * [Api set: ExcelApi 1.9]
    */
  var headersFooters: js.UndefOr[HeaderFooterGroupUpdateData] = js.native
  /**
    *
    * The worksheet's left margin, in points, for use when printing.
    *
    * [Api set: ExcelApi 1.9]
    */
  var leftMargin: js.UndefOr[Double] = js.native
  /**
    *
    * The worksheet's orientation of the page.
    *
    * [Api set: ExcelApi 1.9]
    */
  var orientation: js.UndefOr[PageOrientation | Portrait | Landscape] = js.native
  /**
    *
    * The worksheet's paper size of the page.
    *
    * [Api set: ExcelApi 1.9]
    */
  var paperSize: js.UndefOr[
    PaperType | Letter | LetterSmall | Tabloid | Ledger | Legal | Statement | Executive | A3 | A4 | A4Small | A5 | B4 | B5 | Folio | Quatro | Paper10x14 | Paper11x17 | Note | Envelope9 | Envelope10 | Envelope11 | Envelope12 | Envelope14 | Csheet | Dsheet | Esheet | EnvelopeDL | EnvelopeC5 | EnvelopeC3 | EnvelopeC4 | EnvelopeC6 | EnvelopeC65 | EnvelopeB4 | EnvelopeB5 | EnvelopeB6 | EnvelopeItaly | EnvelopeMonarch | EnvelopePersonal | FanfoldUS | FanfoldStdGerman | FanfoldLegalGerman
  ] = js.native
  /**
    *
    * Specifies if the worksheet's comments should be displayed when printing.
    *
    * [Api set: ExcelApi 1.9]
    */
  var printComments: js.UndefOr[PrintComments | NoComments | EndSheet | InPlace] = js.native
  /**
    *
    * The worksheet's print errors option.
    *
    * [Api set: ExcelApi 1.9]
    */
  var printErrors: js.UndefOr[PrintErrorType | AsDisplayed | Blank | Dash | NotAvailable] = js.native
  /**
    *
    * Specifies if the worksheet's gridlines will be printed.
    *
    * [Api set: ExcelApi 1.9]
    */
  var printGridlines: js.UndefOr[Boolean] = js.native
  /**
    *
    * Specifies if the worksheet's headings will be printed.
    *
    * [Api set: ExcelApi 1.9]
    */
  var printHeadings: js.UndefOr[Boolean] = js.native
  /**
    *
    * The worksheet's page print order option. This specifies the order to use for processing the page number printed.
    *
    * [Api set: ExcelApi 1.9]
    */
  var printOrder: js.UndefOr[PrintOrder | DownThenOver | OverThenDown] = js.native
  /**
    *
    * The worksheet's right margin, in points, for use when printing.
    *
    * [Api set: ExcelApi 1.9]
    */
  var rightMargin: js.UndefOr[Double] = js.native
  /**
    *
    * The worksheet's top margin, in points, for use when printing.
    *
    * [Api set: ExcelApi 1.9]
    */
  var topMargin: js.UndefOr[Double] = js.native
  /**
    *
    * The worksheet's print zoom options.
    The `PageLayoutZoomOptions` object must be set as a JSON object (use `x.zoom = {...}` instead of `x.zoom.scale = ...`).
    *
    * [Api set: ExcelApi 1.9]
    */
  var zoom: js.UndefOr[PageLayoutZoomOptions] = js.native
}

object PageLayoutUpdateData {
  @scala.inline
  def apply(): PageLayoutUpdateData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PageLayoutUpdateData]
  }
  @scala.inline
  implicit class PageLayoutUpdateDataOps[Self <: PageLayoutUpdateData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setBlackAndWhite(value: Boolean): Self = this.set("blackAndWhite", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBlackAndWhite: Self = this.set("blackAndWhite", js.undefined)
    @scala.inline
    def setBottomMargin(value: Double): Self = this.set("bottomMargin", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBottomMargin: Self = this.set("bottomMargin", js.undefined)
    @scala.inline
    def setCenterHorizontally(value: Boolean): Self = this.set("centerHorizontally", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCenterHorizontally: Self = this.set("centerHorizontally", js.undefined)
    @scala.inline
    def setCenterVertically(value: Boolean): Self = this.set("centerVertically", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCenterVertically: Self = this.set("centerVertically", js.undefined)
    @scala.inline
    def setDraftMode(value: Boolean): Self = this.set("draftMode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDraftMode: Self = this.set("draftMode", js.undefined)
    @scala.inline
    def setFirstPageNumber(value: Double | _empty): Self = this.set("firstPageNumber", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFirstPageNumber: Self = this.set("firstPageNumber", js.undefined)
    @scala.inline
    def setFooterMargin(value: Double): Self = this.set("footerMargin", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFooterMargin: Self = this.set("footerMargin", js.undefined)
    @scala.inline
    def setHeaderMargin(value: Double): Self = this.set("headerMargin", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeaderMargin: Self = this.set("headerMargin", js.undefined)
    @scala.inline
    def setHeadersFooters(value: HeaderFooterGroupUpdateData): Self = this.set("headersFooters", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeadersFooters: Self = this.set("headersFooters", js.undefined)
    @scala.inline
    def setLeftMargin(value: Double): Self = this.set("leftMargin", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLeftMargin: Self = this.set("leftMargin", js.undefined)
    @scala.inline
    def setOrientation(value: PageOrientation | Portrait | Landscape): Self = this.set("orientation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOrientation: Self = this.set("orientation", js.undefined)
    @scala.inline
    def setPaperSize(
      value: PaperType | Letter | LetterSmall | Tabloid | Ledger | Legal | Statement | Executive | A3 | A4 | A4Small | A5 | B4 | B5 | Folio | Quatro | Paper10x14 | Paper11x17 | Note | Envelope9 | Envelope10 | Envelope11 | Envelope12 | Envelope14 | Csheet | Dsheet | Esheet | EnvelopeDL | EnvelopeC5 | EnvelopeC3 | EnvelopeC4 | EnvelopeC6 | EnvelopeC65 | EnvelopeB4 | EnvelopeB5 | EnvelopeB6 | EnvelopeItaly | EnvelopeMonarch | EnvelopePersonal | FanfoldUS | FanfoldStdGerman | FanfoldLegalGerman
    ): Self = this.set("paperSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePaperSize: Self = this.set("paperSize", js.undefined)
    @scala.inline
    def setPrintComments(value: PrintComments | NoComments | EndSheet | InPlace): Self = this.set("printComments", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrintComments: Self = this.set("printComments", js.undefined)
    @scala.inline
    def setPrintErrors(value: PrintErrorType | AsDisplayed | Blank | Dash | NotAvailable): Self = this.set("printErrors", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrintErrors: Self = this.set("printErrors", js.undefined)
    @scala.inline
    def setPrintGridlines(value: Boolean): Self = this.set("printGridlines", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrintGridlines: Self = this.set("printGridlines", js.undefined)
    @scala.inline
    def setPrintHeadings(value: Boolean): Self = this.set("printHeadings", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrintHeadings: Self = this.set("printHeadings", js.undefined)
    @scala.inline
    def setPrintOrder(value: PrintOrder | DownThenOver | OverThenDown): Self = this.set("printOrder", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrintOrder: Self = this.set("printOrder", js.undefined)
    @scala.inline
    def setRightMargin(value: Double): Self = this.set("rightMargin", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRightMargin: Self = this.set("rightMargin", js.undefined)
    @scala.inline
    def setTopMargin(value: Double): Self = this.set("topMargin", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTopMargin: Self = this.set("topMargin", js.undefined)
    @scala.inline
    def setZoom(value: PageLayoutZoomOptions): Self = this.set("zoom", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteZoom: Self = this.set("zoom", js.undefined)
  }
  
}

