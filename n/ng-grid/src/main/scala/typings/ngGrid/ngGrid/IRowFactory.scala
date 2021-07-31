package typings.ngGrid.ngGrid

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IRowFactory extends StObject {
  
  def UpdateViewableRange(newRange: IRenderedRange): Unit
  
  var aggCache: js.Any
  
  def buildAggregateRow(aggEntity: js.Any, rowIndex: Double): IAggregate
  
  def buildEntityRow(entity: js.Any, rowIndex: Double): IRow
  
  var dataChanged: Boolean
  
  def filteredRowsChanged(): Unit
  
  def fixRowCache(): Unit
  
  def getGrouping(groups: js.Any): Unit
  
  var groupedData: js.Any
  
  var numberOfAggregates: Double
  
  var parentCache: js.Array[js.Any]
  
  def parseGroupData(groupData: js.Any): Unit
  
  var parsedData: js.Array[js.Any]
  
  def renderedChange(): Unit
  
  def renderedChangeNoGroups(): Unit
  
  var renderedRange: IRenderedRange
  
  var rowConfig: IRowConfig
  
  var rowHeight: Double
  
  var selectionProvider: ISelectionProvider
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
    parentCache: js.Array[js.Any],
    parseGroupData: js.Any => Unit,
    parsedData: js.Array[js.Any],
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
  implicit class IRowFactoryMutableBuilder[Self <: IRowFactory] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAggCache(value: js.Any): Self = StObject.set(x, "aggCache", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBuildAggregateRow(value: (js.Any, Double) => IAggregate): Self = StObject.set(x, "buildAggregateRow", js.Any.fromFunction2(value))
    
    @scala.inline
    def setBuildEntityRow(value: (js.Any, Double) => IRow): Self = StObject.set(x, "buildEntityRow", js.Any.fromFunction2(value))
    
    @scala.inline
    def setDataChanged(value: Boolean): Self = StObject.set(x, "dataChanged", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilteredRowsChanged(value: () => Unit): Self = StObject.set(x, "filteredRowsChanged", js.Any.fromFunction0(value))
    
    @scala.inline
    def setFixRowCache(value: () => Unit): Self = StObject.set(x, "fixRowCache", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetGrouping(value: js.Any => Unit): Self = StObject.set(x, "getGrouping", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGroupedData(value: js.Any): Self = StObject.set(x, "groupedData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumberOfAggregates(value: Double): Self = StObject.set(x, "numberOfAggregates", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParentCache(value: js.Array[js.Any]): Self = StObject.set(x, "parentCache", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParentCacheVarargs(value: js.Any*): Self = StObject.set(x, "parentCache", js.Array(value :_*))
    
    @scala.inline
    def setParseGroupData(value: js.Any => Unit): Self = StObject.set(x, "parseGroupData", js.Any.fromFunction1(value))
    
    @scala.inline
    def setParsedData(value: js.Array[js.Any]): Self = StObject.set(x, "parsedData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParsedDataVarargs(value: js.Any*): Self = StObject.set(x, "parsedData", js.Array(value :_*))
    
    @scala.inline
    def setRenderedChange(value: () => Unit): Self = StObject.set(x, "renderedChange", js.Any.fromFunction0(value))
    
    @scala.inline
    def setRenderedChangeNoGroups(value: () => Unit): Self = StObject.set(x, "renderedChangeNoGroups", js.Any.fromFunction0(value))
    
    @scala.inline
    def setRenderedRange(value: IRenderedRange): Self = StObject.set(x, "renderedRange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRowConfig(value: IRowConfig): Self = StObject.set(x, "rowConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRowHeight(value: Double): Self = StObject.set(x, "rowHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectionProvider(value: ISelectionProvider): Self = StObject.set(x, "selectionProvider", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdateViewableRange(value: IRenderedRange => Unit): Self = StObject.set(x, "UpdateViewableRange", js.Any.fromFunction1(value))
  }
}
