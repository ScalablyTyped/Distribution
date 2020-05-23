package typings.officeJs.Visio.Interfaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Represents the ShapeDataItem.
  *
  * [Api set:  1.1]
  */
trait ShapeDataItemLoadOptions extends js.Object {
  @JSName("$all")
  var $all: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * A string that specifies the format of the shape data item. Read-only.
    *
    * [Api set:  1.1]
    */
  var format: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * A string that specifies the formatted value of the shape data item. Read-only.
    *
    * [Api set:  1.1]
    */
  var formattedValue: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * A string that specifies the label of the shape data item. Read-only.
    *
    * [Api set:  1.1]
    */
  var label: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * A string that specifies the value of the shape data item. Read-only.
    *
    * [Api set:  1.1]
    */
  var value: js.UndefOr[Boolean] = js.undefined
}

object ShapeDataItemLoadOptions {
  @scala.inline
  def apply(
    $all: js.UndefOr[Boolean] = js.undefined,
    format: js.UndefOr[Boolean] = js.undefined,
    formattedValue: js.UndefOr[Boolean] = js.undefined,
    label: js.UndefOr[Boolean] = js.undefined,
    value: js.UndefOr[Boolean] = js.undefined
  ): ShapeDataItemLoadOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined($all)) __obj.updateDynamic("$all")($all.get.asInstanceOf[js.Any])
    if (!js.isUndefined(format)) __obj.updateDynamic("format")(format.get.asInstanceOf[js.Any])
    if (!js.isUndefined(formattedValue)) __obj.updateDynamic("formattedValue")(formattedValue.get.asInstanceOf[js.Any])
    if (!js.isUndefined(label)) __obj.updateDynamic("label")(label.get.asInstanceOf[js.Any])
    if (!js.isUndefined(value)) __obj.updateDynamic("value")(value.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ShapeDataItemLoadOptions]
  }
}

