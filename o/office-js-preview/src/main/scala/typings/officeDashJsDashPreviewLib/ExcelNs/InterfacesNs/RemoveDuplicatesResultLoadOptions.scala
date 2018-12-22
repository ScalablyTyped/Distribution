package typings
package officeDashJsDashPreviewLib.ExcelNs.InterfacesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
         *
         * Represents the results from the removeDuplicates method on range
         *
         * [Api set: ExcelApi BETA (PREVIEW ONLY)]
         * @beta
         */

trait RemoveDuplicatesResultLoadOptions extends js.Object {
  @JSName("$all")
  var $all: js.UndefOr[scala.Boolean] = js.undefined
  /**
               *
               * Number of duplicated rows removed by the operation.
               *
               * [Api set: ExcelApi BETA (PREVIEW ONLY)]
               * @beta
               */
  var removed: js.UndefOr[scala.Boolean] = js.undefined
  /**
               *
               * Number of remaining unique rows present in the resulting range.
               *
               * [Api set: ExcelApi BETA (PREVIEW ONLY)]
               * @beta
               */
  var uniqueRemaining: js.UndefOr[scala.Boolean] = js.undefined
}

