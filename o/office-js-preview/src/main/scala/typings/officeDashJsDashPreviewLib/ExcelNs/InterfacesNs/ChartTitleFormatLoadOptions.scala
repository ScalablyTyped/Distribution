package typings
package officeDashJsDashPreviewLib.ExcelNs.InterfacesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
         *
         * Provides access to the office art formatting for chart title.
         *
         * [Api set: ExcelApi 1.1]
         */

trait ChartTitleFormatLoadOptions extends js.Object {
  @JSName("$all")
  var $all: js.UndefOr[scala.Boolean] = js.undefined
  /**
              *
              * Represents the border format of chart title, which includes color, linestyle, and weight.
              *
              * [Api set: ExcelApi 1.7]
              */
  var border: js.UndefOr[ChartBorderLoadOptions] = js.undefined
  /**
              *
              * Represents the font attributes (font name, font size, color, etc.) for an object.
              *
              * [Api set: ExcelApi 1.1]
              */
  var font: js.UndefOr[ChartFontLoadOptions] = js.undefined
}

