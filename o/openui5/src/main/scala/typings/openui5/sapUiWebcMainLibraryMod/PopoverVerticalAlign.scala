package typings.openui5.sapUiWebcMainLibraryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait PopoverVerticalAlign extends StObject
@JSImport("sap/ui/webc/main/library", "PopoverVerticalAlign")
@js.native
object PopoverVerticalAlign extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[PopoverVerticalAlign & String] = js.native
  
  /**
    * Popover will be placed at the bottom of the reference control.
    */
  @js.native
  sealed trait Bottom
    extends StObject
       with PopoverVerticalAlign
  /* "Bottom" */ val Bottom: typings.openui5.sapUiWebcMainLibraryMod.PopoverVerticalAlign.Bottom & String = js.native
  
  @js.native
  sealed trait Center
    extends StObject
       with PopoverVerticalAlign
  /* "Center" */ val Center: typings.openui5.sapUiWebcMainLibraryMod.PopoverVerticalAlign.Center & String = js.native
  
  /**
    * Popover will be streched
    */
  @js.native
  sealed trait Stretch
    extends StObject
       with PopoverVerticalAlign
  /* "Stretch" */ val Stretch: typings.openui5.sapUiWebcMainLibraryMod.PopoverVerticalAlign.Stretch & String = js.native
  
  /**
    * Popover will be placed at the top of the reference control.
    */
  @js.native
  sealed trait Top
    extends StObject
       with PopoverVerticalAlign
  /* "Top" */ val Top: typings.openui5.sapUiWebcMainLibraryMod.PopoverVerticalAlign.Top & String = js.native
}
