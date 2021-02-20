package typings.officeJs.Excel.Interfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  *
  * Represents layout and print settings that are not dependent any printer-specific implementation. These settings include margins, orientation, page numbering, title rows, and print area.
  *
  * [Api set: ExcelApi 1.9]
  */
@js.native
trait PageLayoutLoadOptions extends StObject {
  
  /**
    Specifying `$all` for the LoadOptions loads all the scalar properties (e.g.: `Range.address`) but not the navigational properties (e.g.: `Range.format.fill.color`).
    */
  @JSName("$all")
  var $all: js.UndefOr[Boolean] = js.native
  
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
  var bottomMargin: js.UndefOr[Boolean] = js.native
  
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
  var firstPageNumber: js.UndefOr[Boolean] = js.native
  
  /**
    *
    * The worksheet's footer margin, in points, for use when printing.
    *
    * [Api set: ExcelApi 1.9]
    */
  var footerMargin: js.UndefOr[Boolean] = js.native
  
  /**
    *
    * The worksheet's header margin, in points, for use when printing.
    *
    * [Api set: ExcelApi 1.9]
    */
  var headerMargin: js.UndefOr[Boolean] = js.native
  
  /**
    *
    * Header and footer configuration for the worksheet.
    *
    * [Api set: ExcelApi 1.9]
    */
  var headersFooters: js.UndefOr[HeaderFooterGroupLoadOptions] = js.native
  
  /**
    *
    * The worksheet's left margin, in points, for use when printing.
    *
    * [Api set: ExcelApi 1.9]
    */
  var leftMargin: js.UndefOr[Boolean] = js.native
  
  /**
    *
    * The worksheet's orientation of the page.
    *
    * [Api set: ExcelApi 1.9]
    */
  var orientation: js.UndefOr[Boolean] = js.native
  
  /**
    *
    * The worksheet's paper size of the page.
    *
    * [Api set: ExcelApi 1.9]
    */
  var paperSize: js.UndefOr[Boolean] = js.native
  
  /**
    *
    * Specifies if the worksheet's comments should be displayed when printing.
    *
    * [Api set: ExcelApi 1.9]
    */
  var printComments: js.UndefOr[Boolean] = js.native
  
  /**
    *
    * The worksheet's print errors option.
    *
    * [Api set: ExcelApi 1.9]
    */
  var printErrors: js.UndefOr[Boolean] = js.native
  
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
  var printOrder: js.UndefOr[Boolean] = js.native
  
  /**
    *
    * The worksheet's right margin, in points, for use when printing.
    *
    * [Api set: ExcelApi 1.9]
    */
  var rightMargin: js.UndefOr[Boolean] = js.native
  
  /**
    *
    * The worksheet's top margin, in points, for use when printing.
    *
    * [Api set: ExcelApi 1.9]
    */
  var topMargin: js.UndefOr[Boolean] = js.native
  
  /**
    *
    * The worksheet's print zoom options.
    The `PageLayoutZoomOptions` object must be set as a JSON object (use `x.zoom = {...}` instead of `x.zoom.scale = ...`).
    *
    * [Api set: ExcelApi 1.9]
    */
  var zoom: js.UndefOr[Boolean] = js.native
}
object PageLayoutLoadOptions {
  
  @scala.inline
  def apply(): PageLayoutLoadOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PageLayoutLoadOptions]
  }
  
  @scala.inline
  implicit class PageLayoutLoadOptionsMutableBuilder[Self <: PageLayoutLoadOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def set$all(value: Boolean): Self = StObject.set(x, "$all", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set$allUndefined: Self = StObject.set(x, "$all", js.undefined)
    
    @scala.inline
    def setBlackAndWhite(value: Boolean): Self = StObject.set(x, "blackAndWhite", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBlackAndWhiteUndefined: Self = StObject.set(x, "blackAndWhite", js.undefined)
    
    @scala.inline
    def setBottomMargin(value: Boolean): Self = StObject.set(x, "bottomMargin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBottomMarginUndefined: Self = StObject.set(x, "bottomMargin", js.undefined)
    
    @scala.inline
    def setCenterHorizontally(value: Boolean): Self = StObject.set(x, "centerHorizontally", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCenterHorizontallyUndefined: Self = StObject.set(x, "centerHorizontally", js.undefined)
    
    @scala.inline
    def setCenterVertically(value: Boolean): Self = StObject.set(x, "centerVertically", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCenterVerticallyUndefined: Self = StObject.set(x, "centerVertically", js.undefined)
    
    @scala.inline
    def setDraftMode(value: Boolean): Self = StObject.set(x, "draftMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDraftModeUndefined: Self = StObject.set(x, "draftMode", js.undefined)
    
    @scala.inline
    def setFirstPageNumber(value: Boolean): Self = StObject.set(x, "firstPageNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFirstPageNumberUndefined: Self = StObject.set(x, "firstPageNumber", js.undefined)
    
    @scala.inline
    def setFooterMargin(value: Boolean): Self = StObject.set(x, "footerMargin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFooterMarginUndefined: Self = StObject.set(x, "footerMargin", js.undefined)
    
    @scala.inline
    def setHeaderMargin(value: Boolean): Self = StObject.set(x, "headerMargin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeaderMarginUndefined: Self = StObject.set(x, "headerMargin", js.undefined)
    
    @scala.inline
    def setHeadersFooters(value: HeaderFooterGroupLoadOptions): Self = StObject.set(x, "headersFooters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeadersFootersUndefined: Self = StObject.set(x, "headersFooters", js.undefined)
    
    @scala.inline
    def setLeftMargin(value: Boolean): Self = StObject.set(x, "leftMargin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLeftMarginUndefined: Self = StObject.set(x, "leftMargin", js.undefined)
    
    @scala.inline
    def setOrientation(value: Boolean): Self = StObject.set(x, "orientation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrientationUndefined: Self = StObject.set(x, "orientation", js.undefined)
    
    @scala.inline
    def setPaperSize(value: Boolean): Self = StObject.set(x, "paperSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPaperSizeUndefined: Self = StObject.set(x, "paperSize", js.undefined)
    
    @scala.inline
    def setPrintComments(value: Boolean): Self = StObject.set(x, "printComments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrintCommentsUndefined: Self = StObject.set(x, "printComments", js.undefined)
    
    @scala.inline
    def setPrintErrors(value: Boolean): Self = StObject.set(x, "printErrors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrintErrorsUndefined: Self = StObject.set(x, "printErrors", js.undefined)
    
    @scala.inline
    def setPrintGridlines(value: Boolean): Self = StObject.set(x, "printGridlines", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrintGridlinesUndefined: Self = StObject.set(x, "printGridlines", js.undefined)
    
    @scala.inline
    def setPrintHeadings(value: Boolean): Self = StObject.set(x, "printHeadings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrintHeadingsUndefined: Self = StObject.set(x, "printHeadings", js.undefined)
    
    @scala.inline
    def setPrintOrder(value: Boolean): Self = StObject.set(x, "printOrder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrintOrderUndefined: Self = StObject.set(x, "printOrder", js.undefined)
    
    @scala.inline
    def setRightMargin(value: Boolean): Self = StObject.set(x, "rightMargin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRightMarginUndefined: Self = StObject.set(x, "rightMargin", js.undefined)
    
    @scala.inline
    def setTopMargin(value: Boolean): Self = StObject.set(x, "topMargin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTopMarginUndefined: Self = StObject.set(x, "topMargin", js.undefined)
    
    @scala.inline
    def setZoom(value: Boolean): Self = StObject.set(x, "zoom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setZoomUndefined: Self = StObject.set(x, "zoom", js.undefined)
  }
}
