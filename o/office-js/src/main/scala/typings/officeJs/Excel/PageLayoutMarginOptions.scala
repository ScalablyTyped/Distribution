package typings.officeJs.Excel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Represents the options in page layout margins.
  *
  * [Api set: ExcelApi 1.9]
  */
trait PageLayoutMarginOptions extends js.Object {
  /**
    *
    * Specifies the page layout bottom margin in the unit specified to use for printing.
    *
    * [Api set: ExcelApi 1.9]
    */
  var bottom: js.UndefOr[Double] = js.undefined
  /**
    *
    * Specifies the page layout footer margin in the unit specified to use for printing.
    *
    * [Api set: ExcelApi 1.9]
    */
  var footer: js.UndefOr[Double] = js.undefined
  /**
    *
    * Specifies the page layout header margin in the unit specified to use for printing.
    *
    * [Api set: ExcelApi 1.9]
    */
  var header: js.UndefOr[Double] = js.undefined
  /**
    *
    * Specifies the page layout left margin in the unit specified to use for printing.
    *
    * [Api set: ExcelApi 1.9]
    */
  var left: js.UndefOr[Double] = js.undefined
  /**
    *
    * Specifies the page layout right margin in the unit specified to use for printing.
    *
    * [Api set: ExcelApi 1.9]
    */
  var right: js.UndefOr[Double] = js.undefined
  /**
    *
    * Specifies the page layout top margin in the unit specified to use for printing.
    *
    * [Api set: ExcelApi 1.9]
    */
  var top: js.UndefOr[Double] = js.undefined
}

object PageLayoutMarginOptions {
  @scala.inline
  def apply(
    bottom: js.UndefOr[Double] = js.undefined,
    footer: js.UndefOr[Double] = js.undefined,
    header: js.UndefOr[Double] = js.undefined,
    left: js.UndefOr[Double] = js.undefined,
    right: js.UndefOr[Double] = js.undefined,
    top: js.UndefOr[Double] = js.undefined
  ): PageLayoutMarginOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(bottom)) __obj.updateDynamic("bottom")(bottom.get.asInstanceOf[js.Any])
    if (!js.isUndefined(footer)) __obj.updateDynamic("footer")(footer.get.asInstanceOf[js.Any])
    if (!js.isUndefined(header)) __obj.updateDynamic("header")(header.get.asInstanceOf[js.Any])
    if (!js.isUndefined(left)) __obj.updateDynamic("left")(left.get.asInstanceOf[js.Any])
    if (!js.isUndefined(right)) __obj.updateDynamic("right")(right.get.asInstanceOf[js.Any])
    if (!js.isUndefined(top)) __obj.updateDynamic("top")(top.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[PageLayoutMarginOptions]
  }
}

