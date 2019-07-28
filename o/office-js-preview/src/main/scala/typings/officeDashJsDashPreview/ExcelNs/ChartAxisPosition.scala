package typings.officeDashJsDashPreview.ExcelNs

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
  sealed trait automatic extends ChartAxisPosition
  
  @js.native
  sealed trait custom extends ChartAxisPosition
  
  @js.native
  sealed trait maximum extends ChartAxisPosition
  
  @js.native
  sealed trait minimum extends ChartAxisPosition
  
  /* "Automatic" */ val automatic: typings.officeDashJsDashPreview.ExcelNs.ChartAxisPosition.automatic with String = js.native
  /* "Custom" */ val custom: typings.officeDashJsDashPreview.ExcelNs.ChartAxisPosition.custom with String = js.native
  /* "Maximum" */ val maximum: typings.officeDashJsDashPreview.ExcelNs.ChartAxisPosition.maximum with String = js.native
  /* "Minimum" */ val minimum: typings.officeDashJsDashPreview.ExcelNs.ChartAxisPosition.minimum with String = js.native
  @JSBracketAccess
  def apply(value: String): js.UndefOr[ChartAxisPosition with String] = js.native
}

