package typings.officeDashJsDashPreview.ExcelNs.InterfacesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Represents the format protection of a range object.
  *
  * [Api set: ExcelApi 1.2]
  */
trait FormatProtectionLoadOptions extends js.Object {
  @JSName("$all")
  var $all: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * Indicates if Excel hides the formula for the cells in the range. A null value indicates that the entire range doesn't have uniform formula hidden setting.
    *
    * [Api set: ExcelApi 1.2]
    */
  var formulaHidden: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * Indicates if Excel locks the cells in the object. A null value indicates that the entire range doesn't have uniform lock setting.
    *
    * [Api set: ExcelApi 1.2]
    */
  var locked: js.UndefOr[Boolean] = js.undefined
}

object FormatProtectionLoadOptions {
  @scala.inline
  def apply(
    $all: js.UndefOr[Boolean] = js.undefined,
    formulaHidden: js.UndefOr[Boolean] = js.undefined,
    locked: js.UndefOr[Boolean] = js.undefined
  ): FormatProtectionLoadOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined($all)) __obj.updateDynamic("$all")($all)
    if (!js.isUndefined(formulaHidden)) __obj.updateDynamic("formulaHidden")(formulaHidden)
    if (!js.isUndefined(locked)) __obj.updateDynamic("locked")(locked)
    __obj.asInstanceOf[FormatProtectionLoadOptions]
  }
}

