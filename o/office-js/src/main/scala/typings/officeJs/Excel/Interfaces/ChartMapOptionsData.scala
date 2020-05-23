package typings.officeJs.Excel.Interfaces

import typings.officeJs.Excel.ChartMapAreaLevel
import typings.officeJs.Excel.ChartMapLabelStrategy
import typings.officeJs.Excel.ChartMapProjectionType
import typings.officeJs.officeJsStrings.Albers
import typings.officeJs.officeJsStrings.Automatic
import typings.officeJs.officeJsStrings.BestFit
import typings.officeJs.officeJsStrings.City
import typings.officeJs.officeJsStrings.Continent
import typings.officeJs.officeJsStrings.Country
import typings.officeJs.officeJsStrings.County
import typings.officeJs.officeJsStrings.DataOnly
import typings.officeJs.officeJsStrings.Mercator
import typings.officeJs.officeJsStrings.Miller
import typings.officeJs.officeJsStrings.None
import typings.officeJs.officeJsStrings.Robinson
import typings.officeJs.officeJsStrings.ShowAll
import typings.officeJs.officeJsStrings.State
import typings.officeJs.officeJsStrings.World
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface describing the data returned by calling `chartMapOptions.toJSON()`. */
trait ChartMapOptionsData extends js.Object {
  /**
    *
    * Specifies the series map labels strategy of a region map chart.
    *
    * [Api set: ExcelApi 1.9]
    */
  var labelStrategy: js.UndefOr[ChartMapLabelStrategy | None | BestFit | ShowAll] = js.undefined
  /**
    *
    * Specifies the series mapping level of a region map chart.
    *
    * [Api set: ExcelApi 1.9]
    */
  var level: js.UndefOr[
    ChartMapAreaLevel | Automatic | DataOnly | City | County | State | Country | Continent | World
  ] = js.undefined
  /**
    *
    * Specifies the series projection type of a region map chart.
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

