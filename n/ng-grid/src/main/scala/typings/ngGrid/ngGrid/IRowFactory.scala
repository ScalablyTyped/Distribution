package typings.ngGrid.ngGrid

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IRowFactory extends js.Object {
  
  def UpdateViewableRange(newRange: IRenderedRange): Unit = js.native
  
  var aggCache: js.Any = js.native
  
  def buildAggregateRow(aggEntity: js.Any, rowIndex: Double): IAggregate = js.native
  
  def buildEntityRow(entity: js.Any, rowIndex: Double): IRow = js.native
  
  var dataChanged: Boolean = js.native
  
  def filteredRowsChanged(): Unit = js.native
  
  def fixRowCache(): Unit = js.native
  
  def getGrouping(groups: js.Any): Unit = js.native
  
  var groupedData: js.Any = js.native
  
  var numberOfAggregates: Double = js.native
  
  var parentCache: js.Array[_] = js.native
  
  def parseGroupData(groupData: js.Any): Unit = js.native
  
  var parsedData: js.Array[_] = js.native
  
  def renderedChange(): Unit = js.native
  
  def renderedChangeNoGroups(): Unit = js.native
  
  var renderedRange: IRenderedRange = js.native
  
  var rowConfig: IRowConfig = js.native
  
  var rowHeight: Double = js.native
  
  var selectionProvider: ISelectionProvider = js.native
}
object IRowFactory {
  
  @scala.inline
  def apply(
    UpdateViewableRange: IRenderedRange => Unit,
    aggCache: js.Any,
    buildAggregateRow: (js.Any, Double) => IAggregate,
    buildEntityRow: (js.Any, Double) => IRow,
    dataChanged: Boolean,
    filteredRowsChanged: () => Unit,
    fixRowCache: () => Unit,
    getGrouping: js.Any => Unit,
    groupedData: js.Any,
    numberOfAggregates: Double,
    parentCache: js.Array[_],
    parseGroupData: js.Any => Unit,
    parsedData: js.Array[_],
    renderedChange: () => Unit,
    renderedChangeNoGroups: () => Unit,
    renderedRange: IRenderedRange,
    rowConfig: IRowConfig,
    rowHeight: Double,
    selectionProvider: ISelectionProvider
  ): IRowFactory = {
    val __obj = js.Dynamic.literal(UpdateViewableRange = js.Any.fromFunction1(UpdateViewableRange), aggCache = aggCache.asInstanceOf[js.Any], buildAggregateRow = js.Any.fromFunction2(buildAggregateRow), buildEntityRow = js.Any.fromFunction2(buildEntityRow), dataChanged = dataChanged.asInstanceOf[js.Any], filteredRowsChanged = js.Any.fromFunction0(filteredRowsChanged), fixRowCache = js.Any.fromFunction0(fixRowCache), getGrouping = js.Any.fromFunction1(getGrouping), groupedData = groupedData.asInstanceOf[js.Any], numberOfAggregates = numberOfAggregates.asInstanceOf[js.Any], parentCache = parentCache.asInstanceOf[js.Any], parseGroupData = js.Any.fromFunction1(parseGroupData), parsedData = parsedData.asInstanceOf[js.Any], renderedChange = js.Any.fromFunction0(renderedChange), renderedChangeNoGroups = js.Any.fromFunction0(renderedChangeNoGroups), renderedRange = renderedRange.asInstanceOf[js.Any], rowConfig = rowConfig.asInstanceOf[js.Any], rowHeight = rowHeight.asInstanceOf[js.Any], selectionProvider = selectionProvider.asInstanceOf[js.Any])
    __obj.asInstanceOf[IRowFactory]
  }
  
  @scala.inline
  implicit class IRowFactoryOps[Self <: IRowFactory] (val x: Self) extends AnyVal {
    
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
    def setUpdateViewableRange(value: IRenderedRange => Unit): Self = this.set("UpdateViewableRange", js.Any.fromFunction1(value))
    
    @scala.inline
    def setAggCache(value: js.Any): Self = this.set("aggCache", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBuildAggregateRow(value: (js.Any, Double) => IAggregate): Self = this.set("buildAggregateRow", js.Any.fromFunction2(value))
    
    @scala.inline
    def setBuildEntityRow(value: (js.Any, Double) => IRow): Self = this.set("buildEntityRow", js.Any.fromFunction2(value))
    
    @scala.inline
    def setDataChanged(value: Boolean): Self = this.set("dataChanged", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilteredRowsChanged(value: () => Unit): Self = this.set("filteredRowsChanged", js.Any.fromFunction0(value))
    
    @scala.inline
    def setFixRowCache(value: () => Unit): Self = this.set("fixRowCache", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetGrouping(value: js.Any => Unit): Self = this.set("getGrouping", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGroupedData(value: js.Any): Self = this.set("groupedData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumberOfAggregates(value: Double): Self = this.set("numberOfAggregates", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParentCacheVarargs(value: js.Any*): Self = this.set("parentCache", js.Array(value :_*))
    
    @scala.inline
    def setParentCache(value: js.Array[_]): Self = this.set("parentCache", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParseGroupData(value: js.Any => Unit): Self = this.set("parseGroupData", js.Any.fromFunction1(value))
    
    @scala.inline
    def setParsedDataVarargs(value: js.Any*): Self = this.set("parsedData", js.Array(value :_*))
    
    @scala.inline
    def setParsedData(value: js.Array[_]): Self = this.set("parsedData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRenderedChange(value: () => Unit): Self = this.set("renderedChange", js.Any.fromFunction0(value))
    
    @scala.inline
    def setRenderedChangeNoGroups(value: () => Unit): Self = this.set("renderedChangeNoGroups", js.Any.fromFunction0(value))
    
    @scala.inline
    def setRenderedRange(value: IRenderedRange): Self = this.set("renderedRange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRowConfig(value: IRowConfig): Self = this.set("rowConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRowHeight(value: Double): Self = this.set("rowHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectionProvider(value: ISelectionProvider): Self = this.set("selectionProvider", value.asInstanceOf[js.Any])
  }
}
