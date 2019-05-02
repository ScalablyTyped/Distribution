package typings
package officeDashJsLib.ExcelNs.InterfacesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface describing the data returned by calling "chartMapOptions.toJSON()". */
trait ChartMapOptionsData extends js.Object {
  /**
    *
    * Returns or sets the series map labels strategy of a region map chart. Read/Write.
    *
    * [Api set: ExcelApi 1.9]
    */
  var labelStrategy: js.UndefOr[
    officeDashJsLib.ExcelNs.ChartMapLabelStrategy | officeDashJsLib.officeDashJsLibStrings.None | officeDashJsLib.officeDashJsLibStrings.BestFit | officeDashJsLib.officeDashJsLibStrings.ShowAll
  ] = js.undefined
  /**
    *
    * Returns or sets the series mapping level of a region map chart. Read/Write.
    *
    * [Api set: ExcelApi 1.9]
    */
  var level: js.UndefOr[
    officeDashJsLib.ExcelNs.ChartMapAreaLevel | officeDashJsLib.officeDashJsLibStrings.Automatic | officeDashJsLib.officeDashJsLibStrings.DataOnly | officeDashJsLib.officeDashJsLibStrings.City | officeDashJsLib.officeDashJsLibStrings.County | officeDashJsLib.officeDashJsLibStrings.State | officeDashJsLib.officeDashJsLibStrings.Country | officeDashJsLib.officeDashJsLibStrings.Continent | officeDashJsLib.officeDashJsLibStrings.World
  ] = js.undefined
  /**
    *
    * Returns or sets the series projection type of a region map chart. Read/Write.
    *
    * [Api set: ExcelApi 1.9]
    */
  var projectionType: js.UndefOr[
    officeDashJsLib.ExcelNs.ChartMapProjectionType | officeDashJsLib.officeDashJsLibStrings.Automatic | officeDashJsLib.officeDashJsLibStrings.Mercator | officeDashJsLib.officeDashJsLibStrings.Miller | officeDashJsLib.officeDashJsLibStrings.Robinson | officeDashJsLib.officeDashJsLibStrings.Albers
  ] = js.undefined
}

object ChartMapOptionsData {
  @scala.inline
  def apply(
    labelStrategy: officeDashJsLib.ExcelNs.ChartMapLabelStrategy | officeDashJsLib.officeDashJsLibStrings.None | officeDashJsLib.officeDashJsLibStrings.BestFit | officeDashJsLib.officeDashJsLibStrings.ShowAll = null,
    level: officeDashJsLib.ExcelNs.ChartMapAreaLevel | officeDashJsLib.officeDashJsLibStrings.Automatic | officeDashJsLib.officeDashJsLibStrings.DataOnly | officeDashJsLib.officeDashJsLibStrings.City | officeDashJsLib.officeDashJsLibStrings.County | officeDashJsLib.officeDashJsLibStrings.State | officeDashJsLib.officeDashJsLibStrings.Country | officeDashJsLib.officeDashJsLibStrings.Continent | officeDashJsLib.officeDashJsLibStrings.World = null,
    projectionType: officeDashJsLib.ExcelNs.ChartMapProjectionType | officeDashJsLib.officeDashJsLibStrings.Automatic | officeDashJsLib.officeDashJsLibStrings.Mercator | officeDashJsLib.officeDashJsLibStrings.Miller | officeDashJsLib.officeDashJsLibStrings.Robinson | officeDashJsLib.officeDashJsLibStrings.Albers = null
  ): ChartMapOptionsData = {
    val __obj = js.Dynamic.literal()
    if (labelStrategy != null) __obj.updateDynamic("labelStrategy")(labelStrategy.asInstanceOf[js.Any])
    if (level != null) __obj.updateDynamic("level")(level.asInstanceOf[js.Any])
    if (projectionType != null) __obj.updateDynamic("projectionType")(projectionType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChartMapOptionsData]
  }
}

