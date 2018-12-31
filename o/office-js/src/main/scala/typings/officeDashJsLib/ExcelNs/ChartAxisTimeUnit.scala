package typings
package officeDashJsLib.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ChartAxisTimeUnit extends js.Object

/**
  *
  * Specifies the unit of time for chart axes and data series.
  *
  * [Api set: ExcelApi 1.7]
  */
@JSGlobal("Excel.ChartAxisTimeUnit")
@js.native
object ChartAxisTimeUnit extends js.Object {
  @js.native
  sealed trait days
    extends officeDashJsLib.ExcelNs.ChartAxisTimeUnit
  
  @js.native
  sealed trait months
    extends officeDashJsLib.ExcelNs.ChartAxisTimeUnit
  
  @js.native
  sealed trait years
    extends officeDashJsLib.ExcelNs.ChartAxisTimeUnit
  
  /* "Days" */ val days: days with java.lang.String = js.native
  /* "Months" */ val months: months with java.lang.String = js.native
  /* "Years" */ val years: years with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[officeDashJsLib.ExcelNs.ChartAxisTimeUnit with java.lang.String] = js.native
}

