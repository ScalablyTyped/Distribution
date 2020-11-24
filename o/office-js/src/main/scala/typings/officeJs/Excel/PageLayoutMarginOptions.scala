package typings.officeJs.Excel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  *
  * Represents the options in page layout margins.
  *
  * [Api set: ExcelApi 1.9]
  */
@js.native
trait PageLayoutMarginOptions extends js.Object {
  
  /**
    *
    * Specifies the page layout bottom margin in the unit specified to use for printing.
    *
    * [Api set: ExcelApi 1.9]
    */
  var bottom: js.UndefOr[Double] = js.native
  
  /**
    *
    * Specifies the page layout footer margin in the unit specified to use for printing.
    *
    * [Api set: ExcelApi 1.9]
    */
  var footer: js.UndefOr[Double] = js.native
  
  /**
    *
    * Specifies the page layout header margin in the unit specified to use for printing.
    *
    * [Api set: ExcelApi 1.9]
    */
  var header: js.UndefOr[Double] = js.native
  
  /**
    *
    * Specifies the page layout left margin in the unit specified to use for printing.
    *
    * [Api set: ExcelApi 1.9]
    */
  var left: js.UndefOr[Double] = js.native
  
  /**
    *
    * Specifies the page layout right margin in the unit specified to use for printing.
    *
    * [Api set: ExcelApi 1.9]
    */
  var right: js.UndefOr[Double] = js.native
  
  /**
    *
    * Specifies the page layout top margin in the unit specified to use for printing.
    *
    * [Api set: ExcelApi 1.9]
    */
  var top: js.UndefOr[Double] = js.native
}
object PageLayoutMarginOptions {
  
  @scala.inline
  def apply(): PageLayoutMarginOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PageLayoutMarginOptions]
  }
  
  @scala.inline
  implicit class PageLayoutMarginOptionsOps[Self <: PageLayoutMarginOptions] (val x: Self) extends AnyVal {
    
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
    def setBottom(value: Double): Self = this.set("bottom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBottom: Self = this.set("bottom", js.undefined)
    
    @scala.inline
    def setFooter(value: Double): Self = this.set("footer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFooter: Self = this.set("footer", js.undefined)
    
    @scala.inline
    def setHeader(value: Double): Self = this.set("header", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeader: Self = this.set("header", js.undefined)
    
    @scala.inline
    def setLeft(value: Double): Self = this.set("left", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLeft: Self = this.set("left", js.undefined)
    
    @scala.inline
    def setRight(value: Double): Self = this.set("right", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRight: Self = this.set("right", js.undefined)
    
    @scala.inline
    def setTop(value: Double): Self = this.set("top", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTop: Self = this.set("top", js.undefined)
  }
}
