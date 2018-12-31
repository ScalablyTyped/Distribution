package typings
package officeDashJsDashPreviewLib.ExcelNs.InterfacesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface describing the data returned by calling "chartMapOptions.toJSON()". */
trait ChartMapOptionsData extends js.Object {
  /**
    *
    * Returns or sets series map labels strategy of a region map chart. Read/Write.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var labelStrategy: js.UndefOr[
    officeDashJsDashPreviewLib.ExcelNs.ChartMapLabelStrategy | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.None | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.BestFit | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.ShowAll
  ] = js.undefined
  /**
    *
    * Returns or sets series map area of a region map chart. Read/Write.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var level: js.UndefOr[
    officeDashJsDashPreviewLib.ExcelNs.ChartMapAreaLevel | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Automatic | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.DataOnly | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.City | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.County | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.State | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Country | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Continent | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.World
  ] = js.undefined
  /**
    *
    * Returns or sets series projection type of a region map chart. Read/Write.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var projectionType: js.UndefOr[
    officeDashJsDashPreviewLib.ExcelNs.ChartMapProjectionType | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Automatic | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Mercator | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Miller | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Robinson | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Albers
  ] = js.undefined
}

