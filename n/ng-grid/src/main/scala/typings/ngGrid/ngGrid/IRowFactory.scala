package typings.ngGrid.ngGrid

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IRowFactory extends js.Object {
  var aggCache: js.Any
  var dataChanged: Boolean
  var groupedData: js.Any
  var numberOfAggregates: Double
  var parentCache: js.Array[_]
  var parsedData: js.Array[_]
  var renderedRange: IRenderedRange
  var rowConfig: IRowConfig
  var rowHeight: Double
  var selectionProvider: ISelectionProvider
  def UpdateViewableRange(newRange: IRenderedRange): Unit
  def buildAggregateRow(aggEntity: js.Any, rowIndex: Double): IAggregate
  def buildEntityRow(entity: js.Any, rowIndex: Double): IRow
  def filteredRowsChanged(): Unit
  def fixRowCache(): Unit
  def getGrouping(groups: js.Any): Unit
  def parseGroupData(groupData: js.Any): Unit
  def renderedChange(): Unit
  def renderedChangeNoGroups(): Unit
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
}

