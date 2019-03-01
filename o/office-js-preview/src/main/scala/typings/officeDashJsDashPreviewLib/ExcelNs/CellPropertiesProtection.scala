package typings
package officeDashJsDashPreviewLib.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Represents the returned format.protection properties of getCell/Row/ColumnProperties or format.protection input parameter of setCell/Row/ColumnProperties.
  *
  * [Api set: ExcelApi BETA (PREVIEW ONLY)]
  * @beta
  */
trait CellPropertiesProtection extends js.Object {
  var formulaHidden: js.UndefOr[scala.Boolean] = js.undefined
  var locked: js.UndefOr[scala.Boolean] = js.undefined
}

object CellPropertiesProtection {
  @scala.inline
  def apply(
    formulaHidden: js.UndefOr[scala.Boolean] = js.undefined,
    locked: js.UndefOr[scala.Boolean] = js.undefined
  ): CellPropertiesProtection = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(formulaHidden)) __obj.updateDynamic("formulaHidden")(formulaHidden)
    if (!js.isUndefined(locked)) __obj.updateDynamic("locked")(locked)
    __obj.asInstanceOf[CellPropertiesProtection]
  }
}

