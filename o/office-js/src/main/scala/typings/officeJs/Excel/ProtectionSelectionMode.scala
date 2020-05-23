package typings.officeJs.Excel

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
    * Selection is not allowed for all cells.
    *
    */
  @js.native
  sealed trait none extends ProtectionSelectionMode
  
  /**
    * Selection is allowed for all cells.
    *
    */
  @js.native
  sealed trait normal extends ProtectionSelectionMode
  
  /**
    * Selection is allowed only for cells that are not locked.
    *
    */
  @js.native
  sealed trait unlocked extends ProtectionSelectionMode
  
}

