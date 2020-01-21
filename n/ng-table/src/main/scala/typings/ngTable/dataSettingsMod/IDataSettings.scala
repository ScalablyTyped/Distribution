package typings.ngTable.dataSettingsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDataSettings extends js.Object {
  var applyFilter: js.UndefOr[Boolean] = js.undefined
  var applyPaging: js.UndefOr[Boolean] = js.undefined
  var applySort: js.UndefOr[Boolean] = js.undefined
}

object IDataSettings {
  @scala.inline
  def apply(
    applyFilter: js.UndefOr[Boolean] = js.undefined,
    applyPaging: js.UndefOr[Boolean] = js.undefined,
    applySort: js.UndefOr[Boolean] = js.undefined
  ): IDataSettings = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(applyFilter)) __obj.updateDynamic("applyFilter")(applyFilter.asInstanceOf[js.Any])
    if (!js.isUndefined(applyPaging)) __obj.updateDynamic("applyPaging")(applyPaging.asInstanceOf[js.Any])
    if (!js.isUndefined(applySort)) __obj.updateDynamic("applySort")(applySort.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDataSettings]
  }
}

