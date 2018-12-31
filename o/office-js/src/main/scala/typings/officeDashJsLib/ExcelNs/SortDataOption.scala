package typings
package officeDashJsLib.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait SortDataOption extends js.Object

/**
  * [Api set: ExcelApi 1.2]
  */
@JSGlobal("Excel.SortDataOption")
@js.native
object SortDataOption extends js.Object {
  @js.native
  sealed trait normal
    extends officeDashJsLib.ExcelNs.SortDataOption
  
  @js.native
  sealed trait textAsNumber
    extends officeDashJsLib.ExcelNs.SortDataOption
  
  /* "Normal" */ val normal: normal with java.lang.String = js.native
  /* "TextAsNumber" */ val textAsNumber: textAsNumber with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[officeDashJsLib.ExcelNs.SortDataOption with java.lang.String] = js.native
}

