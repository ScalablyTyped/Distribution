package typings
package officeDashJsDashPreviewLib.ExcelNs

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
  sealed trait all
    extends officeDashJsDashPreviewLib.ExcelNs.SpecialCellValueType
  
  /**
    *
    * Cells that have errors.
    *
    */
  @js.native
  sealed trait errors
    extends officeDashJsDashPreviewLib.ExcelNs.SpecialCellValueType
  
  /**
    *
    * Cells that have errors, or a true/false value.
    *
    */
  @js.native
  sealed trait errorsLogical
    extends officeDashJsDashPreviewLib.ExcelNs.SpecialCellValueType
  
  /**
    *
    * Cells that have errors, true/false, or a numeric value.
    *
    */
  @js.native
  sealed trait errorsLogicalNumber
    extends officeDashJsDashPreviewLib.ExcelNs.SpecialCellValueType
  
  /**
    *
    * Cells that have errors, true/false, or a string value.
    *
    */
  @js.native
  sealed trait errorsLogicalText
    extends officeDashJsDashPreviewLib.ExcelNs.SpecialCellValueType
  
  /**
    *
    * Cells that have errors, numeric, or a string value.
    *
    */
  @js.native
  sealed trait errorsNumberText
    extends officeDashJsDashPreviewLib.ExcelNs.SpecialCellValueType
  
  /**
    *
    * Cells that have errors, or a numeric value.
    *
    */
  @js.native
  sealed trait errorsNumbers
    extends officeDashJsDashPreviewLib.ExcelNs.SpecialCellValueType
  
  /**
    *
    * Cells that have errors, or a string value.
    *
    */
  @js.native
  sealed trait errorsText
    extends officeDashJsDashPreviewLib.ExcelNs.SpecialCellValueType
  
  /**
    *
    * Cells that have a true/false value.
    *
    */
  @js.native
  sealed trait logical
    extends officeDashJsDashPreviewLib.ExcelNs.SpecialCellValueType
  
  /**
    *
    * Cells that have a true/false, or a numeric value.
    *
    */
  @js.native
  sealed trait logicalNumbers
    extends officeDashJsDashPreviewLib.ExcelNs.SpecialCellValueType
  
  /**
    *
    * Cells that have a true/false, numeric, or a string value.
    *
    */
  @js.native
  sealed trait logicalNumbersText
    extends officeDashJsDashPreviewLib.ExcelNs.SpecialCellValueType
  
  /**
    *
    * Cells that have a true/false, or a string value.
    *
    */
  @js.native
  sealed trait logicalText
    extends officeDashJsDashPreviewLib.ExcelNs.SpecialCellValueType
  
  /**
    *
    * Cells that have a numeric value.
    *
    */
  @js.native
  sealed trait numbers
    extends officeDashJsDashPreviewLib.ExcelNs.SpecialCellValueType
  
  /**
    *
    * Cells that have a numeric, or a string value.
    *
    */
  @js.native
  sealed trait numbersText
    extends officeDashJsDashPreviewLib.ExcelNs.SpecialCellValueType
  
  /**
    *
    * Cells that have a string value.
    *
    */
  @js.native
  sealed trait text
    extends officeDashJsDashPreviewLib.ExcelNs.SpecialCellValueType
  
  /* "All" */ val all: all with java.lang.String = js.native
  /* "Errors" */ val errors: errors with java.lang.String = js.native
  /* "ErrorsLogical" */ val errorsLogical: errorsLogical with java.lang.String = js.native
  /* "ErrorsLogicalNumber" */ val errorsLogicalNumber: errorsLogicalNumber with java.lang.String = js.native
  /* "ErrorsLogicalText" */ val errorsLogicalText: errorsLogicalText with java.lang.String = js.native
  /* "ErrorsNumberText" */ val errorsNumberText: errorsNumberText with java.lang.String = js.native
  /* "ErrorsNumbers" */ val errorsNumbers: errorsNumbers with java.lang.String = js.native
  /* "ErrorsText" */ val errorsText: errorsText with java.lang.String = js.native
  /* "Logical" */ val logical: logical with java.lang.String = js.native
  /* "LogicalNumbers" */ val logicalNumbers: logicalNumbers with java.lang.String = js.native
  /* "LogicalNumbersText" */ val logicalNumbersText: logicalNumbersText with java.lang.String = js.native
  /* "LogicalText" */ val logicalText: logicalText with java.lang.String = js.native
  /* "Numbers" */ val numbers: numbers with java.lang.String = js.native
  /* "NumbersText" */ val numbersText: numbersText with java.lang.String = js.native
  /* "Text" */ val text: text with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[officeDashJsDashPreviewLib.ExcelNs.SpecialCellValueType with java.lang.String] = js.native
}

