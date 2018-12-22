package typings
package officeDashJsDashPreviewLib.ExcelNs.InterfacesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface for updating data on the ChartPlotArea object, for use in "chartPlotArea.set({ ... })". */

trait ChartPlotAreaUpdateData extends js.Object {
  /**
              *
              * Represents the formatting of a chart plotArea.
              *
              * [Api set: ExcelApi 1.8]
              */
  var format: js.UndefOr[ChartPlotAreaFormatUpdateData] = js.undefined
  /**
               *
               * Represents the height value of plotArea.
               *
               * [Api set: ExcelApi 1.8]
               */
  var height: js.UndefOr[scala.Double] = js.undefined
  /**
               *
               * Represents the insideHeight value of plotArea.
               *
               * [Api set: ExcelApi 1.8]
               */
  var insideHeight: js.UndefOr[scala.Double] = js.undefined
  /**
               *
               * Represents the insideLeft value of plotArea.
               *
               * [Api set: ExcelApi 1.8]
               */
  var insideLeft: js.UndefOr[scala.Double] = js.undefined
  /**
               *
               * Represents the insideTop value of plotArea.
               *
               * [Api set: ExcelApi 1.8]
               */
  var insideTop: js.UndefOr[scala.Double] = js.undefined
  /**
               *
               * Represents the insideWidth value of plotArea.
               *
               * [Api set: ExcelApi 1.8]
               */
  var insideWidth: js.UndefOr[scala.Double] = js.undefined
  /**
               *
               * Represents the left value of plotArea.
               *
               * [Api set: ExcelApi 1.8]
               */
  var left: js.UndefOr[scala.Double] = js.undefined
  /**
               *
               * Represents the position of plotArea.
               *
               * [Api set: ExcelApi 1.8]
               */
  var position: js.UndefOr[
    officeDashJsDashPreviewLib.ExcelNs.ChartPlotAreaPosition | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Automatic | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Custom
  ] = js.undefined
  /**
               *
               * Represents the top value of plotArea.
               *
               * [Api set: ExcelApi 1.8]
               */
  var top: js.UndefOr[scala.Double] = js.undefined
  /**
               *
               * Represents the width value of plotArea.
               *
               * [Api set: ExcelApi 1.8]
               */
  var width: js.UndefOr[scala.Double] = js.undefined
}

