package typings.openui5.sapUiWebcMainLibraryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait SemanticColor extends StObject
@JSImport("sap/ui/webc/main/library", "SemanticColor")
@js.native
object SemanticColor extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[SemanticColor & String] = js.native
  
  /**
    * Critical color
    */
  @js.native
  sealed trait Critical
    extends StObject
       with SemanticColor
  /* "Critical" */ val Critical: typings.openui5.sapUiWebcMainLibraryMod.SemanticColor.Critical & String = js.native
  
  /**
    * Default color (brand color)
    */
  @js.native
  sealed trait Default
    extends StObject
       with SemanticColor
  /* "Default" */ val Default: typings.openui5.sapUiWebcMainLibraryMod.SemanticColor.Default & String = js.native
  
  /**
    * Negative color
    */
  @js.native
  sealed trait Negative
    extends StObject
       with SemanticColor
  /* "Negative" */ val Negative: typings.openui5.sapUiWebcMainLibraryMod.SemanticColor.Negative & String = js.native
  
  /**
    * Neutral color.
    */
  @js.native
  sealed trait Neutral
    extends StObject
       with SemanticColor
  /* "Neutral" */ val Neutral: typings.openui5.sapUiWebcMainLibraryMod.SemanticColor.Neutral & String = js.native
  
  /**
    * Positive color
    */
  @js.native
  sealed trait Positive
    extends StObject
       with SemanticColor
  /* "Positive" */ val Positive: typings.openui5.sapUiWebcMainLibraryMod.SemanticColor.Positive & String = js.native
}
