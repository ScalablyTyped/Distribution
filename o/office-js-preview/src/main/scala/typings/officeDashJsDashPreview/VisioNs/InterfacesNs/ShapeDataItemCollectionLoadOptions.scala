package typings.officeDashJsDashPreview.VisioNs.InterfacesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Represents the ShapeDataItemCollection for a given Shape.
  *
  * [Api set:  1.1]
  */
trait ShapeDataItemCollectionLoadOptions extends js.Object {
  @JSName("$all")
  var $all: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * For EACH ITEM in the collection: A string that specifies the format of the shape data item. Read-only.
    *
    * [Api set:  1.1]
    */
  var format: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * For EACH ITEM in the collection: A string that specifies the formatted value of the shape data item. Read-only.
    *
    * [Api set:  1.1]
    */
  var formattedValue: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * For EACH ITEM in the collection: A string that specifies the label of the shape data item. Read-only.
    *
    * [Api set:  1.1]
    */
  var label: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * For EACH ITEM in the collection: A string that specifies the value of the shape data item. Read-only.
    *
    * [Api set:  1.1]
    */
  var value: js.UndefOr[Boolean] = js.undefined
}

object ShapeDataItemCollectionLoadOptions {
  @scala.inline
  def apply(
    $all: js.UndefOr[Boolean] = js.undefined,
    format: js.UndefOr[Boolean] = js.undefined,
    formattedValue: js.UndefOr[Boolean] = js.undefined,
    label: js.UndefOr[Boolean] = js.undefined,
    value: js.UndefOr[Boolean] = js.undefined
  ): ShapeDataItemCollectionLoadOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined($all)) __obj.updateDynamic("$all")($all)
    if (!js.isUndefined(format)) __obj.updateDynamic("format")(format)
    if (!js.isUndefined(formattedValue)) __obj.updateDynamic("formattedValue")(formattedValue)
    if (!js.isUndefined(label)) __obj.updateDynamic("label")(label)
    if (!js.isUndefined(value)) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[ShapeDataItemCollectionLoadOptions]
  }
}

