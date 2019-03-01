package typings
package officeDashJsLib.VisioNs.InterfacesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface describing the data returned by calling "shapeDataItem.toJSON()". */
trait ShapeDataItemData extends js.Object {
  /**
    *
    * A string that specifies the format of the shape data item. Read-only.
    *
    * [Api set:  1.1]
    */
  var format: js.UndefOr[java.lang.String] = js.undefined
  /**
    *
    * A string that specifies the formatted value of the shape data item. Read-only.
    *
    * [Api set:  1.1]
    */
  var formattedValue: js.UndefOr[java.lang.String] = js.undefined
  /**
    *
    * A string that specifies the label of the shape data item. Read-only.
    *
    * [Api set:  1.1]
    */
  var label: js.UndefOr[java.lang.String] = js.undefined
  /**
    *
    * A string that specifies the value of the shape data item. Read-only.
    *
    * [Api set:  1.1]
    */
  var value: js.UndefOr[java.lang.String] = js.undefined
}

object ShapeDataItemData {
  @scala.inline
  def apply(
    format: java.lang.String = null,
    formattedValue: java.lang.String = null,
    label: java.lang.String = null,
    value: java.lang.String = null
  ): ShapeDataItemData = {
    val __obj = js.Dynamic.literal()
    if (format != null) __obj.updateDynamic("format")(format)
    if (formattedValue != null) __obj.updateDynamic("formattedValue")(formattedValue)
    if (label != null) __obj.updateDynamic("label")(label)
    if (value != null) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[ShapeDataItemData]
  }
}

