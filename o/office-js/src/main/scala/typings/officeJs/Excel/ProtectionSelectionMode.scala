package typings.officeJs.Excel

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ProtectionSelectionMode extends StObject
/**
  * [Api set: ExcelApi 1.7]
  */
@JSGlobal("Excel.ProtectionSelectionMode")
@js.native
object ProtectionSelectionMode extends StObject {
  
  /**
    * Selection is not allowed for all cells.
    *
    */
  @js.native
  sealed trait none
    extends StObject
       with ProtectionSelectionMode
  
  /**
    * Selection is allowed for all cells.
    *
    */
  @js.native
  sealed trait normal
    extends StObject
       with ProtectionSelectionMode
  
  /**
    * Selection is allowed only for cells that are not locked.
    *
    */
  @js.native
  sealed trait unlocked
    extends StObject
       with ProtectionSelectionMode
}
