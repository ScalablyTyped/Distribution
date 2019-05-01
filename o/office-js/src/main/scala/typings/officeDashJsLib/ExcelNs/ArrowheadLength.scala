package typings
package officeDashJsLib.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ArrowheadLength extends js.Object

/**
  * [Api set: ExcelApi 1.9]
  */
@JSGlobal("Excel.ArrowheadLength")
@js.native
object ArrowheadLength extends js.Object {
  @js.native
  sealed trait long
    extends officeDashJsLib.ExcelNs.ArrowheadLength
  
  @js.native
  sealed trait medium
    extends officeDashJsLib.ExcelNs.ArrowheadLength
  
  @js.native
  sealed trait short
    extends officeDashJsLib.ExcelNs.ArrowheadLength
  
  /* "Long" */ val long: long with java.lang.String = js.native
  /* "Medium" */ val medium: medium with java.lang.String = js.native
  /* "Short" */ val short: short with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[officeDashJsLib.ExcelNs.ArrowheadLength with java.lang.String] = js.native
}

