package typings.ngTable.ngTableDefaultsMod

import typings.ngTable.ngTableParamsMod.IParamValues
import typings.ngTable.ngTableSettingsMod.ISettings
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
    if (params != null) __obj.updateDynamic("params")(params.asInstanceOf[js.Any])
    if (settings != null) __obj.updateDynamic("settings")(settings.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDefaults]
  }
}

