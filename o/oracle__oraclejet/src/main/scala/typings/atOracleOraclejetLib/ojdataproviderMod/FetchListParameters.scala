package typings
package atOracleOraclejetLib.ojdataproviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FetchListParameters[D] extends js.Object {
  var attributes: js.UndefOr[js.Array[java.lang.String | FetchAttribute]] = js.undefined
  var filterCriterion: js.UndefOr[FilterOperator[D]] = js.undefined
  var size: scala.Double
  var sortCriteria: js.UndefOr[js.Array[SortCriterion[D]]] = js.undefined
}

