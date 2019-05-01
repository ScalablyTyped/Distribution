package typings
package officeDashJsLib.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ArrowheadWidth extends js.Object

/**
  * [Api set: ExcelApi 1.9]
  */
@JSGlobal("Excel.ArrowheadWidth")
@js.native
object ArrowheadWidth extends js.Object {
  @js.native
  sealed trait medium
    extends officeDashJsLib.ExcelNs.ArrowheadWidth
  
  @js.native
  sealed trait narrow
    extends officeDashJsLib.ExcelNs.ArrowheadWidth
  
  @js.native
  sealed trait wide
    extends officeDashJsLib.ExcelNs.ArrowheadWidth
  
  /* "Medium" */ val medium: medium with java.lang.String = js.native
  /* "Narrow" */ val narrow: narrow with java.lang.String = js.native
  /* "Wide" */ val wide: wide with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[officeDashJsLib.ExcelNs.ArrowheadWidth with java.lang.String] = js.native
}

