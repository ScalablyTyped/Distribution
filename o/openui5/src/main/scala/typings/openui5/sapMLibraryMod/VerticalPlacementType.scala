package typings.openui5.sapMLibraryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait VerticalPlacementType extends StObject
@JSImport("sap/m/library", "VerticalPlacementType")
@js.native
object VerticalPlacementType extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[VerticalPlacementType & String] = js.native
  
  /**
    * Popover will be placed at the bottom of the reference control.
    */
  @js.native
  sealed trait Bottom
    extends StObject
       with VerticalPlacementType
  /* "Bottom" */ val Bottom: typings.openui5.sapMLibraryMod.VerticalPlacementType.Bottom & String = js.native
  
  /**
    * Popover will be placed at the top of the reference control.
    */
  @js.native
  sealed trait Top
    extends StObject
       with VerticalPlacementType
  /* "Top" */ val Top: typings.openui5.sapMLibraryMod.VerticalPlacementType.Top & String = js.native
  
  /**
    * Popover will be placed at the top or bottom of the reference control.
    */
  @js.native
  sealed trait Vertical
    extends StObject
       with VerticalPlacementType
  /* "Vertical" */ val Vertical: typings.openui5.sapMLibraryMod.VerticalPlacementType.Vertical & String = js.native
}
