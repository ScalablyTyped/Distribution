package typings
package ngDashGridLib.ngGridNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IAggregate extends js.Object {
  var aggChildren: js.Array[_]
  var aggIndex: scala.Double
  var aggLabelFilter: js.Any
  var children: js.Array[_]
  var collapsed: scala.Boolean
  var depth: scala.Double
  var entity: js.Any
  var field: java.lang.String
  var groupInitState: scala.Boolean
  var isAggRow: scala.Boolean
  var label: java.lang.String
  var offsetLeft: scala.Double
  var offsetTop: scala.Double
  var parent: js.Any
  var rowFactory: IRowFactory
  var rowHeight: scala.Double
  var rowIndex: scala.Double
}

object IAggregate {
  @scala.inline
  def apply(
    aggChildren: js.Array[_],
    aggIndex: scala.Double,
    aggLabelFilter: js.Any,
    children: js.Array[_],
    collapsed: scala.Boolean,
    depth: scala.Double,
    entity: js.Any,
    field: java.lang.String,
    groupInitState: scala.Boolean,
    isAggRow: scala.Boolean,
    label: java.lang.String,
    offsetLeft: scala.Double,
    offsetTop: scala.Double,
    parent: js.Any,
    rowFactory: IRowFactory,
    rowHeight: scala.Double,
    rowIndex: scala.Double
  ): IAggregate = {
    val __obj = js.Dynamic.literal(aggChildren = aggChildren, aggIndex = aggIndex, aggLabelFilter = aggLabelFilter, children = children, collapsed = collapsed, depth = depth, entity = entity, field = field, groupInitState = groupInitState, isAggRow = isAggRow, label = label, offsetLeft = offsetLeft, offsetTop = offsetTop, parent = parent, rowFactory = rowFactory, rowHeight = rowHeight, rowIndex = rowIndex)
  
    __obj.asInstanceOf[IAggregate]
  }
}

