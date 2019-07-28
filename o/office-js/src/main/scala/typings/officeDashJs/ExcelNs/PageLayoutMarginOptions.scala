package typings.officeDashJs.ExcelNs

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
    * Represents the page layout bottom margin in the unit specified to use for printing.
    *
    * [Api set: ExcelApi 1.9]
    */
  var bottom: js.UndefOr[Double] = js.undefined
  /**
    *
    * Represents the page layout footer margin in the unit specified to use for printing.
    *
    * [Api set: ExcelApi 1.9]
    */
  var footer: js.UndefOr[Double] = js.undefined
  /**
    *
    * Represents the page layout header margin in the unit specified to use for printing.
    *
    * [Api set: ExcelApi 1.9]
    */
  var header: js.UndefOr[Double] = js.undefined
  /**
    *
    * Represents the page layout left margin in the unit specified to use for printing.
    *
    * [Api set: ExcelApi 1.9]
    */
  var left: js.UndefOr[Double] = js.undefined
  /**
    *
    * Represents the page layout right margin in the unit specified to use for printing.
    *
    * [Api set: ExcelApi 1.9]
    */
  var right: js.UndefOr[Double] = js.undefined
  /**
    *
    * Represents the page layout top margin in the unit specified to use for printing.
    *
    * [Api set: ExcelApi 1.9]
    */
  var top: js.UndefOr[Double] = js.undefined
}

object PageLayoutMarginOptions {
  @scala.inline
  def apply(
    bottom: Int | Double = null,
    footer: Int | Double = null,
    header: Int | Double = null,
    left: Int | Double = null,
    right: Int | Double = null,
    top: Int | Double = null
  ): PageLayoutMarginOptions = {
    val __obj = js.Dynamic.literal()
    if (bottom != null) __obj.updateDynamic("bottom")(bottom.asInstanceOf[js.Any])
    if (footer != null) __obj.updateDynamic("footer")(footer.asInstanceOf[js.Any])
    if (header != null) __obj.updateDynamic("header")(header.asInstanceOf[js.Any])
    if (left != null) __obj.updateDynamic("left")(left.asInstanceOf[js.Any])
    if (right != null) __obj.updateDynamic("right")(right.asInstanceOf[js.Any])
    if (top != null) __obj.updateDynamic("top")(top.asInstanceOf[js.Any])
    __obj.asInstanceOf[PageLayoutMarginOptions]
  }
}

