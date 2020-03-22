package typings.officeJsPreview.Excel

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[SpecialCellValueType with String] = js.native
  /* "All" */ @js.native
  object all extends TopLevel[all with String]
  
  /* "Errors" */ @js.native
  object errors extends TopLevel[errors with String]
  
  /* "ErrorsLogical" */ @js.native
  object errorsLogical extends TopLevel[errorsLogical with String]
  
  /* "ErrorsLogicalNumber" */ @js.native
  object errorsLogicalNumber extends TopLevel[errorsLogicalNumber with String]
  
  /* "ErrorsLogicalText" */ @js.native
  object errorsLogicalText extends TopLevel[errorsLogicalText with String]
  
  /* "ErrorsNumberText" */ @js.native
  object errorsNumberText extends TopLevel[errorsNumberText with String]
  
  /* "ErrorsNumbers" */ @js.native
  object errorsNumbers extends TopLevel[errorsNumbers with String]
  
  /* "ErrorsText" */ @js.native
  object errorsText extends TopLevel[errorsText with String]
  
  /* "Logical" */ @js.native
  object logical extends TopLevel[logical with String]
  
  /* "LogicalNumbers" */ @js.native
  object logicalNumbers extends TopLevel[logicalNumbers with String]
  
  /* "LogicalNumbersText" */ @js.native
  object logicalNumbersText extends TopLevel[logicalNumbersText with String]
  
  /* "LogicalText" */ @js.native
  object logicalText extends TopLevel[logicalText with String]
  
  /* "Numbers" */ @js.native
  object numbers extends TopLevel[numbers with String]
  
  /* "NumbersText" */ @js.native
  object numbersText extends TopLevel[numbersText with String]
  
  /* "Text" */ @js.native
  object text extends TopLevel[text with String]
  
}

