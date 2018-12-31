package typings
package officeDashJsDashPreviewLib.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ChartAxisType extends js.Object

/**
  * [Api set: ExcelApi 1.7]
  */
@JSGlobal("Excel.ChartAxisType")
@js.native
object ChartAxisType extends js.Object {
  /**
    *
    * Axis displays categories.
    *
    */
  @js.native
  sealed trait category
    extends officeDashJsDashPreviewLib.ExcelNs.ChartAxisType
  
  @js.native
  sealed trait invalid
    extends officeDashJsDashPreviewLib.ExcelNs.ChartAxisType
  
  /**
    *
    * Axis displays data series.
    *
    */
  @js.native
  sealed trait series
    extends officeDashJsDashPreviewLib.ExcelNs.ChartAxisType
  
  /**
    *
    * Axis displays values.
    *
    */
  @js.native
  sealed trait value
    extends officeDashJsDashPreviewLib.ExcelNs.ChartAxisType
  
  /* "Category" */ val category: category with java.lang.String = js.native
  /* "Invalid" */ val invalid: invalid with java.lang.String = js.native
  /* "Series" */ val series: series with java.lang.String = js.native
  /* "Value" */ val value: value with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[officeDashJsDashPreviewLib.ExcelNs.ChartAxisType with java.lang.String] = js.native
}

