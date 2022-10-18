package typings.openui5.sapMLibraryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait TabsOverflowMode extends StObject
@JSImport("sap/m/library", "TabsOverflowMode")
@js.native
object TabsOverflowMode extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[TabsOverflowMode & String] = js.native
  
  /**
    * Default behavior: One overflow tab at the end of the header.
    */
  @js.native
  sealed trait End
    extends StObject
       with TabsOverflowMode
  /* "End" */ val End: typings.openui5.sapMLibraryMod.TabsOverflowMode.End & String = js.native
  
  /**
    * Two overflow tabs at both ends of the header to keep tabs order intact.
    */
  @js.native
  sealed trait StartAndEnd
    extends StObject
       with TabsOverflowMode
  /* "StartAndEnd" */ val StartAndEnd: typings.openui5.sapMLibraryMod.TabsOverflowMode.StartAndEnd & String = js.native
}
