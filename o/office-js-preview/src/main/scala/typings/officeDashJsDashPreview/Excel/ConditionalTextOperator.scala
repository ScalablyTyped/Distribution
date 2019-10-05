package typings.officeDashJsDashPreview.Excel

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
  
  /* "BeginsWith" */ val beginsWith: typings.officeDashJsDashPreview.Excel.ConditionalTextOperator.beginsWith with String = js.native
  /* "Contains" */ val contains: typings.officeDashJsDashPreview.Excel.ConditionalTextOperator.contains with String = js.native
  /* "EndsWith" */ val endsWith: typings.officeDashJsDashPreview.Excel.ConditionalTextOperator.endsWith with String = js.native
  /* "Invalid" */ val invalid: typings.officeDashJsDashPreview.Excel.ConditionalTextOperator.invalid with String = js.native
  /* "NotContains" */ val notContains: typings.officeDashJsDashPreview.Excel.ConditionalTextOperator.notContains with String = js.native
  @JSBracketAccess
  def apply(value: String): js.UndefOr[ConditionalTextOperator with String] = js.native
}

