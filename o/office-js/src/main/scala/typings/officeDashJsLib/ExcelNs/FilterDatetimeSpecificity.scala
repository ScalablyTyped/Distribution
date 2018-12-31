package typings
package officeDashJsLib.ExcelNs

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
  sealed trait day
    extends officeDashJsLib.ExcelNs.FilterDatetimeSpecificity
  
  @js.native
  sealed trait hour
    extends officeDashJsLib.ExcelNs.FilterDatetimeSpecificity
  
  @js.native
  sealed trait minute
    extends officeDashJsLib.ExcelNs.FilterDatetimeSpecificity
  
  @js.native
  sealed trait month
    extends officeDashJsLib.ExcelNs.FilterDatetimeSpecificity
  
  @js.native
  sealed trait second
    extends officeDashJsLib.ExcelNs.FilterDatetimeSpecificity
  
  @js.native
  sealed trait year
    extends officeDashJsLib.ExcelNs.FilterDatetimeSpecificity
  
  /* "Day" */ val day: day with java.lang.String = js.native
  /* "Hour" */ val hour: hour with java.lang.String = js.native
  /* "Minute" */ val minute: minute with java.lang.String = js.native
  /* "Month" */ val month: month with java.lang.String = js.native
  /* "Second" */ val second: second with java.lang.String = js.native
  /* "Year" */ val year: year with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[officeDashJsLib.ExcelNs.FilterDatetimeSpecificity with java.lang.String] = js.native
}

