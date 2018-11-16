package typings
package officeDashJsLib.ExcelNs.InterfacesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface describing the data returned by calling "chartDataLabelFormat.toJSON()". */

trait ChartDataLabelFormatData extends js.Object {
  /**
              *
              * Represents the border format, which includes color, linestyle, and weight. Read-only.
              *
              * [Api set: ExcelApi 1.8]
              */
  var border: js.UndefOr[ChartBorderData] = js.undefined
  /**
              *
              * Represents the font attributes (font name, font size, color, etc.) for a chart data label. Read-only.
              *
              * [Api set: ExcelApi 1.1]
              */
  var font: js.UndefOr[ChartFontData] = js.undefined
}

