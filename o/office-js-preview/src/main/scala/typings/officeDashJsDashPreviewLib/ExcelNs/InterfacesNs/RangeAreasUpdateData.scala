package typings
package officeDashJsDashPreviewLib.ExcelNs.InterfacesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface for updating data on the RangeAreas object, for use in "rangeAreas.set({ ... })". */

trait RangeAreasUpdateData extends js.Object {
  /**
              *
              * Returns a dataValidation object for all ranges in the RangeAreas.
              *
              * [Api set: ExcelApi BETA (PREVIEW ONLY)]
              * @beta
              */
  var dataValidation: js.UndefOr[DataValidationUpdateData] = js.undefined
  /**
              *
              * Returns a rangeFormat object, encapsulating the the font, fill, borders, alignment, and other properties for all ranges in the RangeAreas object.
              *
              * [Api set: ExcelApi BETA (PREVIEW ONLY)]
              * @beta
              */
  var format: js.UndefOr[RangeFormatUpdateData] = js.undefined
  /**
               *
               * Represents the style for all ranges in this RangeAreas object.
              If the styles of the cells are inconsistent, null will be returned.
              For custom styles, the style name will be returned. For built-in styles, a string representing a value in the BuiltInStyle enum will be returned.
               *
               * [Api set: ExcelApi BETA (PREVIEW ONLY)]
               * @beta
               */
  var style: js.UndefOr[java.lang.String] = js.undefined
}

