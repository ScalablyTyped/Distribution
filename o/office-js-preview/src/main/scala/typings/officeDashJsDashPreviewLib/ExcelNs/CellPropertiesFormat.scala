package typings
package officeDashJsDashPreviewLib.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents the returned format properties of getCellProperties or format input parameter of setCellProperties. */
trait CellPropertiesFormat extends js.Object {
  var autoIndent: js.UndefOr[scala.Boolean] = js.undefined
  var borders: js.UndefOr[CellBorderCollection] = js.undefined
  var fill: js.UndefOr[CellPropertiesFill] = js.undefined
  var font: js.UndefOr[CellPropertiesFont] = js.undefined
  var horizontalAlignment: js.UndefOr[
    HorizontalAlignment | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.General | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Left | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Center | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Right | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Fill | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Justify | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.CenterAcrossSelection | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Distributed
  ] = js.undefined
  var indentLevel: js.UndefOr[scala.Double] = js.undefined
  var protection: js.UndefOr[CellPropertiesProtection] = js.undefined
  var readingOrder: js.UndefOr[
    ReadingOrder | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Context | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.LeftToRight | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.RightToLeft
  ] = js.undefined
  var shrinkToFit: js.UndefOr[scala.Boolean] = js.undefined
  var textOrientation: js.UndefOr[scala.Double] = js.undefined
  var useStandardHeight: js.UndefOr[scala.Boolean] = js.undefined
  var useStandardWidth: js.UndefOr[scala.Boolean] = js.undefined
  var verticalAlignment: js.UndefOr[
    VerticalAlignment | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Top | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Center | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Bottom | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Justify | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Distributed
  ] = js.undefined
  var wrapText: js.UndefOr[scala.Boolean] = js.undefined
}

