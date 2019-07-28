package typings.officeDashJsDashPreview.ExcelNs

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
  sealed trait blanks extends SpecialCellType
  
  /**
    *
    * All cells with conditional formats
    *
    */
  @js.native
  sealed trait conditionalFormats extends SpecialCellType
  
  /**
    *
    * Cells containing constants.
    *
    */
  @js.native
  sealed trait constants extends SpecialCellType
  
  /**
    *
    * Cells having validation criteria.
    *
    */
  @js.native
  sealed trait dataValidations extends SpecialCellType
  
  /**
    *
    * Cells containing formulas.
    *
    */
  @js.native
  sealed trait formulas extends SpecialCellType
  
  /**
    *
    * Cells having the same conditional format as the first cell in the range.
    *
    */
  @js.native
  sealed trait sameConditionalFormat extends SpecialCellType
  
  /**
    *
    * Cells having the same data validation criteria as the first cell in the range.
    *
    */
  @js.native
  sealed trait sameDataValidation extends SpecialCellType
  
  /**
    *
    * Cells that are visible.
    *
    */
  @js.native
  sealed trait visible extends SpecialCellType
  
  /* "Blanks" */ val blanks: typings.officeDashJsDashPreview.ExcelNs.SpecialCellType.blanks with String = js.native
  /* "ConditionalFormats" */ val conditionalFormats: typings.officeDashJsDashPreview.ExcelNs.SpecialCellType.conditionalFormats with String = js.native
  /* "Constants" */ val constants: typings.officeDashJsDashPreview.ExcelNs.SpecialCellType.constants with String = js.native
  /* "DataValidations" */ val dataValidations: typings.officeDashJsDashPreview.ExcelNs.SpecialCellType.dataValidations with String = js.native
  /* "Formulas" */ val formulas: typings.officeDashJsDashPreview.ExcelNs.SpecialCellType.formulas with String = js.native
  /* "SameConditionalFormat" */ val sameConditionalFormat: typings.officeDashJsDashPreview.ExcelNs.SpecialCellType.sameConditionalFormat with String = js.native
  /* "SameDataValidation" */ val sameDataValidation: typings.officeDashJsDashPreview.ExcelNs.SpecialCellType.sameDataValidation with String = js.native
  /* "Visible" */ val visible: typings.officeDashJsDashPreview.ExcelNs.SpecialCellType.visible with String = js.native
  @JSBracketAccess
  def apply(value: String): js.UndefOr[SpecialCellType with String] = js.native
}

