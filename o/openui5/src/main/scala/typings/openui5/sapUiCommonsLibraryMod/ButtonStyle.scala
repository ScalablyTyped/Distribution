package typings.openui5.sapUiCommonsLibraryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ButtonStyle extends StObject
@JSImport("sap/ui/commons/library", "ButtonStyle")
@js.native
object ButtonStyle extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[ButtonStyle & String] = js.native
  
  /**
    * Accept button (normally green).
    */
  @js.native
  sealed trait Accept
    extends StObject
       with ButtonStyle
  /* "Accept" */ val Accept: typings.openui5.sapUiCommonsLibraryMod.ButtonStyle.Accept & String = js.native
  
  /**
    * default style (no special styling).
    */
  @js.native
  sealed trait Default
    extends StObject
       with ButtonStyle
  /* "Default" */ val Default: typings.openui5.sapUiCommonsLibraryMod.ButtonStyle.Default & String = js.native
  
  /**
    * Button is emphasized.
    */
  @js.native
  sealed trait Emph
    extends StObject
       with ButtonStyle
  /* "Emph" */ val Emph: typings.openui5.sapUiCommonsLibraryMod.ButtonStyle.Emph & String = js.native
  
  /**
    * Reject button (normally red).
    */
  @js.native
  sealed trait Reject
    extends StObject
       with ButtonStyle
  /* "Reject" */ val Reject: typings.openui5.sapUiCommonsLibraryMod.ButtonStyle.Reject & String = js.native
}
