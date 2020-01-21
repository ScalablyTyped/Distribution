package typings.officeJs.Excel

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait FilterDatetimeSpecificity extends js.Object

/**
  * [Api set: ExcelApi 1.2]
  */
@JSGlobal("Excel.FilterDatetimeSpecificity")
@js.native
object FilterDatetimeSpecificity extends js.Object {
  @js.native
  sealed trait day extends FilterDatetimeSpecificity
  
  @js.native
  sealed trait hour extends FilterDatetimeSpecificity
  
  @js.native
  sealed trait minute extends FilterDatetimeSpecificity
  
  @js.native
  sealed trait month extends FilterDatetimeSpecificity
  
  @js.native
  sealed trait second extends FilterDatetimeSpecificity
  
  @js.native
  sealed trait year extends FilterDatetimeSpecificity
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[FilterDatetimeSpecificity with String] = js.native
  /* "Day" */ @js.native
  object day extends TopLevel[day with String]
  
  /* "Hour" */ @js.native
  object hour extends TopLevel[hour with String]
  
  /* "Minute" */ @js.native
  object minute extends TopLevel[minute with String]
  
  /* "Month" */ @js.native
  object month extends TopLevel[month with String]
  
  /* "Second" */ @js.native
  object second extends TopLevel[second with String]
  
  /* "Year" */ @js.native
  object year extends TopLevel[year with String]
  
}

