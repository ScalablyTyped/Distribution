package typings.openui5.sapUiWebcMainLibraryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait GrowingMode extends StObject
@JSImport("sap/ui/webc/main/library", "GrowingMode")
@js.native
object GrowingMode extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[GrowingMode & String] = js.native
  
  /**
    * Component's `load-more` is fired upon pressing a "More" button. at the bottom.
    */
  @js.native
  sealed trait Button
    extends StObject
       with GrowingMode
  /* "Button" */ val Button: typings.openui5.sapUiWebcMainLibraryMod.GrowingMode.Button & String = js.native
  
  /**
    * Component's growing is not enabled.
    */
  @js.native
  sealed trait None
    extends StObject
       with GrowingMode
  /* "None" */ val None: typings.openui5.sapUiWebcMainLibraryMod.GrowingMode.None & String = js.native
  
  /**
    * Component's `load-more` is fired upon scroll.
    */
  @js.native
  sealed trait Scroll
    extends StObject
       with GrowingMode
  /* "Scroll" */ val Scroll: typings.openui5.sapUiWebcMainLibraryMod.GrowingMode.Scroll & String = js.native
}
