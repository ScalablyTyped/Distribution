package typings
package officeDashJsLib.ExcelNs.InterfacesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
         *
         * Represents the border objects that make up the range border.
         *
         * [Api set: ExcelApi 1.1]
         */

trait RangeBorderCollectionLoadOptions extends js.Object {
  @JSName("$all")
  var $all: js.UndefOr[scala.Boolean] = js.undefined
  /**
               *
               * For EACH ITEM in the collection: HTML color code representing the color of the border line, of the form #RRGGBB (e.g. "FFA500") or as a named HTML color (e.g. "orange").
               *
               * [Api set: ExcelApi 1.1]
               */
  var color: js.UndefOr[scala.Boolean] = js.undefined
  /**
               *
               * For EACH ITEM in the collection: Constant value that indicates the specific side of the border. See Excel.BorderIndex for details. Read-only.
               *
               * [Api set: ExcelApi 1.1]
               */
  var sideIndex: js.UndefOr[scala.Boolean] = js.undefined
  /**
               *
               * For EACH ITEM in the collection: One of the constants of line style specifying the line style for the border. See Excel.BorderLineStyle for details.
               *
               * [Api set: ExcelApi 1.1]
               */
  var style: js.UndefOr[scala.Boolean] = js.undefined
  /**
               *
               * For EACH ITEM in the collection: Specifies the weight of the border around a range. See Excel.BorderWeight for details.
               *
               * [Api set: ExcelApi 1.1]
               */
  var weight: js.UndefOr[scala.Boolean] = js.undefined
}

