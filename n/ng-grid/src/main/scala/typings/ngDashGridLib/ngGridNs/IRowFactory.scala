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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("UpdateViewableRange")(UpdateViewableRange)
    __obj.updateDynamic("aggCache")(aggCache)
    __obj.updateDynamic("buildAggregateRow")(buildAggregateRow)
    __obj.updateDynamic("buildEntityRow")(buildEntityRow)
    __obj.updateDynamic("dataChanged")(dataChanged)
    __obj.updateDynamic("filteredRowsChanged")(filteredRowsChanged)
    __obj.updateDynamic("fixRowCache")(fixRowCache)
    __obj.updateDynamic("getGrouping")(getGrouping)
    __obj.updateDynamic("groupedData")(groupedData)
    __obj.updateDynamic("numberOfAggregates")(numberOfAggregates)
    __obj.updateDynamic("parentCache")(parentCache)
    __obj.updateDynamic("parseGroupData")(parseGroupData)
    __obj.updateDynamic("parsedData")(parsedData)
    __obj.updateDynamic("renderedChange")(renderedChange)
    __obj.updateDynamic("renderedChangeNoGroups")(renderedChangeNoGroups)
    __obj.updateDynamic("renderedRange")(renderedRange)
    __obj.updateDynamic("rowConfig")(rowConfig)
    __obj.updateDynamic("rowHeight")(rowHeight)
    __obj.updateDynamic("selectionProvider")(selectionProvider)
    __obj.asInstanceOf[IRowFactory]
  }
}

