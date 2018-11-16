package typings
package playerframeworkLib.PlayerFrameworkNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait TextTrackDisplayMode extends js.Object

@JSGlobal("PlayerFramework.TextTrackDisplayMode")
@js.native
object TextTrackDisplayMode extends js.Object {
  /**
  		* Indicates tracks should be displayed using both custom and native UI. This is useful for debugging.
  		*/
  @js.native
  sealed trait all
    extends playerframeworkLib.PlayerFrameworkNs.TextTrackDisplayMode
  
  /**
  		* Indicates tracks should be displayed using custom UI.
  		*/
  @js.native
  sealed trait custom
    extends playerframeworkLib.PlayerFrameworkNs.TextTrackDisplayMode
  
  /**
  		* Indicates tracks should be displayed using native UI.
  		*/
  @js.native
  sealed trait native
    extends playerframeworkLib.PlayerFrameworkNs.TextTrackDisplayMode
  
  /**
  		* Indicates tracks should not be displayed.
  		*/
  @js.native
  sealed trait none
    extends playerframeworkLib.PlayerFrameworkNs.TextTrackDisplayMode
  
  /* 3 */ val all: all with scala.Double = js.native
  /* 1 */ val custom: custom with scala.Double = js.native
  /* 2 */ val native: native with scala.Double = js.native
  /* 0 */ val none: none with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[playerframeworkLib.PlayerFrameworkNs.TextTrackDisplayMode with scala.Double] = js.native
}

