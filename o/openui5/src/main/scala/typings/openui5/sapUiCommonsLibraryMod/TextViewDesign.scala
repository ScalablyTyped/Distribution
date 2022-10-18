package typings.openui5.sapUiCommonsLibraryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait TextViewDesign extends StObject
@JSImport("sap/ui/commons/library", "TextViewDesign")
@js.native
object TextViewDesign extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[TextViewDesign & String] = js.native
  
  /**
    * Displays the text in bold letters
    */
  @js.native
  sealed trait Bold
    extends StObject
       with TextViewDesign
  /* "Bold" */ val Bold: typings.openui5.sapUiCommonsLibraryMod.TextViewDesign.Bold & String = js.native
  
  /**
    * Displays the text in header 1 letters.
    */
  @js.native
  sealed trait H1
    extends StObject
       with TextViewDesign
  /* "H1" */ val H1: typings.openui5.sapUiCommonsLibraryMod.TextViewDesign.H1 & String = js.native
  
  /**
    * Displays the text in header 2 letters.
    */
  @js.native
  sealed trait H2
    extends StObject
       with TextViewDesign
  /* "H2" */ val H2: typings.openui5.sapUiCommonsLibraryMod.TextViewDesign.H2 & String = js.native
  
  /**
    * Displays the text in header 3 letters.
    */
  @js.native
  sealed trait H3
    extends StObject
       with TextViewDesign
  /* "H3" */ val H3: typings.openui5.sapUiCommonsLibraryMod.TextViewDesign.H3 & String = js.native
  
  /**
    * Displays the text in header 4 letters.
    */
  @js.native
  sealed trait H4
    extends StObject
       with TextViewDesign
  /* "H4" */ val H4: typings.openui5.sapUiCommonsLibraryMod.TextViewDesign.H4 & String = js.native
  
  /**
    * Displays the text in header 5 letters.
    */
  @js.native
  sealed trait H5
    extends StObject
       with TextViewDesign
  /* "H5" */ val H5: typings.openui5.sapUiCommonsLibraryMod.TextViewDesign.H5 & String = js.native
  
  /**
    * Displays the text in header 6 letters.
    */
  @js.native
  sealed trait H6
    extends StObject
       with TextViewDesign
  /* "H6" */ val H6: typings.openui5.sapUiCommonsLibraryMod.TextViewDesign.H6 & String = js.native
  
  /**
    * Displays the text in italic letters
    */
  @js.native
  sealed trait Italic
    extends StObject
       with TextViewDesign
  /* "Italic" */ val Italic: typings.openui5.sapUiCommonsLibraryMod.TextViewDesign.Italic & String = js.native
  
  /**
    * Displays the text in monospace letters.
    */
  @js.native
  sealed trait Monospace
    extends StObject
       with TextViewDesign
  /* "Monospace" */ val Monospace: typings.openui5.sapUiCommonsLibraryMod.TextViewDesign.Monospace & String = js.native
  
  /**
    * Displays the text in smaller letters.
    */
  @js.native
  sealed trait Small
    extends StObject
       with TextViewDesign
  /* "Small" */ val Small: typings.openui5.sapUiCommonsLibraryMod.TextViewDesign.Small & String = js.native
  
  /**
    * Displays the text in standard letters.
    */
  @js.native
  sealed trait Standard
    extends StObject
       with TextViewDesign
  /* "Standard" */ val Standard: typings.openui5.sapUiCommonsLibraryMod.TextViewDesign.Standard & String = js.native
  
  /**
    * underlined Text
    */
  @js.native
  sealed trait Underline
    extends StObject
       with TextViewDesign
  /* "Underline" */ val Underline: typings.openui5.sapUiCommonsLibraryMod.TextViewDesign.Underline & String = js.native
}
