package typings
package officeDashJsDashPreviewLib.ExcelNs

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
    extends officeDashJsDashPreviewLib.ExcelNs.FilterDatetimeSpecificity
  
  @js.native
  sealed trait hour
    extends officeDashJsDashPreviewLib.ExcelNs.FilterDatetimeSpecificity
  
  @js.native
  sealed trait minute
    extends officeDashJsDashPreviewLib.ExcelNs.FilterDatetimeSpecificity
  
  @js.native
  sealed trait month
    extends officeDashJsDashPreviewLib.ExcelNs.FilterDatetimeSpecificity
  
  @js.native
  sealed trait second
    extends officeDashJsDashPreviewLib.ExcelNs.FilterDatetimeSpecificity
  
  @js.native
  sealed trait year
    extends officeDashJsDashPreviewLib.ExcelNs.FilterDatetimeSpecificity
  
  /* "Day" */ val day: day with java.lang.String = js.native
  /* "Hour" */ val hour: hour with java.lang.String = js.native
  /* "Minute" */ val minute: minute with java.lang.String = js.native
  /* "Month" */ val month: month with java.lang.String = js.native
  /* "Second" */ val second: second with java.lang.String = js.native
  /* "Year" */ val year: year with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    officeDashJsDashPreviewLib.ExcelNs.FilterDatetimeSpecificity with java.lang.String
  ] = js.native
}

