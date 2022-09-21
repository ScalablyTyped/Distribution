package typings.officeJsPreview.global.Excel

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
  def apply(value: String): js.UndefOr[typings.officeJsPreview.Excel.ConditionalTextOperator & String] = js.native
  
  /* "BeginsWith" */ val beginsWith: typings.officeJsPreview.Excel.ConditionalTextOperator.beginsWith & String = js.native
  
  /* "Contains" */ val contains: typings.officeJsPreview.Excel.ConditionalTextOperator.contains & String = js.native
  
  /* "EndsWith" */ val endsWith: typings.officeJsPreview.Excel.ConditionalTextOperator.endsWith & String = js.native
  
  /* "Invalid" */ val invalid: typings.officeJsPreview.Excel.ConditionalTextOperator.invalid & String = js.native
  
  /* "NotContains" */ val notContains: typings.officeJsPreview.Excel.ConditionalTextOperator.notContains & String = js.native
}
