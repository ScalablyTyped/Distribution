package typings.openui5.sapUiWebcMainLibraryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait TabLayout extends StObject
@JSImport("sap/ui/webc/main/library", "TabLayout")
@js.native
object TabLayout extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[TabLayout & String] = js.native
  
  /**
    * Inline type, the tab `main text` and `additionalText` are displayed horizotally.
    */
  @js.native
  sealed trait Inline
    extends StObject
       with TabLayout
  /* "Inline" */ val Inline: typings.openui5.sapUiWebcMainLibraryMod.TabLayout.Inline & String = js.native
  
  /**
    * Standard type, the tab `main text` and `additionalText` are displayed vertically.
    */
  @js.native
  sealed trait Standard
    extends StObject
       with TabLayout
  /* "Standard" */ val Standard: typings.openui5.sapUiWebcMainLibraryMod.TabLayout.Standard & String = js.native
}
