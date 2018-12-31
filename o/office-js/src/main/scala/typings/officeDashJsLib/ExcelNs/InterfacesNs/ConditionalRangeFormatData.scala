package typings
package officeDashJsLib.ExcelNs.InterfacesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface describing the data returned by calling "conditionalRangeFormat.toJSON()". */
trait ConditionalRangeFormatData extends js.Object {
  /**
    *
    * Collection of border objects that apply to the overall conditional format range. Read-only.
    *
    * [Api set: ExcelApi 1.6]
    */
  var borders: js.UndefOr[js.Array[ConditionalRangeBorderData]] = js.undefined
  /**
    *
    * Returns the fill object defined on the overall conditional format range. Read-only.
    *
    * [Api set: ExcelApi 1.6]
    */
  var fill: js.UndefOr[ConditionalRangeFillData] = js.undefined
  /**
    *
    * Returns the font object defined on the overall conditional format range. Read-only.
    *
    * [Api set: ExcelApi 1.6]
    */
  var font: js.UndefOr[ConditionalRangeFontData] = js.undefined
  /**
    *
    * Represents Excel's number format code for the given range. Cleared if null is passed in.
    *
    * [Api set: ExcelApi 1.6]
    */
  var numberFormat: js.UndefOr[js.Any] = js.undefined
}

