package typings.officeDashJs.Excel

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
  
  /* "Day" */ val day: typings.officeDashJs.Excel.FilterDatetimeSpecificity.day with String = js.native
  /* "Hour" */ val hour: typings.officeDashJs.Excel.FilterDatetimeSpecificity.hour with String = js.native
  /* "Minute" */ val minute: typings.officeDashJs.Excel.FilterDatetimeSpecificity.minute with String = js.native
  /* "Month" */ val month: typings.officeDashJs.Excel.FilterDatetimeSpecificity.month with String = js.native
  /* "Second" */ val second: typings.officeDashJs.Excel.FilterDatetimeSpecificity.second with String = js.native
  /* "Year" */ val year: typings.officeDashJs.Excel.FilterDatetimeSpecificity.year with String = js.native
  @JSBracketAccess
  def apply(value: String): js.UndefOr[FilterDatetimeSpecificity with String] = js.native
}

