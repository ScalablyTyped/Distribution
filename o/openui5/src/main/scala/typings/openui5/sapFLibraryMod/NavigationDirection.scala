package typings.openui5.sapFLibraryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait NavigationDirection extends StObject
@JSImport("sap/f/library", "NavigationDirection")
@js.native
object NavigationDirection extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[NavigationDirection & String] = js.native
  
  /**
    * The direction is down.
    */
  @js.native
  sealed trait Down
    extends StObject
       with NavigationDirection
  /* "Down" */ val Down: typings.openui5.sapFLibraryMod.NavigationDirection.Down & String = js.native
  
  /**
    * The direction is left.
    */
  @js.native
  sealed trait Left
    extends StObject
       with NavigationDirection
  /* "Left" */ val Left: typings.openui5.sapFLibraryMod.NavigationDirection.Left & String = js.native
  
  /**
    * The direction is right.
    */
  @js.native
  sealed trait Right
    extends StObject
       with NavigationDirection
  /* "Right" */ val Right: typings.openui5.sapFLibraryMod.NavigationDirection.Right & String = js.native
  
  /**
    * The direction is up.
    */
  @js.native
  sealed trait Up
    extends StObject
       with NavigationDirection
  /* "Up" */ val Up: typings.openui5.sapFLibraryMod.NavigationDirection.Up & String = js.native
}
