package typings.officeDashJs.Excel

import org.scalablytyped.runtime.TopLevel
import typings.officeDashJs.Excel.ConditionalTextOperator.beginsWith
import typings.officeDashJs.Excel.ConditionalTextOperator.contains
import typings.officeDashJs.Excel.ConditionalTextOperator.endsWith
import typings.officeDashJs.Excel.ConditionalTextOperator.invalid
import typings.officeDashJs.Excel.ConditionalTextOperator.notContains
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ConditionalTextOperator extends js.Object

/**
  *
  * Represents the operator of the text conditional format type.
  *
  * [Api set: ExcelApi 1.6]
  */
@JSGlobal("Excel.ConditionalTextOperator")
@js.native
object ConditionalTextOperator extends js.Object {
  @js.native
  sealed trait beginsWith extends ConditionalTextOperator
  
  @js.native
  sealed trait contains extends ConditionalTextOperator
  
  @js.native
  sealed trait endsWith extends ConditionalTextOperator
  
  @js.native
  sealed trait invalid extends ConditionalTextOperator
  
  @js.native
  sealed trait notContains extends ConditionalTextOperator
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[ConditionalTextOperator with String] = js.native
  /* "BeginsWith" */ @js.native
  object beginsWith extends TopLevel[beginsWith with String]
  
  /* "Contains" */ @js.native
  object contains extends TopLevel[contains with String]
  
  /* "EndsWith" */ @js.native
  object endsWith extends TopLevel[endsWith with String]
  
  /* "Invalid" */ @js.native
  object invalid extends TopLevel[invalid with String]
  
  /* "NotContains" */ @js.native
  object notContains extends TopLevel[notContains with String]
  
}

