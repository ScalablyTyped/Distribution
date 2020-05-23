package typings.playerframework.PlayerFramework

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
  
}

