package typings.openui5.sapUiWebcMainLibraryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait SwitchDesign extends StObject
@JSImport("sap/ui/webc/main/library", "SwitchDesign")
@js.native
object SwitchDesign extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[SwitchDesign & String] = js.native
  
  /**
    * Defines the Switch as Graphical
    */
  @js.native
  sealed trait Graphical
    extends StObject
       with SwitchDesign
  /* "Graphical" */ val Graphical: typings.openui5.sapUiWebcMainLibraryMod.SwitchDesign.Graphical & String = js.native
  
  /**
    * Defines the Switch as Textual
    */
  @js.native
  sealed trait Textual
    extends StObject
       with SwitchDesign
  /* "Textual" */ val Textual: typings.openui5.sapUiWebcMainLibraryMod.SwitchDesign.Textual & String = js.native
}
