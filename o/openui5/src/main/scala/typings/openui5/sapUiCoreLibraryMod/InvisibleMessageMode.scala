package typings.openui5.sapUiCoreLibraryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait InvisibleMessageMode extends StObject
@JSImport("sap/ui/core/library", "InvisibleMessageMode")
@js.native
object InvisibleMessageMode extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[InvisibleMessageMode & String] = js.native
  
  /**
    * Indicates that updates to the region have the highest priority and should be presented to the user immediately.
    */
  @js.native
  sealed trait Assertive
    extends StObject
       with InvisibleMessageMode
  /* "Assertive" */ val Assertive: typings.openui5.sapUiCoreLibraryMod.InvisibleMessageMode.Assertive & String = js.native
  
  /**
    * Indicates that updates to the region should be presented at the next graceful opportunity, such as at
    * the end of reading the current sentence, or when the user pauses typing.
    */
  @js.native
  sealed trait Polite
    extends StObject
       with InvisibleMessageMode
  /* "Polite" */ val Polite: typings.openui5.sapUiCoreLibraryMod.InvisibleMessageMode.Polite & String = js.native
}
