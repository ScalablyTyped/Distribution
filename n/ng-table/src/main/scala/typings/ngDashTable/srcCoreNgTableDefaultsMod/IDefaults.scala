package typings.ngDashTable.srcCoreNgTableDefaultsMod

import typings.ngDashTable.srcCoreNgTableParamsMod.IParamValues
import typings.ngDashTable.srcCoreNgTableSettingsMod.ISettings
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDefaults extends js.Object {
  var params: js.UndefOr[IParamValues[_]] = js.undefined
  var settings: js.UndefOr[ISettings[_]] = js.undefined
}

object IDefaults {
  @scala.inline
  def apply(params: IParamValues[_] = null, settings: ISettings[_] = null): IDefaults = {
    val __obj = js.Dynamic.literal()
    if (params != null) __obj.updateDynamic("params")(params)
    if (settings != null) __obj.updateDynamic("settings")(settings)
    __obj.asInstanceOf[IDefaults]
  }
}

