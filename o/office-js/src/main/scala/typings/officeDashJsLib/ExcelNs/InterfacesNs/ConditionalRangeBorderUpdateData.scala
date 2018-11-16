package typings
package officeDashJsLib.ExcelNs.InterfacesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface for updating data on the ConditionalRangeBorder object, for use in "conditionalRangeBorder.set({ ... })". */

trait ConditionalRangeBorderUpdateData extends js.Object {
  /**
               *
               * HTML color code representing the color of the border line, of the form #RRGGBB (e.g. "FFA500") or as a named HTML color (e.g. "orange").
               *
               * [Api set: ExcelApi 1.6]
               */
  var color: js.UndefOr[java.lang.String] = js.undefined
  /**
               *
               * One of the constants of line style specifying the line style for the border. See Excel.BorderLineStyle for details.
               *
               * [Api set: ExcelApi 1.6]
               */
  var style: js.UndefOr[
    officeDashJsLib.ExcelNs.ConditionalRangeBorderLineStyle | officeDashJsLib.officeDashJsLibStrings.None | officeDashJsLib.officeDashJsLibStrings.Continuous | officeDashJsLib.officeDashJsLibStrings.Dash | officeDashJsLib.officeDashJsLibStrings.DashDot | officeDashJsLib.officeDashJsLibStrings.DashDotDot | officeDashJsLib.officeDashJsLibStrings.Dot
  ] = js.undefined
}

