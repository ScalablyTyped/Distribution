package typings.officeJsPreview.Excel.Interfaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface for updating data on the HeaderFooter object, for use in `headerFooter.set({ ... })`. */
@js.native
trait HeaderFooterUpdateData extends js.Object {
  /**
    *
    * The center footer of the worksheet.
    To apply font formatting or insert a variable value, use format codes specified here: https://msdn.microsoft.com/library/bb225426.aspx.
    *
    * [Api set: ExcelApi 1.9]
    */
  var centerFooter: js.UndefOr[String] = js.native
  /**
    *
    * The center header of the worksheet.
    To apply font formatting or insert a variable value, use format codes specified here: https://msdn.microsoft.com/library/bb225426.aspx.
    *
    * [Api set: ExcelApi 1.9]
    */
  var centerHeader: js.UndefOr[String] = js.native
  /**
    *
    * The left footer of the worksheet.
    To apply font formatting or insert a variable value, use format codes specified here: https://msdn.microsoft.com/library/bb225426.aspx.
    *
    * [Api set: ExcelApi 1.9]
    */
  var leftFooter: js.UndefOr[String] = js.native
  /**
    *
    * The left header of the worksheet.
    To apply font formatting or insert a variable value, use format codes specified here: https://msdn.microsoft.com/library/bb225426.aspx.
    *
    * [Api set: ExcelApi 1.9]
    */
  var leftHeader: js.UndefOr[String] = js.native
  /**
    *
    * The right footer of the worksheet.
    To apply font formatting or insert a variable value, use format codes specified here: https://msdn.microsoft.com/library/bb225426.aspx.
    *
    * [Api set: ExcelApi 1.9]
    */
  var rightFooter: js.UndefOr[String] = js.native
  /**
    *
    * The right header of the worksheet.
    To apply font formatting or insert a variable value, use format codes specified here: https://msdn.microsoft.com/library/bb225426.aspx.
    *
    * [Api set: ExcelApi 1.9]
    */
  var rightHeader: js.UndefOr[String] = js.native
}

object HeaderFooterUpdateData {
  @scala.inline
  def apply(): HeaderFooterUpdateData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HeaderFooterUpdateData]
  }
  @scala.inline
  implicit class HeaderFooterUpdateDataOps[Self <: HeaderFooterUpdateData] (val x: Self) extends AnyVal {
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
    def setCenterFooter(value: String): Self = this.set("centerFooter", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCenterFooter: Self = this.set("centerFooter", js.undefined)
    @scala.inline
    def setCenterHeader(value: String): Self = this.set("centerHeader", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCenterHeader: Self = this.set("centerHeader", js.undefined)
    @scala.inline
    def setLeftFooter(value: String): Self = this.set("leftFooter", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLeftFooter: Self = this.set("leftFooter", js.undefined)
    @scala.inline
    def setLeftHeader(value: String): Self = this.set("leftHeader", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLeftHeader: Self = this.set("leftHeader", js.undefined)
    @scala.inline
    def setRightFooter(value: String): Self = this.set("rightFooter", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRightFooter: Self = this.set("rightFooter", js.undefined)
    @scala.inline
    def setRightHeader(value: String): Self = this.set("rightHeader", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRightHeader: Self = this.set("rightHeader", js.undefined)
  }
  
}

