package typings.officeDashJsDashPreview.Excel.Interfaces

import typings.officeDashJsDashPreview.Excel.ChartMapAreaLevel
import typings.officeDashJsDashPreview.Excel.ChartMapLabelStrategy
import typings.officeDashJsDashPreview.Excel.ChartMapProjectionType
import typings.officeDashJsDashPreview.officeDashJsDashPreviewStrings.Albers
import typings.officeDashJsDashPreview.officeDashJsDashPreviewStrings.Automatic
import typings.officeDashJsDashPreview.officeDashJsDashPreviewStrings.BestFit
import typings.officeDashJsDashPreview.officeDashJsDashPreviewStrings.City
import typings.officeDashJsDashPreview.officeDashJsDashPreviewStrings.Continent
import typings.officeDashJsDashPreview.officeDashJsDashPreviewStrings.Country
import typings.officeDashJsDashPreview.officeDashJsDashPreviewStrings.County
import typings.officeDashJsDashPreview.officeDashJsDashPreviewStrings.DataOnly
import typings.officeDashJsDashPreview.officeDashJsDashPreviewStrings.Mercator
import typings.officeDashJsDashPreview.officeDashJsDashPreviewStrings.Miller
import typings.officeDashJsDashPreview.officeDashJsDashPreviewStrings.None
import typings.officeDashJsDashPreview.officeDashJsDashPreviewStrings.Robinson
import typings.officeDashJsDashPreview.officeDashJsDashPreviewStrings.ShowAll
import typings.officeDashJsDashPreview.officeDashJsDashPreviewStrings.State
import typings.officeDashJsDashPreview.officeDashJsDashPreviewStrings.World
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

