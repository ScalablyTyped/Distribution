package typings.openui5.sapUiCoreLibraryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait OpenState extends StObject
@JSImport("sap/ui/core/library", "OpenState")
@js.native
object OpenState extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[OpenState & String] = js.native
  
  /**
    * Closed and currently not changing states.
    */
  @js.native
  sealed trait CLOSED
    extends StObject
       with OpenState
  /* "CLOSED" */ val CLOSED: typings.openui5.sapUiCoreLibraryMod.OpenState.CLOSED & String = js.native
  
  /**
    * Still open, but in the process of going to the CLOSED state.
    */
  @js.native
  sealed trait CLOSING
    extends StObject
       with OpenState
  /* "CLOSING" */ val CLOSING: typings.openui5.sapUiCoreLibraryMod.OpenState.CLOSING & String = js.native
  
  /**
    * Open and currently not changing states.
    */
  @js.native
  sealed trait OPEN
    extends StObject
       with OpenState
  /* "OPEN" */ val OPEN: typings.openui5.sapUiCoreLibraryMod.OpenState.OPEN & String = js.native
  
  /**
    * Already left the CLOSED state, is not OPEN yet, but in the process of getting OPEN.
    */
  @js.native
  sealed trait OPENING
    extends StObject
       with OpenState
  /* "OPENING" */ val OPENING: typings.openui5.sapUiCoreLibraryMod.OpenState.OPENING & String = js.native
}
