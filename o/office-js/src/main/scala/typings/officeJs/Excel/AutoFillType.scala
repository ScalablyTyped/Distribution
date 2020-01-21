package typings.officeJs.Excel

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[AutoFillType with String] = js.native
  /* "FillCopy" */ @js.native
  object fillCopy extends TopLevel[fillCopy with String]
  
  /* "FillDays" */ @js.native
  object fillDays extends TopLevel[fillDays with String]
  
  /* "FillDefault" */ @js.native
  object fillDefault extends TopLevel[fillDefault with String]
  
  /* "FillFormats" */ @js.native
  object fillFormats extends TopLevel[fillFormats with String]
  
  /* "FillMonths" */ @js.native
  object fillMonths extends TopLevel[fillMonths with String]
  
  /* "FillSeries" */ @js.native
  object fillSeries extends TopLevel[fillSeries with String]
  
  /* "FillValues" */ @js.native
  object fillValues extends TopLevel[fillValues with String]
  
  /* "FillWeekdays" */ @js.native
  object fillWeekdays extends TopLevel[fillWeekdays with String]
  
  /* "FillYears" */ @js.native
  object fillYears extends TopLevel[fillYears with String]
  
  /* "FlashFill" */ @js.native
  object flashFill extends TopLevel[flashFill with String]
  
  /* "GrowthTrend" */ @js.native
  object growthTrend extends TopLevel[growthTrend with String]
  
  /* "LinearTrend" */ @js.native
  object linearTrend extends TopLevel[linearTrend with String]
  
}

