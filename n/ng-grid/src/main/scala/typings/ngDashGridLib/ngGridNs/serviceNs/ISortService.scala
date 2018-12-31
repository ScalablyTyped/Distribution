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

