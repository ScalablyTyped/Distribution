package typings.openui5.sapUiCoreLibraryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait Orientation extends StObject
@JSImport("sap/ui/core/library", "Orientation")
@js.native
object Orientation extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[Orientation & String] = js.native
  
  /**
    * Arrange Horizontally
    */
  @js.native
  sealed trait Horizontal
    extends StObject
       with Orientation
  /* "Horizontal" */ val Horizontal: typings.openui5.sapUiCoreLibraryMod.Orientation.Horizontal & String = js.native
  
  /**
    * Arrange Vertically
    */
  @js.native
  sealed trait Vertical
    extends StObject
       with Orientation
  /* "Vertical" */ val Vertical: typings.openui5.sapUiCoreLibraryMod.Orientation.Vertical & String = js.native
}
