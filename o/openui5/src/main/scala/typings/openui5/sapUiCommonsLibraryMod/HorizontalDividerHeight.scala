package typings.openui5.sapUiCommonsLibraryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait HorizontalDividerHeight extends StObject
@JSImport("sap/ui/commons/library", "HorizontalDividerHeight")
@js.native
object HorizontalDividerHeight extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[HorizontalDividerHeight & String] = js.native
  
  /**
    * Divider gets a large top and bottom margin.
    */
  @js.native
  sealed trait Large
    extends StObject
       with HorizontalDividerHeight
  /* "Large" */ val Large: typings.openui5.sapUiCommonsLibraryMod.HorizontalDividerHeight.Large & String = js.native
  
  /**
    * Divider gets a medium top and bottom margin.
    */
  @js.native
  sealed trait Medium
    extends StObject
       with HorizontalDividerHeight
  /* "Medium" */ val Medium: typings.openui5.sapUiCommonsLibraryMod.HorizontalDividerHeight.Medium & String = js.native
  
  /**
    * Divider gets no top and bottom margin.
    */
  @js.native
  sealed trait Ruleheight
    extends StObject
       with HorizontalDividerHeight
  /* "Ruleheight" */ val Ruleheight: typings.openui5.sapUiCommonsLibraryMod.HorizontalDividerHeight.Ruleheight & String = js.native
  
  /**
    * Divider gets a small top and bottom margin.
    */
  @js.native
  sealed trait Small
    extends StObject
       with HorizontalDividerHeight
  /* "Small" */ val Small: typings.openui5.sapUiCommonsLibraryMod.HorizontalDividerHeight.Small & String = js.native
}
