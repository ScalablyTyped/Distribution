package typings
package officeDashJsLib.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait SpecialCellType extends js.Object

/**
  * [Api set: ExcelApi 1.9]
  */
@JSGlobal("Excel.SpecialCellType")
@js.native
object SpecialCellType extends js.Object {
  /**
    *
    * Cells with no content.
    *
    */
  @js.native
  sealed trait blanks
    extends officeDashJsLib.ExcelNs.SpecialCellType
  
  /**
    *
    * All cells with conditional formats
    *
    */
  @js.native
  sealed trait conditionalFormats
    extends officeDashJsLib.ExcelNs.SpecialCellType
  
  /**
    *
    * Cells containing constants.
    *
    */
  @js.native
  sealed trait constants
    extends officeDashJsLib.ExcelNs.SpecialCellType
  
  /**
    *
    * Cells having validation criteria.
    *
    */
  @js.native
  sealed trait dataValidations
    extends officeDashJsLib.ExcelNs.SpecialCellType
  
  /**
    *
    * Cells containing formulas.
    *
    */
  @js.native
  sealed trait formulas
    extends officeDashJsLib.ExcelNs.SpecialCellType
  
  /**
    *
    * Cells having the same conditional format as the first cell in the range.
    *
    */
  @js.native
  sealed trait sameConditionalFormat
    extends officeDashJsLib.ExcelNs.SpecialCellType
  
  /**
    *
    * Cells having the same data validation criteria as the first cell in the range.
    *
    */
  @js.native
  sealed trait sameDataValidation
    extends officeDashJsLib.ExcelNs.SpecialCellType
  
  /**
    *
    * Cells that are visible.
    *
    */
  @js.native
  sealed trait visible
    extends officeDashJsLib.ExcelNs.SpecialCellType
  
  /* "Blanks" */ val blanks: blanks with java.lang.String = js.native
  /* "ConditionalFormats" */ val conditionalFormats: conditionalFormats with java.lang.String = js.native
  /* "Constants" */ val constants: constants with java.lang.String = js.native
  /* "DataValidations" */ val dataValidations: dataValidations with java.lang.String = js.native
  /* "Formulas" */ val formulas: formulas with java.lang.String = js.native
  /* "SameConditionalFormat" */ val sameConditionalFormat: sameConditionalFormat with java.lang.String = js.native
  /* "SameDataValidation" */ val sameDataValidation: sameDataValidation with java.lang.String = js.native
  /* "Visible" */ val visible: visible with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[officeDashJsLib.ExcelNs.SpecialCellType with java.lang.String] = js.native
}

