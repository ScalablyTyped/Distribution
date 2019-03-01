package typings
package officeDashJsDashPreviewLib.ExcelNs.InterfacesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface describing the data returned by calling "pageBreak.toJSON()". */
trait PageBreakData extends js.Object {
  /**
    *
    * Represents the column index for the page break
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var columnIndex: js.UndefOr[scala.Double] = js.undefined
  /**
    *
    * Represents the row index for the page break
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var rowIndex: js.UndefOr[scala.Double] = js.undefined
}

object PageBreakData {
  @scala.inline
  def apply(columnIndex: scala.Int | scala.Double = null, rowIndex: scala.Int | scala.Double = null): PageBreakData = {
    val __obj = js.Dynamic.literal()
    if (columnIndex != null) __obj.updateDynamic("columnIndex")(columnIndex.asInstanceOf[js.Any])
    if (rowIndex != null) __obj.updateDynamic("rowIndex")(rowIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[PageBreakData]
  }
}

