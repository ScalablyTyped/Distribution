package typings.officeJs.Excel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait SpecialCellValueType extends js.Object
/**
  * [Api set: ExcelApi 1.9]
  */
@JSGlobal("Excel.SpecialCellValueType")
@js.native
object SpecialCellValueType extends js.Object {
  
  /**
    * Cells that have errors, true/false, numeric, or a string value.
    *
    */
  @js.native
  sealed trait all extends SpecialCellValueType
  
  /**
    * Cells that have errors.
    *
    */
  @js.native
  sealed trait errors extends SpecialCellValueType
  
  /**
    * Cells that have errors, or a true/false value.
    *
    */
  @js.native
  sealed trait errorsLogical extends SpecialCellValueType
  
  /**
    * Cells that have errors, true/false, or a numeric value.
    *
    */
  @js.native
  sealed trait errorsLogicalNumber extends SpecialCellValueType
  
  /**
    * Cells that have errors, true/false, or a string value.
    *
    */
  @js.native
  sealed trait errorsLogicalText extends SpecialCellValueType
  
  /**
    * Cells that have errors, numeric, or a string value.
    *
    */
  @js.native
  sealed trait errorsNumberText extends SpecialCellValueType
  
  /**
    * Cells that have errors, or a numeric value.
    *
    */
  @js.native
  sealed trait errorsNumbers extends SpecialCellValueType
  
  /**
    * Cells that have errors, or a string value.
    *
    */
  @js.native
  sealed trait errorsText extends SpecialCellValueType
  
  /**
    * Cells that have a true/false value.
    *
    */
  @js.native
  sealed trait logical extends SpecialCellValueType
  
  /**
    * Cells that have a true/false, or a numeric value.
    *
    */
  @js.native
  sealed trait logicalNumbers extends SpecialCellValueType
  
  /**
    * Cells that have a true/false, numeric, or a string value.
    *
    */
  @js.native
  sealed trait logicalNumbersText extends SpecialCellValueType
  
  /**
    * Cells that have a true/false, or a string value.
    *
    */
  @js.native
  sealed trait logicalText extends SpecialCellValueType
  
  /**
    * Cells that have a numeric value.
    *
    */
  @js.native
  sealed trait numbers extends SpecialCellValueType
  
  /**
    * Cells that have a numeric, or a string value.
    *
    */
  @js.native
  sealed trait numbersText extends SpecialCellValueType
  
  /**
    * Cells that have a string value.
    *
    */
  @js.native
  sealed trait text extends SpecialCellValueType
}
