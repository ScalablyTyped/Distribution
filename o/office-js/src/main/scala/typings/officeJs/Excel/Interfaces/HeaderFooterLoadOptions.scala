package typings.officeJs.Excel.Interfaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * [Api set: ExcelApi 1.9]
  */
@js.native
trait HeaderFooterLoadOptions extends js.Object {
  
  /**
    Specifying `$all` for the LoadOptions loads all the scalar properties (e.g.: `Range.address`) but not the navigational properties (e.g.: `Range.format.fill.color`).
    */
  @JSName("$all")
  var $all: js.UndefOr[Boolean] = js.native
  
  /**
    *
    * The center footer of the worksheet.
    To apply font formatting or insert a variable value, use format codes specified here: https://msdn.microsoft.com/library/bb225426.aspx.
    *
    * [Api set: ExcelApi 1.9]
    */
  var centerFooter: js.UndefOr[Boolean] = js.native
  
  /**
    *
    * The center header of the worksheet.
    To apply font formatting or insert a variable value, use format codes specified here: https://msdn.microsoft.com/library/bb225426.aspx.
    *
    * [Api set: ExcelApi 1.9]
    */
  var centerHeader: js.UndefOr[Boolean] = js.native
  
  /**
    *
    * The left footer of the worksheet.
    To apply font formatting or insert a variable value, use format codes specified here: https://msdn.microsoft.com/library/bb225426.aspx.
    *
    * [Api set: ExcelApi 1.9]
    */
  var leftFooter: js.UndefOr[Boolean] = js.native
  
  /**
    *
    * The left header of the worksheet.
    To apply font formatting or insert a variable value, use format codes specified here: https://msdn.microsoft.com/library/bb225426.aspx.
    *
    * [Api set: ExcelApi 1.9]
    */
  var leftHeader: js.UndefOr[Boolean] = js.native
  
  /**
    *
    * The right footer of the worksheet.
    To apply font formatting or insert a variable value, use format codes specified here: https://msdn.microsoft.com/library/bb225426.aspx.
    *
    * [Api set: ExcelApi 1.9]
    */
  var rightFooter: js.UndefOr[Boolean] = js.native
  
  /**
    *
    * The right header of the worksheet.
    To apply font formatting or insert a variable value, use format codes specified here: https://msdn.microsoft.com/library/bb225426.aspx.
    *
    * [Api set: ExcelApi 1.9]
    */
  var rightHeader: js.UndefOr[Boolean] = js.native
}
object HeaderFooterLoadOptions {
  
  @scala.inline
  def apply(): HeaderFooterLoadOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HeaderFooterLoadOptions]
  }
  
  @scala.inline
  implicit class HeaderFooterLoadOptionsOps[Self <: HeaderFooterLoadOptions] (val x: Self) extends AnyVal {
    
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
    def setCenterFooter(value: Boolean): Self = this.set("centerFooter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCenterFooter: Self = this.set("centerFooter", js.undefined)
    
    @scala.inline
    def setCenterHeader(value: Boolean): Self = this.set("centerHeader", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCenterHeader: Self = this.set("centerHeader", js.undefined)
    
    @scala.inline
    def setLeftFooter(value: Boolean): Self = this.set("leftFooter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLeftFooter: Self = this.set("leftFooter", js.undefined)
    
    @scala.inline
    def setLeftHeader(value: Boolean): Self = this.set("leftHeader", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLeftHeader: Self = this.set("leftHeader", js.undefined)
    
    @scala.inline
    def setRightFooter(value: Boolean): Self = this.set("rightFooter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRightFooter: Self = this.set("rightFooter", js.undefined)
    
    @scala.inline
    def setRightHeader(value: Boolean): Self = this.set("rightHeader", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRightHeader: Self = this.set("rightHeader", js.undefined)
  }
}
