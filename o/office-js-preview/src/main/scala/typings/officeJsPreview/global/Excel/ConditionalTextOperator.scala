package typings.officeJsPreview.global.Excel

import org.scalablytyped.runtime.StObject
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
object ConditionalTextOperator extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[typings.officeJsPreview.Excel.ConditionalTextOperator with String] = js.native
  
  /* "BeginsWith" */ val beginsWith: typings.officeJsPreview.Excel.ConditionalTextOperator.beginsWith with String = js.native
  
  /* "Contains" */ val contains: typings.officeJsPreview.Excel.ConditionalTextOperator.contains with String = js.native
  
  /* "EndsWith" */ val endsWith: typings.officeJsPreview.Excel.ConditionalTextOperator.endsWith with String = js.native
  
  /* "Invalid" */ val invalid: typings.officeJsPreview.Excel.ConditionalTextOperator.invalid with String = js.native
  
  /* "NotContains" */ val notContains: typings.officeJsPreview.Excel.ConditionalTextOperator.notContains with String = js.native
}
