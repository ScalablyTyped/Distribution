package typings.ngGrid.ngGrid

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IColumn extends StObject {
  
  var aggLabelFilter: js.Any
  
  var cellClass: String
  
  var cellEditableCondition: js.Any
  
  var cellFilter: js.Any
  
  var cellTemplate: String
  
  var colDef: IColumnDef
  
  def copy(): IColumn
  
  var cursor: String
  
  var displayName: String
  
  var enableCellEdit: Boolean
  
  var field: String
  
  def gripClick(): js.Any
  
  def gripOnMouseDown(event: js.Any): js.Any
  
  def gripOnMouseUp(event: js.Any): Unit
  
  var groupIndex: Double
  
  var groupable: Boolean
  
  def groupedByClass(): String
  
  var headerCellTemplate: String
  
  var headerClass: String
  
  var headerRowHeight: Double
  
  var index: Double
  
  var isAggCol: Boolean
  
  var isGroupedBy: Boolean
  
  var maxWidth: Double
  
  var minWidth: Double
  
  def noSortVisible(): Boolean
  
  def onMouseMove(event: js.Any): Unit
  
  var originalIndex: Double
  
  var pinnable: Boolean
  
  var pinned: Boolean
  
  var resizable: Boolean
  
  def setVars(fromCol: IColumn): Unit
  
  def showSortButtonDown(): Boolean
  
  def showSortButtonUp(): Boolean
  
  def sort(event: js.Any): Boolean
  
  var sortDirection: String
  
  var sortPriority: Double
  
  var sortable: Boolean
  
  var sortingAlgorithm: js.Function
  
  def toggleVisible(): Unit
  
  var visible: Boolean
  
  var width: Double
}
object IColumn {
  
  @scala.inline
  def apply(
    aggLabelFilter: js.Any,
    cellClass: String,
    cellEditableCondition: js.Any,
    cellFilter: js.Any,
    cellTemplate: String,
    colDef: IColumnDef,
    copy: () => IColumn,
    cursor: String,
    displayName: String,
    enableCellEdit: Boolean,
    field: String,
    gripClick: () => js.Any,
    gripOnMouseDown: js.Any => js.Any,
    gripOnMouseUp: js.Any => Unit,
    groupIndex: Double,
    groupable: Boolean,
    groupedByClass: () => String,
    headerCellTemplate: String,
    headerClass: String,
    headerRowHeight: Double,
    index: Double,
    isAggCol: Boolean,
    isGroupedBy: Boolean,
    maxWidth: Double,
    minWidth: Double,
    noSortVisible: () => Boolean,
    onMouseMove: js.Any => Unit,
    originalIndex: Double,
    pinnable: Boolean,
    pinned: Boolean,
    resizable: Boolean,
    setVars: IColumn => Unit,
    showSortButtonDown: () => Boolean,
    showSortButtonUp: () => Boolean,
    sort: js.Any => Boolean,
    sortDirection: String,
    sortPriority: Double,
    sortable: Boolean,
    sortingAlgorithm: js.Function,
    toggleVisible: () => Unit,
    visible: Boolean,
    width: Double
  ): IColumn = {
    val __obj = js.Dynamic.literal(aggLabelFilter = aggLabelFilter.asInstanceOf[js.Any], cellClass = cellClass.asInstanceOf[js.Any], cellEditableCondition = cellEditableCondition.asInstanceOf[js.Any], cellFilter = cellFilter.asInstanceOf[js.Any], cellTemplate = cellTemplate.asInstanceOf[js.Any], colDef = colDef.asInstanceOf[js.Any], copy = js.Any.fromFunction0(copy), cursor = cursor.asInstanceOf[js.Any], displayName = displayName.asInstanceOf[js.Any], enableCellEdit = enableCellEdit.asInstanceOf[js.Any], field = field.asInstanceOf[js.Any], gripClick = js.Any.fromFunction0(gripClick), gripOnMouseDown = js.Any.fromFunction1(gripOnMouseDown), gripOnMouseUp = js.Any.fromFunction1(gripOnMouseUp), groupIndex = groupIndex.asInstanceOf[js.Any], groupable = groupable.asInstanceOf[js.Any], groupedByClass = js.Any.fromFunction0(groupedByClass), headerCellTemplate = headerCellTemplate.asInstanceOf[js.Any], headerClass = headerClass.asInstanceOf[js.Any], headerRowHeight = headerRowHeight.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], isAggCol = isAggCol.asInstanceOf[js.Any], isGroupedBy = isGroupedBy.asInstanceOf[js.Any], maxWidth = maxWidth.asInstanceOf[js.Any], minWidth = minWidth.asInstanceOf[js.Any], noSortVisible = js.Any.fromFunction0(noSortVisible), onMouseMove = js.Any.fromFunction1(onMouseMove), originalIndex = originalIndex.asInstanceOf[js.Any], pinnable = pinnable.asInstanceOf[js.Any], pinned = pinned.asInstanceOf[js.Any], resizable = resizable.asInstanceOf[js.Any], setVars = js.Any.fromFunction1(setVars), showSortButtonDown = js.Any.fromFunction0(showSortButtonDown), showSortButtonUp = js.Any.fromFunction0(showSortButtonUp), sort = js.Any.fromFunction1(sort), sortDirection = sortDirection.asInstanceOf[js.Any], sortPriority = sortPriority.asInstanceOf[js.Any], sortable = sortable.asInstanceOf[js.Any], sortingAlgorithm = sortingAlgorithm.asInstanceOf[js.Any], toggleVisible = js.Any.fromFunction0(toggleVisible), visible = visible.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[IColumn]
  }
  
