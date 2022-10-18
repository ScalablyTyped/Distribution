package typings.openui5.sapUiLayoutLibraryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait GridPosition extends StObject
@JSImport("sap/ui/layout/library", "GridPosition")
@js.native
object GridPosition extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[GridPosition & String] = js.native
  
  /**
    * `Grid` is centered on the screen.
    */
  @js.native
  sealed trait Center
    extends StObject
       with GridPosition
  /* "Center" */ val Center: typings.openui5.sapUiLayoutLibraryMod.GridPosition.Center & String = js.native
  
  /**
    * `Grid` is aligned left.
    */
  @js.native
  sealed trait Left
    extends StObject
       with GridPosition
  /* "Left" */ val Left: typings.openui5.sapUiLayoutLibraryMod.GridPosition.Left & String = js.native
  
  /**
    * `Grid` is aligned to the right.
    */
  @js.native
  sealed trait Right
    extends StObject
       with GridPosition
  /* "Right" */ val Right: typings.openui5.sapUiLayoutLibraryMod.GridPosition.Right & String = js.native
}
