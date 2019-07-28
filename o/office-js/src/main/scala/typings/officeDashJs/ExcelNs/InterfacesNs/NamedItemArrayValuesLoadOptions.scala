package typings.officeDashJs.ExcelNs.InterfacesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Represents an object containing values and types of a named item.
  *
  * [Api set: ExcelApi 1.7]
  */
trait NamedItemArrayValuesLoadOptions extends js.Object {
  @JSName("$all")
  var $all: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * Represents the types for each item in the named item array
    *
    * [Api set: ExcelApi 1.7]
    */
  var types: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * Represents the values of each item in the named item array.
    *
    * [Api set: ExcelApi 1.7]
    */
  var values: js.UndefOr[Boolean] = js.undefined
}

object NamedItemArrayValuesLoadOptions {
  @scala.inline
  def apply(
    $all: js.UndefOr[Boolean] = js.undefined,
    types: js.UndefOr[Boolean] = js.undefined,
    values: js.UndefOr[Boolean] = js.undefined
  ): NamedItemArrayValuesLoadOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined($all)) __obj.updateDynamic("$all")($all)
    if (!js.isUndefined(types)) __obj.updateDynamic("types")(types)
    if (!js.isUndefined(values)) __obj.updateDynamic("values")(values)
    __obj.asInstanceOf[NamedItemArrayValuesLoadOptions]
  }
}

