package typings
package officeDashJsDashPreviewLib.ExcelNs.InterfacesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface describing the data returned by calling "presetCriteriaConditionalFormat.toJSON()". */

trait PresetCriteriaConditionalFormatData extends js.Object {
  /**
              *
              * Returns a format object, encapsulating the conditional formats font, fill, borders, and other properties.
              *
              * [Api set: ExcelApi 1.6]
              */
  var format: js.UndefOr[ConditionalRangeFormatData] = js.undefined
  /**
               *
               * The rule of the conditional format.
               *
               * [Api set: ExcelApi 1.6]
               */
  var rule: js.UndefOr[officeDashJsDashPreviewLib.ExcelNs.ConditionalPresetCriteriaRule] = js.undefined
}