  @scala.inline
  implicit class IColumnMutableBuilder[Self <: IColumn] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAggLabelFilter(value: js.Any): Self = StObject.set(x, "aggLabelFilter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCellClass(value: String): Self = StObject.set(x, "cellClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCellEditableCondition(value: js.Any): Self = StObject.set(x, "cellEditableCondition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCellFilter(value: js.Any): Self = StObject.set(x, "cellFilter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCellTemplate(value: String): Self = StObject.set(x, "cellTemplate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColDef(value: IColumnDef): Self = StObject.set(x, "colDef", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCopy(value: () => IColumn): Self = StObject.set(x, "copy", js.Any.fromFunction0(value))
    
    @scala.inline
    def setCursor(value: String): Self = StObject.set(x, "cursor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnableCellEdit(value: Boolean): Self = StObject.set(x, "enableCellEdit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setField(value: String): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGripClick(value: () => js.Any): Self = StObject.set(x, "gripClick", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGripOnMouseDown(value: js.Any => js.Any): Self = StObject.set(x, "gripOnMouseDown", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGripOnMouseUp(value: js.Any => Unit): Self = StObject.set(x, "gripOnMouseUp", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGroupIndex(value: Double): Self = StObject.set(x, "groupIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroupable(value: Boolean): Self = StObject.set(x, "groupable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroupedByClass(value: () => String): Self = StObject.set(x, "groupedByClass", js.Any.fromFunction0(value))
    
    @scala.inline
    def setHeaderCellTemplate(value: String): Self = StObject.set(x, "headerCellTemplate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeaderClass(value: String): Self = StObject.set(x, "headerClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeaderRowHeight(value: Double): Self = StObject.set(x, "headerRowHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsAggCol(value: Boolean): Self = StObject.set(x, "isAggCol", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsGroupedBy(value: Boolean): Self = StObject.set(x, "isGroupedBy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxWidth(value: Double): Self = StObject.set(x, "maxWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinWidth(value: Double): Self = StObject.set(x, "minWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNoSortVisible(value: () => Boolean): Self = StObject.set(x, "noSortVisible", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnMouseMove(value: js.Any => Unit): Self = StObject.set(x, "onMouseMove", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOriginalIndex(value: Double): Self = StObject.set(x, "originalIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPinnable(value: Boolean): Self = StObject.set(x, "pinnable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPinned(value: Boolean): Self = StObject.set(x, "pinned", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResizable(value: Boolean): Self = StObject.set(x, "resizable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSetVars(value: IColumn => Unit): Self = StObject.set(x, "setVars", js.Any.fromFunction1(value))
    
    @scala.inline
    def setShowSortButtonDown(value: () => Boolean): Self = StObject.set(x, "showSortButtonDown", js.Any.fromFunction0(value))
    
    @scala.inline
    def setShowSortButtonUp(value: () => Boolean): Self = StObject.set(x, "showSortButtonUp", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSort(value: js.Any => Boolean): Self = StObject.set(x, "sort", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSortDirection(value: String): Self = StObject.set(x, "sortDirection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSortPriority(value: Double): Self = StObject.set(x, "sortPriority", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSortable(value: Boolean): Self = StObject.set(x, "sortable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSortingAlgorithm(value: js.Function): Self = StObject.set(x, "sortingAlgorithm", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setToggleVisible(value: () => Unit): Self = StObject.set(x, "toggleVisible", js.Any.fromFunction0(value))
    
    @scala.inline
    def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
  }
}
