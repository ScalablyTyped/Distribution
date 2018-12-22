package typings
package officeDashJsDashPreviewLib.ExcelNs.InterfacesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
         *
         * Represents the border of an object.
         *
         * [Api set: ExcelApi 1.1]
         */

trait RangeBorderLoadOptions extends js.Object {
  @JSName("$all")
  var $all: js.UndefOr[scala.Boolean] = js.undefined
  /**
               *
               * HTML color code representing the color of the border line, of the form #RRGGBB (e.g. "FFA500") or as a named HTML color (e.g. "orange").
               *
               * [Api set: ExcelApi 1.1]
               */
  var color: js.UndefOr[scala.Boolean] = js.undefined
  /**
               *
               * Constant value that indicates the specific side of the border. See Excel.BorderIndex for details. Read-only.
               *
               * [Api set: ExcelApi 1.1]
               */
  var sideIndex: js.UndefOr[scala.Boolean] = js.undefined
  /**
               *
               * One of the constants of line style specifying the line style for the border. See Excel.BorderLineStyle for details.
               *
               * [Api set: ExcelApi 1.1]
               */
  var style: js.UndefOr[scala.Boolean] = js.undefined
  /**
               *
               * Returns or sets a double that lightens or darkens a color for Range Border, the value is between -1 (darkest) and 1 (brightest), with 0 for the original color.
              A null value indicates that the border doesn't have uniform tintAndShade setting.
               *
               * [Api set: ExcelApi BETA (PREVIEW ONLY)]
               * @beta
               */
  var tintAndShade: js.UndefOr[scala.Boolean] = js.undefined
  /**
               *
               * Specifies the weight of the border around a range. See Excel.BorderWeight for details.
               *
               * [Api set: ExcelApi 1.1]
               */
  var weight: js.UndefOr[scala.Boolean] = js.undefined
}

