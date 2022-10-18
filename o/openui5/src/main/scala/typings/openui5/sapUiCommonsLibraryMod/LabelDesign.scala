package typings.openui5.sapUiCommonsLibraryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait LabelDesign extends StObject
@JSImport("sap/ui/commons/library", "LabelDesign")
@js.native
object LabelDesign extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[LabelDesign & String] = js.native
  
  /**
    * Displays the label in bold.
    */
  @js.native
  sealed trait Bold
    extends StObject
       with LabelDesign
  /* "Bold" */ val Bold: typings.openui5.sapUiCommonsLibraryMod.LabelDesign.Bold & String = js.native
  
  /**
    * Displays the label in normal mode.
    */
  @js.native
  sealed trait Standard
    extends StObject
       with LabelDesign
  /* "Standard" */ val Standard: typings.openui5.sapUiCommonsLibraryMod.LabelDesign.Standard & String = js.native
}
