package typings.officeJsPreview.Excel

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait SpecialCellValueType extends StObject
/**
  * @remarks
  * [Api set: ExcelApi 1.9]
  */
@JSGlobal("Excel.SpecialCellValueType")
@js.native
object SpecialCellValueType extends StObject {
  
  /**
    * Cells that have errors, boolean, numeric, or string values.
    * @remarks
    * [Api set: ExcelApi 1.9]
    */
  @js.native
  sealed trait all
    extends StObject
       with SpecialCellValueType
  
  /**
    * Cells that have errors.
    * @remarks
    * [Api set: ExcelApi 1.9]
    */
  @js.native
  sealed trait errors
    extends StObject
       with SpecialCellValueType
  
  /**
    * Cells that have errors or boolean values.
    * @remarks
    * [Api set: ExcelApi 1.9]
    */
  @js.native
  sealed trait errorsLogical
    extends StObject
       with SpecialCellValueType
  
  /**
    * Cells that have errors, boolean, or numeric values.
    * @remarks
    * [Api set: ExcelApi 1.9]
    */
  @js.native
  sealed trait errorsLogicalNumber
    extends StObject
       with SpecialCellValueType
  
  /**
    * Cells that have errors, boolean, or string values.
    * @remarks
    * [Api set: ExcelApi 1.9]
    */
  @js.native
  sealed trait errorsLogicalText
    extends StObject
       with SpecialCellValueType
  
  /**
    * Cells that have errors, numeric, or string values.
    * @remarks
    * [Api set: ExcelApi 1.9]
    */
  @js.native
  sealed trait errorsNumberText
    extends StObject
       with SpecialCellValueType
  
  /**
    * Cells that have errors or numeric values.
    * @remarks
    * [Api set: ExcelApi 1.9]
    */
  @js.native
  sealed trait errorsNumbers
    extends StObject
       with SpecialCellValueType
  
  /**
    * Cells that have errors or string values.
    * @remarks
    * [Api set: ExcelApi 1.9]
    */
  @js.native
  sealed trait errorsText
    extends StObject
       with SpecialCellValueType
  
  /**
    * Cells that have a boolean value.
    * @remarks
    * [Api set: ExcelApi 1.9]
    */
  @js.native
  sealed trait logical
    extends StObject
       with SpecialCellValueType
  
  /**
    * Cells that have a boolean or numeric value.
    * @remarks
    * [Api set: ExcelApi 1.9]
    */
  @js.native
  sealed trait logicalNumbers
    extends StObject
       with SpecialCellValueType
  
  /**
    * Cells that have a boolean, numeric, or string value.
    * @remarks
    * [Api set: ExcelApi 1.9]
    */
  @js.native
  sealed trait logicalNumbersText
    extends StObject
       with SpecialCellValueType
  
  /**
    * Cells that have a boolean or string value.
    * @remarks
    * [Api set: ExcelApi 1.9]
    */
  @js.native
  sealed trait logicalText
    extends StObject
       with SpecialCellValueType
  
  /**
    * Cells that have a numeric value.
    * @remarks
    * [Api set: ExcelApi 1.9]
    */
  @js.native
  sealed trait numbers
    extends StObject
       with SpecialCellValueType
  
  /**
    * Cells that have a numeric or string value.
    * @remarks
    * [Api set: ExcelApi 1.9]
    */
  @js.native
  sealed trait numbersText
    extends StObject
       with SpecialCellValueType
  
  /**
    * Cells that have a string value.
    * @remarks
    * [Api set: ExcelApi 1.9]
    */
  @js.native
  sealed trait text
    extends StObject
       with SpecialCellValueType
}
