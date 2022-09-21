package typings.officeJs.Excel

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait DataValidationOperator extends StObject
/**
  * Represents the data validation operator enum.
  *
  * @remarks
  * [Api set: ExcelApi 1.8]
  */
@JSGlobal("Excel.DataValidationOperator")
@js.native
object DataValidationOperator extends StObject {
  
  /**
    * @remarks
    * [Api set: ExcelApi 1.8]
    */
  @js.native
  sealed trait between
    extends StObject
       with DataValidationOperator
  
  /**
    * @remarks
    * [Api set: ExcelApi 1.8]
    */
  @js.native
  sealed trait equalTo
    extends StObject
       with DataValidationOperator
  
  /**
    * @remarks
    * [Api set: ExcelApi 1.8]
    */
  @js.native
  sealed trait greaterThan
    extends StObject
       with DataValidationOperator
  
  /**
    * @remarks
    * [Api set: ExcelApi 1.8]
    */
  @js.native
  sealed trait greaterThanOrEqualTo
    extends StObject
       with DataValidationOperator
  
  /**
    * @remarks
    * [Api set: ExcelApi 1.8]
    */
  @js.native
  sealed trait lessThan
    extends StObject
       with DataValidationOperator
  
  /**
    * @remarks
    * [Api set: ExcelApi 1.8]
    */
  @js.native
  sealed trait lessThanOrEqualTo
    extends StObject
       with DataValidationOperator
  
  /**
    * @remarks
    * [Api set: ExcelApi 1.8]
    */
  @js.native
  sealed trait notBetween
    extends StObject
       with DataValidationOperator
  
  /**
    * @remarks
    * [Api set: ExcelApi 1.8]
    */
  @js.native
  sealed trait notEqualTo
    extends StObject
       with DataValidationOperator
}
