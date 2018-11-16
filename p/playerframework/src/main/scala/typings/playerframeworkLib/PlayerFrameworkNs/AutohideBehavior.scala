package typings
package playerframeworkLib.PlayerFrameworkNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait AutohideBehavior extends js.Object

@JSGlobal("PlayerFramework.AutohideBehavior")
@js.native
object AutohideBehavior extends js.Object {
  /**
  		* All behaviors are applied to the autohide feature.
  		**/
  @js.native
  sealed trait all
    extends playerframeworkLib.PlayerFrameworkNs.AutohideBehavior
  
  /**
  		* Autohide is allowed during media playback only.
  		**/
  @js.native
  sealed trait allowDuringPlaybackOnly
    extends playerframeworkLib.PlayerFrameworkNs.AutohideBehavior
  
  /**
  		* No behaviors are applied to the autohide feature.
  		**/
  @js.native
  sealed trait none
    extends playerframeworkLib.PlayerFrameworkNs.AutohideBehavior
  
  /**
  		* Autohide is prevented when the pointer is over interactive components such as the control panel.
  		**/
  @js.native
  sealed trait preventDuringInteractiveHover
    extends playerframeworkLib.PlayerFrameworkNs.AutohideBehavior
  
  /* 3 */ val all: all with scala.Double = js.native
  /* 1 */ val allowDuringPlaybackOnly: allowDuringPlaybackOnly with scala.Double = js.native
  /* 0 */ val none: none with scala.Double = js.native
  /* 2 */ val preventDuringInteractiveHover: preventDuringInteractiveHover with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[playerframeworkLib.PlayerFrameworkNs.AutohideBehavior with scala.Double] = js.native
}

