package typings
package officeDashJsDashPreviewLib.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Represents the options in page layout margins.
  *
  * [Api set: ExcelApi BETA (PREVIEW ONLY)]
  * @beta
  */
trait PageLayoutMarginOptions extends js.Object {
  /**
    *
    * Represents the page layout bottom margin in the unit specified to use for printing.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var bottom: js.UndefOr[scala.Double] = js.undefined
  /**
    *
    * Represents the page layout footer margin in the unit specified to use for printing.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var footer: js.UndefOr[scala.Double] = js.undefined
  /**
    *
    * Represents the page layout header margin in the unit specified to use for printing.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var header: js.UndefOr[scala.Double] = js.undefined
  /**
    *
    * Represents the page layout left margin in the unit specified to use for printing.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var left: js.UndefOr[scala.Double] = js.undefined
  /**
    *
    * Represents the page layout right margin in the unit specified to use for printing.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var right: js.UndefOr[scala.Double] = js.undefined
  /**
    *
    * Represents the page layout top margin in the unit specified to use for printing.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var top: js.UndefOr[scala.Double] = js.undefined
}

object PageLayoutMarginOptions {
  @scala.inline
  def apply(
    bottom: scala.Int | scala.Double = null,
    footer: scala.Int | scala.Double = null,
    header: scala.Int | scala.Double = null,
    left: scala.Int | scala.Double = null,
    right: scala.Int | scala.Double = null,
    top: scala.Int | scala.Double = null
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

