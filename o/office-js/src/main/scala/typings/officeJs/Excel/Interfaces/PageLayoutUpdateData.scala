package typings.officeJs.Excel.Interfaces

import typings.officeJs.Excel.PageLayoutZoomOptions
import typings.officeJs.Excel.PageOrientation
import typings.officeJs.Excel.PaperType
import typings.officeJs.Excel.PrintComments
import typings.officeJs.Excel.PrintErrorType
import typings.officeJs.Excel.PrintOrder
import typings.officeJs.officeJsStrings.A3
import typings.officeJs.officeJsStrings.A4
import typings.officeJs.officeJsStrings.A4Small
import typings.officeJs.officeJsStrings.A5
import typings.officeJs.officeJsStrings.AsDisplayed
import typings.officeJs.officeJsStrings.B4
import typings.officeJs.officeJsStrings.B5
import typings.officeJs.officeJsStrings.Blank
import typings.officeJs.officeJsStrings.Csheet
import typings.officeJs.officeJsStrings.Dash
import typings.officeJs.officeJsStrings.DownThenOver
import typings.officeJs.officeJsStrings.Dsheet
import typings.officeJs.officeJsStrings.EndSheet
import typings.officeJs.officeJsStrings.Envelope10
import typings.officeJs.officeJsStrings.Envelope11
import typings.officeJs.officeJsStrings.Envelope12
import typings.officeJs.officeJsStrings.Envelope14
import typings.officeJs.officeJsStrings.Envelope9
import typings.officeJs.officeJsStrings.EnvelopeB4
import typings.officeJs.officeJsStrings.EnvelopeB5
import typings.officeJs.officeJsStrings.EnvelopeB6
import typings.officeJs.officeJsStrings.EnvelopeC3
import typings.officeJs.officeJsStrings.EnvelopeC4
import typings.officeJs.officeJsStrings.EnvelopeC5
import typings.officeJs.officeJsStrings.EnvelopeC6
import typings.officeJs.officeJsStrings.EnvelopeC65
import typings.officeJs.officeJsStrings.EnvelopeDL
import typings.officeJs.officeJsStrings.EnvelopeItaly
import typings.officeJs.officeJsStrings.EnvelopeMonarch
import typings.officeJs.officeJsStrings.EnvelopePersonal
import typings.officeJs.officeJsStrings.Esheet
import typings.officeJs.officeJsStrings.Executive
import typings.officeJs.officeJsStrings.FanfoldLegalGerman
import typings.officeJs.officeJsStrings.FanfoldStdGerman
import typings.officeJs.officeJsStrings.FanfoldUS
import typings.officeJs.officeJsStrings.Folio
import typings.officeJs.officeJsStrings.InPlace
import typings.officeJs.officeJsStrings.Landscape
import typings.officeJs.officeJsStrings.Ledger
import typings.officeJs.officeJsStrings.Legal
import typings.officeJs.officeJsStrings.Letter
import typings.officeJs.officeJsStrings.LetterSmall
import typings.officeJs.officeJsStrings.NoComments
import typings.officeJs.officeJsStrings.NotAvailable
import typings.officeJs.officeJsStrings.Note
import typings.officeJs.officeJsStrings.OverThenDown
import typings.officeJs.officeJsStrings.Paper10x14
import typings.officeJs.officeJsStrings.Paper11x17
import typings.officeJs.officeJsStrings.Portrait
import typings.officeJs.officeJsStrings.Quatro
import typings.officeJs.officeJsStrings.Statement
import typings.officeJs.officeJsStrings.Tabloid
import typings.officeJs.officeJsStrings._empty
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface for updating data on the PageLayout object, for use in `pageLayout.set({ ... })`. */
trait PageLayoutUpdateData extends StObject {
  
  /**
    * The worksheet's black and white print option.
    *
    * @remarks
    * [Api set: ExcelApi 1.9]
    */
  var blackAndWhite: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The worksheet's bottom page margin to use for printing in points.
    *
    * @remarks
    * [Api set: ExcelApi 1.9]
    */
  var bottomMargin: js.UndefOr[Double] = js.undefined
  
  /**
    * The worksheet's center horizontally flag. This flag determines whether the worksheet will be centered horizontally when it's printed.
    *
    * @remarks
    * [Api set: ExcelApi 1.9]
    */
  var centerHorizontally: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The worksheet's center vertically flag. This flag determines whether the worksheet will be centered vertically when it's printed.
    *
    * @remarks
    * [Api set: ExcelApi 1.9]
    */
  var centerVertically: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The worksheet's draft mode option. If `true`, the sheet will be printed without graphics.
    *
    * @remarks
    * [Api set: ExcelApi 1.9]
    */
  var draftMode: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The worksheet's first page number to print. A `null` value represents "auto" page numbering.
    *
    * @remarks
    * [Api set: ExcelApi 1.9]
    */
  var firstPageNumber: js.UndefOr[Double | _empty] = js.undefined
  
