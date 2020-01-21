package typings.ngGrid.ngGrid

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
    val __obj = js.Dynamic.literal(aggChildren = aggChildren.asInstanceOf[js.Any], aggIndex = aggIndex.asInstanceOf[js.Any], aggLabelFilter = aggLabelFilter.asInstanceOf[js.Any], children = children.asInstanceOf[js.Any], collapsed = collapsed.asInstanceOf[js.Any], depth = depth.asInstanceOf[js.Any], entity = entity.asInstanceOf[js.Any], field = field.asInstanceOf[js.Any], groupInitState = groupInitState.asInstanceOf[js.Any], isAggRow = isAggRow.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], offsetLeft = offsetLeft.asInstanceOf[js.Any], offsetTop = offsetTop.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any], rowFactory = rowFactory.asInstanceOf[js.Any], rowHeight = rowHeight.asInstanceOf[js.Any], rowIndex = rowIndex.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IAggregate]
  }
}

