package typings
package officeDashJsDashPreviewLib.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents which cell properties to load, when used as part of a "range.getCellProperties" method. */
trait CellPropertiesLoadOptions extends js.Object {
  var address: js.UndefOr[scala.Boolean] = js.undefined
  var addressLocal: js.UndefOr[scala.Boolean] = js.undefined
  var format: js.UndefOr[CellPropertiesFormatLoadOptions] = js.undefined
  var hasSpill: js.UndefOr[scala.Boolean] = js.undefined
  var hidden: js.UndefOr[scala.Boolean] = js.undefined
  var hyperlink: js.UndefOr[scala.Boolean] = js.undefined
  var style: js.UndefOr[scala.Boolean] = js.undefined
}

