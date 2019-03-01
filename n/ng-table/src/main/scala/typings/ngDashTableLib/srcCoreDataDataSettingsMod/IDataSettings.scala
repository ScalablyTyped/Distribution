package typings
package ngDashTableLib.srcCoreDataDataSettingsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDataSettings extends js.Object {
  var applyFilter: js.UndefOr[scala.Boolean] = js.undefined
  var applyPaging: js.UndefOr[scala.Boolean] = js.undefined
  var applySort: js.UndefOr[scala.Boolean] = js.undefined
}

object IDataSettings {
  @scala.inline
  def apply(
    applyFilter: js.UndefOr[scala.Boolean] = js.undefined,
    applyPaging: js.UndefOr[scala.Boolean] = js.undefined,
    applySort: js.UndefOr[scala.Boolean] = js.undefined
  ): IDataSettings = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(applyFilter)) __obj.updateDynamic("applyFilter")(applyFilter)
    if (!js.isUndefined(applyPaging)) __obj.updateDynamic("applyPaging")(applyPaging)
    if (!js.isUndefined(applySort)) __obj.updateDynamic("applySort")(applySort)
    __obj.asInstanceOf[IDataSettings]
  }
}

