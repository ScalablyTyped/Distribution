package typings.officeJsPreview.Excel.Interfaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface describing the data returned by calling `chartSeriesFormat.toJSON()`. */
trait ChartSeriesFormatData extends js.Object {
  /**
    *
    * Represents line formatting. Read-only.
    *
    * [Api set: ExcelApi 1.1]
    */
  var line: js.UndefOr[ChartLineFormatData] = js.undefined
}

object ChartSeriesFormatData {
  @scala.inline
  def apply(line: ChartLineFormatData = null): ChartSeriesFormatData = {
    val __obj = js.Dynamic.literal()
    if (line != null) __obj.updateDynamic("line")(line.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChartSeriesFormatData]
  }
}

