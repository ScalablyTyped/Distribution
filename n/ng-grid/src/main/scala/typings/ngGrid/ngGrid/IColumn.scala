package typings.ngGrid.ngGrid

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IColumn extends js.Object {
  
  var aggLabelFilter: js.Any = js.native
  
  var cellClass: String = js.native
  
  var cellEditableCondition: js.Any = js.native
  
  var cellFilter: js.Any = js.native
  
  var cellTemplate: String = js.native
  
  var colDef: IColumnDef = js.native
  
  def copy(): IColumn = js.native
  
  var cursor: String = js.native
  
  var displayName: String = js.native
  
  var enableCellEdit: Boolean = js.native
  
  var field: String = js.native
  
  def gripClick(): js.Any = js.native
  
  def gripOnMouseDown(event: js.Any): js.Any = js.native
  
  def gripOnMouseUp(event: js.Any): Unit = js.native
  
  var groupIndex: Double = js.native
  
  var groupable: Boolean = js.native
  
  def groupedByClass(): String = js.native
  
  var headerCellTemplate: String = js.native
  
  var headerClass: String = js.native
  
  var headerRowHeight: Double = js.native
  
  var index: Double = js.native
  
  var isAggCol: Boolean = js.native
  
  var isGroupedBy: Boolean = js.native
  
  var maxWidth: Double = js.native
  
  var minWidth: Double = js.native
  
  def noSortVisible(): Boolean = js.native
  
  def onMouseMove(event: js.Any): Unit = js.native
  
  var originalIndex: Double = js.native
  
  var pinnable: Boolean = js.native
  
  var pinned: Boolean = js.native
  
  var resizable: Boolean = js.native
  
  def setVars(fromCol: IColumn): Unit = js.native
  
  def showSortButtonDown(): Boolean = js.native
  
  def showSortButtonUp(): Boolean = js.native
  
  def sort(event: js.Any): Boolean = js.native
  
  var sortDirection: String = js.native
  
  var sortPriority: Double = js.native
  
  var sortable: Boolean = js.native
  
  var sortingAlgorithm: js.Function = js.native
  
  def toggleVisible(): Unit = js.native
  
  var visible: Boolean = js.native
  
  var width: Double = js.native
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
  implicit class IColumnOps[Self <: IColumn] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAggLabelFilter(value: js.Any): Self = this.set("aggLabelFilter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCellClass(value: String): Self = this.set("cellClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCellEditableCondition(value: js.Any): Self = this.set("cellEditableCondition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCellFilter(value: js.Any): Self = this.set("cellFilter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCellTemplate(value: String): Self = this.set("cellTemplate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColDef(value: IColumnDef): Self = this.set("colDef", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCopy(value: () => IColumn): Self = this.set("copy", js.Any.fromFunction0(value))
    
    @scala.inline
    def setCursor(value: String): Self = this.set("cursor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayName(value: String): Self = this.set("displayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnableCellEdit(value: Boolean): Self = this.set("enableCellEdit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setField(value: String): Self = this.set("field", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGripClick(value: () => js.Any): Self = this.set("gripClick", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGripOnMouseDown(value: js.Any => js.Any): Self = this.set("gripOnMouseDown", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGripOnMouseUp(value: js.Any => Unit): Self = this.set("gripOnMouseUp", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGroupIndex(value: Double): Self = this.set("groupIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroupable(value: Boolean): Self = this.set("groupable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroupedByClass(value: () => String): Self = this.set("groupedByClass", js.Any.fromFunction0(value))
    
    @scala.inline
    def setHeaderCellTemplate(value: String): Self = this.set("headerCellTemplate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeaderClass(value: String): Self = this.set("headerClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeaderRowHeight(value: Double): Self = this.set("headerRowHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndex(value: Double): Self = this.set("index", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsAggCol(value: Boolean): Self = this.set("isAggCol", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsGroupedBy(value: Boolean): Self = this.set("isGroupedBy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxWidth(value: Double): Self = this.set("maxWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinWidth(value: Double): Self = this.set("minWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNoSortVisible(value: () => Boolean): Self = this.set("noSortVisible", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnMouseMove(value: js.Any => Unit): Self = this.set("onMouseMove", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOriginalIndex(value: Double): Self = this.set("originalIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPinnable(value: Boolean): Self = this.set("pinnable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPinned(value: Boolean): Self = this.set("pinned", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResizable(value: Boolean): Self = this.set("resizable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSetVars(value: IColumn => Unit): Self = this.set("setVars", js.Any.fromFunction1(value))
    
    @scala.inline
    def setShowSortButtonDown(value: () => Boolean): Self = this.set("showSortButtonDown", js.Any.fromFunction0(value))
    
    @scala.inline
    def setShowSortButtonUp(value: () => Boolean): Self = this.set("showSortButtonUp", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSort(value: js.Any => Boolean): Self = this.set("sort", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSortDirection(value: String): Self = this.set("sortDirection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSortPriority(value: Double): Self = this.set("sortPriority", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSortable(value: Boolean): Self = this.set("sortable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSortingAlgorithm(value: js.Function): Self = this.set("sortingAlgorithm", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setToggleVisible(value: () => Unit): Self = this.set("toggleVisible", js.Any.fromFunction0(value))
    
    @scala.inline
    def setVisible(value: Boolean): Self = this.set("visible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
  }
}
