package typings.openui5.sapMLibraryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait TileSizeBehavior extends StObject
@JSImport("sap/m/library", "TileSizeBehavior")
@js.native
object TileSizeBehavior extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[TileSizeBehavior & String] = js.native
  
  /**
    * Default behavior: Tiles adapt to the size of the screen, getting smaller on small screens.
    */
  @js.native
  sealed trait Responsive
    extends StObject
       with TileSizeBehavior
  /* "Responsive" */ val Responsive: typings.openui5.sapMLibraryMod.TileSizeBehavior.Responsive & String = js.native
  
  /**
    * Tiles are small all the time, regardless of the actual screen size.
    */
  @js.native
  sealed trait Small
    extends StObject
       with TileSizeBehavior
  /* "Small" */ val Small: typings.openui5.sapMLibraryMod.TileSizeBehavior.Small & String = js.native
}
