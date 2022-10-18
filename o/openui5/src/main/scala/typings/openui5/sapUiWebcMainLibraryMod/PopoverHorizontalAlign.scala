package typings.openui5.sapUiWebcMainLibraryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait PopoverHorizontalAlign extends StObject
@JSImport("sap/ui/webc/main/library", "PopoverHorizontalAlign")
@js.native
object PopoverHorizontalAlign extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[PopoverHorizontalAlign & String] = js.native
  
  /**
    * Popover is centered
    */
  @js.native
  sealed trait Center
    extends StObject
       with PopoverHorizontalAlign
  /* "Center" */ val Center: typings.openui5.sapUiWebcMainLibraryMod.PopoverHorizontalAlign.Center & String = js.native
  
  /**
    * Popover opens on the left side of the target
    */
  @js.native
  sealed trait Left
    extends StObject
       with PopoverHorizontalAlign
  /* "Left" */ val Left: typings.openui5.sapUiWebcMainLibraryMod.PopoverHorizontalAlign.Left & String = js.native
  
  /**
    * Popover opens on the right side of the target
    */
  @js.native
  sealed trait Right
    extends StObject
       with PopoverHorizontalAlign
  /* "Right" */ val Right: typings.openui5.sapUiWebcMainLibraryMod.PopoverHorizontalAlign.Right & String = js.native
  
  /**
    * Popover is stretched
    */
  @js.native
  sealed trait Stretch
    extends StObject
       with PopoverHorizontalAlign
  /* "Stretch" */ val Stretch: typings.openui5.sapUiWebcMainLibraryMod.PopoverHorizontalAlign.Stretch & String = js.native
}
