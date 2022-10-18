package typings.openui5.sapMLibraryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait LabelDesign extends StObject
@JSImport("sap/m/library", "LabelDesign")
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
  /* "Bold" */ val Bold: typings.openui5.sapMLibraryMod.LabelDesign.Bold & String = js.native
  
  /**
    * Displays the label in normal mode.
    */
  @js.native
  sealed trait Standard
    extends StObject
       with LabelDesign
  /* "Standard" */ val Standard: typings.openui5.sapMLibraryMod.LabelDesign.Standard & String = js.native
}
