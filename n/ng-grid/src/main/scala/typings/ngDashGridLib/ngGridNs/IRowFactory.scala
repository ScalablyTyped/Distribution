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

