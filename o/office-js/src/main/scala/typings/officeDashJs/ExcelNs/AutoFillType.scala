package typings.officeDashJs.ExcelNs

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
  
  /* "FillCopy" */ val fillCopy: typings.officeDashJs.ExcelNs.AutoFillType.fillCopy with String = js.native
  /* "FillDays" */ val fillDays: typings.officeDashJs.ExcelNs.AutoFillType.fillDays with String = js.native
  /* "FillDefault" */ val fillDefault: typings.officeDashJs.ExcelNs.AutoFillType.fillDefault with String = js.native
  /* "FillFormats" */ val fillFormats: typings.officeDashJs.ExcelNs.AutoFillType.fillFormats with String = js.native
  /* "FillMonths" */ val fillMonths: typings.officeDashJs.ExcelNs.AutoFillType.fillMonths with String = js.native
  /* "FillSeries" */ val fillSeries: typings.officeDashJs.ExcelNs.AutoFillType.fillSeries with String = js.native
  /* "FillValues" */ val fillValues: typings.officeDashJs.ExcelNs.AutoFillType.fillValues with String = js.native
  /* "FillWeekdays" */ val fillWeekdays: typings.officeDashJs.ExcelNs.AutoFillType.fillWeekdays with String = js.native
  /* "FillYears" */ val fillYears: typings.officeDashJs.ExcelNs.AutoFillType.fillYears with String = js.native
  /* "FlashFill" */ val flashFill: typings.officeDashJs.ExcelNs.AutoFillType.flashFill with String = js.native
  /* "GrowthTrend" */ val growthTrend: typings.officeDashJs.ExcelNs.AutoFillType.growthTrend with String = js.native
  /* "LinearTrend" */ val linearTrend: typings.officeDashJs.ExcelNs.AutoFillType.linearTrend with String = js.native
  @JSBracketAccess
  def apply(value: String): js.UndefOr[AutoFillType with String] = js.native
}

