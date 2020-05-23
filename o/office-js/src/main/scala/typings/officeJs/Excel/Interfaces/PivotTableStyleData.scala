package typings.officeJs.Excel.Interfaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface describing the data returned by calling `pivotTableStyle.toJSON()`. */
trait PivotTableStyleData extends js.Object {
  /**
    *
    * Gets the name of the PivotTableStyle.
    *
    * [Api set: ExcelApi 1.10]
    */
  var name: js.UndefOr[String] = js.undefined
  /**
    *
    * Specifies if this PivotTableStyle object is read-only.
    *
    * [Api set: ExcelApi 1.10]
    */
  var readOnly: js.UndefOr[Boolean] = js.undefined
}

object PivotTableStyleData {
  @scala.inline
  def apply(name: String = null, readOnly: js.UndefOr[Boolean] = js.undefined): PivotTableStyleData = {
    val __obj = js.Dynamic.literal()
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (!js.isUndefined(readOnly)) __obj.updateDynamic("readOnly")(readOnly.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[PivotTableStyleData]
  }
}

