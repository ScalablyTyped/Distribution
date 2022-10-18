package typings.openui5.sapUiWebcFioriLibraryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait SideContentPosition extends StObject
@JSImport("sap/ui/webc/fiori/library", "SideContentPosition")
@js.native
object SideContentPosition extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[SideContentPosition & String] = js.native
  
  /**
    * The side content is on the right side of the main container in left-to-right mode and on the left side
    * in right-to-left mode.
    */
  @js.native
  sealed trait End
    extends StObject
       with SideContentPosition
  /* "End" */ val End: typings.openui5.sapUiWebcFioriLibraryMod.SideContentPosition.End & String = js.native
  
  /**
    * The side content is on the left side of the main container in left-to-right mode and on the right side
    * in right-to-left mode.
    */
  @js.native
  sealed trait Start
    extends StObject
       with SideContentPosition
  /* "Start" */ val Start: typings.openui5.sapUiWebcFioriLibraryMod.SideContentPosition.Start & String = js.native
}
