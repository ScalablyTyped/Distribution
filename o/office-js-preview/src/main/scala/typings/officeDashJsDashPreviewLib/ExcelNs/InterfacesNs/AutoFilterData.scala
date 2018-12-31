package typings
package officeDashJsDashPreviewLib.ExcelNs.InterfacesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface describing the data returned by calling "autoFilter.toJSON()". */
trait AutoFilterData extends js.Object {
  /**
    *
    * Array that holds all filter criterias in an autofiltered range. Read-Only.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var criteria: js.UndefOr[js.Array[officeDashJsDashPreviewLib.ExcelNs.FilterCriteria]] = js.undefined
  /**
    *
    * Indicates if the AutoFilter is enabled or not. Read-Only.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var enabled: js.UndefOr[scala.Boolean] = js.undefined
  /**
    *
    * Indicates if the AutoFilter has filter criteria. Read-Only.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var isDataFiltered: js.UndefOr[scala.Boolean] = js.undefined
}

