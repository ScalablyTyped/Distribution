package typings.officeJsPreview.Excel.Interfaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface for updating data on the HeaderFooter object, for use in `headerFooter.set({ ... })`. */
trait HeaderFooterUpdateData extends js.Object {
  /**
    *
    * The center footer of the worksheet.
    To apply font formatting or insert a variable value, use format codes specified here: https://msdn.microsoft.com/library/bb225426.aspx.
    *
    * [Api set: ExcelApi 1.9]
    */
  var centerFooter: js.UndefOr[String] = js.undefined
  /**
    *
    * The center header of the worksheet.
    To apply font formatting or insert a variable value, use format codes specified here: https://msdn.microsoft.com/library/bb225426.aspx.
    *
    * [Api set: ExcelApi 1.9]
    */
  var centerHeader: js.UndefOr[String] = js.undefined
  /**
    *
    * The left footer of the worksheet.
    To apply font formatting or insert a variable value, use format codes specified here: https://msdn.microsoft.com/library/bb225426.aspx.
    *
    * [Api set: ExcelApi 1.9]
    */
  var leftFooter: js.UndefOr[String] = js.undefined
  /**
    *
    * The left header of the worksheet.
    To apply font formatting or insert a variable value, use format codes specified here: https://msdn.microsoft.com/library/bb225426.aspx.
    *
    * [Api set: ExcelApi 1.9]
    */
  var leftHeader: js.UndefOr[String] = js.undefined
  /**
    *
    * The right footer of the worksheet.
    To apply font formatting or insert a variable value, use format codes specified here: https://msdn.microsoft.com/library/bb225426.aspx.
    *
    * [Api set: ExcelApi 1.9]
    */
  var rightFooter: js.UndefOr[String] = js.undefined
  /**
    *
    * The right header of the worksheet.
    To apply font formatting or insert a variable value, use format codes specified here: https://msdn.microsoft.com/library/bb225426.aspx.
    *
    * [Api set: ExcelApi 1.9]
    */
  var rightHeader: js.UndefOr[String] = js.undefined
}

object HeaderFooterUpdateData {
  @scala.inline
  def apply(
    centerFooter: String = null,
    centerHeader: String = null,
    leftFooter: String = null,
    leftHeader: String = null,
    rightFooter: String = null,
    rightHeader: String = null
  ): HeaderFooterUpdateData = {
    val __obj = js.Dynamic.literal()
    if (centerFooter != null) __obj.updateDynamic("centerFooter")(centerFooter.asInstanceOf[js.Any])
    if (centerHeader != null) __obj.updateDynamic("centerHeader")(centerHeader.asInstanceOf[js.Any])
    if (leftFooter != null) __obj.updateDynamic("leftFooter")(leftFooter.asInstanceOf[js.Any])
    if (leftHeader != null) __obj.updateDynamic("leftHeader")(leftHeader.asInstanceOf[js.Any])
    if (rightFooter != null) __obj.updateDynamic("rightFooter")(rightFooter.asInstanceOf[js.Any])
    if (rightHeader != null) __obj.updateDynamic("rightHeader")(rightHeader.asInstanceOf[js.Any])
    __obj.asInstanceOf[HeaderFooterUpdateData]
  }
}

