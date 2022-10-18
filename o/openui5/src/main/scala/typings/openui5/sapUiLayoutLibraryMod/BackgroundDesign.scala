package typings.openui5.sapUiLayoutLibraryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait BackgroundDesign extends StObject
@JSImport("sap/ui/layout/library", "BackgroundDesign")
@js.native
object BackgroundDesign extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[BackgroundDesign & String] = js.native
  
  /**
    * A solid background color dependent on the theme.
    */
  @js.native
  sealed trait Solid
    extends StObject
       with BackgroundDesign
  /* "Solid" */ val Solid: typings.openui5.sapUiLayoutLibraryMod.BackgroundDesign.Solid & String = js.native
  
  /**
    * A translucent background depending on the opacity value of the theme.
    */
  @js.native
  sealed trait Translucent
    extends StObject
       with BackgroundDesign
  /* "Translucent" */ val Translucent: typings.openui5.sapUiLayoutLibraryMod.BackgroundDesign.Translucent & String = js.native
  
  /**
    * Transparent background.
    */
  @js.native
  sealed trait Transparent
    extends StObject
       with BackgroundDesign
  /* "Transparent" */ val Transparent: typings.openui5.sapUiLayoutLibraryMod.BackgroundDesign.Transparent & String = js.native
}
