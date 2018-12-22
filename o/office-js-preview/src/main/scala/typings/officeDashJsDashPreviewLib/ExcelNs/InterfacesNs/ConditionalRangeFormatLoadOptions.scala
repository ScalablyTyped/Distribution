package typings
package officeDashJsDashPreviewLib.ExcelNs.InterfacesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
         *
         * A format object encapsulating the conditional formats range's font, fill, borders, and other properties.
         *
         * [Api set: ExcelApi 1.6]
         */

trait ConditionalRangeFormatLoadOptions extends js.Object {
  @JSName("$all")
  var $all: js.UndefOr[scala.Boolean] = js.undefined
  /**
              *
              * Collection of border objects that apply to the overall conditional format range.
              *
              * [Api set: ExcelApi 1.6]
              */
  var borders: js.UndefOr[ConditionalRangeBorderCollectionLoadOptions] = js.undefined
  /**
              *
              * Returns the fill object defined on the overall conditional format range.
              *
              * [Api set: ExcelApi 1.6]
              */
  var fill: js.UndefOr[ConditionalRangeFillLoadOptions] = js.undefined
  /**
              *
              * Returns the font object defined on the overall conditional format range.
              *
              * [Api set: ExcelApi 1.6]
              */
  var font: js.UndefOr[ConditionalRangeFontLoadOptions] = js.undefined
  /**
               *
               * Represents Excel's number format code for the given range. Cleared if null is passed in.
               *
               * [Api set: ExcelApi 1.6]
               */
  var numberFormat: js.UndefOr[scala.Boolean] = js.undefined
}

