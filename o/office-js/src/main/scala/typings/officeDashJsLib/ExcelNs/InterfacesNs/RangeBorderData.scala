package typings
package officeDashJsLib.ExcelNs.InterfacesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface describing the data returned by calling "rangeBorder.toJSON()". */

trait RangeBorderData extends js.Object {
  /**
               *
               * HTML color code representing the color of the border line, of the form #RRGGBB (e.g. "FFA500") or as a named HTML color (e.g. "orange").
               *
               * [Api set: ExcelApi 1.1]
               */
  var color: js.UndefOr[java.lang.String] = js.undefined
  /**
               *
               * Constant value that indicates the specific side of the border. See Excel.BorderIndex for details. Read-only.
               *
               * [Api set: ExcelApi 1.1]
               */
  var sideIndex: js.UndefOr[
    officeDashJsLib.ExcelNs.BorderIndex | officeDashJsLib.officeDashJsLibStrings.EdgeTop | officeDashJsLib.officeDashJsLibStrings.EdgeBottom | officeDashJsLib.officeDashJsLibStrings.EdgeLeft | officeDashJsLib.officeDashJsLibStrings.EdgeRight | officeDashJsLib.officeDashJsLibStrings.InsideVertical | officeDashJsLib.officeDashJsLibStrings.InsideHorizontal | officeDashJsLib.officeDashJsLibStrings.DiagonalDown | officeDashJsLib.officeDashJsLibStrings.DiagonalUp
  ] = js.undefined
  /**
               *
               * One of the constants of line style specifying the line style for the border. See Excel.BorderLineStyle for details.
               *
               * [Api set: ExcelApi 1.1]
               */
  var style: js.UndefOr[
    officeDashJsLib.ExcelNs.BorderLineStyle | officeDashJsLib.officeDashJsLibStrings.None | officeDashJsLib.officeDashJsLibStrings.Continuous | officeDashJsLib.officeDashJsLibStrings.Dash | officeDashJsLib.officeDashJsLibStrings.DashDot | officeDashJsLib.officeDashJsLibStrings.DashDotDot | officeDashJsLib.officeDashJsLibStrings.Dot | officeDashJsLib.officeDashJsLibStrings.Double | officeDashJsLib.officeDashJsLibStrings.SlantDashDot
  ] = js.undefined
  /**
               *
               * Specifies the weight of the border around a range. See Excel.BorderWeight for details.
               *
               * [Api set: ExcelApi 1.1]
               */
  var weight: js.UndefOr[
    officeDashJsLib.ExcelNs.BorderWeight | officeDashJsLib.officeDashJsLibStrings.Hairline | officeDashJsLib.officeDashJsLibStrings.Thin | officeDashJsLib.officeDashJsLibStrings.Medium | officeDashJsLib.officeDashJsLibStrings.Thick
  ] = js.undefined
}

