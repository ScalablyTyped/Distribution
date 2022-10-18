package typings.openui5.sapMLibraryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ToolbarStyle extends StObject
@JSImport("sap/m/library", "ToolbarStyle")
@js.native
object ToolbarStyle extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[ToolbarStyle & String] = js.native
  
  /**
    * Simplified visual style dependent on the used theme.
    *
    * **Note:** For the Belize themes, the `sap.m.Toolbar` is displayed with no border.
    */
  @js.native
  sealed trait Clear
    extends StObject
       with ToolbarStyle
  /* "Clear" */ val Clear: typings.openui5.sapMLibraryMod.ToolbarStyle.Clear & String = js.native
  
  /**
    * Default visual style dependent on the used theme.
    */
  @js.native
  sealed trait Standard
    extends StObject
       with ToolbarStyle
  /* "Standard" */ val Standard: typings.openui5.sapMLibraryMod.ToolbarStyle.Standard & String = js.native
}
