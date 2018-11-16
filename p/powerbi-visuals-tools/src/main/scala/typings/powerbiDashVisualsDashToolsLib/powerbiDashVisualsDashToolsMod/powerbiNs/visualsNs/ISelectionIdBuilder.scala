package typings
package powerbiDashVisualsDashToolsLib.powerbiDashVisualsDashToolsMod.powerbiNs.visualsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ISelectionIdBuilder extends js.Object {
  def createSelectionId(): ISelectionId = js.native
  def withCategory(
    categoryColumn: powerbiDashVisualsDashToolsLib.powerbiDashVisualsDashToolsMod.powerbiNs.DataViewCategoryColumn,
    index: scala.Double
  ): this.type = js.native
  def withMeasure(measureId: java.lang.String): this.type = js.native
  def withSeries(
    seriesColumn: powerbiDashVisualsDashToolsLib.powerbiDashVisualsDashToolsMod.powerbiNs.DataViewValueColumns,
    valueColumn: powerbiDashVisualsDashToolsLib.powerbiDashVisualsDashToolsMod.powerbiNs.DataViewValueColumn
  ): this.type = js.native
  def withSeries(
    seriesColumn: powerbiDashVisualsDashToolsLib.powerbiDashVisualsDashToolsMod.powerbiNs.DataViewValueColumns,
    valueColumn: powerbiDashVisualsDashToolsLib.powerbiDashVisualsDashToolsMod.powerbiNs.DataViewValueColumnGroup
  ): this.type = js.native
}

