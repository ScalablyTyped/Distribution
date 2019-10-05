package typings.officeDashJs.Excel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait AutoFillType extends js.Object

/**
  * [Api set: ExcelApi 1.9]
  */
@JSGlobal("Excel.AutoFillType")
@js.native
object AutoFillType extends js.Object {
  @js.native
  sealed trait fillCopy extends AutoFillType
  
  @js.native
  sealed trait fillDays extends AutoFillType
  
  @js.native
  sealed trait fillDefault extends AutoFillType
  
  @js.native
  sealed trait fillFormats extends AutoFillType
  
  @js.native
  sealed trait fillMonths extends AutoFillType
  
  @js.native
  sealed trait fillSeries extends AutoFillType
  
  @js.native
  sealed trait fillValues extends AutoFillType
  
  @js.native
  sealed trait fillWeekdays extends AutoFillType
  
  @js.native
  sealed trait fillYears extends AutoFillType
  
  @js.native
  sealed trait flashFill extends AutoFillType
  
  @js.native
  sealed trait growthTrend extends AutoFillType
  
  @js.native
  sealed trait linearTrend extends AutoFillType
  
  /* "FillCopy" */ val fillCopy: typings.officeDashJs.Excel.AutoFillType.fillCopy with String = js.native
  /* "FillDays" */ val fillDays: typings.officeDashJs.Excel.AutoFillType.fillDays with String = js.native
  /* "FillDefault" */ val fillDefault: typings.officeDashJs.Excel.AutoFillType.fillDefault with String = js.native
  /* "FillFormats" */ val fillFormats: typings.officeDashJs.Excel.AutoFillType.fillFormats with String = js.native
  /* "FillMonths" */ val fillMonths: typings.officeDashJs.Excel.AutoFillType.fillMonths with String = js.native
  /* "FillSeries" */ val fillSeries: typings.officeDashJs.Excel.AutoFillType.fillSeries with String = js.native
  /* "FillValues" */ val fillValues: typings.officeDashJs.Excel.AutoFillType.fillValues with String = js.native
  /* "FillWeekdays" */ val fillWeekdays: typings.officeDashJs.Excel.AutoFillType.fillWeekdays with String = js.native
  /* "FillYears" */ val fillYears: typings.officeDashJs.Excel.AutoFillType.fillYears with String = js.native
  /* "FlashFill" */ val flashFill: typings.officeDashJs.Excel.AutoFillType.flashFill with String = js.native
  /* "GrowthTrend" */ val growthTrend: typings.officeDashJs.Excel.AutoFillType.growthTrend with String = js.native
  /* "LinearTrend" */ val linearTrend: typings.officeDashJs.Excel.AutoFillType.linearTrend with String = js.native
  @JSBracketAccess
  def apply(value: String): js.UndefOr[AutoFillType with String] = js.native
}

