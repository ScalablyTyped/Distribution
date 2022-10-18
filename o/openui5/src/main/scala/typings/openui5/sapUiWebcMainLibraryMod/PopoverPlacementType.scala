package typings.openui5.sapUiWebcMainLibraryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait PopoverPlacementType extends StObject
@JSImport("sap/ui/webc/main/library", "PopoverPlacementType")
@js.native
object PopoverPlacementType extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[PopoverPlacementType & String] = js.native
  
  /**
    * Popover will be placed at the bottom of the reference element.
    */
  @js.native
  sealed trait Bottom
    extends StObject
       with PopoverPlacementType
  /* "Bottom" */ val Bottom: typings.openui5.sapUiWebcMainLibraryMod.PopoverPlacementType.Bottom & String = js.native
  
  /**
    * Popover will be placed at the left side of the reference element.
    */
  @js.native
  sealed trait Left
    extends StObject
       with PopoverPlacementType
  /* "Left" */ val Left: typings.openui5.sapUiWebcMainLibraryMod.PopoverPlacementType.Left & String = js.native
  
  /**
    * Popover will be placed at the right side of the reference element.
    */
  @js.native
  sealed trait Right
    extends StObject
       with PopoverPlacementType
  /* "Right" */ val Right: typings.openui5.sapUiWebcMainLibraryMod.PopoverPlacementType.Right & String = js.native
  
  /**
    * Popover will be placed at the top of the reference element.
    */
  @js.native
  sealed trait Top
    extends StObject
       with PopoverPlacementType
  /* "Top" */ val Top: typings.openui5.sapUiWebcMainLibraryMod.PopoverPlacementType.Top & String = js.native
}
