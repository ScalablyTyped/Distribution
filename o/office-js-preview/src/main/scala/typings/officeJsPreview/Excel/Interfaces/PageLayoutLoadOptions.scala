package typings.officeJsPreview.Excel.Interfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  *
  * Represents layout and print settings that are not dependent any printer-specific implementation. These settings include margins, orientation, page numbering, title rows, and print area.
  *
  * [Api set: ExcelApi 1.9]
  */
trait PageLayoutLoadOptions extends StObject {
  
  /**
    Specifying `$all` for the LoadOptions loads all the scalar properties (e.g.: `Range.address`) but not the navigational properties (e.g.: `Range.format.fill.color`).
    */
  @JSName("$all")
  var $all: js.UndefOr[Boolean] = js.undefined
  
  /**
    *
    * The worksheet's black and white print option.
    *
    * [Api set: ExcelApi 1.9]
    */
  var blackAndWhite: js.UndefOr[Boolean] = js.undefined
  
  /**
    *
    * The worksheet's bottom page margin to use for printing in points.
    *
    * [Api set: ExcelApi 1.9]
    */
  var bottomMargin: js.UndefOr[Boolean] = js.undefined
  
  /**
    *
    * The worksheet's center horizontally flag. This flag determines whether the worksheet will be centered horizontally when it's printed.
    *
    * [Api set: ExcelApi 1.9]
    */
  var centerHorizontally: js.UndefOr[Boolean] = js.undefined
  
  /**
    *
    * The worksheet's center vertically flag. This flag determines whether the worksheet will be centered vertically when it's printed.
    *
    * [Api set: ExcelApi 1.9]
    */
  var centerVertically: js.UndefOr[Boolean] = js.undefined
  
  /**
    *
    * The worksheet's draft mode option. If true the sheet will be printed without graphics.
    *
    * [Api set: ExcelApi 1.9]
    */
  var draftMode: js.UndefOr[Boolean] = js.undefined
  
  /**
    *
    * The worksheet's first page number to print. Null value represents "auto" page numbering.
    *
    * [Api set: ExcelApi 1.9]
    */
  var firstPageNumber: js.UndefOr[Boolean] = js.undefined
  
  /**
    *
    * The worksheet's footer margin, in points, for use when printing.
    *
    * [Api set: ExcelApi 1.9]
    */
  var footerMargin: js.UndefOr[Boolean] = js.undefined
  
  /**
    *
    * The worksheet's header margin, in points, for use when printing.
    *
    * [Api set: ExcelApi 1.9]
    */
  var headerMargin: js.UndefOr[Boolean] = js.undefined
  
  /**
    *
    * Header and footer configuration for the worksheet.
    *
    * [Api set: ExcelApi 1.9]
    */
  var headersFooters: js.UndefOr[HeaderFooterGroupLoadOptions] = js.undefined
  
  /**
    *
    * The worksheet's left margin, in points, for use when printing.
    *
    * [Api set: ExcelApi 1.9]
    */
  var leftMargin: js.UndefOr[Boolean] = js.undefined
  
  /**
    *
    * The worksheet's orientation of the page.
    *
    * [Api set: ExcelApi 1.9]
    */
  var orientation: js.UndefOr[Boolean] = js.undefined
  
  /**
    *
    * The worksheet's paper size of the page.
    *
    * [Api set: ExcelApi 1.9]
    */
  var paperSize: js.UndefOr[Boolean] = js.undefined
  
  /**
    *
    * Specifies if the worksheet's comments should be displayed when printing.
    *
    * [Api set: ExcelApi 1.9]
    */
  var printComments: js.UndefOr[Boolean] = js.undefined
  
  /**
    *
    * The worksheet's print errors option.
    *
    * [Api set: ExcelApi 1.9]
    */
  var printErrors: js.UndefOr[Boolean] = js.undefined
  
  /**
    *
    * Specifies if the worksheet's gridlines will be printed.
    *
    * [Api set: ExcelApi 1.9]
    */
  var printGridlines: js.UndefOr[Boolean] = js.undefined
  
  /**
    *
    * Specifies if the worksheet's headings will be printed.
    *
    * [Api set: ExcelApi 1.9]
    */
  var printHeadings: js.UndefOr[Boolean] = js.undefined
  
  /**
    *
    * The worksheet's page print order option. This specifies the order to use for processing the page number printed.
    *
    * [Api set: ExcelApi 1.9]
    */
  var printOrder: js.UndefOr[Boolean] = js.undefined
  
  /**
    *
    * The worksheet's right margin, in points, for use when printing.
    *
    * [Api set: ExcelApi 1.9]
    */
  var rightMargin: js.UndefOr[Boolean] = js.undefined
  
  /**
    *
    * The worksheet's top margin, in points, for use when printing.
    *
    * [Api set: ExcelApi 1.9]
    */
  var topMargin: js.UndefOr[Boolean] = js.undefined
  
  /**
    *
    * The worksheet's print zoom options.
    The `PageLayoutZoomOptions` object must be set as a JSON object (use `x.zoom = {...}` instead of `x.zoom.scale = ...`).
    *
    * [Api set: ExcelApi 1.9]
    */
  var zoom: js.UndefOr[Boolean] = js.undefined
}
object PageLayoutLoadOptions {
  
