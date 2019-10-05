package typings.officeDashJsDashPreview.Excel

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
  
  /* "All" */ val all: typings.officeDashJsDashPreview.Excel.SpecialCellValueType.all with String = js.native
  /* "Errors" */ val errors: typings.officeDashJsDashPreview.Excel.SpecialCellValueType.errors with String = js.native
  /* "ErrorsLogical" */ val errorsLogical: typings.officeDashJsDashPreview.Excel.SpecialCellValueType.errorsLogical with String = js.native
  /* "ErrorsLogicalNumber" */ val errorsLogicalNumber: typings.officeDashJsDashPreview.Excel.SpecialCellValueType.errorsLogicalNumber with String = js.native
  /* "ErrorsLogicalText" */ val errorsLogicalText: typings.officeDashJsDashPreview.Excel.SpecialCellValueType.errorsLogicalText with String = js.native
  /* "ErrorsNumberText" */ val errorsNumberText: typings.officeDashJsDashPreview.Excel.SpecialCellValueType.errorsNumberText with String = js.native
  /* "ErrorsNumbers" */ val errorsNumbers: typings.officeDashJsDashPreview.Excel.SpecialCellValueType.errorsNumbers with String = js.native
  /* "ErrorsText" */ val errorsText: typings.officeDashJsDashPreview.Excel.SpecialCellValueType.errorsText with String = js.native
  /* "Logical" */ val logical: typings.officeDashJsDashPreview.Excel.SpecialCellValueType.logical with String = js.native
  /* "LogicalNumbers" */ val logicalNumbers: typings.officeDashJsDashPreview.Excel.SpecialCellValueType.logicalNumbers with String = js.native
  /* "LogicalNumbersText" */ val logicalNumbersText: typings.officeDashJsDashPreview.Excel.SpecialCellValueType.logicalNumbersText with String = js.native
  /* "LogicalText" */ val logicalText: typings.officeDashJsDashPreview.Excel.SpecialCellValueType.logicalText with String = js.native
  /* "Numbers" */ val numbers: typings.officeDashJsDashPreview.Excel.SpecialCellValueType.numbers with String = js.native
  /* "NumbersText" */ val numbersText: typings.officeDashJsDashPreview.Excel.SpecialCellValueType.numbersText with String = js.native
  /* "Text" */ val text: typings.officeDashJsDashPreview.Excel.SpecialCellValueType.text with String = js.native
  @JSBracketAccess
  def apply(value: String): js.UndefOr[SpecialCellValueType with String] = js.native
}

