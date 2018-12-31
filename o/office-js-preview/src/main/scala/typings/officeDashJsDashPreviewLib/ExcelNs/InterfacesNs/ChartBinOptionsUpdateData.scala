package typings
package officeDashJsDashPreviewLib.ExcelNs.InterfacesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface for updating data on the ChartBinOptions object, for use in "chartBinOptions.set({ ... })". */
trait ChartBinOptionsUpdateData extends js.Object {
  /**
    *
    * Returns or sets if bin overflow enabled in a histogram chart or pareto chart. Read/Write.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var allowOverflow: js.UndefOr[scala.Boolean] = js.undefined
  /**
    *
    * Returns or sets if bin underflow enabled in a histogram chart or pareto chart. Read/Write.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var allowUnderflow: js.UndefOr[scala.Boolean] = js.undefined
  /**
    *
    * Returns or sets count of bin of a histogram chart or pareto chart. Read/Write.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var count: js.UndefOr[scala.Double] = js.undefined
  /**
    *
    * Returns or sets bin overflow value of a histogram chart or pareto chart. Read/Write.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var overflowValue: js.UndefOr[scala.Double] = js.undefined
  /**
    *
    * Returns or sets bin type of a histogram chart or pareto chart. Read/Write.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var `type`: js.UndefOr[
    officeDashJsDashPreviewLib.ExcelNs.ChartBinType | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Category | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Auto | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.BinWidth | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.BinCount
  ] = js.undefined
  /**
    *
    * Returns or sets bin underflow value of a histogram chart or pareto chart. Read/Write.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var underflowValue: js.UndefOr[scala.Double] = js.undefined
  /**
    *
    * Returns or sets bin width value of a histogram chart or pareto chart. Read/Write.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var width: js.UndefOr[scala.Double] = js.undefined
}

