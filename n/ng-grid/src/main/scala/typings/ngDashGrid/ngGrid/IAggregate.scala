package typings.ngDashGrid.ngGrid

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IAggregate extends js.Object {
  var aggChildren: js.Array[_]
  var aggIndex: Double
  var aggLabelFilter: js.Any
  var children: js.Array[_]
  var collapsed: Boolean
  var depth: Double
  var entity: js.Any
  var field: String
  var groupInitState: Boolean
  var isAggRow: Boolean
  var label: String
  var offsetLeft: Double
  var offsetTop: Double
  var parent: js.Any
  var rowFactory: IRowFactory
  var rowHeight: Double
  var rowIndex: Double
}

object IAggregate {
  @scala.inline
  def apply(
    aggChildren: js.Array[_],
    aggIndex: Double,
    aggLabelFilter: js.Any,
    children: js.Array[_],
    collapsed: Boolean,
    depth: Double,
    entity: js.Any,
    field: String,
    groupInitState: Boolean,
    isAggRow: Boolean,
    label: String,
    offsetLeft: Double,
    offsetTop: Double,
    parent: js.Any,
    rowFactory: IRowFactory,
    rowHeight: Double,
    rowIndex: Double
  ): IAggregate = {
    val __obj = js.Dynamic.literal(aggChildren = aggChildren, aggIndex = aggIndex, aggLabelFilter = aggLabelFilter, children = children, collapsed = collapsed, depth = depth, entity = entity, field = field, groupInitState = groupInitState, isAggRow = isAggRow, label = label, offsetLeft = offsetLeft, offsetTop = offsetTop, parent = parent, rowFactory = rowFactory, rowHeight = rowHeight, rowIndex = rowIndex)
  
    __obj.asInstanceOf[IAggregate]
  }
}

