package typings.openui5.sapUiCommonsLibraryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ToolbarDesign extends StObject
@JSImport("sap/ui/commons/library", "ToolbarDesign")
@js.native
object ToolbarDesign extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[ToolbarDesign & String] = js.native
  
  /**
    * The included controls have a very light appearance. The feature might be not supported by all themes.
    */
  @js.native
  sealed trait Flat
    extends StObject
       with ToolbarDesign
  /* "Flat" */ val Flat: typings.openui5.sapUiCommonsLibraryMod.ToolbarDesign.Flat & String = js.native
  
  /**
    * The toolbar elements such as buttons for example have their normal visual design, and the toolbar appears
    * solid. The feature might be not supported by all themes.
    */
  @js.native
  sealed trait Standard
    extends StObject
       with ToolbarDesign
  /* "Standard" */ val Standard: typings.openui5.sapUiCommonsLibraryMod.ToolbarDesign.Standard & String = js.native
  
  /**
    * The controls included in the toolbar have a normal visual design where the toolbar appears transparent.
    * The feature might be not supported by all themes.
    */
  @js.native
  sealed trait Transparent
    extends StObject
       with ToolbarDesign
  /* "Transparent" */ val Transparent: typings.openui5.sapUiCommonsLibraryMod.ToolbarDesign.Transparent & String = js.native
}
