package typings
package officeDashJsDashPreviewLib.ExcelNs.InterfacesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface describing the data returned by calling "chartErrorBars.toJSON()". */

trait ChartErrorBarsData extends js.Object {
  /**
               *
               * Represents whether have the end style cap for the error bars.
               *
               * [Api set: ExcelApi BETA (PREVIEW ONLY)]
               * @beta
               */
  var endStyleCap: js.UndefOr[scala.Boolean] = js.undefined
  /**
              *
              * Represents the formatting of chart ErrorBars.
              *
              * [Api set: ExcelApi BETA (PREVIEW ONLY)]
              * @beta
              */
  var format: js.UndefOr[ChartErrorBarsFormatData] = js.undefined
  /**
               *
               * Represents which error-bar parts to include. See Excel.ChartErrorBarsInclude for details.
               *
               * [Api set: ExcelApi BETA (PREVIEW ONLY)]
               * @beta
               */
  var include: js.UndefOr[
    officeDashJsDashPreviewLib.ExcelNs.ChartErrorBarsInclude | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Both | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.MinusValues | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.PlusValues
  ] = js.undefined
  /**
               *
               * Represents the range marked by error bars. See Excel.ChartErrorBarsType for details.
               *
               * [Api set: ExcelApi BETA (PREVIEW ONLY)]
               * @beta
               */
  var `type`: js.UndefOr[
    officeDashJsDashPreviewLib.ExcelNs.ChartErrorBarsType | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.FixedValue | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Percent | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.StDev | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.StError | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Custom
  ] = js.undefined
  /**
               *
               * Represents whether shown error bars.
               *
               * [Api set: ExcelApi BETA (PREVIEW ONLY)]
               * @beta
               */
  var visible: js.UndefOr[scala.Boolean] = js.undefined
}

