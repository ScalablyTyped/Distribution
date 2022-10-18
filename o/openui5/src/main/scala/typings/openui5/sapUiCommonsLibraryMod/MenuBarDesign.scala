package typings.openui5.sapUiCommonsLibraryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait MenuBarDesign extends StObject
@JSImport("sap/ui/commons/library", "MenuBarDesign")
@js.native
object MenuBarDesign extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[MenuBarDesign & String] = js.native
  
  /**
    * The MenuBar appears in header design.
    */
  @js.native
  sealed trait Header
    extends StObject
       with MenuBarDesign
  /* "Header" */ val Header: typings.openui5.sapUiCommonsLibraryMod.MenuBarDesign.Header & String = js.native
  
  /**
    * The MenuBar appears in standard design.
    */
  @js.native
  sealed trait Standard
    extends StObject
       with MenuBarDesign
  /* "Standard" */ val Standard: typings.openui5.sapUiCommonsLibraryMod.MenuBarDesign.Standard & String = js.native
}
