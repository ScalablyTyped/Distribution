package typings
package officeDashJsDashPreviewLib.ExcelNs

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
  sealed trait none
    extends officeDashJsDashPreviewLib.ExcelNs.ProtectionSelectionMode
  
  /**
           *
           * Selection is allowed for all cells.
           *
           */
  @js.native
  sealed trait normal
    extends officeDashJsDashPreviewLib.ExcelNs.ProtectionSelectionMode
  
  /**
           *
           * Selection is allowed only for cells that are not locked.
           *
           */
  @js.native
  sealed trait unlocked
    extends officeDashJsDashPreviewLib.ExcelNs.ProtectionSelectionMode
  
  /* "None" */ val none: none with java.lang.String = js.native
  /* "Normal" */ val normal: normal with java.lang.String = js.native
  /* "Unlocked" */ val unlocked: unlocked with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[officeDashJsDashPreviewLib.ExcelNs.ProtectionSelectionMode with java.lang.String] = js.native
}

