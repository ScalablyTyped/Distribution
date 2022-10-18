package typings.openui5.sapUiUx3LibraryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait VisibleItemCountMode extends StObject
@JSImport("sap/ui/ux3/library", "VisibleItemCountMode")
@js.native
object VisibleItemCountMode extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[VisibleItemCountMode & String] = js.native
  
  /**
    * The FacetFilter automatically fills the height of the surrounding container. The visibleItemCount property
    * is automatically changed accordingly.
    */
  @js.native
  sealed trait Auto
    extends StObject
       with VisibleItemCountMode
  /* "Auto" */ val Auto: typings.openui5.sapUiUx3LibraryMod.VisibleItemCountMode.Auto & String = js.native
  
  /**
    * The FacetFilter always has as many items in the FacetFilterList as defined in the visibleItemCount property.
    */
  @js.native
  sealed trait Fixed
    extends StObject
       with VisibleItemCountMode
  /* "Fixed" */ val Fixed: typings.openui5.sapUiUx3LibraryMod.VisibleItemCountMode.Fixed & String = js.native
}
