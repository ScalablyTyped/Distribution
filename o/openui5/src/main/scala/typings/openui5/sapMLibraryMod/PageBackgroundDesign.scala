package typings.openui5.sapMLibraryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait PageBackgroundDesign extends StObject
@JSImport("sap/m/library", "PageBackgroundDesign")
@js.native
object PageBackgroundDesign extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[PageBackgroundDesign & String] = js.native
  
  /**
    * Page background color when a List is set as the Page content.
    */
  @js.native
  sealed trait List
    extends StObject
       with PageBackgroundDesign
  /* "List" */ val List: typings.openui5.sapMLibraryMod.PageBackgroundDesign.List & String = js.native
  
  /**
    * A solid background color dependent on the theme.
    */
  @js.native
  sealed trait Solid
    extends StObject
       with PageBackgroundDesign
  /* "Solid" */ val Solid: typings.openui5.sapMLibraryMod.PageBackgroundDesign.Solid & String = js.native
  
  /**
    * Standard Page background color.
    */
  @js.native
  sealed trait Standard
    extends StObject
       with PageBackgroundDesign
  /* "Standard" */ val Standard: typings.openui5.sapMLibraryMod.PageBackgroundDesign.Standard & String = js.native
  
  /**
    * Transparent background for the page.
    */
  @js.native
  sealed trait Transparent
    extends StObject
       with PageBackgroundDesign
  /* "Transparent" */ val Transparent: typings.openui5.sapMLibraryMod.PageBackgroundDesign.Transparent & String = js.native
}
