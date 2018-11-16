package typings
package officeDashJsLib.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait SubtotalLocationType extends js.Object

/**
     * [Api set: ExcelApi 1.8]
     */
@JSGlobal("Excel.SubtotalLocationType")
@js.native
object SubtotalLocationType extends js.Object {
  /**
           *
           * Subtotals are at the bottom.
           *
           */
  @js.native
  sealed trait atBottom
    extends officeDashJsLib.ExcelNs.SubtotalLocationType
  
  /**
           *
           * Subtotals are at the top.
           *
           */
  @js.native
  sealed trait atTop
    extends officeDashJsLib.ExcelNs.SubtotalLocationType
  
  /**
           *
           * Subtotals are off.
           *
           */
  @js.native
  sealed trait off
    extends officeDashJsLib.ExcelNs.SubtotalLocationType
  
  /* "AtBottom" */ val atBottom: atBottom with java.lang.String = js.native
  /* "AtTop" */ val atTop: atTop with java.lang.String = js.native
  /* "Off" */ val off: off with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[officeDashJsLib.ExcelNs.SubtotalLocationType with java.lang.String] = js.native
}

