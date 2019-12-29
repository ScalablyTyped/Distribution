package typings.officeDashJs.Excel

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait FilterOperator extends js.Object

/**
  * [Api set: ExcelApi 1.2]
  */
@JSGlobal("Excel.FilterOperator")
@js.native
object FilterOperator extends js.Object {
  @js.native
  sealed trait and extends FilterOperator
  
  @js.native
  sealed trait or extends FilterOperator
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[FilterOperator with String] = js.native
  /* "And" */ @js.native
  object and extends TopLevel[and with String]
  
  /* "Or" */ @js.native
  object or extends TopLevel[or with String]
  
}

