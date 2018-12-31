package typings
package officeDashJsLib.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait CalculationType extends js.Object

/**
  * [Api set: ExcelApi 1.1]
  */
@JSGlobal("Excel.CalculationType")
@js.native
object CalculationType extends js.Object {
  /**
    *
    * This will mark all cells as dirty and then recalculate them.
    *
    */
  @js.native
  sealed trait full
    extends officeDashJsLib.ExcelNs.CalculationType
  
  /**
    *
    * This will rebuild the full dependency chain, mark all cells as dirty and then recalculate them.
    *
    */
  @js.native
  sealed trait fullRebuild
    extends officeDashJsLib.ExcelNs.CalculationType
  
  /**
    *
    * Recalculates all cells that Excel has marked as dirty, that is, dependents of volatile or changed data, and cells programmatically marked as dirty.
    *
    */
  @js.native
  sealed trait recalculate
    extends officeDashJsLib.ExcelNs.CalculationType
  
  /* "Full" */ val full: full with java.lang.String = js.native
  /* "FullRebuild" */ val fullRebuild: fullRebuild with java.lang.String = js.native
  /* "Recalculate" */ val recalculate: recalculate with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[officeDashJsLib.ExcelNs.CalculationType with java.lang.String] = js.native
}