  inline def apply(): PageLayoutLoadOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PageLayoutLoadOptions]
  }
  
  extension [Self <: PageLayoutLoadOptions](x: Self) {
    
    inline def set$all(value: Boolean): Self = StObject.set(x, "$all", value.asInstanceOf[js.Any])
    
    inline def set$allUndefined: Self = StObject.set(x, "$all", js.undefined)
    
    inline def setBlackAndWhite(value: Boolean): Self = StObject.set(x, "blackAndWhite", value.asInstanceOf[js.Any])
    
    inline def setBlackAndWhiteUndefined: Self = StObject.set(x, "blackAndWhite", js.undefined)
    
    inline def setBottomMargin(value: Boolean): Self = StObject.set(x, "bottomMargin", value.asInstanceOf[js.Any])
    
    inline def setBottomMarginUndefined: Self = StObject.set(x, "bottomMargin", js.undefined)
    
    inline def setCenterHorizontally(value: Boolean): Self = StObject.set(x, "centerHorizontally", value.asInstanceOf[js.Any])
    
    inline def setCenterHorizontallyUndefined: Self = StObject.set(x, "centerHorizontally", js.undefined)
    
    inline def setCenterVertically(value: Boolean): Self = StObject.set(x, "centerVertically", value.asInstanceOf[js.Any])
    
    inline def setCenterVerticallyUndefined: Self = StObject.set(x, "centerVertically", js.undefined)
    
    inline def setDraftMode(value: Boolean): Self = StObject.set(x, "draftMode", value.asInstanceOf[js.Any])
    
    inline def setDraftModeUndefined: Self = StObject.set(x, "draftMode", js.undefined)
    
    inline def setFirstPageNumber(value: Boolean): Self = StObject.set(x, "firstPageNumber", value.asInstanceOf[js.Any])
    
    inline def setFirstPageNumberUndefined: Self = StObject.set(x, "firstPageNumber", js.undefined)
    
    inline def setFooterMargin(value: Boolean): Self = StObject.set(x, "footerMargin", value.asInstanceOf[js.Any])
    
    inline def setFooterMarginUndefined: Self = StObject.set(x, "footerMargin", js.undefined)
    
    inline def setHeaderMargin(value: Boolean): Self = StObject.set(x, "headerMargin", value.asInstanceOf[js.Any])
    
    inline def setHeaderMarginUndefined: Self = StObject.set(x, "headerMargin", js.undefined)
    
    inline def setHeadersFooters(value: HeaderFooterGroupLoadOptions): Self = StObject.set(x, "headersFooters", value.asInstanceOf[js.Any])
    
    inline def setHeadersFootersUndefined: Self = StObject.set(x, "headersFooters", js.undefined)
    
    inline def setLeftMargin(value: Boolean): Self = StObject.set(x, "leftMargin", value.asInstanceOf[js.Any])
    
    inline def setLeftMarginUndefined: Self = StObject.set(x, "leftMargin", js.undefined)
    
    inline def setOrientation(value: Boolean): Self = StObject.set(x, "orientation", value.asInstanceOf[js.Any])
    
    inline def setOrientationUndefined: Self = StObject.set(x, "orientation", js.undefined)
    
    inline def setPaperSize(value: Boolean): Self = StObject.set(x, "paperSize", value.asInstanceOf[js.Any])
    
    inline def setPaperSizeUndefined: Self = StObject.set(x, "paperSize", js.undefined)
    
    inline def setPrintComments(value: Boolean): Self = StObject.set(x, "printComments", value.asInstanceOf[js.Any])
    
    inline def setPrintCommentsUndefined: Self = StObject.set(x, "printComments", js.undefined)
    
    inline def setPrintErrors(value: Boolean): Self = StObject.set(x, "printErrors", value.asInstanceOf[js.Any])
    
    inline def setPrintErrorsUndefined: Self = StObject.set(x, "printErrors", js.undefined)
    
    inline def setPrintGridlines(value: Boolean): Self = StObject.set(x, "printGridlines", value.asInstanceOf[js.Any])
    
    inline def setPrintGridlinesUndefined: Self = StObject.set(x, "printGridlines", js.undefined)
    
    inline def setPrintHeadings(value: Boolean): Self = StObject.set(x, "printHeadings", value.asInstanceOf[js.Any])
    
    inline def setPrintHeadingsUndefined: Self = StObject.set(x, "printHeadings", js.undefined)
    
    inline def setPrintOrder(value: Boolean): Self = StObject.set(x, "printOrder", value.asInstanceOf[js.Any])
    
    inline def setPrintOrderUndefined: Self = StObject.set(x, "printOrder", js.undefined)
    
    inline def setRightMargin(value: Boolean): Self = StObject.set(x, "rightMargin", value.asInstanceOf[js.Any])
    
    inline def setRightMarginUndefined: Self = StObject.set(x, "rightMargin", js.undefined)
    
    inline def setTopMargin(value: Boolean): Self = StObject.set(x, "topMargin", value.asInstanceOf[js.Any])
    
    inline def setTopMarginUndefined: Self = StObject.set(x, "topMargin", js.undefined)
    
    inline def setZoom(value: Boolean): Self = StObject.set(x, "zoom", value.asInstanceOf[js.Any])
    
    inline def setZoomUndefined: Self = StObject.set(x, "zoom", js.undefined)
  }
}
