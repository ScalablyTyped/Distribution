package typings.playerframework.PlayerFramework

import org.scalablytyped.runtime.TopLevel
import typings.playerframework.PlayerFramework.MediaQuality.highDefinition
import typings.playerframework.PlayerFramework.MediaQuality.standardDefinition
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait MediaQuality extends js.Object

@JSGlobal("PlayerFramework.MediaQuality")
@js.native
object MediaQuality extends js.Object {
  /**
  		* Typically indicates greater than or equal to 720p media quality.
  		**/
  @js.native
  sealed trait highDefinition extends MediaQuality
  
  /**
  		* Typically indicates less than 720p media quality.
  		**/
  @js.native
  sealed trait standardDefinition extends MediaQuality
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[MediaQuality with Double] = js.native
  /* 1 */ @js.native
  object highDefinition extends TopLevel[highDefinition with Double]
  
  /* 0 */ @js.native
  object standardDefinition extends TopLevel[standardDefinition with Double]
  
}

