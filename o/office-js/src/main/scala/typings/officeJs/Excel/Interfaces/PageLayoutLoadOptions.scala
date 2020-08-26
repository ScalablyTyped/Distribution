package typings.officeJs.Excel.Interfaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Represents layout and print settings that are not dependent any printer-specific implementation. These settings include margins, orientation, page numbering, title rows, and print area.
  *
  * [Api set: ExcelApi 1.9]
  */
@js.native
trait PageLayoutLoadOptions extends js.Object {
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
  implicit class PageLayoutLoadOptionsOps[Self <: PageLayoutLoadOptions] (val x: Self) extends AnyVal {
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
    def set$all(value: Boolean): Self = this.set("$all", value.asInstanceOf[js.Any])
    @scala.inline
    def delete$all: Self = this.set("$all", js.undefined)
    @scala.inline
    def setBlackAndWhite(value: Boolean): Self = this.set("blackAndWhite", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBlackAndWhite: Self = this.set("blackAndWhite", js.undefined)
    @scala.inline
    def setBottomMargin(value: Boolean): Self = this.set("bottomMargin", value.asInstanceOf[js.Any])
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
    def setFirstPageNumber(value: Boolean): Self = this.set("firstPageNumber", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFirstPageNumber: Self = this.set("firstPageNumber", js.undefined)
    @scala.inline
    def setFooterMargin(value: Boolean): Self = this.set("footerMargin", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFooterMargin: Self = this.set("footerMargin", js.undefined)
    @scala.inline
    def setHeaderMargin(value: Boolean): Self = this.set("headerMargin", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeaderMargin: Self = this.set("headerMargin", js.undefined)
    @scala.inline
    def setHeadersFooters(value: HeaderFooterGroupLoadOptions): Self = this.set("headersFooters", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeadersFooters: Self = this.set("headersFooters", js.undefined)
    @scala.inline
    def setLeftMargin(value: Boolean): Self = this.set("leftMargin", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLeftMargin: Self = this.set("leftMargin", js.undefined)
    @scala.inline
    def setOrientation(value: Boolean): Self = this.set("orientation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOrientation: Self = this.set("orientation", js.undefined)
    @scala.inline
    def setPaperSize(value: Boolean): Self = this.set("paperSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePaperSize: Self = this.set("paperSize", js.undefined)
    @scala.inline
    def setPrintComments(value: Boolean): Self = this.set("printComments", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrintComments: Self = this.set("printComments", js.undefined)
    @scala.inline
    def setPrintErrors(value: Boolean): Self = this.set("printErrors", value.asInstanceOf[js.Any])
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
    def setPrintOrder(value: Boolean): Self = this.set("printOrder", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrintOrder: Self = this.set("printOrder", js.undefined)
    @scala.inline
    def setRightMargin(value: Boolean): Self = this.set("rightMargin", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRightMargin: Self = this.set("rightMargin", js.undefined)
    @scala.inline
    def setTopMargin(value: Boolean): Self = this.set("topMargin", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTopMargin: Self = this.set("topMargin", js.undefined)
    @scala.inline
    def setZoom(value: Boolean): Self = this.set("zoom", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteZoom: Self = this.set("zoom", js.undefined)
  }
  
}

