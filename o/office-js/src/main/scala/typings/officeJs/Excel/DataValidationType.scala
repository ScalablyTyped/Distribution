package typings.officeJs.Excel

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait DataValidationType extends StObject
/**
  * Represents the data validation type enum.
  *
  * @remarks
  * [Api set: ExcelApi 1.8]
  */
@JSGlobal("Excel.DataValidationType")
@js.native
object DataValidationType extends StObject {
  
  /**
    * The custom data validation type.
    * @remarks
    * [Api set: ExcelApi 1.8]
    */
  @js.native
  sealed trait custom
    extends StObject
       with DataValidationType
  
  /**
    * The date data validation type.
    * @remarks
    * [Api set: ExcelApi 1.8]
    */
  @js.native
  sealed trait date
    extends StObject
       with DataValidationType
  
  /**
    * The decimal data validation type.
    * @remarks
    * [Api set: ExcelApi 1.8]
    */
  @js.native
  sealed trait decimal
    extends StObject
       with DataValidationType
  
  /**
    * Inconsistent means that the range has inconsistent data validation, indicating that there are different rules on different cells.
    * @remarks
    * [Api set: ExcelApi 1.8]
    */
  @js.native
  sealed trait inconsistent
    extends StObject
       with DataValidationType
  
  /**
    * The list data validation type.
    * @remarks
    * [Api set: ExcelApi 1.8]
    */
  @js.native
  sealed trait list
    extends StObject
       with DataValidationType
  
  /**
    * Mixed criteria means that the range has data validation present on some but not all cells.
    * @remarks
    * [Api set: ExcelApi 1.8]
    */
  @js.native
  sealed trait mixedCriteria
    extends StObject
       with DataValidationType
  
  /**
    * None means allow any value, indicating that there is no data validation in the range.
    * @remarks
    * [Api set: ExcelApi 1.8]
    */
  @js.native
  sealed trait none
    extends StObject
       with DataValidationType
  
  /**
    * The text length data validation type.
    * @remarks
    * [Api set: ExcelApi 1.8]
    */
  @js.native
  sealed trait textLength
    extends StObject
       with DataValidationType
  
  /**
    * The time data validation type.
    * @remarks
    * [Api set: ExcelApi 1.8]
    */
  @js.native
  sealed trait time
    extends StObject
       with DataValidationType
  
  /**
    * The whole number data validation type.
    * @remarks
    * [Api set: ExcelApi 1.8]
    */
  @js.native
  sealed trait wholeNumber
    extends StObject
       with DataValidationType
}
