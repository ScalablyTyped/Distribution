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
@JSGlobal("Excel.ConditionalCellValueOperator")
@js.native
object ConditionalCellValueOperator extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[typings.officeJs.Excel.ConditionalCellValueOperator & String] = js.native
  
  /* "Between" */ val between: typings.officeJs.Excel.ConditionalCellValueOperator.between & String = js.native
  
  /* "EqualTo" */ val equalTo: typings.officeJs.Excel.ConditionalCellValueOperator.equalTo & String = js.native
  
  /* "GreaterThan" */ val greaterThan: typings.officeJs.Excel.ConditionalCellValueOperator.greaterThan & String = js.native
  
  /* "GreaterThanOrEqual" */ val greaterThanOrEqual: typings.officeJs.Excel.ConditionalCellValueOperator.greaterThanOrEqual & String = js.native
  
  /* "Invalid" */ val invalid: typings.officeJs.Excel.ConditionalCellValueOperator.invalid & String = js.native
  
  /* "LessThan" */ val lessThan: typings.officeJs.Excel.ConditionalCellValueOperator.lessThan & String = js.native
  
  /* "LessThanOrEqual" */ val lessThanOrEqual: typings.officeJs.Excel.ConditionalCellValueOperator.lessThanOrEqual & String = js.native
  
  /* "NotBetween" */ val notBetween: typings.officeJs.Excel.ConditionalCellValueOperator.notBetween & String = js.native
  
  /* "NotEqualTo" */ val notEqualTo: typings.officeJs.Excel.ConditionalCellValueOperator.notEqualTo & String = js.native
}
