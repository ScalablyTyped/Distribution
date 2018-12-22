package typings
package officeDashJsDashPreviewLib.ExcelNs.InterfacesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
         *
         * Represents the chart axis title formatting.
         *
         * [Api set: ExcelApi 1.1]
         */

trait ChartAxisTitleFormatLoadOptions extends js.Object {
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
              * Represents the font attributes, such as font name, font size, color, etc. of chart axis title object.
              *
              * [Api set: ExcelApi 1.1]
              */
  var font: js.UndefOr[ChartFontLoadOptions] = js.undefined
}

