package typings.openui5.sapFLibraryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait SidePanelPosition extends StObject
@JSImport("sap/f/library", "SidePanelPosition")
@js.native
object SidePanelPosition extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[SidePanelPosition & String] = js.native
  
  /**
    * The position is left.
    */
  @js.native
  sealed trait Left
    extends StObject
       with SidePanelPosition
  /* "Left" */ val Left: typings.openui5.sapFLibraryMod.SidePanelPosition.Left & String = js.native
  
  /**
    * The position is right.
    */
  @js.native
  sealed trait Right
    extends StObject
       with SidePanelPosition
  /* "Right" */ val Right: typings.openui5.sapFLibraryMod.SidePanelPosition.Right & String = js.native
}
