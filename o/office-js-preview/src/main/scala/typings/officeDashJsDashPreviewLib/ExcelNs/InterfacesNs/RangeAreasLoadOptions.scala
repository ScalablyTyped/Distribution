package typings
package officeDashJsDashPreviewLib.ExcelNs.InterfacesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
         *
         * RangeAreas represents a collection of one or more rectangular ranges in the same worksheet.
         *
         * [Api set: ExcelApi BETA (PREVIEW ONLY)]
         * @beta
         */

trait RangeAreasLoadOptions extends js.Object {
  @JSName("$all")
  var $all: js.UndefOr[scala.Boolean] = js.undefined
  /**
               *
               * Returns the RageAreas reference in A1-style. Address value will contain the worksheet name for each rectangular block of cells (e.g. "Sheet1!A1:B4, Sheet1!D1:D4"). Read-only.
               *
               * [Api set: ExcelApi BETA (PREVIEW ONLY)]
               * @beta
               */
  var address: js.UndefOr[scala.Boolean] = js.undefined
  /**
               *
               * Returns the RageAreas reference in the user locale. Read-only.
               *
               * [Api set: ExcelApi BETA (PREVIEW ONLY)]
               * @beta
               */
  var addressLocal: js.UndefOr[scala.Boolean] = js.undefined
  /**
               *
               * Returns the number of rectangular ranges that comprise this RangeAreas object.
               *
               * [Api set: ExcelApi BETA (PREVIEW ONLY)]
               * @beta
               */
  var areaCount: js.UndefOr[scala.Boolean] = js.undefined
  /**
               *
               * Returns the number of cells in the RangeAreas object, summing up the cell counts of all of the individual rectangular ranges. Returns -1 if the cell count exceeds 2^31-1 (2,147,483,647). Read-only.
               *
               * [Api set: ExcelApi BETA (PREVIEW ONLY)]
               * @beta
               */
  var cellCount: js.UndefOr[scala.Boolean] = js.undefined
  /**
              *
              * Returns a dataValidation object for all ranges in the RangeAreas.
              *
              * [Api set: ExcelApi BETA (PREVIEW ONLY)]
              * @beta
              */
  var dataValidation: js.UndefOr[DataValidationLoadOptions] = js.undefined
  /**
              *
              * Returns a rangeFormat object, encapsulating the the font, fill, borders, alignment, and other properties for all ranges in the RangeAreas object.
              *
              * [Api set: ExcelApi BETA (PREVIEW ONLY)]
              * @beta
              */
  var format: js.UndefOr[RangeFormatLoadOptions] = js.undefined
  /**
               *
               * Indicates whether all the ranges on this RangeAreas object represent entire columns (e.g., "A:C, Q:Z"). Read-only.
               *
               * [Api set: ExcelApi BETA (PREVIEW ONLY)]
               * @beta
               */
  var isEntireColumn: js.UndefOr[scala.Boolean] = js.undefined
  /**
               *
               * Indicates whether all the ranges on this RangeAreas object represent entire rows (e.g., "1:3, 5:7"). Read-only.
               *
               * [Api set: ExcelApi BETA (PREVIEW ONLY)]
               * @beta
               */
  var isEntireRow: js.UndefOr[scala.Boolean] = js.undefined
  /**
               *
               * Represents the style for all ranges in this RangeAreas object.
              If the styles of the cells are inconsistent, null will be returned.
              For custom styles, the style name will be returned. For built-in styles, a string representing a value in the BuiltInStyle enum will be returned.
               *
               * [Api set: ExcelApi BETA (PREVIEW ONLY)]
               * @beta
               */
  var style: js.UndefOr[scala.Boolean] = js.undefined
  /**
              *
              * Returns the worksheet for the current RangeAreas.
              *
              * [Api set: ExcelApi BETA (PREVIEW ONLY)]
              * @beta
              */
  var worksheet: js.UndefOr[WorksheetLoadOptions] = js.undefined
}

