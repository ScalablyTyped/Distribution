package typings.officeDashJs.Excel.Interfaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface describing the data returned by calling `chartGridlinesFormat.toJSON()`. */
trait ChartGridlinesFormatData extends js.Object {
  /**
    *
    * Represents chart line formatting. Read-only.
    *
    * [Api set: ExcelApi 1.1]
    */
  var line: js.UndefOr[ChartLineFormatData] = js.undefined
}

object ChartGridlinesFormatData {
  @scala.inline
  def apply(line: ChartLineFormatData = null): ChartGridlinesFormatData = {
    val __obj = js.Dynamic.literal()
    if (line != null) __obj.updateDynamic("line")(line)
    __obj.asInstanceOf[ChartGridlinesFormatData]
  }
}

