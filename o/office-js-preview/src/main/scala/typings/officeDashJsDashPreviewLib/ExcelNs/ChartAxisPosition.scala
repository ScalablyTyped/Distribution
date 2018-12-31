package typings
package officeDashJsDashPreviewLib.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ChartAxisPosition extends js.Object

/**
  * [Api set: ExcelApi 1.7]
  */
@JSGlobal("Excel.ChartAxisPosition")
@js.native
object ChartAxisPosition extends js.Object {
  @js.native
  sealed trait automatic
    extends officeDashJsDashPreviewLib.ExcelNs.ChartAxisPosition
  
  @js.native
  sealed trait custom
    extends officeDashJsDashPreviewLib.ExcelNs.ChartAxisPosition
  
  @js.native
  sealed trait maximum
    extends officeDashJsDashPreviewLib.ExcelNs.ChartAxisPosition
  
  @js.native
  sealed trait minimum
    extends officeDashJsDashPreviewLib.ExcelNs.ChartAxisPosition
  
  /* "Automatic" */ val automatic: automatic with java.lang.String = js.native
  /* "Custom" */ val custom: custom with java.lang.String = js.native
  /* "Maximum" */ val maximum: maximum with java.lang.String = js.native
  /* "Minimum" */ val minimum: minimum with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[officeDashJsDashPreviewLib.ExcelNs.ChartAxisPosition with java.lang.String] = js.native
}

