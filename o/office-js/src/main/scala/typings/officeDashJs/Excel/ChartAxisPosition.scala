package typings.officeDashJs.Excel

import org.scalablytyped.runtime.TopLevel
import typings.officeDashJs.Excel.ChartAxisPosition.automatic
import typings.officeDashJs.Excel.ChartAxisPosition.custom
import typings.officeDashJs.Excel.ChartAxisPosition.maximum
import typings.officeDashJs.Excel.ChartAxisPosition.minimum
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
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[ChartAxisPosition with String] = js.native
  /* "Automatic" */ @js.native
  object automatic extends TopLevel[automatic with String]
  
  /* "Custom" */ @js.native
  object custom extends TopLevel[custom with String]
  
  /* "Maximum" */ @js.native
  object maximum extends TopLevel[maximum with String]
  
  /* "Minimum" */ @js.native
  object minimum extends TopLevel[minimum with String]
  
}

