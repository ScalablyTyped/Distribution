package typings.officeDashJsDashPreview.Excel

import org.scalablytyped.runtime.TopLevel
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
  sealed trait days extends ChartAxisTimeUnit
  
  @js.native
  sealed trait months extends ChartAxisTimeUnit
  
  @js.native
  sealed trait years extends ChartAxisTimeUnit
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[ChartAxisTimeUnit with String] = js.native
  /* "Days" */ @js.native
  object days extends TopLevel[days with String]
  
  /* "Months" */ @js.native
  object months extends TopLevel[months with String]
  
  /* "Years" */ @js.native
  object years extends TopLevel[years with String]
  
}

