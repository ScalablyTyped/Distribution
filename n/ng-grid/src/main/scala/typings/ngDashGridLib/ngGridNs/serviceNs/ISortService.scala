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
    Sort: (ISortInfo, js.Any) => scala.Unit,
    basicSort: (js.Any, js.Any) => scala.Double,
    colSortFnCache: js.Any,
    getSortFn: (ngDashGridLib.ngGridNs.IColumn, js.Any) => js.Function2[/* a */ js.Any, /* b */ js.Any, scala.Double],
    guessSortFn: js.Any => js.Function2[/* a */ js.Any, /* b */ js.Any, scala.Double],
    isCustomSort: scala.Boolean,
    isSorting: scala.Boolean,
    sortAlpha: (java.lang.String, java.lang.String) => scala.Double,
    sortBool: (scala.Boolean, scala.Boolean) => scala.Double,
    sortData: (ISortInfo, js.Any) => scala.Unit,
    sortDate: (stdLib.Date, stdLib.Date) => scala.Double,
    sortNumber: (scala.Double, scala.Double) => scala.Double,
    sortNumberStr: (java.lang.String, java.lang.String) => scala.Double
  ): ISortService = {
    val __obj = js.Dynamic.literal(Sort = js.Any.fromFunction2(Sort), basicSort = js.Any.fromFunction2(basicSort), colSortFnCache = colSortFnCache, getSortFn = js.Any.fromFunction2(getSortFn), guessSortFn = js.Any.fromFunction1(guessSortFn), isCustomSort = isCustomSort, isSorting = isSorting, sortAlpha = js.Any.fromFunction2(sortAlpha), sortBool = js.Any.fromFunction2(sortBool), sortData = js.Any.fromFunction2(sortData), sortDate = js.Any.fromFunction2(sortDate), sortNumber = js.Any.fromFunction2(sortNumber), sortNumberStr = js.Any.fromFunction2(sortNumberStr))
  
    __obj.asInstanceOf[ISortService]
  }
}

