package typings.officeJs.Excel

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait NumberFormatCategory extends StObject
/**
  * Represents a category of number formats.
  *
  * @remarks
  * [Api set: ExcelApi 1.12]
  */
@JSGlobal("Excel.NumberFormatCategory")
@js.native
object NumberFormatCategory extends StObject {
  
  /**
    * Accounting formats line up the currency symbols and decimal points in a column.
    * @remarks
    * [Api set: ExcelApi 1.12]
    */
  @js.native
  sealed trait accounting
    extends StObject
       with NumberFormatCategory
  
  /**
    * Currency formats are used for general monetary values. Use Accounting formats to align decimal points in a column.
    * @remarks
    * [Api set: ExcelApi 1.12]
    */
  @js.native
  sealed trait currency
    extends StObject
       with NumberFormatCategory
  
  /**
    * A custom format that is not a part of any category.
    * @remarks
    * [Api set: ExcelApi 1.12]
    */
  @js.native
  sealed trait custom
    extends StObject
       with NumberFormatCategory
  
  /**
    * Date formats display date and time serial numbers as date values. Date formats that begin with an asterisk (*) respond to changes in regional date and time settings that are specified for the operating system. Formats without an asterisk are not affected by operating system settings.
    * @remarks
    * [Api set: ExcelApi 1.12]
    */
  @js.native
  sealed trait date
    extends StObject
       with NumberFormatCategory
  
  /**
    * Fraction formats display the cell value as a whole number with the remainder rounded to the nearest fraction value.
    * @remarks
    * [Api set: ExcelApi 1.12]
    */
  @js.native
  sealed trait fraction
    extends StObject
       with NumberFormatCategory
  
  /**
    * General format cells have no specific number format.
    * @remarks
    * [Api set: ExcelApi 1.12]
    */
  @js.native
  sealed trait general
    extends StObject
       with NumberFormatCategory
  
  /**
    * Number is used for general display of numbers. Currency and Accounting offer specialized formatting for monetary value.
    * @remarks
    * [Api set: ExcelApi 1.12]
    */
  @js.native
  sealed trait number
    extends StObject
       with NumberFormatCategory
  
  /**
    * Percentage formats multiply the cell value by 100 and displays the result with a percent symbol.
    * @remarks
    * [Api set: ExcelApi 1.12]
    */
  @js.native
  sealed trait percentage
    extends StObject
       with NumberFormatCategory
  
  /**
    * Scientific formats display the cell value as a number between 1 and 10 multiplied by a power of 10.
    * @remarks
    * [Api set: ExcelApi 1.12]
    */
  @js.native
  sealed trait scientific
    extends StObject
       with NumberFormatCategory
  
  /**
    * Special formats are useful for tracking list and database values.
    * @remarks
    * [Api set: ExcelApi 1.12]
    */
  @js.native
  sealed trait special
    extends StObject
       with NumberFormatCategory
  
  /**
    * Text format cells are treated as text even when a number is in the cell. The cell is displayed exactly as entered.
    * @remarks
    * [Api set: ExcelApi 1.12]
    */
  @js.native
  sealed trait text
    extends StObject
       with NumberFormatCategory
  
  /**
    * Time formats display date and time serial numbers as date values. Time formats that begin with an asterisk (*) respond to changes in regional date and time settings that are specified for the operating system. Formats without an asterisk are not affected by operating system settings.
    * @remarks
    * [Api set: ExcelApi 1.12]
    */
  @js.native
  sealed trait time
    extends StObject
       with NumberFormatCategory
}
