package typings
package officeDashJsLib.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ChartAxisScaleType extends js.Object

/**
  * [Api set: ExcelApi 1.7]
  */
@JSGlobal("Excel.ChartAxisScaleType")
@js.native
object ChartAxisScaleType extends js.Object {
  @js.native
  sealed trait linear
    extends officeDashJsLib.ExcelNs.ChartAxisScaleType
  
  @js.native
  sealed trait logarithmic
    extends officeDashJsLib.ExcelNs.ChartAxisScaleType
  
  /* "Linear" */ val linear: linear with java.lang.String = js.native
  /* "Logarithmic" */ val logarithmic: logarithmic with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[officeDashJsLib.ExcelNs.ChartAxisScaleType with java.lang.String] = js.native
}

