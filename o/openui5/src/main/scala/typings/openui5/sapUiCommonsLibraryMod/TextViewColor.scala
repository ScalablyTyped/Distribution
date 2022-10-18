package typings.openui5.sapUiCommonsLibraryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait TextViewColor extends StObject
@JSImport("sap/ui/commons/library", "TextViewColor")
@js.native
object TextViewColor extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[TextViewColor & String] = js.native
  
  /**
    * Critical color
    */
  @js.native
  sealed trait Critical
    extends StObject
       with TextViewColor
  /* "Critical" */ val Critical: typings.openui5.sapUiCommonsLibraryMod.TextViewColor.Critical & String = js.native
  
  /**
    * Default color
    */
  @js.native
  sealed trait Default
    extends StObject
       with TextViewColor
  /* "Default" */ val Default: typings.openui5.sapUiCommonsLibraryMod.TextViewColor.Default & String = js.native
  
  /**
    * Negative color
    */
  @js.native
  sealed trait Negative
    extends StObject
       with TextViewColor
  /* "Negative" */ val Negative: typings.openui5.sapUiCommonsLibraryMod.TextViewColor.Negative & String = js.native
  
  /**
    * Positive color
    */
  @js.native
  sealed trait Positive
    extends StObject
       with TextViewColor
  /* "Positive" */ val Positive: typings.openui5.sapUiCommonsLibraryMod.TextViewColor.Positive & String = js.native
}
