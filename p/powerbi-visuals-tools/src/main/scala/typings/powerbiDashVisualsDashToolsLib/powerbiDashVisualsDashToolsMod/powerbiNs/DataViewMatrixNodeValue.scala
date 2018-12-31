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

