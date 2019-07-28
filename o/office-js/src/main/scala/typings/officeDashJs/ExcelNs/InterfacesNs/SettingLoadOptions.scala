package typings.officeDashJs.ExcelNs.InterfacesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Setting represents a key-value pair of a setting persisted to the document (per file per add-in). These custom key-value pair can be used to store state or lifecycle information needed by the content or task-pane add-in. Note that settings are persisted in the document and hence it is not a place to store any sensitive or protected information such as user information and password.
  *
  * [Api set: ExcelApi 1.4]
  */
trait SettingLoadOptions extends js.Object {
  @JSName("$all")
  var $all: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * Returns the key that represents the id of the Setting. Read-only.
    *
    * [Api set: ExcelApi 1.4]
    */
  var key: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * Represents the value stored for this setting.
    *
    * [Api set: ExcelApi 1.4]
    */
  var value: js.UndefOr[Boolean] = js.undefined
}

object SettingLoadOptions {
  @scala.inline
  def apply(
    $all: js.UndefOr[Boolean] = js.undefined,
    key: js.UndefOr[Boolean] = js.undefined,
    value: js.UndefOr[Boolean] = js.undefined
  ): SettingLoadOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined($all)) __obj.updateDynamic("$all")($all)
    if (!js.isUndefined(key)) __obj.updateDynamic("key")(key)
    if (!js.isUndefined(value)) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[SettingLoadOptions]
  }
}

