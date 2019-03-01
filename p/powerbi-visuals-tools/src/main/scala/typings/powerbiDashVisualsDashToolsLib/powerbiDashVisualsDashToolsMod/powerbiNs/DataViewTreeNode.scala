package typings
package powerbiDashVisualsDashToolsLib.powerbiDashVisualsDashToolsMod.powerbiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DataViewTreeNode extends js.Object {
  /** The set of expressions that define the identity for the child nodes.  This must match items in the DataViewScopeIdentity of those nodes. */
  var childIdentityFields: js.UndefOr[
    js.Array[
      powerbiDashVisualsDashToolsLib.powerbiDashVisualsDashToolsMod.powerbiNs.dataNs.ISQExpr
    ]
  ] = js.undefined
  var children: js.UndefOr[js.Array[DataViewTreeNode]] = js.undefined
  var identity: js.UndefOr[DataViewScopeIdentity] = js.undefined
  var name: js.UndefOr[PrimitiveValue] = js.undefined
  /** The data repetition objects. */
  var objects: js.UndefOr[DataViewObjects] = js.undefined
  /**
    * When used under the context of DataView.tree, this value is one of the elements in the values property.
    *
    * When used under the context of DataView.matrix, this property is the value of the particular
    * group instance represented by this node (e.g. In a grouping on Year, a node can have value == 2016).
    *
    * DEPRECATED for usage under the context of DataView.matrix: This property is deprecated for objects
    * that conform to the DataViewMatrixNode interface (which extends DataViewTreeNode).
    * New visuals code should consume the new property levelValues on DataViewMatrixNode instead.
    * If this node represents a composite group node in matrix, this property will be undefined.
    */
  var value: js.UndefOr[PrimitiveValue] = js.undefined
  /**
    * This property contains all the values in this node.
    * The key of each of the key-value-pair in this dictionary is the position of the column in the
    * select statement to which the value belongs.
    */
  var values: js.UndefOr[org.scalablytyped.runtime.NumberDictionary[DataViewTreeNodeValue]] = js.undefined
}

object DataViewTreeNode {
  @scala.inline
  def apply(
    childIdentityFields: js.Array[
      powerbiDashVisualsDashToolsLib.powerbiDashVisualsDashToolsMod.powerbiNs.dataNs.ISQExpr
    ] = null,
    children: js.Array[DataViewTreeNode] = null,
    identity: DataViewScopeIdentity = null,
    name: PrimitiveValue = null,
    objects: DataViewObjects = null,
    value: PrimitiveValue = null,
    values: org.scalablytyped.runtime.NumberDictionary[DataViewTreeNodeValue] = null
  ): DataViewTreeNode = {
    val __obj = js.Dynamic.literal()
    if (childIdentityFields != null) __obj.updateDynamic("childIdentityFields")(childIdentityFields)
    if (children != null) __obj.updateDynamic("children")(children)
    if (identity != null) __obj.updateDynamic("identity")(identity)
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (objects != null) __obj.updateDynamic("objects")(objects)
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    if (values != null) __obj.updateDynamic("values")(values)
    __obj.asInstanceOf[DataViewTreeNode]
  }
}

