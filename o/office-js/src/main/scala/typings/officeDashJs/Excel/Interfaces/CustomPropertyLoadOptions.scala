package typings.officeDashJs.Excel.Interfaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Represents a custom property.
  *
  * [Api set: ExcelApi 1.7]
  */
trait CustomPropertyLoadOptions extends js.Object {
  /**
    Specifying `$all` for the LoadOptions loads all the scalar properties (e.g.: `Range.address`) but not the navigational properties (e.g.: `Range.format.fill.color`).
    */
  @JSName("$all")
  var $all: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * Gets the key of the custom property. Read only.
    *
    * [Api set: ExcelApi 1.7]
    */
  var key: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * Gets the value type of the custom property. Read only.
    *
    * [Api set: ExcelApi 1.7]
    */
  var `type`: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * Gets or sets the value of the custom property.
    *
    * [Api set: ExcelApi 1.7]
    */
  var value: js.UndefOr[Boolean] = js.undefined
}

object CustomPropertyLoadOptions {
  @scala.inline
  def apply(
    $all: js.UndefOr[Boolean] = js.undefined,
    key: js.UndefOr[Boolean] = js.undefined,
    `type`: js.UndefOr[Boolean] = js.undefined,
    value: js.UndefOr[Boolean] = js.undefined
  ): CustomPropertyLoadOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined($all)) __obj.updateDynamic("$all")($all)
    if (!js.isUndefined(key)) __obj.updateDynamic("key")(key)
    if (!js.isUndefined(`type`)) __obj.updateDynamic("type")(`type`)
    if (!js.isUndefined(value)) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[CustomPropertyLoadOptions]
  }
}