  /**
    * The worksheet's footer margin, in points, for use when printing.
    *
    * @remarks
    * [Api set: ExcelApi 1.9]
    */
  var footerMargin: js.UndefOr[Double] = js.undefined
  
  /**
    * The worksheet's header margin, in points, for use when printing.
    *
    * @remarks
    * [Api set: ExcelApi 1.9]
    */
  var headerMargin: js.UndefOr[Double] = js.undefined
  
  /**
    * Header and footer configuration for the worksheet.
    *
    * @remarks
    * [Api set: ExcelApi 1.9]
    */
  var headersFooters: js.UndefOr[HeaderFooterGroupUpdateData] = js.undefined
  
  /**
    * The worksheet's left margin, in points, for use when printing.
    *
    * @remarks
    * [Api set: ExcelApi 1.9]
    */
  var leftMargin: js.UndefOr[Double] = js.undefined
  
  /**
    * The worksheet's orientation of the page.
    *
    * @remarks
    * [Api set: ExcelApi 1.9]
    */
  var orientation: js.UndefOr[PageOrientation | Portrait | Landscape] = js.undefined
  
  /**
    * The worksheet's paper size of the page.
    *
    * @remarks
    * [Api set: ExcelApi 1.9]
    */
  var paperSize: js.UndefOr[
    PaperType | Letter | LetterSmall | Tabloid | Ledger | Legal | Statement | Executive | A3 | A4 | A4Small | A5 | B4 | B5 | Folio | Quatro | Paper10x14 | Paper11x17 | Note | Envelope9 | Envelope10 | Envelope11 | Envelope12 | Envelope14 | Csheet | Dsheet | Esheet | EnvelopeDL | EnvelopeC5 | EnvelopeC3 | EnvelopeC4 | EnvelopeC6 | EnvelopeC65 | EnvelopeB4 | EnvelopeB5 | EnvelopeB6 | EnvelopeItaly | EnvelopeMonarch | EnvelopePersonal | FanfoldUS | FanfoldStdGerman | FanfoldLegalGerman
  ] = js.undefined
  
  /**
    * Specifies if the worksheet's comments should be displayed when printing.
    *
    * @remarks
    * [Api set: ExcelApi 1.9]
    */
  var printComments: js.UndefOr[PrintComments | NoComments | EndSheet | InPlace] = js.undefined
  
  /**
    * The worksheet's print errors option.
    *
    * @remarks
    * [Api set: ExcelApi 1.9]
    */
  var printErrors: js.UndefOr[PrintErrorType | AsDisplayed | Blank | Dash | NotAvailable] = js.undefined
  
  /**
    * Specifies if the worksheet's gridlines will be printed.
    *
    * @remarks
    * [Api set: ExcelApi 1.9]
    */
  var printGridlines: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies if the worksheet's headings will be printed.
    *
    * @remarks
    * [Api set: ExcelApi 1.9]
    */
  var printHeadings: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The worksheet's page print order option. This specifies the order to use for processing the page number printed.
    *
    * @remarks
    * [Api set: ExcelApi 1.9]
    */
  var printOrder: js.UndefOr[PrintOrder | DownThenOver | OverThenDown] = js.undefined
  
  /**
    * The worksheet's right margin, in points, for use when printing.
    *
    * @remarks
    * [Api set: ExcelApi 1.9]
    */
  var rightMargin: js.UndefOr[Double] = js.undefined
  
  /**
    * The worksheet's top margin, in points, for use when printing.
    *
    * @remarks
    * [Api set: ExcelApi 1.9]
    */
  var topMargin: js.UndefOr[Double] = js.undefined
  
  /**
    * The worksheet's print zoom options.
    The `PageLayoutZoomOptions` object must be set as a JSON object (use `x.zoom = {...}` instead of `x.zoom.scale = ...`).
    *
    * @remarks
    * [Api set: ExcelApi 1.9]
    */
  var zoom: js.UndefOr[PageLayoutZoomOptions] = js.undefined
}
object PageLayoutUpdateData {
  
