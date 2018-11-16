package typings
package playerframeworkLib.PlayerFrameworkNs

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
  sealed trait highDefinition
    extends playerframeworkLib.PlayerFrameworkNs.MediaQuality
  
  /**
  		* Typically indicates less than 720p media quality.
  		**/
  @js.native
  sealed trait standardDefinition
    extends playerframeworkLib.PlayerFrameworkNs.MediaQuality
  
  /* 1 */ val highDefinition: highDefinition with scala.Double = js.native
  /* 0 */ val standardDefinition: standardDefinition with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[playerframeworkLib.PlayerFrameworkNs.MediaQuality with scala.Double] = js.native
}

