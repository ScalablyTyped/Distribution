package typings
package officeDashJsDashPreviewLib.ExcelNs.InterfacesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
         *
         * Encapsulates the format properties for the chart trendline label.
         *
         * [Api set: ExcelApi 1.8]
         */

trait ChartTrendlineLabelFormatLoadOptions extends js.Object {
  @JSName("$all")
  var $all: js.UndefOr[scala.Boolean] = js.undefined
  /**
              *
              * Represents the border format, which includes color, linestyle, and weight.
              *
              * [Api set: ExcelApi 1.8]
              */
  var border: js.UndefOr[ChartBorderLoadOptions] = js.undefined
  /**
              *
              * Represents the font attributes (font name, font size, color, etc.) for a chart trendline label.
              *
              * [Api set: ExcelApi 1.8]
              */
  var font: js.UndefOr[ChartFontLoadOptions] = js.undefined
}

