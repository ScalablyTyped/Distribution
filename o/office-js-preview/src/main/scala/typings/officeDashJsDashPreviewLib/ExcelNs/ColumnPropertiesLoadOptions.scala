package typings
package officeDashJsDashPreviewLib.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents which column properties to load, when used as part of a "range.getColumnProperties" method. */
trait ColumnPropertiesLoadOptions extends CellPropertiesLoadOptions {
  var columnHidden: js.UndefOr[scala.Boolean] = js.undefined
  var columnIndex: js.UndefOr[scala.Boolean] = js.undefined
  @JSName("format")
  var format_ColumnPropertiesLoadOptions: js.UndefOr[CellPropertiesFormatLoadOptions with officeDashJsDashPreviewLib.Anon_ColumnWidth] = js.undefined
}

