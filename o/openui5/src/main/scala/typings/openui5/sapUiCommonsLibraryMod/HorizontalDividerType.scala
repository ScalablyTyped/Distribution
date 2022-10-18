package typings.openui5.sapUiCommonsLibraryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait HorizontalDividerType extends StObject
@JSImport("sap/ui/commons/library", "HorizontalDividerType")
@js.native
object HorizontalDividerType extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[HorizontalDividerType & String] = js.native
  
  /**
    * Type Area
    */
  @js.native
  sealed trait Area
    extends StObject
       with HorizontalDividerType
  /* "Area" */ val Area: typings.openui5.sapUiCommonsLibraryMod.HorizontalDividerType.Area & String = js.native
  
  /**
    * Type Page
    */
  @js.native
  sealed trait Page
    extends StObject
       with HorizontalDividerType
  /* "Page" */ val Page: typings.openui5.sapUiCommonsLibraryMod.HorizontalDividerType.Page & String = js.native
}
