package typings.openui5.sapUiWebcMainLibraryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait TabsOverflowMode extends StObject
@JSImport("sap/ui/webc/main/library", "TabsOverflowMode")
@js.native
object TabsOverflowMode extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[TabsOverflowMode & String] = js.native
  
  /**
    * End type is used if there should be only one overflow with hidden the tabs at the end of the tab container.
    */
  @js.native
  sealed trait End
    extends StObject
       with TabsOverflowMode
  /* "End" */ val End: typings.openui5.sapUiWebcMainLibraryMod.TabsOverflowMode.End & String = js.native
  
  /**
    * StartAndEnd type is used if there should be two overflows on both ends of the tab container.
    */
  @js.native
  sealed trait StartAndEnd
    extends StObject
       with TabsOverflowMode
  /* "StartAndEnd" */ val StartAndEnd: typings.openui5.sapUiWebcMainLibraryMod.TabsOverflowMode.StartAndEnd & String = js.native
}
