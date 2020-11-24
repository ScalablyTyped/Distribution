package typings.officeJs.global.Excel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  *
  * Represents the operator of the text conditional format type.
  *
  * [Api set: ExcelApi 1.6]
  */
@JSGlobal("Excel.ConditionalTextOperator")
@js.native
object ConditionalTextOperator extends js.Object {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[typings.officeJs.Excel.ConditionalTextOperator with String] = js.native
  
  /* "BeginsWith" */ val beginsWith: typings.officeJs.Excel.ConditionalTextOperator.beginsWith with String = js.native
  
  /* "Contains" */ val contains: typings.officeJs.Excel.ConditionalTextOperator.contains with String = js.native
  
  /* "EndsWith" */ val endsWith: typings.officeJs.Excel.ConditionalTextOperator.endsWith with String = js.native
  
  /* "Invalid" */ val invalid: typings.officeJs.Excel.ConditionalTextOperator.invalid with String = js.native
  
  /* "NotContains" */ val notContains: typings.officeJs.Excel.ConditionalTextOperator.notContains with String = js.native
}
