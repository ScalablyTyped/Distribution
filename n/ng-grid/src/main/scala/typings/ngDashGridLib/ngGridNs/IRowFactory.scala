package typings
package ngDashGridLib.ngGridNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IRowFactory extends js.Object {
  var aggCache: js.Any
  var dataChanged: scala.Boolean
  var groupedData: js.Any
  var numberOfAggregates: scala.Double
  var parentCache: js.Array[_]
  var parsedData: js.Array[_]
  var renderedRange: IRenderedRange
  var rowConfig: IRowConfig
  var rowHeight: scala.Double
  var selectionProvider: ISelectionProvider
  def UpdateViewableRange(newRange: IRenderedRange): scala.Unit
  def buildAggregateRow(aggEntity: js.Any, rowIndex: scala.Double): IAggregate
  def buildEntityRow(entity: js.Any, rowIndex: scala.Double): IRow
  def filteredRowsChanged(): scala.Unit
  def fixRowCache(): scala.Unit
  def getGrouping(groups: js.Any): scala.Unit
  def parseGroupData(groupData: js.Any): scala.Unit
  def renderedChange(): scala.Unit
  def renderedChangeNoGroups(): scala.Unit
}

object IRowFactory {
  @scala.inline
  def apply(
    UpdateViewableRange: IRenderedRange => scala.Unit,
    aggCache: js.Any,
    buildAggregateRow: (js.Any, scala.Double) => IAggregate,
    buildEntityRow: (js.Any, scala.Double) => IRow,
    dataChanged: scala.Boolean,
    filteredRowsChanged: () => scala.Unit,
    fixRowCache: () => scala.Unit,
    getGrouping: js.Any => scala.Unit,
    groupedData: js.Any,
    numberOfAggregates: scala.Double,
    parentCache: js.Array[_],
    parseGroupData: js.Any => scala.Unit,
    parsedData: js.Array[_],
    renderedChange: () => scala.Unit,
    renderedChangeNoGroups: () => scala.Unit,
    renderedRange: IRenderedRange,
    rowConfig: IRowConfig,
    rowHeight: scala.Double,
    selectionProvider: ISelectionProvider
  ): IRowFactory = {
    val __obj = js.Dynamic.literal(UpdateViewableRange = js.Any.fromFunction1(UpdateViewableRange), aggCache = aggCache, buildAggregateRow = js.Any.fromFunction2(buildAggregateRow), buildEntityRow = js.Any.fromFunction2(buildEntityRow), dataChanged = dataChanged, filteredRowsChanged = js.Any.fromFunction0(filteredRowsChanged), fixRowCache = js.Any.fromFunction0(fixRowCache), getGrouping = js.Any.fromFunction1(getGrouping), groupedData = groupedData, numberOfAggregates = numberOfAggregates, parentCache = parentCache, parseGroupData = js.Any.fromFunction1(parseGroupData), parsedData = parsedData, renderedChange = js.Any.fromFunction0(renderedChange), renderedChangeNoGroups = js.Any.fromFunction0(renderedChangeNoGroups), renderedRange = renderedRange, rowConfig = rowConfig, rowHeight = rowHeight, selectionProvider = selectionProvider)
  
    __obj.asInstanceOf[IRowFactory]
  }
}

