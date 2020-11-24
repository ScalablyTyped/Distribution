package typings.officeJsPreview.Excel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait NumberFormatCategory extends js.Object
/**
  *
  * Represents a category of number formats.
  *
  * [Api set: ExcelApi 1.12]
  */
@JSGlobal("Excel.NumberFormatCategory")
@js.native
object NumberFormatCategory extends js.Object {
  
  /**
    * Accounting formats line up the currency symbols and decimal points in a column.
    *
    */
  @js.native
  sealed trait accounting extends NumberFormatCategory
  
  /**
    * Currency formats are used for general monetary values. Use Accounting formats to align decimal points in a column.
    *
    */
  @js.native
  sealed trait currency extends NumberFormatCategory
  
  /**
    * A custom format that is not a part of any category.
    *
    */
  @js.native
  sealed trait custom extends NumberFormatCategory
  
  /**
    * Date formats display date and time serial numbers as date values.  Date formats that begin with an asterisk (*) respond to changes in regional date and time settings that are specified for the operating system. Formats without an asterisk are not affected by operating system settings.
    *
    */
  @js.native
  sealed trait date extends NumberFormatCategory
  
  /**
    * Fraction formats display the cell value as a whole number with the remainder rounded to the nearest fraction value.
    *
    */
  @js.native
  sealed trait fraction extends NumberFormatCategory
  
  /**
    * General format cells have no specific number format.
    *
    */
  @js.native
  sealed trait general extends NumberFormatCategory
  
  /**
    * Number is used for general display of numbers. Currency and Accounting offer specialized formatting for monetary value.
    *
    */
  @js.native
  sealed trait number extends NumberFormatCategory
  
  /**
    * Percentage formats multiply the cell value by 100 and displays the result with a percent symbol.
    *
    */
  @js.native
  sealed trait percentage extends NumberFormatCategory
  
  /**
    * Scientific formats display the cell value as a number between 1 and 10 multiplied by a power of 10.
    *
    */
  @js.native
  sealed trait scientific extends NumberFormatCategory
  
  /**
    * Special formats are useful for tracking list and database values.
    *
    */
  @js.native
  sealed trait special extends NumberFormatCategory
  
  /**
    * Text format cells are treated as text even when a number is in the cell. The cell is displayed exactly as entered.
    *
    */
  @js.native
  sealed trait text extends NumberFormatCategory
  
  /**
    * Time formats display date and time serial numbers as date values.  Time formats that begin with an asterisk (*) respond to changes in regional date and time settings that are specified for the operating system. Formats without an asterisk are not affected by operating system settings.
    *
    */
  @js.native
  sealed trait time extends NumberFormatCategory
}
