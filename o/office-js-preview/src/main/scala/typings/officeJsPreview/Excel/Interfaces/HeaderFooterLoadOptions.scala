package typings.officeJsPreview.Excel.Interfaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * [Api set: ExcelApi 1.9]
  */
trait HeaderFooterLoadOptions extends js.Object {
  /**
    Specifying `$all` for the LoadOptions loads all the scalar properties (e.g.: `Range.address`) but not the navigational properties (e.g.: `Range.format.fill.color`).
    */
  @JSName("$all")
  var $all: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * Gets or sets the center footer of the worksheet.
    To apply font formatting or insert a variable value, use format codes specified here: https://msdn.microsoft.com/en-us/library/bb225426.aspx.
    *
    * [Api set: ExcelApi 1.9]
    */
  var centerFooter: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * Gets or sets the center header of the worksheet.
    To apply font formatting or insert a variable value, use format codes specified here: https://msdn.microsoft.com/en-us/library/bb225426.aspx.
    *
    * [Api set: ExcelApi 1.9]
    */
  var centerHeader: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * Gets or sets the left footer of the worksheet.
    To apply font formatting or insert a variable value, use format codes specified here: https://msdn.microsoft.com/en-us/library/bb225426.aspx.
    *
    * [Api set: ExcelApi 1.9]
    */
  var leftFooter: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * Gets or sets the left header of the worksheet.
    To apply font formatting or insert a variable value, use format codes specified here: https://msdn.microsoft.com/en-us/library/bb225426.aspx.
    *
    * [Api set: ExcelApi 1.9]
    */
  var leftHeader: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * Gets or sets the right footer of the worksheet.
    To apply font formatting or insert a variable value, use format codes specified here: https://msdn.microsoft.com/en-us/library/bb225426.aspx.
    *
    * [Api set: ExcelApi 1.9]
    */
  var rightFooter: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * Gets or sets the right header of the worksheet.
    To apply font formatting or insert a variable value, use format codes specified here: https://msdn.microsoft.com/en-us/library/bb225426.aspx.
    *
    * [Api set: ExcelApi 1.9]
    */
  var rightHeader: js.UndefOr[Boolean] = js.undefined
}

object HeaderFooterLoadOptions {
  @scala.inline
  def apply(
    $all: js.UndefOr[Boolean] = js.undefined,
    centerFooter: js.UndefOr[Boolean] = js.undefined,
    centerHeader: js.UndefOr[Boolean] = js.undefined,
    leftFooter: js.UndefOr[Boolean] = js.undefined,
    leftHeader: js.UndefOr[Boolean] = js.undefined,
    rightFooter: js.UndefOr[Boolean] = js.undefined,
    rightHeader: js.UndefOr[Boolean] = js.undefined
  ): HeaderFooterLoadOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined($all)) __obj.updateDynamic("$all")($all.asInstanceOf[js.Any])
    if (!js.isUndefined(centerFooter)) __obj.updateDynamic("centerFooter")(centerFooter.asInstanceOf[js.Any])
    if (!js.isUndefined(centerHeader)) __obj.updateDynamic("centerHeader")(centerHeader.asInstanceOf[js.Any])
    if (!js.isUndefined(leftFooter)) __obj.updateDynamic("leftFooter")(leftFooter.asInstanceOf[js.Any])
    if (!js.isUndefined(leftHeader)) __obj.updateDynamic("leftHeader")(leftHeader.asInstanceOf[js.Any])
    if (!js.isUndefined(rightFooter)) __obj.updateDynamic("rightFooter")(rightFooter.asInstanceOf[js.Any])
    if (!js.isUndefined(rightHeader)) __obj.updateDynamic("rightHeader")(rightHeader.asInstanceOf[js.Any])
    __obj.asInstanceOf[HeaderFooterLoadOptions]
  }
}

