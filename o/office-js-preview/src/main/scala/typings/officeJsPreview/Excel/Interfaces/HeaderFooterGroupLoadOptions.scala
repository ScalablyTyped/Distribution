package typings.officeJsPreview.Excel.Interfaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * [Api set: ExcelApi 1.9]
  */
@js.native
trait HeaderFooterGroupLoadOptions extends js.Object {
  /**
    Specifying `$all` for the LoadOptions loads all the scalar properties (e.g.: `Range.address`) but not the navigational properties (e.g.: `Range.format.fill.color`).
    */
  @JSName("$all")
  var $all: js.UndefOr[Boolean] = js.native
  /**
    *
    * The general header/footer, used for all pages unless even/odd or first page is specified.
    *
    * [Api set: ExcelApi 1.9]
    */
  var defaultForAllPages: js.UndefOr[HeaderFooterLoadOptions] = js.native
  /**
    *
    * The header/footer to use for even pages, odd header/footer needs to be specified for odd pages.
    *
    * [Api set: ExcelApi 1.9]
    */
  var evenPages: js.UndefOr[HeaderFooterLoadOptions] = js.native
  /**
    *
    * The first page header/footer, for all other pages general or even/odd is used.
    *
    * [Api set: ExcelApi 1.9]
    */
  var firstPage: js.UndefOr[HeaderFooterLoadOptions] = js.native
  /**
    *
    * The header/footer to use for odd pages, even header/footer needs to be specified for even pages.
    *
    * [Api set: ExcelApi 1.9]
    */
  var oddPages: js.UndefOr[HeaderFooterLoadOptions] = js.native
  /**
    *
    * The state by which headers/footers are set. See Excel.HeaderFooterState for details.
    *
    * [Api set: ExcelApi 1.9]
    */
  var state: js.UndefOr[Boolean] = js.native
  /**
    *
    * Gets or sets a flag indicating if headers/footers are aligned with the page margins set in the page layout options for the worksheet.
    *
    * [Api set: ExcelApi 1.9]
    */
  var useSheetMargins: js.UndefOr[Boolean] = js.native
  /**
    *
    * Gets or sets a flag indicating if headers/footers should be scaled by the page percentage scale set in the page layout options for the worksheet.
    *
    * [Api set: ExcelApi 1.9]
    */
  var useSheetScale: js.UndefOr[Boolean] = js.native
}

object HeaderFooterGroupLoadOptions {
  @scala.inline
  def apply(): HeaderFooterGroupLoadOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HeaderFooterGroupLoadOptions]
  }
  @scala.inline
  implicit class HeaderFooterGroupLoadOptionsOps[Self <: HeaderFooterGroupLoadOptions] (val x: Self) extends AnyVal {
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
    def setDefaultForAllPages(value: HeaderFooterLoadOptions): Self = this.set("defaultForAllPages", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefaultForAllPages: Self = this.set("defaultForAllPages", js.undefined)
    @scala.inline
    def setEvenPages(value: HeaderFooterLoadOptions): Self = this.set("evenPages", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEvenPages: Self = this.set("evenPages", js.undefined)
    @scala.inline
    def setFirstPage(value: HeaderFooterLoadOptions): Self = this.set("firstPage", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFirstPage: Self = this.set("firstPage", js.undefined)
    @scala.inline
    def setOddPages(value: HeaderFooterLoadOptions): Self = this.set("oddPages", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOddPages: Self = this.set("oddPages", js.undefined)
    @scala.inline
    def setState(value: Boolean): Self = this.set("state", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteState: Self = this.set("state", js.undefined)
    @scala.inline
    def setUseSheetMargins(value: Boolean): Self = this.set("useSheetMargins", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUseSheetMargins: Self = this.set("useSheetMargins", js.undefined)
    @scala.inline
    def setUseSheetScale(value: Boolean): Self = this.set("useSheetScale", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUseSheetScale: Self = this.set("useSheetScale", js.undefined)
  }
  
}

