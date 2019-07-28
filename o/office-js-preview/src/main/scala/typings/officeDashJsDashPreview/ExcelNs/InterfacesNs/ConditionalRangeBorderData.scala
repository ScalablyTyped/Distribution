package typings.officeDashJsDashPreview.ExcelNs.InterfacesNs

import typings.officeDashJsDashPreview.ExcelNs.ConditionalRangeBorderIndex
import typings.officeDashJsDashPreview.ExcelNs.ConditionalRangeBorderLineStyle
import typings.officeDashJsDashPreview.officeDashJsDashPreviewStrings.Continuous
import typings.officeDashJsDashPreview.officeDashJsDashPreviewStrings.Dash
import typings.officeDashJsDashPreview.officeDashJsDashPreviewStrings.DashDot
import typings.officeDashJsDashPreview.officeDashJsDashPreviewStrings.DashDotDot
import typings.officeDashJsDashPreview.officeDashJsDashPreviewStrings.Dot
import typings.officeDashJsDashPreview.officeDashJsDashPreviewStrings.EdgeBottom
import typings.officeDashJsDashPreview.officeDashJsDashPreviewStrings.EdgeLeft
import typings.officeDashJsDashPreview.officeDashJsDashPreviewStrings.EdgeRight
import typings.officeDashJsDashPreview.officeDashJsDashPreviewStrings.EdgeTop
import typings.officeDashJsDashPreview.officeDashJsDashPreviewStrings.None
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface describing the data returned by calling "conditionalRangeBorder.toJSON()". */
trait ConditionalRangeBorderData extends js.Object {
  /**
    *
    * HTML color code representing the color of the border line, of the form #RRGGBB (e.g. "FFA500") or as a named HTML color (e.g. "orange").
    *
    * [Api set: ExcelApi 1.6]
    */
  var color: js.UndefOr[String] = js.undefined
  /**
    *
    * Constant value that indicates the specific side of the border. See Excel.ConditionalRangeBorderIndex for details. Read-only.
    *
    * [Api set: ExcelApi 1.6]
    */
  var sideIndex: js.UndefOr[ConditionalRangeBorderIndex | EdgeTop | EdgeBottom | EdgeLeft | EdgeRight] = js.undefined
  /**
    *
    * One of the constants of line style specifying the line style for the border. See Excel.BorderLineStyle for details.
    *
    * [Api set: ExcelApi 1.6]
    */
  var style: js.UndefOr[
    ConditionalRangeBorderLineStyle | None | Continuous | Dash | DashDot | DashDotDot | Dot
  ] = js.undefined
}

object ConditionalRangeBorderData {
  @scala.inline
  def apply(
    color: String = null,
    sideIndex: ConditionalRangeBorderIndex | EdgeTop | EdgeBottom | EdgeLeft | EdgeRight = null,
    style: ConditionalRangeBorderLineStyle | None | Continuous | Dash | DashDot | DashDotDot | Dot = null
  ): ConditionalRangeBorderData = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color)
    if (sideIndex != null) __obj.updateDynamic("sideIndex")(sideIndex.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConditionalRangeBorderData]
  }
}

