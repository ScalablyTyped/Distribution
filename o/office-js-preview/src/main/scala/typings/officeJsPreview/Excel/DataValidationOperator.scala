package typings.officeJsPreview.Excel

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[DataValidationOperator with String] = js.native
  /* "Between" */ @js.native
  object between extends TopLevel[between with String]
  
  /* "EqualTo" */ @js.native
  object equalTo extends TopLevel[equalTo with String]
  
  /* "GreaterThan" */ @js.native
  object greaterThan extends TopLevel[greaterThan with String]
  
  /* "GreaterThanOrEqualTo" */ @js.native
  object greaterThanOrEqualTo extends TopLevel[greaterThanOrEqualTo with String]
  
  /* "LessThan" */ @js.native
  object lessThan extends TopLevel[lessThan with String]
  
  /* "LessThanOrEqualTo" */ @js.native
  object lessThanOrEqualTo extends TopLevel[lessThanOrEqualTo with String]
  
  /* "NotBetween" */ @js.native
  object notBetween extends TopLevel[notBetween with String]
  
  /* "NotEqualTo" */ @js.native
  object notEqualTo extends TopLevel[notEqualTo with String]
  
}

