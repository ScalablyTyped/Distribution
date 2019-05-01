package typings
package officeDashJsLib.ExcelNs.InterfacesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * [Api set: ExcelApi 1.9]
  */
trait HeaderFooterLoadOptions extends js.Object {
  @JSName("$all")
  var $all: js.UndefOr[scala.Boolean] = js.undefined
  /**
    *
    * Gets or sets the center footer of the worksheet.
    To apply font formatting or insert a variable value, use format codes specified here: https://msdn.microsoft.com/en-us/library/bb225426.aspx.
    *
    * [Api set: ExcelApi 1.9]
    */
  var centerFooter: js.UndefOr[scala.Boolean] = js.undefined
  /**
    *
    * Gets or sets the center header of the worksheet.
    To apply font formatting or insert a variable value, use format codes specified here: https://msdn.microsoft.com/en-us/library/bb225426.aspx.
    *
    * [Api set: ExcelApi 1.9]
    */
  var centerHeader: js.UndefOr[scala.Boolean] = js.undefined
  /**
    *
    * Gets or sets the left footer of the worksheet.
    To apply font formatting or insert a variable value, use format codes specified here: https://msdn.microsoft.com/en-us/library/bb225426.aspx.
    *
    * [Api set: ExcelApi 1.9]
    */
  var leftFooter: js.UndefOr[scala.Boolean] = js.undefined
  /**
    *
    * Gets or sets the left header of the worksheet.
    To apply font formatting or insert a variable value, use format codes specified here: https://msdn.microsoft.com/en-us/library/bb225426.aspx.
    *
    * [Api set: ExcelApi 1.9]
    */
  var leftHeader: js.UndefOr[scala.Boolean] = js.undefined
  /**
    *
    * Gets or sets the right footer of the worksheet.
    To apply font formatting or insert a variable value, use format codes specified here: https://msdn.microsoft.com/en-us/library/bb225426.aspx.
    *
    * [Api set: ExcelApi 1.9]
    */
  var rightFooter: js.UndefOr[scala.Boolean] = js.undefined
  /**
    *
    * Gets or sets the right header of the worksheet.
    To apply font formatting or insert a variable value, use format codes specified here: https://msdn.microsoft.com/en-us/library/bb225426.aspx.
    *
    * [Api set: ExcelApi 1.9]
    */
  var rightHeader: js.UndefOr[scala.Boolean] = js.undefined
}

object HeaderFooterLoadOptions {
  @scala.inline
  def apply(
    $all: js.UndefOr[scala.Boolean] = js.undefined,
    centerFooter: js.UndefOr[scala.Boolean] = js.undefined,
    centerHeader: js.UndefOr[scala.Boolean] = js.undefined,
    leftFooter: js.UndefOr[scala.Boolean] = js.undefined,
    leftHeader: js.UndefOr[scala.Boolean] = js.undefined,
    rightFooter: js.UndefOr[scala.Boolean] = js.undefined,
    rightHeader: js.UndefOr[scala.Boolean] = js.undefined
  ): HeaderFooterLoadOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined($all)) __obj.updateDynamic("$all")($all)
    if (!js.isUndefined(centerFooter)) __obj.updateDynamic("centerFooter")(centerFooter)
    if (!js.isUndefined(centerHeader)) __obj.updateDynamic("centerHeader")(centerHeader)
    if (!js.isUndefined(leftFooter)) __obj.updateDynamic("leftFooter")(leftFooter)
    if (!js.isUndefined(leftHeader)) __obj.updateDynamic("leftHeader")(leftHeader)
    if (!js.isUndefined(rightFooter)) __obj.updateDynamic("rightFooter")(rightFooter)
    if (!js.isUndefined(rightHeader)) __obj.updateDynamic("rightHeader")(rightHeader)
    __obj.asInstanceOf[HeaderFooterLoadOptions]
  }
}

