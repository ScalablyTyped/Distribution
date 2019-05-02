package typings
package officeDashJsLib.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ChartMapProjectionType extends js.Object

/**
  *
  * Represents the region projection type of a chart series layout. This only applies to region map charts.
  *
  * [Api set: ExcelApi 1.9]
  */
@JSGlobal("Excel.ChartMapProjectionType")
@js.native
object ChartMapProjectionType extends js.Object {
  @js.native
  sealed trait albers
    extends officeDashJsLib.ExcelNs.ChartMapProjectionType
  
  @js.native
  sealed trait automatic
    extends officeDashJsLib.ExcelNs.ChartMapProjectionType
  
  @js.native
  sealed trait mercator
    extends officeDashJsLib.ExcelNs.ChartMapProjectionType
  
  @js.native
  sealed trait miller
    extends officeDashJsLib.ExcelNs.ChartMapProjectionType
  
  @js.native
  sealed trait robinson
    extends officeDashJsLib.ExcelNs.ChartMapProjectionType
  
  /* "Albers" */ val albers: albers with java.lang.String = js.native
  /* "Automatic" */ val automatic: automatic with java.lang.String = js.native
  /* "Mercator" */ val mercator: mercator with java.lang.String = js.native
  /* "Miller" */ val miller: miller with java.lang.String = js.native
  /* "Robinson" */ val robinson: robinson with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[officeDashJsLib.ExcelNs.ChartMapProjectionType with java.lang.String] = js.native
}

