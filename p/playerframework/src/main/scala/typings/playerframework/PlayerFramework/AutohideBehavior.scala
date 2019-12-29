package typings.playerframework.PlayerFramework

import org.scalablytyped.runtime.TopLevel
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
  sealed trait all extends AutohideBehavior
  
  /**
  		* Autohide is allowed during media playback only.
  		**/
  @js.native
  sealed trait allowDuringPlaybackOnly extends AutohideBehavior
  
  /**
  		* No behaviors are applied to the autohide feature.
  		**/
  @js.native
  sealed trait none extends AutohideBehavior
  
  /**
  		* Autohide is prevented when the pointer is over interactive components such as the control panel.
  		**/
  @js.native
  sealed trait preventDuringInteractiveHover extends AutohideBehavior
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[AutohideBehavior with Double] = js.native
  /* 3 */ @js.native
  object all extends TopLevel[all with Double]
  
  /* 1 */ @js.native
  object allowDuringPlaybackOnly extends TopLevel[allowDuringPlaybackOnly with Double]
  
  /* 0 */ @js.native
  object none extends TopLevel[none with Double]
  
  /* 2 */ @js.native
  object preventDuringInteractiveHover extends TopLevel[preventDuringInteractiveHover with Double]
  
}

