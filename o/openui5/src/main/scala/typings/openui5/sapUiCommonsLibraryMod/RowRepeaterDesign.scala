package typings.openui5.sapUiCommonsLibraryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait RowRepeaterDesign extends StObject
@JSImport("sap/ui/commons/library", "RowRepeaterDesign")
@js.native
object RowRepeaterDesign extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[RowRepeaterDesign & String] = js.native
  
  /**
    * The RowRepeater will be displayed without header, toolbar or footer. Background will be transparent.
    */
  @js.native
  sealed trait BareShell
    extends StObject
       with RowRepeaterDesign
  /* "BareShell" */ val BareShell: typings.openui5.sapUiCommonsLibraryMod.RowRepeaterDesign.BareShell & String = js.native
  
  /**
    * The RowRepeater header and footer elements, as well as the row container background, appear solid.
    */
  @js.native
  sealed trait Standard
    extends StObject
       with RowRepeaterDesign
  /* "Standard" */ val Standard: typings.openui5.sapUiCommonsLibraryMod.RowRepeaterDesign.Standard & String = js.native
  
  /**
    * The RowRepeater header and footer elements, as well as the row container background, appear transparent.
    */
  @js.native
  sealed trait Transparent
    extends StObject
       with RowRepeaterDesign
  /* "Transparent" */ val Transparent: typings.openui5.sapUiCommonsLibraryMod.RowRepeaterDesign.Transparent & String = js.native
}
