package typings.ngGrid.ngGrid

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IAggregate extends StObject {
  
  var aggChildren: js.Array[js.Any]
  
  var aggIndex: Double
  
  var aggLabelFilter: js.Any
  
  var children: js.Array[js.Any]
  
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
  
  inline def apply(
    aggChildren: js.Array[js.Any],
    aggIndex: Double,
    aggLabelFilter: js.Any,
    children: js.Array[js.Any],
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
  
  extension [Self <: IAggregate](x: Self) {
    
    inline def setAggChildren(value: js.Array[js.Any]): Self = StObject.set(x, "aggChildren", value.asInstanceOf[js.Any])
    
    inline def setAggChildrenVarargs(value: js.Any*): Self = StObject.set(x, "aggChildren", js.Array(value :_*))
    
    inline def setAggIndex(value: Double): Self = StObject.set(x, "aggIndex", value.asInstanceOf[js.Any])
    
    inline def setAggLabelFilter(value: js.Any): Self = StObject.set(x, "aggLabelFilter", value.asInstanceOf[js.Any])
    
    inline def setChildren(value: js.Array[js.Any]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setChildrenVarargs(value: js.Any*): Self = StObject.set(x, "children", js.Array(value :_*))
    
    inline def setCollapsed(value: Boolean): Self = StObject.set(x, "collapsed", value.asInstanceOf[js.Any])
    
    inline def setDepth(value: Double): Self = StObject.set(x, "depth", value.asInstanceOf[js.Any])
    
    inline def setEntity(value: js.Any): Self = StObject.set(x, "entity", value.asInstanceOf[js.Any])
    
    inline def setField(value: String): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
    
    inline def setGroupInitState(value: Boolean): Self = StObject.set(x, "groupInitState", value.asInstanceOf[js.Any])
    
    inline def setIsAggRow(value: Boolean): Self = StObject.set(x, "isAggRow", value.asInstanceOf[js.Any])
    
    inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setOffsetLeft(value: Double): Self = StObject.set(x, "offsetLeft", value.asInstanceOf[js.Any])
    
    inline def setOffsetTop(value: Double): Self = StObject.set(x, "offsetTop", value.asInstanceOf[js.Any])
    
    inline def setParent(value: js.Any): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setRowFactory(value: IRowFactory): Self = StObject.set(x, "rowFactory", value.asInstanceOf[js.Any])
    
    inline def setRowHeight(value: Double): Self = StObject.set(x, "rowHeight", value.asInstanceOf[js.Any])
    
    inline def setRowIndex(value: Double): Self = StObject.set(x, "rowIndex", value.asInstanceOf[js.Any])
  }
}
