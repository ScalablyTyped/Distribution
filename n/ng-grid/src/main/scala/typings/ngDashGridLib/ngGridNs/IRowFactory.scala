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
    UpdateViewableRange: js.Function1[IRenderedRange, scala.Unit],
    aggCache: js.Any,
    buildAggregateRow: js.Function2[js.Any, scala.Double, IAggregate],
    buildEntityRow: js.Function2[js.Any, scala.Double, IRow],
    dataChanged: scala.Boolean,
    filteredRowsChanged: js.Function0[scala.Unit],
    fixRowCache: js.Function0[scala.Unit],
    getGrouping: js.Function1[js.Any, scala.Unit],
    groupedData: js.Any,
    numberOfAggregates: scala.Double,
    parentCache: js.Array[_],
    parseGroupData: js.Function1[js.Any, scala.Unit],
    parsedData: js.Array[_],
    renderedChange: js.Function0[scala.Unit],
    renderedChangeNoGroups: js.Function0[scala.Unit],
    renderedRange: IRenderedRange,
    rowConfig: IRowConfig,
    rowHeight: scala.Double,
    selectionProvider: ISelectionProvider
  ): IRowFactory = {
    val __obj = js.Dynamic.literal(UpdateViewableRange = UpdateViewableRange, aggCache = aggCache, buildAggregateRow = buildAggregateRow, buildEntityRow = buildEntityRow, dataChanged = dataChanged, filteredRowsChanged = filteredRowsChanged, fixRowCache = fixRowCache, getGrouping = getGrouping, groupedData = groupedData, numberOfAggregates = numberOfAggregates, parentCache = parentCache, parseGroupData = parseGroupData, parsedData = parsedData, renderedChange = renderedChange, renderedChangeNoGroups = renderedChangeNoGroups, renderedRange = renderedRange, rowConfig = rowConfig, rowHeight = rowHeight, selectionProvider = selectionProvider)
  
    __obj.asInstanceOf[IRowFactory]
  }
}

