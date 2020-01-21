package typings.officeJsPreview.Excel

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[ConditionalCellValueOperator with String] = js.native
  /* "Between" */ @js.native
  object between extends TopLevel[between with String]
  
  /* "EqualTo" */ @js.native
  object equalTo extends TopLevel[equalTo with String]
  
  /* "GreaterThan" */ @js.native
  object greaterThan extends TopLevel[greaterThan with String]
  
  /* "GreaterThanOrEqual" */ @js.native
  object greaterThanOrEqual extends TopLevel[greaterThanOrEqual with String]
  
  /* "Invalid" */ @js.native
  object invalid extends TopLevel[invalid with String]
  
  /* "LessThan" */ @js.native
  object lessThan extends TopLevel[lessThan with String]
  
  /* "LessThanOrEqual" */ @js.native
  object lessThanOrEqual extends TopLevel[lessThanOrEqual with String]
  
  /* "NotBetween" */ @js.native
  object notBetween extends TopLevel[notBetween with String]
  
  /* "NotEqualTo" */ @js.native
  object notEqualTo extends TopLevel[notEqualTo with String]
  
}

