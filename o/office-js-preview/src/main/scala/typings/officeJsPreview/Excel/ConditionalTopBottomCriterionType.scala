package typings.officeJsPreview.Excel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ConditionalTopBottomCriterionType extends js.Object

/**
  *
  * Represents the criteria for the above/below average conditional format type.
  *
  * [Api set: ExcelApi 1.6]
  */
@JSGlobal("Excel.ConditionalTopBottomCriterionType")
@js.native
object ConditionalTopBottomCriterionType extends js.Object {
  @js.native
  sealed trait bottomItems extends ConditionalTopBottomCriterionType
  
  @js.native
  sealed trait bottomPercent extends ConditionalTopBottomCriterionType
  
  @js.native
  sealed trait invalid extends ConditionalTopBottomCriterionType
  
  @js.native
  sealed trait topItems extends ConditionalTopBottomCriterionType
  
  @js.native
  sealed trait topPercent extends ConditionalTopBottomCriterionType
  
}

