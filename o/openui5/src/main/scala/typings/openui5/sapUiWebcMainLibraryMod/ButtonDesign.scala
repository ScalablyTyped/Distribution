package typings.openui5.sapUiWebcMainLibraryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ButtonDesign extends StObject
@JSImport("sap/ui/webc/main/library", "ButtonDesign")
@js.native
object ButtonDesign extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[ButtonDesign & String] = js.native
  
  /**
    * attention type
    */
  @js.native
  sealed trait Attention
    extends StObject
       with ButtonDesign
  /* "Attention" */ val Attention: typings.openui5.sapUiWebcMainLibraryMod.ButtonDesign.Attention & String = js.native
  
  /**
    * default type (no special styling)
    */
  @js.native
  sealed trait Default
    extends StObject
       with ButtonDesign
  /* "Default" */ val Default: typings.openui5.sapUiWebcMainLibraryMod.ButtonDesign.Default & String = js.native
  
  /**
    * emphasized type
    */
  @js.native
  sealed trait Emphasized
    extends StObject
       with ButtonDesign
  /* "Emphasized" */ val Emphasized: typings.openui5.sapUiWebcMainLibraryMod.ButtonDesign.Emphasized & String = js.native
  
  /**
    * reject style (red button)
    */
  @js.native
  sealed trait Negative
    extends StObject
       with ButtonDesign
  /* "Negative" */ val Negative: typings.openui5.sapUiWebcMainLibraryMod.ButtonDesign.Negative & String = js.native
  
  /**
    * accept type (green button)
    */
  @js.native
  sealed trait Positive
    extends StObject
       with ButtonDesign
  /* "Positive" */ val Positive: typings.openui5.sapUiWebcMainLibraryMod.ButtonDesign.Positive & String = js.native
  
  /**
    * transparent type
    */
  @js.native
  sealed trait Transparent
    extends StObject
       with ButtonDesign
  /* "Transparent" */ val Transparent: typings.openui5.sapUiWebcMainLibraryMod.ButtonDesign.Transparent & String = js.native
}
