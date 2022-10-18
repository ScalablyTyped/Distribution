package typings.openui5.sapUiCommonsLibraryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ToolbarSeparatorDesign extends StObject
@JSImport("sap/ui/commons/library", "ToolbarSeparatorDesign")
@js.native
object ToolbarSeparatorDesign extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[ToolbarSeparatorDesign & String] = js.native
  
  /**
    * 100% height Separator before and after specific controls
    */
  @js.native
  sealed trait FullHeight
    extends StObject
       with ToolbarSeparatorDesign
  /* "FullHeight" */ val FullHeight: typings.openui5.sapUiCommonsLibraryMod.ToolbarSeparatorDesign.FullHeight & String = js.native
  
  /**
    * Standard Separator between controls
    */
  @js.native
  sealed trait Standard
    extends StObject
       with ToolbarSeparatorDesign
  /* "Standard" */ val Standard: typings.openui5.sapUiCommonsLibraryMod.ToolbarSeparatorDesign.Standard & String = js.native
}
