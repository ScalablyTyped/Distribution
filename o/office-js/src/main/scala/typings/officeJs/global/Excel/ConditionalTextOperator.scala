package typings.officeJs.global.Excel

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents the operator of the text conditional format type.
  *
  * @remarks
  * [Api set: ExcelApi 1.6]
  */
@JSGlobal("Excel.ConditionalTextOperator")
@js.native
object ConditionalTextOperator extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[typings.officeJs.Excel.ConditionalTextOperator & String] = js.native
  
  /* "BeginsWith" */ val beginsWith: typings.officeJs.Excel.ConditionalTextOperator.beginsWith & String = js.native
  
  /* "Contains" */ val contains: typings.officeJs.Excel.ConditionalTextOperator.contains & String = js.native
  
  /* "EndsWith" */ val endsWith: typings.officeJs.Excel.ConditionalTextOperator.endsWith & String = js.native
  
  /* "Invalid" */ val invalid: typings.officeJs.Excel.ConditionalTextOperator.invalid & String = js.native
  
  /* "NotContains" */ val notContains: typings.officeJs.Excel.ConditionalTextOperator.notContains & String = js.native
}
