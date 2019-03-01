package typings
package ngDashTableLib.srcCoreNgTableDefaultsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDefaults extends js.Object {
  var params: js.UndefOr[ngDashTableLib.srcCoreNgTableParamsMod.IParamValues[_]] = js.undefined
  var settings: js.UndefOr[ngDashTableLib.srcCoreNgTableSettingsMod.ISettings[_]] = js.undefined
}

object IDefaults {
  @scala.inline
  def apply(
    params: ngDashTableLib.srcCoreNgTableParamsMod.IParamValues[_] = null,
    settings: ngDashTableLib.srcCoreNgTableSettingsMod.ISettings[_] = null
  ): IDefaults = {
    val __obj = js.Dynamic.literal()
    if (params != null) __obj.updateDynamic("params")(params)
    if (settings != null) __obj.updateDynamic("settings")(settings)
    __obj.asInstanceOf[IDefaults]
  }
}

