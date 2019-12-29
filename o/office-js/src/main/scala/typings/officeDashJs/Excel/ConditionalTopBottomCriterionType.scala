package typings.officeDashJs.Excel

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[ConditionalTopBottomCriterionType with String] = js.native
  /* "BottomItems" */ @js.native
  object bottomItems extends TopLevel[bottomItems with String]
  
  /* "BottomPercent" */ @js.native
  object bottomPercent extends TopLevel[bottomPercent with String]
  
  /* "Invalid" */ @js.native
  object invalid extends TopLevel[invalid with String]
  
  /* "TopItems" */ @js.native
  object topItems extends TopLevel[topItems with String]
  
  /* "TopPercent" */ @js.native
  object topPercent extends TopLevel[topPercent with String]
  
}

