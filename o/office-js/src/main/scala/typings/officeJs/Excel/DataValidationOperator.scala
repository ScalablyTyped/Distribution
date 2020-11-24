package typings.officeJs.Excel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait DataValidationOperator extends js.Object
/**
  *
  * Represents Data validation operator enum.
  *
  * [Api set: ExcelApi 1.8]
  */
@JSGlobal("Excel.DataValidationOperator")
@js.native
object DataValidationOperator extends js.Object {
  
  @js.native
  sealed trait between extends DataValidationOperator
  
  @js.native
  sealed trait equalTo extends DataValidationOperator
  
  @js.native
  sealed trait greaterThan extends DataValidationOperator
  
  @js.native
  sealed trait greaterThanOrEqualTo extends DataValidationOperator
  
  @js.native
  sealed trait lessThan extends DataValidationOperator
  
  @js.native
  sealed trait lessThanOrEqualTo extends DataValidationOperator
  
  @js.native
  sealed trait notBetween extends DataValidationOperator
  
  @js.native
  sealed trait notEqualTo extends DataValidationOperator
}
