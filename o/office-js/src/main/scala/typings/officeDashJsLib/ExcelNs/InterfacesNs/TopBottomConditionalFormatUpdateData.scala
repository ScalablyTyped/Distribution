package typings
package officeDashJsLib.ExcelNs.InterfacesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface for updating data on the TopBottomConditionalFormat object, for use in "topBottomConditionalFormat.set({ ... })". */

trait TopBottomConditionalFormatUpdateData extends js.Object {
  /**
              *
              * Returns a format object, encapsulating the conditional formats font, fill, borders, and other properties.
              *
              * [Api set: ExcelApi 1.6]
              */
  var format: js.UndefOr[ConditionalRangeFormatUpdateData] = js.undefined
  /**
               *
               * The criteria of the Top/Bottom conditional format.
               *
               * [Api set: ExcelApi 1.6]
               */
  var rule: js.UndefOr[officeDashJsLib.ExcelNs.ConditionalTopBottomRule] = js.undefined
}

