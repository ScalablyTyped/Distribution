package typings.openui5.sapUiTableLibraryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait VisibleRowCountMode extends StObject
@JSImport("sap/ui/table/library", "VisibleRowCountMode")
@js.native
object VisibleRowCountMode extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[VisibleRowCountMode & String] = js.native
  
  /**
    * The table automatically fills the height of the surrounding container.
    */
  @js.native
  sealed trait Auto
    extends StObject
       with VisibleRowCountMode
  /* "Auto" */ val Auto: typings.openui5.sapUiTableLibraryMod.VisibleRowCountMode.Auto & String = js.native
  
  /**
    * The table always has as many rows as defined in the `visibleRowCount` property.
    */
  @js.native
  sealed trait Fixed
    extends StObject
       with VisibleRowCountMode
  /* "Fixed" */ val Fixed: typings.openui5.sapUiTableLibraryMod.VisibleRowCountMode.Fixed & String = js.native
  
  /**
    * The user can change the `visibleRowCount` by dragging a resizer.
    */
  @js.native
  sealed trait Interactive
    extends StObject
       with VisibleRowCountMode
  /* "Interactive" */ val Interactive: typings.openui5.sapUiTableLibraryMod.VisibleRowCountMode.Interactive & String = js.native
}
