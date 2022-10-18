package typings.openui5.sapUiWebcMainLibraryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ListGrowingMode extends StObject
@JSImport("sap/ui/webc/main/library", "ListGrowingMode")
@js.native
object ListGrowingMode extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[ListGrowingMode & String] = js.native
  
  /**
    * Component's `load-more` is fired upon pressing a "More" button. at the bottom.
    */
  @js.native
  sealed trait Button
    extends StObject
       with ListGrowingMode
  /* "Button" */ val Button: typings.openui5.sapUiWebcMainLibraryMod.ListGrowingMode.Button & String = js.native
  
  /**
    * Component's growing is not enabled.
    */
  @js.native
  sealed trait None
    extends StObject
       with ListGrowingMode
  /* "None" */ val None: typings.openui5.sapUiWebcMainLibraryMod.ListGrowingMode.None & String = js.native
  
  /**
    * Component's `load-more` is fired upon scroll.
    */
  @js.native
  sealed trait Scroll
    extends StObject
       with ListGrowingMode
  /* "Scroll" */ val Scroll: typings.openui5.sapUiWebcMainLibraryMod.ListGrowingMode.Scroll & String = js.native
}
