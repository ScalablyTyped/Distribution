package typings
package officeDashJsDashPreviewLib.ExcelNs.InterfacesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface describing the data returned by calling "chartLegendFormat.toJSON()". */
trait ChartLegendFormatData extends js.Object {
  /**
    *
    * Represents the border format, which includes color, linestyle, and weight. Read-only.
    *
    * [Api set: ExcelApi 1.8]
    */
  var border: js.UndefOr[ChartBorderData] = js.undefined
  /**
    *
    * Represents the font attributes such as font name, font size, color, etc. of a chart legend. Read-only.
    *
    * [Api set: ExcelApi 1.1]
    */
  var font: js.UndefOr[ChartFontData] = js.undefined
}

