package typings
package powerbiDashVisualsDashToolsLib.powerbiDashVisualsDashToolsMod.powerbiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a value at the matrix intersection, used in the values property on DataViewMatrixNode (inherited from DataViewTreeNode). */
trait DataViewMatrixNodeValue extends DataViewTreeNodeValue {
  var highlight: js.UndefOr[PrimitiveValue] = js.undefined
  /** The data repetition objects. */
  var objects: js.UndefOr[DataViewObjects] = js.undefined
  /** Indicates the index of the corresponding measure (held by DataViewMatrix.valueSources). Its value is 0 if omitted. */
  var valueSourceIndex: js.UndefOr[scala.Double] = js.undefined
}

object DataViewMatrixNodeValue {
  @scala.inline
  def apply(
    highlight: PrimitiveValue = null,
    objects: DataViewObjects = null,
    value: PrimitiveValue = null,
    valueSourceIndex: scala.Int | scala.Double = null
  ): DataViewMatrixNodeValue = {
    val __obj = js.Dynamic.literal()
    if (highlight != null) __obj.updateDynamic("highlight")(highlight.asInstanceOf[js.Any])
    if (objects != null) __obj.updateDynamic("objects")(objects)
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    if (valueSourceIndex != null) __obj.updateDynamic("valueSourceIndex")(valueSourceIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataViewMatrixNodeValue]
  }
}

