package typings.officeJs.Excel

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[SpecialCellType with String] = js.native
  /* "Blanks" */ @js.native
  object blanks extends TopLevel[blanks with String]
  
  /* "ConditionalFormats" */ @js.native
  object conditionalFormats extends TopLevel[conditionalFormats with String]
  
  /* "Constants" */ @js.native
  object constants extends TopLevel[constants with String]
  
  /* "DataValidations" */ @js.native
  object dataValidations extends TopLevel[dataValidations with String]
  
  /* "Formulas" */ @js.native
  object formulas extends TopLevel[formulas with String]
  
  /* "SameConditionalFormat" */ @js.native
  object sameConditionalFormat extends TopLevel[sameConditionalFormat with String]
  
  /* "SameDataValidation" */ @js.native
  object sameDataValidation extends TopLevel[sameDataValidation with String]
  
  /* "Visible" */ @js.native
  object visible extends TopLevel[visible with String]
  
}

