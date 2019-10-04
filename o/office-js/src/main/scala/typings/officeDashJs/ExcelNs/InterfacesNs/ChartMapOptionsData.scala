package typings.officeDashJs.ExcelNs.InterfacesNs

import typings.officeDashJs.ExcelNs.ChartMapAreaLevel
import typings.officeDashJs.ExcelNs.ChartMapLabelStrategy
import typings.officeDashJs.ExcelNs.ChartMapProjectionType
import typings.officeDashJs.officeDashJsStrings.Albers
import typings.officeDashJs.officeDashJsStrings.Automatic
import typings.officeDashJs.officeDashJsStrings.BestFit
import typings.officeDashJs.officeDashJsStrings.City
import typings.officeDashJs.officeDashJsStrings.Continent
import typings.officeDashJs.officeDashJsStrings.Country
import typings.officeDashJs.officeDashJsStrings.County
import typings.officeDashJs.officeDashJsStrings.DataOnly
import typings.officeDashJs.officeDashJsStrings.Mercator
import typings.officeDashJs.officeDashJsStrings.Miller
import typings.officeDashJs.officeDashJsStrings.None
import typings.officeDashJs.officeDashJsStrings.Robinson
import typings.officeDashJs.officeDashJsStrings.ShowAll
import typings.officeDashJs.officeDashJsStrings.State
import typings.officeDashJs.officeDashJsStrings.World
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface describing the data returned by calling `chartMapOptions.toJSON()`. */
trait ChartMapOptionsData extends js.Object {
  /**
    *
    * Returns or sets the series map labels strategy of a region map chart. Read/Write.
    *
    * [Api set: ExcelApi 1.9]
    */
  var labelStrategy: js.UndefOr[ChartMapLabelStrategy | None | BestFit | ShowAll] = js.undefined
  /**
    *
    * Returns or sets the series mapping level of a region map chart. Read/Write.
    *
    * [Api set: ExcelApi 1.9]
    */
  var level: js.UndefOr[
    ChartMapAreaLevel | Automatic | DataOnly | City | County | State | Country | Continent | World
  ] = js.undefined
  /**
    *
    * Returns or sets the series projection type of a region map chart. Read/Write.
    *
    * [Api set: ExcelApi 1.9]
    */
  var projectionType: js.UndefOr[ChartMapProjectionType | Automatic | Mercator | Miller | Robinson | Albers] = js.undefined
}

object ChartMapOptionsData {
  @scala.inline
  def apply(
    labelStrategy: ChartMapLabelStrategy | None | BestFit | ShowAll = null,
    level: ChartMapAreaLevel | Automatic | DataOnly | City | County | State | Country | Continent | World = null,
    projectionType: ChartMapProjectionType | Automatic | Mercator | Miller | Robinson | Albers = null
  ): ChartMapOptionsData = {
    val __obj = js.Dynamic.literal()
    if (labelStrategy != null) __obj.updateDynamic("labelStrategy")(labelStrategy.asInstanceOf[js.Any])
    if (level != null) __obj.updateDynamic("level")(level.asInstanceOf[js.Any])
    if (projectionType != null) __obj.updateDynamic("projectionType")(projectionType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChartMapOptionsData]
  }
}

