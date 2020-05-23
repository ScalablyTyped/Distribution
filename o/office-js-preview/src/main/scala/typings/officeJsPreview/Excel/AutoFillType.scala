package typings.officeJsPreview.Excel

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
  
}

