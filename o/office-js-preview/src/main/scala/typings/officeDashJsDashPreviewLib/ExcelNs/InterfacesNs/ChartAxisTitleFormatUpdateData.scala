package typings
package officeDashJsDashPreviewLib.ExcelNs.InterfacesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface for updating data on the ChartAxisTitleFormat object, for use in "chartAxisTitleFormat.set({ ... })". */

trait ChartAxisTitleFormatUpdateData extends js.Object {
  /**
              *
              * Represents the border format, which includes color, linestyle, and weight.
              *
              * [Api set: ExcelApi 1.8]
              */
  var border: js.UndefOr[ChartBorderUpdateData] = js.undefined
  /**
              *
              * Represents the font attributes, such as font name, font size, color, etc. of chart axis title object.
              *
              * [Api set: ExcelApi 1.1]
              */
  var font: js.UndefOr[ChartFontUpdateData] = js.undefined
}

