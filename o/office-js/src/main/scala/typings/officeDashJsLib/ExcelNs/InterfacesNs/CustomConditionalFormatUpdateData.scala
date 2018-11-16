package typings
package officeDashJsLib.ExcelNs.InterfacesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface for updating data on the CustomConditionalFormat object, for use in "customConditionalFormat.set({ ... })". */

trait CustomConditionalFormatUpdateData extends js.Object {
  /**
              *
              * Returns a format object, encapsulating the conditional formats font, fill, borders, and other properties.
              *
              * [Api set: ExcelApi 1.6]
              */
  var format: js.UndefOr[ConditionalRangeFormatUpdateData] = js.undefined
  /**
              *
              * Represents the Rule object on this conditional format.
              *
              * [Api set: ExcelApi 1.6]
              */
  var rule: js.UndefOr[ConditionalFormatRuleUpdateData] = js.undefined
}

