package typings.officeJs.Excel

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
  
}

