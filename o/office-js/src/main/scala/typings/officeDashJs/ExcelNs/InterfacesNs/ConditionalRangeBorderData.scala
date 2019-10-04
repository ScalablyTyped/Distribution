package typings.officeDashJs.ExcelNs.InterfacesNs

import typings.officeDashJs.ExcelNs.ConditionalRangeBorderIndex
import typings.officeDashJs.ExcelNs.ConditionalRangeBorderLineStyle
import typings.officeDashJs.officeDashJsStrings.Continuous
import typings.officeDashJs.officeDashJsStrings.Dash
import typings.officeDashJs.officeDashJsStrings.DashDot
import typings.officeDashJs.officeDashJsStrings.DashDotDot
import typings.officeDashJs.officeDashJsStrings.Dot
import typings.officeDashJs.officeDashJsStrings.EdgeBottom
import typings.officeDashJs.officeDashJsStrings.EdgeLeft
import typings.officeDashJs.officeDashJsStrings.EdgeRight
import typings.officeDashJs.officeDashJsStrings.EdgeTop
import typings.officeDashJs.officeDashJsStrings.None
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface describing the data returned by calling `conditionalRangeBorder.toJSON()`. */
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

