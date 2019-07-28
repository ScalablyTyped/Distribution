package typings.ngDashGrid.ngGridNs.serviceNs

import typings.ngDashGrid.ngGridNs.IColumn
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISortService extends js.Object {
  var colSortFnCache: js.Any
  var isCustomSort: Boolean
  var isSorting: Boolean
  def Sort(sortInfo: ISortInfo, data: js.Any): Unit
  def basicSort(a: js.Any, b: js.Any): Double
  def getSortFn(col: IColumn, data: js.Any): js.Function2[/* a */ js.Any, /* b */ js.Any, Double]
  def guessSortFn(item: js.Any): js.Function2[/* a */ js.Any, /* b */ js.Any, Double]
  def sortAlpha(a: String, b: String): Double
  def sortBool(a: Boolean, b: Boolean): Double
  def sortData(sortInfo: ISortInfo, data: js.Any): Unit
  def sortDate(a: Date, b: Date): Double
  def sortNumber(a: Double, b: Double): Double
  def sortNumberStr(a: String, b: String): Double
}

object ISortService {
  @scala.inline
  def apply(
    Sort: (ISortInfo, js.Any) => Unit,
    basicSort: (js.Any, js.Any) => Double,
    colSortFnCache: js.Any,
    getSortFn: (IColumn, js.Any) => js.Function2[/* a */ js.Any, /* b */ js.Any, Double],
    guessSortFn: js.Any => js.Function2[/* a */ js.Any, /* b */ js.Any, Double],
    isCustomSort: Boolean,
    isSorting: Boolean,
    sortAlpha: (String, String) => Double,
    sortBool: (Boolean, Boolean) => Double,
    sortData: (ISortInfo, js.Any) => Unit,
    sortDate: (Date, Date) => Double,
    sortNumber: (Double, Double) => Double,
    sortNumberStr: (String, String) => Double
  ): ISortService = {
    val __obj = js.Dynamic.literal(Sort = js.Any.fromFunction2(Sort), basicSort = js.Any.fromFunction2(basicSort), colSortFnCache = colSortFnCache, getSortFn = js.Any.fromFunction2(getSortFn), guessSortFn = js.Any.fromFunction1(guessSortFn), isCustomSort = isCustomSort, isSorting = isSorting, sortAlpha = js.Any.fromFunction2(sortAlpha), sortBool = js.Any.fromFunction2(sortBool), sortData = js.Any.fromFunction2(sortData), sortDate = js.Any.fromFunction2(sortDate), sortNumber = js.Any.fromFunction2(sortNumber), sortNumberStr = js.Any.fromFunction2(sortNumberStr))
  
    __obj.asInstanceOf[ISortService]
  }
}

