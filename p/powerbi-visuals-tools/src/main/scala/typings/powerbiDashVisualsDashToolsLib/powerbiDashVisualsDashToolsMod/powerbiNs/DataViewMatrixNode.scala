package typings
package powerbiDashVisualsDashToolsLib.powerbiDashVisualsDashToolsMod.powerbiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait DataViewMatrixNode extends DataViewTreeNode {
  @JSName("children")
  var children_DataViewMatrixNode: js.UndefOr[js.Array[DataViewMatrixNode]] = js.undefined
  /** Indicates whether or not the node is a subtotal node. Its value is false if omitted. */
  var isSubtotal: js.UndefOr[scala.Boolean] = js.undefined
  /** Indicates the level this node is on. Zero indicates the outermost children (root node level is undefined). */
  var level: js.UndefOr[scala.Double] = js.undefined
  /**
           * Indicates the source metadata index on the node's level. Its value is 0 if omitted.
           *
           * DEPRECATED: This property is deprecated and exists for backward-compatibility only.
           * New visuals code should consume the new property levelSourceIndex on DataViewMatrixGroupValue instead.
           */
  var levelSourceIndex: js.UndefOr[scala.Double] = js.undefined
  /**
           * The values of the particular group instance represented by this node.
           * This array property would contain more than one element in a composite group
           * (e.g. Year == 2016 and Month == 'January').
           */
  var levelValues: js.UndefOr[js.Array[DataViewMatrixGroupValue]] = js.undefined
  /* If this DataViewMatrixNode represents the  inner-most dimension of row groups (i.e. a leaf node), then this property will contain the values at the
          * matrix intersection under the group. The valueSourceIndex property will contain the position of the column in the select statement to which the
          * value belongs.
          *
          * When this DataViewMatrixNode is used under the context of DataView.matrix.columns, this property is not used.
          */
  @JSName("values")
  var values_DataViewMatrixNode: js.UndefOr[org.scalablytyped.runtime.NumberDictionary[DataViewMatrixNodeValue]] = js.undefined
}