  inline def apply(): PageLayoutUpdateData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PageLayoutUpdateData]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PageLayoutUpdateData] (val x: Self) extends AnyVal {
    
    inline def setBlackAndWhite(value: Boolean): Self = StObject.set(x, "blackAndWhite", value.asInstanceOf[js.Any])
    
    inline def setBlackAndWhiteUndefined: Self = StObject.set(x, "blackAndWhite", js.undefined)
    
    inline def setBottomMargin(value: Double): Self = StObject.set(x, "bottomMargin", value.asInstanceOf[js.Any])
    
    inline def setBottomMarginUndefined: Self = StObject.set(x, "bottomMargin", js.undefined)
    
    inline def setCenterHorizontally(value: Boolean): Self = StObject.set(x, "centerHorizontally", value.asInstanceOf[js.Any])
    
    inline def setCenterHorizontallyUndefined: Self = StObject.set(x, "centerHorizontally", js.undefined)
    
    inline def setCenterVertically(value: Boolean): Self = StObject.set(x, "centerVertically", value.asInstanceOf[js.Any])
    
    inline def setCenterVerticallyUndefined: Self = StObject.set(x, "centerVertically", js.undefined)
    
    inline def setDraftMode(value: Boolean): Self = StObject.set(x, "draftMode", value.asInstanceOf[js.Any])
    
    inline def setDraftModeUndefined: Self = StObject.set(x, "draftMode", js.undefined)
    
    inline def setFirstPageNumber(value: Double | _empty): Self = StObject.set(x, "firstPageNumber", value.asInstanceOf[js.Any])
    
    inline def setFirstPageNumberUndefined: Self = StObject.set(x, "firstPageNumber", js.undefined)
    
    inline def setFooterMargin(value: Double): Self = StObject.set(x, "footerMargin", value.asInstanceOf[js.Any])
    
    inline def setFooterMarginUndefined: Self = StObject.set(x, "footerMargin", js.undefined)
    
    inline def setHeaderMargin(value: Double): Self = StObject.set(x, "headerMargin", value.asInstanceOf[js.Any])
    
    inline def setHeaderMarginUndefined: Self = StObject.set(x, "headerMargin", js.undefined)
    
    inline def setHeadersFooters(value: HeaderFooterGroupUpdateData): Self = StObject.set(x, "headersFooters", value.asInstanceOf[js.Any])
    
    inline def setHeadersFootersUndefined: Self = StObject.set(x, "headersFooters", js.undefined)
    
    inline def setLeftMargin(value: Double): Self = StObject.set(x, "leftMargin", value.asInstanceOf[js.Any])
    
    inline def setLeftMarginUndefined: Self = StObject.set(x, "leftMargin", js.undefined)
    
    inline def setOrientation(value: PageOrientation | Portrait | Landscape): Self = StObject.set(x, "orientation", value.asInstanceOf[js.Any])
    
    inline def setOrientationUndefined: Self = StObject.set(x, "orientation", js.undefined)
    
    inline def setPaperSize(
      value: PaperType | Letter | LetterSmall | Tabloid | Ledger | Legal | Statement | Executive | A3 | A4 | A4Small | A5 | B4 | B5 | Folio | Quatro | Paper10x14 | Paper11x17 | Note | Envelope9 | Envelope10 | Envelope11 | Envelope12 | Envelope14 | Csheet | Dsheet | Esheet | EnvelopeDL | EnvelopeC5 | EnvelopeC3 | EnvelopeC4 | EnvelopeC6 | EnvelopeC65 | EnvelopeB4 | EnvelopeB5 | EnvelopeB6 | EnvelopeItaly | EnvelopeMonarch | EnvelopePersonal | FanfoldUS | FanfoldStdGerman | FanfoldLegalGerman
    ): Self = StObject.set(x, "paperSize", value.asInstanceOf[js.Any])
    
    inline def setPaperSizeUndefined: Self = StObject.set(x, "paperSize", js.undefined)
    
    inline def setPrintComments(value: PrintComments | NoComments | EndSheet | InPlace): Self = StObject.set(x, "printComments", value.asInstanceOf[js.Any])
    
    inline def setPrintCommentsUndefined: Self = StObject.set(x, "printComments", js.undefined)
    
    inline def setPrintErrors(value: PrintErrorType | AsDisplayed | Blank | Dash | NotAvailable): Self = StObject.set(x, "printErrors", value.asInstanceOf[js.Any])
    
    inline def setPrintErrorsUndefined: Self = StObject.set(x, "printErrors", js.undefined)
    
    inline def setPrintGridlines(value: Boolean): Self = StObject.set(x, "printGridlines", value.asInstanceOf[js.Any])
    
    inline def setPrintGridlinesUndefined: Self = StObject.set(x, "printGridlines", js.undefined)
    
    inline def setPrintHeadings(value: Boolean): Self = StObject.set(x, "printHeadings", value.asInstanceOf[js.Any])
    
    inline def setPrintHeadingsUndefined: Self = StObject.set(x, "printHeadings", js.undefined)
    
    inline def setPrintOrder(value: PrintOrder | DownThenOver | OverThenDown): Self = StObject.set(x, "printOrder", value.asInstanceOf[js.Any])
    
    inline def setPrintOrderUndefined: Self = StObject.set(x, "printOrder", js.undefined)
    
    inline def setRightMargin(value: Double): Self = StObject.set(x, "rightMargin", value.asInstanceOf[js.Any])
    
    inline def setRightMarginUndefined: Self = StObject.set(x, "rightMargin", js.undefined)
    
    inline def setTopMargin(value: Double): Self = StObject.set(x, "topMargin", value.asInstanceOf[js.Any])
    
    inline def setTopMarginUndefined: Self = StObject.set(x, "topMargin", js.undefined)
    
    inline def setZoom(value: PageLayoutZoomOptions): Self = StObject.set(x, "zoom", value.asInstanceOf[js.Any])
    
    inline def setZoomUndefined: Self = StObject.set(x, "zoom", js.undefined)
  }
}
