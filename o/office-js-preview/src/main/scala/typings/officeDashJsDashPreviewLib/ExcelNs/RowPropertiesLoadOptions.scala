package typings
package officeDashJsDashPreviewLib.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents which row properties to load, when used as part of a "range.getRowProperties" method. */
trait RowPropertiesLoadOptions extends CellPropertiesLoadOptions {
  @JSName("format")
  var format_RowPropertiesLoadOptions: js.UndefOr[CellPropertiesFormatLoadOptions with officeDashJsDashPreviewLib.Anon_RowHeight] = js.undefined
  var rowHidden: js.UndefOr[scala.Boolean] = js.undefined
  var rowIndex: js.UndefOr[scala.Boolean] = js.undefined
}

