package typings
package ngDashGridLib.ngGridNs.serviceNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISortService extends js.Object {
  var colSortFnCache: js.Any
  var isCustomSort: scala.Boolean
  var isSorting: scala.Boolean
  def Sort(sortInfo: ISortInfo, data: js.Any): scala.Unit
  def basicSort(a: js.Any, b: js.Any): scala.Double
  def getSortFn(col: ngDashGridLib.ngGridNs.IColumn, data: js.Any): js.Function2[/* a */ js.Any, /* b */ js.Any, scala.Double]
  def guessSortFn(item: js.Any): js.Function2[/* a */ js.Any, /* b */ js.Any, scala.Double]
  def sortAlpha(a: java.lang.String, b: java.lang.String): scala.Double
  def sortBool(a: scala.Boolean, b: scala.Boolean): scala.Double
  def sortData(sortInfo: ISortInfo, data: js.Any): scala.Unit
  def sortDate(a: stdLib.Date, b: stdLib.Date): scala.Double
  def sortNumber(a: scala.Double, b: scala.Double): scala.Double
  def sortNumberStr(a: java.lang.String, b: java.lang.String): scala.Double
}

object ISortService {
  @scala.inline
  def apply(
    Sort: js.Function2[ISortInfo, js.Any, scala.Unit],
    basicSort: js.Function2[js.Any, js.Any, scala.Double],
    colSortFnCache: js.Any,
    getSortFn: js.Function2[
      ngDashGridLib.ngGridNs.IColumn, 
      js.Any, 
      js.Function2[/* a */ js.Any, /* b */ js.Any, scala.Double]
    ],
    guessSortFn: js.Function1[js.Any, js.Function2[/* a */ js.Any, /* b */ js.Any, scala.Double]],
    isCustomSort: scala.Boolean,
    isSorting: scala.Boolean,
    sortAlpha: js.Function2[java.lang.String, java.lang.String, scala.Double],
    sortBool: js.Function2[scala.Boolean, scala.Boolean, scala.Double],
    sortData: js.Function2[ISortInfo, js.Any, scala.Unit],
    sortDate: js.Function2[stdLib.Date, stdLib.Date, scala.Double],
    sortNumber: js.Function2[scala.Double, scala.Double, scala.Double],
    sortNumberStr: js.Function2[java.lang.String, java.lang.String, scala.Double]
  ): ISortService = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("Sort")(Sort)
    __obj.updateDynamic("basicSort")(basicSort)
    __obj.updateDynamic("colSortFnCache")(colSortFnCache)
    __obj.updateDynamic("getSortFn")(getSortFn)
    __obj.updateDynamic("guessSortFn")(guessSortFn)
    __obj.updateDynamic("isCustomSort")(isCustomSort)
    __obj.updateDynamic("isSorting")(isSorting)
    __obj.updateDynamic("sortAlpha")(sortAlpha)
    __obj.updateDynamic("sortBool")(sortBool)
    __obj.updateDynamic("sortData")(sortData)
    __obj.updateDynamic("sortDate")(sortDate)
    __obj.updateDynamic("sortNumber")(sortNumber)
    __obj.updateDynamic("sortNumberStr")(sortNumberStr)
    __obj.asInstanceOf[ISortService]
  }
}

