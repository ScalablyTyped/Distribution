package typings.officeJs.Excel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ConditionalCellValueOperator extends js.Object
/**
  *
  * Represents the operator of the text conditional format type.
  *
  * [Api set: ExcelApi 1.6]
  */
@JSGlobal("Excel.ConditionalCellValueOperator")
@js.native
object ConditionalCellValueOperator extends js.Object {
  
  @js.native
  sealed trait between extends ConditionalCellValueOperator
  
  @js.native
  sealed trait equalTo extends ConditionalCellValueOperator
  
  @js.native
  sealed trait greaterThan extends ConditionalCellValueOperator
  
  @js.native
  sealed trait greaterThanOrEqual extends ConditionalCellValueOperator
  
  @js.native
  sealed trait invalid extends ConditionalCellValueOperator
  
  @js.native
  sealed trait lessThan extends ConditionalCellValueOperator
  
  @js.native
  sealed trait lessThanOrEqual extends ConditionalCellValueOperator
  
  @js.native
  sealed trait notBetween extends ConditionalCellValueOperator
  
  @js.native
  sealed trait notEqualTo extends ConditionalCellValueOperator
}
