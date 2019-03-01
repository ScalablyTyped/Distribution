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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("aggChildren")(aggChildren)
    __obj.updateDynamic("aggIndex")(aggIndex)
    __obj.updateDynamic("aggLabelFilter")(aggLabelFilter)
    __obj.updateDynamic("children")(children)
    __obj.updateDynamic("collapsed")(collapsed)
    __obj.updateDynamic("depth")(depth)
    __obj.updateDynamic("entity")(entity)
    __obj.updateDynamic("field")(field)
    __obj.updateDynamic("groupInitState")(groupInitState)
    __obj.updateDynamic("isAggRow")(isAggRow)
    __obj.updateDynamic("label")(label)
    __obj.updateDynamic("offsetLeft")(offsetLeft)
    __obj.updateDynamic("offsetTop")(offsetTop)
    __obj.updateDynamic("parent")(parent)
    __obj.updateDynamic("rowFactory")(rowFactory)
    __obj.updateDynamic("rowHeight")(rowHeight)
    __obj.updateDynamic("rowIndex")(rowIndex)
    __obj.asInstanceOf[IAggregate]
  }
}

