package typings.openui5.sapUiCoreLibraryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait Design extends StObject
@JSImport("sap/ui/core/library", "Design")
@js.native
object Design extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[Design & String] = js.native
  
  /**
    * Mono space font
    */
  @js.native
  sealed trait Monospace
    extends StObject
       with Design
  /* "Monospace" */ val Monospace: typings.openui5.sapUiCoreLibraryMod.Design.Monospace & String = js.native
  
  /**
    * Standard font
    */
  @js.native
  sealed trait Standard
    extends StObject
       with Design
  /* "Standard" */ val Standard: typings.openui5.sapUiCoreLibraryMod.Design.Standard & String = js.native
}
