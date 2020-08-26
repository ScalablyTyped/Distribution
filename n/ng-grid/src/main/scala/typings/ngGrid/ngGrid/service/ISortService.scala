package typings.ngGrid.ngGrid.service

import typings.ngGrid.ngGrid.IColumn
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ISortService extends js.Object {
  var colSortFnCache: js.Any = js.native
  var isCustomSort: Boolean = js.native
  var isSorting: Boolean = js.native
  def Sort(sortInfo: ISortInfo, data: js.Any): Unit = js.native
  def basicSort(a: js.Any, b: js.Any): Double = js.native
  def getSortFn(col: IColumn, data: js.Any): js.Function2[/* a */ js.Any, /* b */ js.Any, Double] = js.native
  def guessSortFn(item: js.Any): js.Function2[/* a */ js.Any, /* b */ js.Any, Double] = js.native
  def sortAlpha(a: String, b: String): Double = js.native
  def sortBool(a: Boolean, b: Boolean): Double = js.native
  def sortData(sortInfo: ISortInfo, data: js.Any): Unit = js.native
  def sortDate(a: Date, b: Date): Double = js.native
  def sortNumber(a: Double, b: Double): Double = js.native
  def sortNumberStr(a: String, b: String): Double = js.native
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
    val __obj = js.Dynamic.literal(Sort = js.Any.fromFunction2(Sort), basicSort = js.Any.fromFunction2(basicSort), colSortFnCache = colSortFnCache.asInstanceOf[js.Any], getSortFn = js.Any.fromFunction2(getSortFn), guessSortFn = js.Any.fromFunction1(guessSortFn), isCustomSort = isCustomSort.asInstanceOf[js.Any], isSorting = isSorting.asInstanceOf[js.Any], sortAlpha = js.Any.fromFunction2(sortAlpha), sortBool = js.Any.fromFunction2(sortBool), sortData = js.Any.fromFunction2(sortData), sortDate = js.Any.fromFunction2(sortDate), sortNumber = js.Any.fromFunction2(sortNumber), sortNumberStr = js.Any.fromFunction2(sortNumberStr))
    __obj.asInstanceOf[ISortService]
  }
  @scala.inline
  implicit class ISortServiceOps[Self <: ISortService] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setSort(value: (ISortInfo, js.Any) => Unit): Self = this.set("Sort", js.Any.fromFunction2(value))
    @scala.inline
    def setBasicSort(value: (js.Any, js.Any) => Double): Self = this.set("basicSort", js.Any.fromFunction2(value))
    @scala.inline
    def setColSortFnCache(value: js.Any): Self = this.set("colSortFnCache", value.asInstanceOf[js.Any])
    @scala.inline
    def setGetSortFn(value: (IColumn, js.Any) => js.Function2[/* a */ js.Any, /* b */ js.Any, Double]): Self = this.set("getSortFn", js.Any.fromFunction2(value))
    @scala.inline
    def setGuessSortFn(value: js.Any => js.Function2[/* a */ js.Any, /* b */ js.Any, Double]): Self = this.set("guessSortFn", js.Any.fromFunction1(value))
    @scala.inline
    def setIsCustomSort(value: Boolean): Self = this.set("isCustomSort", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsSorting(value: Boolean): Self = this.set("isSorting", value.asInstanceOf[js.Any])
    @scala.inline
    def setSortAlpha(value: (String, String) => Double): Self = this.set("sortAlpha", js.Any.fromFunction2(value))
    @scala.inline
    def setSortBool(value: (Boolean, Boolean) => Double): Self = this.set("sortBool", js.Any.fromFunction2(value))
    @scala.inline
    def setSortData(value: (ISortInfo, js.Any) => Unit): Self = this.set("sortData", js.Any.fromFunction2(value))
    @scala.inline
    def setSortDate(value: (Date, Date) => Double): Self = this.set("sortDate", js.Any.fromFunction2(value))
    @scala.inline
    def setSortNumber(value: (Double, Double) => Double): Self = this.set("sortNumber", js.Any.fromFunction2(value))
    @scala.inline
    def setSortNumberStr(value: (String, String) => Double): Self = this.set("sortNumberStr", js.Any.fromFunction2(value))
  }
  
}

