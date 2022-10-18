package typings.openui5.sapUiWebcMainLibraryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait LinkDesign extends StObject
@JSImport("sap/ui/webc/main/library", "LinkDesign")
@js.native
object LinkDesign extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[LinkDesign & String] = js.native
  
  /**
    * default type (no special styling)
    */
  @js.native
  sealed trait Default
    extends StObject
       with LinkDesign
  /* "Default" */ val Default: typings.openui5.sapUiWebcMainLibraryMod.LinkDesign.Default & String = js.native
  
  /**
    * emphasized type
    */
  @js.native
  sealed trait Emphasized
    extends StObject
       with LinkDesign
  /* "Emphasized" */ val Emphasized: typings.openui5.sapUiWebcMainLibraryMod.LinkDesign.Emphasized & String = js.native
  
  /**
    * subtle type (appears as regular text, rather than a link)
    */
  @js.native
  sealed trait Subtle
    extends StObject
       with LinkDesign
  /* "Subtle" */ val Subtle: typings.openui5.sapUiWebcMainLibraryMod.LinkDesign.Subtle & String = js.native
}
