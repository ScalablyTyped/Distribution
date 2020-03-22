package typings.officeJs.Excel

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[ProtectionSelectionMode with String] = js.native
  /* "None" */ @js.native
  object none extends TopLevel[none with String]
  
  /* "Normal" */ @js.native
  object normal extends TopLevel[normal with String]
  
  /* "Unlocked" */ @js.native
  object unlocked extends TopLevel[unlocked with String]
  
}

