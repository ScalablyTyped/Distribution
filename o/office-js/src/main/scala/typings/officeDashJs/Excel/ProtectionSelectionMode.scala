package typings.officeDashJs.Excel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ProtectionSelectionMode extends js.Object

/**
  * [Api set: ExcelApi 1.7]
  */
@JSGlobal("Excel.ProtectionSelectionMode")
@js.native
object ProtectionSelectionMode extends js.Object {
  /**
    *
    * Selection is not allowed for all cells.
    *
    */
  @js.native
  sealed trait none extends ProtectionSelectionMode
  
  /**
    *
    * Selection is allowed for all cells.
    *
    */
  @js.native
  sealed trait normal extends ProtectionSelectionMode
  
  /**
    *
    * Selection is allowed only for cells that are not locked.
    *
    */
  @js.native
  sealed trait unlocked extends ProtectionSelectionMode
  
  /* "None" */ val none: typings.officeDashJs.Excel.ProtectionSelectionMode.none with String = js.native
  /* "Normal" */ val normal: typings.officeDashJs.Excel.ProtectionSelectionMode.normal with String = js.native
  /* "Unlocked" */ val unlocked: typings.officeDashJs.Excel.ProtectionSelectionMode.unlocked with String = js.native
  @JSBracketAccess
  def apply(value: String): js.UndefOr[ProtectionSelectionMode with String] = js.native
}

