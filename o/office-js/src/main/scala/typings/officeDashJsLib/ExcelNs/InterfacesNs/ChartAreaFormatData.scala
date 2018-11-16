package typings
package officeDashJsLib.ExcelNs.InterfacesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface describing the data returned by calling "chartAreaFormat.toJSON()". */

trait ChartAreaFormatData extends js.Object {
  /**
              *
              * Represents the border format of chart area, which includes color, linestyle, and weight. Read-only.
              *
              * [Api set: ExcelApi 1.7]
              */
  var border: js.UndefOr[ChartBorderData] = js.undefined
  /**
              *
              * Represents the font attributes (font name, font size, color, etc.) for the current object. Read-only.
              *
              * [Api set: ExcelApi 1.1]
              */
  var font: js.UndefOr[ChartFontData] = js.undefined
}

