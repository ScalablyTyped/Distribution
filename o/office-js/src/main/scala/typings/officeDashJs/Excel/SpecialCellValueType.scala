package typings.officeDashJs.Excel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait SpecialCellValueType extends js.Object

/**
  * [Api set: ExcelApi 1.9]
  */
@JSGlobal("Excel.SpecialCellValueType")
@js.native
object SpecialCellValueType extends js.Object {
  /**
    *
    * Cells that have errors, true/false, numeric, or a string value.
    *
    */
  @js.native
  sealed trait all extends SpecialCellValueType
  
  /**
    *
    * Cells that have errors.
    *
    */
  @js.native
  sealed trait errors extends SpecialCellValueType
  
  /**
    *
    * Cells that have errors, or a true/false value.
    *
    */
  @js.native
  sealed trait errorsLogical extends SpecialCellValueType
  
  /**
    *
    * Cells that have errors, true/false, or a numeric value.
    *
    */
  @js.native
  sealed trait errorsLogicalNumber extends SpecialCellValueType
  
  /**
    *
    * Cells that have errors, true/false, or a string value.
    *
    */
  @js.native
  sealed trait errorsLogicalText extends SpecialCellValueType
  
  /**
    *
    * Cells that have errors, numeric, or a string value.
    *
    */
  @js.native
  sealed trait errorsNumberText extends SpecialCellValueType
  
  /**
    *
    * Cells that have errors, or a numeric value.
    *
    */
  @js.native
  sealed trait errorsNumbers extends SpecialCellValueType
  
  /**
    *
    * Cells that have errors, or a string value.
    *
    */
  @js.native
  sealed trait errorsText extends SpecialCellValueType
  
  /**
    *
    * Cells that have a true/false value.
    *
    */
  @js.native
  sealed trait logical extends SpecialCellValueType
  
  /**
    *
    * Cells that have a true/false, or a numeric value.
    *
    */
  @js.native
  sealed trait logicalNumbers extends SpecialCellValueType
  
  /**
    *
    * Cells that have a true/false, numeric, or a string value.
    *
    */
  @js.native
  sealed trait logicalNumbersText extends SpecialCellValueType
  
  /**
    *
    * Cells that have a true/false, or a string value.
    *
    */
  @js.native
  sealed trait logicalText extends SpecialCellValueType
  
  /**
    *
    * Cells that have a numeric value.
    *
    */
  @js.native
  sealed trait numbers extends SpecialCellValueType
  
  /**
    *
    * Cells that have a numeric, or a string value.
    *
    */
  @js.native
  sealed trait numbersText extends SpecialCellValueType
  
  /**
    *
    * Cells that have a string value.
    *
    */
  @js.native
  sealed trait text extends SpecialCellValueType
  
  /* "All" */ val all: typings.officeDashJs.Excel.SpecialCellValueType.all with String = js.native
  /* "Errors" */ val errors: typings.officeDashJs.Excel.SpecialCellValueType.errors with String = js.native
  /* "ErrorsLogical" */ val errorsLogical: typings.officeDashJs.Excel.SpecialCellValueType.errorsLogical with String = js.native
  /* "ErrorsLogicalNumber" */ val errorsLogicalNumber: typings.officeDashJs.Excel.SpecialCellValueType.errorsLogicalNumber with String = js.native
  /* "ErrorsLogicalText" */ val errorsLogicalText: typings.officeDashJs.Excel.SpecialCellValueType.errorsLogicalText with String = js.native
  /* "ErrorsNumberText" */ val errorsNumberText: typings.officeDashJs.Excel.SpecialCellValueType.errorsNumberText with String = js.native
  /* "ErrorsNumbers" */ val errorsNumbers: typings.officeDashJs.Excel.SpecialCellValueType.errorsNumbers with String = js.native
  /* "ErrorsText" */ val errorsText: typings.officeDashJs.Excel.SpecialCellValueType.errorsText with String = js.native
  /* "Logical" */ val logical: typings.officeDashJs.Excel.SpecialCellValueType.logical with String = js.native
  /* "LogicalNumbers" */ val logicalNumbers: typings.officeDashJs.Excel.SpecialCellValueType.logicalNumbers with String = js.native
  /* "LogicalNumbersText" */ val logicalNumbersText: typings.officeDashJs.Excel.SpecialCellValueType.logicalNumbersText with String = js.native
  /* "LogicalText" */ val logicalText: typings.officeDashJs.Excel.SpecialCellValueType.logicalText with String = js.native
  /* "Numbers" */ val numbers: typings.officeDashJs.Excel.SpecialCellValueType.numbers with String = js.native
  /* "NumbersText" */ val numbersText: typings.officeDashJs.Excel.SpecialCellValueType.numbersText with String = js.native
  /* "Text" */ val text: typings.officeDashJs.Excel.SpecialCellValueType.text with String = js.native
  @JSBracketAccess
  def apply(value: String): js.UndefOr[SpecialCellValueType with String] = js.native
}

