package typings
package microsoftDashGraphLib.microsoftDashGraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WorkbookChartAreaFormat extends Entity {
  /** Represents the fill format of an object, which includes background formatting information. Read-only. */
  var fill: js.UndefOr[WorkbookChartFill] = js.undefined
  /** Represents the font attributes (font name, font size, color, etc.) for the current object. Read-only. */
  var font: js.UndefOr[WorkbookChartFont] = js.undefined
}

object WorkbookChartAreaFormat {
  @scala.inline
  def apply(fill: WorkbookChartFill = null, font: WorkbookChartFont = null, id: java.lang.String = null): WorkbookChartAreaFormat = {
    val __obj = js.Dynamic.literal()
    if (fill != null) __obj.updateDynamic("fill")(fill)
    if (font != null) __obj.updateDynamic("font")(font)
    if (id != null) __obj.updateDynamic("id")(id)
    __obj.asInstanceOf[WorkbookChartAreaFormat]
  }
}

