package typings
package officeDashJsDashPreviewLib.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Represents the returned format.font properties of getCell/Row/ColumnProperties or format.font input parameter of setCell/Row/ColumnProperties.
  *
  * [Api set: ExcelApi BETA (PREVIEW ONLY)]
  * @beta
  */
trait CellPropertiesFont extends js.Object {
  var bold: js.UndefOr[scala.Boolean] = js.undefined
  var color: js.UndefOr[java.lang.String] = js.undefined
  var italic: js.UndefOr[scala.Boolean] = js.undefined
  var name: js.UndefOr[java.lang.String] = js.undefined
  var size: js.UndefOr[scala.Double] = js.undefined
  var strikethrough: js.UndefOr[scala.Boolean] = js.undefined
  var subscript: js.UndefOr[scala.Boolean] = js.undefined
  var superscript: js.UndefOr[scala.Boolean] = js.undefined
  var tintAndShade: js.UndefOr[scala.Double] = js.undefined
  var underline: js.UndefOr[
    RangeUnderlineStyle | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.None | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Single | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Double | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.SingleAccountant | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.DoubleAccountant
  ] = js.undefined
}

