package typings.openui5.sapUiWebcMainLibraryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait TableGrowingMode extends StObject
@JSImport("sap/ui/webc/main/library", "TableGrowingMode")
@js.native
object TableGrowingMode extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[TableGrowingMode & String] = js.native
  
  /**
    * Component's `load-more` is fired upon pressing a "More" button. at the bottom.
    */
  @js.native
  sealed trait Button
    extends StObject
       with TableGrowingMode
  /* "Button" */ val Button: typings.openui5.sapUiWebcMainLibraryMod.TableGrowingMode.Button & String = js.native
  
  /**
    * Component's growing is not enabled.
    */
  @js.native
  sealed trait None
    extends StObject
       with TableGrowingMode
  /* "None" */ val None: typings.openui5.sapUiWebcMainLibraryMod.TableGrowingMode.None & String = js.native
  
  /**
    * Component's `load-more` is fired upon scroll.
    */
  @js.native
  sealed trait Scroll
    extends StObject
       with TableGrowingMode
  /* "Scroll" */ val Scroll: typings.openui5.sapUiWebcMainLibraryMod.TableGrowingMode.Scroll & String = js.native
}
