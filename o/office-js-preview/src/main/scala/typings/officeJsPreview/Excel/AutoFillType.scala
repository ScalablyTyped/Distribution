package typings.officeJsPreview.Excel

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait AutoFillType extends StObject
/**
  * The behavior types when AutoFill is used on a range in the workbook.
  *
  * @remarks
  * [Api set: ExcelApi 1.9]
  */
@JSGlobal("Excel.AutoFillType")
@js.native
object AutoFillType extends StObject {
  
  /**
    * Populates the adjacent cells with data based on the selected data.
    * @remarks
    * [Api set: ExcelApi 1.9]
    */
  @js.native
  sealed trait fillCopy
    extends StObject
       with AutoFillType
  
  /**
    * A version of "FillSeries" for dates that bases the pattern on either the day of the month or the day of the week, depending on the context.
    * @remarks
    * [Api set: ExcelApi 1.9]
    */
  @js.native
  sealed trait fillDays
    extends StObject
       with AutoFillType
  
  /**
    * Populates the adjacent cells based on the surrounding data (the standard AutoFill behavior).
    * @remarks
    * [Api set: ExcelApi 1.9]
    */
  @js.native
  sealed trait fillDefault
    extends StObject
       with AutoFillType
  
  /**
    * Populates the adjacent cells with the selected formulas.
    * @remarks
    * [Api set: ExcelApi 1.9]
    */
  @js.native
  sealed trait fillFormats
    extends StObject
       with AutoFillType
  
  /**
    * A version of "FillSeries" for dates that bases the pattern on the month.
    * @remarks
    * [Api set: ExcelApi 1.9]
    */
  @js.native
  sealed trait fillMonths
    extends StObject
       with AutoFillType
  
  /**
    * Populates the adjacent cells with data that follows a pattern in the copied cells.
    * @remarks
    * [Api set: ExcelApi 1.9]
    */
  @js.native
  sealed trait fillSeries
    extends StObject
       with AutoFillType
  
  /**
    * Populates the adjacent cells with the selected values.
    * @remarks
    * [Api set: ExcelApi 1.9]
    */
  @js.native
  sealed trait fillValues
    extends StObject
       with AutoFillType
  
  /**
    * A version of "FillSeries" for dates that bases the pattern on the day of the week and only includes weekdays.
    * @remarks
    * [Api set: ExcelApi 1.9]
    */
  @js.native
  sealed trait fillWeekdays
    extends StObject
       with AutoFillType
  
  /**
    * A version of "FillSeries" for dates that bases the pattern on the year.
    * @remarks
    * [Api set: ExcelApi 1.9]
    */
  @js.native
  sealed trait fillYears
    extends StObject
       with AutoFillType
  
  /**
    * Populates the adjacent cells by using Excel's Flash Fill feature.
    * @remarks
    * [Api set: ExcelApi 1.9]
    */
  @js.native
  sealed trait flashFill
    extends StObject
       with AutoFillType
  
  /**
    * A version of "FillSeries" for numbers that fills out the values in the adjacent cells according to a growth trend model.
    * @remarks
    * [Api set: ExcelApi 1.9]
    */
  @js.native
  sealed trait growthTrend
    extends StObject
       with AutoFillType
  
  /**
    * A version of "FillSeries" for numbers that fills out the values in the adjacent cells according to a linear trend model.
    * @remarks
    * [Api set: ExcelApi 1.9]
    */
  @js.native
  sealed trait linearTrend
    extends StObject
       with AutoFillType
}
