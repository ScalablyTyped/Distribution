package typings.officeDashJsDashPreview.ExcelNs.InterfacesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Represents an IconSet criteria for conditional formatting.
  *
  * [Api set: ExcelApi 1.6]
  */
trait IconSetConditionalFormatLoadOptions extends js.Object {
  @JSName("$all")
  var $all: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * An array of Criteria and IconSets for the rules and potential custom icons for conditional icons. Note that for the first criterion only the custom icon can be modified, while type, formula, and operator will be ignored when set.
    *
    * [Api set: ExcelApi 1.6]
    */
  var criteria: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * If true, reverses the icon orders for the IconSet. Note that this cannot be set if custom icons are used.
    *
    * [Api set: ExcelApi 1.6]
    */
  var reverseIconOrder: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * If true, hides the values and only shows icons.
    *
    * [Api set: ExcelApi 1.6]
    */
  var showIconOnly: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * If set, displays the IconSet option for the conditional format.
    *
    * [Api set: ExcelApi 1.6]
    */
  var style: js.UndefOr[Boolean] = js.undefined
}

object IconSetConditionalFormatLoadOptions {
  @scala.inline
  def apply(
    $all: js.UndefOr[Boolean] = js.undefined,
    criteria: js.UndefOr[Boolean] = js.undefined,
    reverseIconOrder: js.UndefOr[Boolean] = js.undefined,
    showIconOnly: js.UndefOr[Boolean] = js.undefined,
    style: js.UndefOr[Boolean] = js.undefined
  ): IconSetConditionalFormatLoadOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined($all)) __obj.updateDynamic("$all")($all)
    if (!js.isUndefined(criteria)) __obj.updateDynamic("criteria")(criteria)
    if (!js.isUndefined(reverseIconOrder)) __obj.updateDynamic("reverseIconOrder")(reverseIconOrder)
    if (!js.isUndefined(showIconOnly)) __obj.updateDynamic("showIconOnly")(showIconOnly)
    if (!js.isUndefined(style)) __obj.updateDynamic("style")(style)
    __obj.asInstanceOf[IconSetConditionalFormatLoadOptions]
  }
}

