package typings
package playerframeworkLib.PlayerFrameworkNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ImageErrorCode extends js.Object

@JSGlobal("PlayerFramework.ImageErrorCode")
@js.native
object ImageErrorCode extends js.Object {
  /**
  		* Image download was aborted.
  		**/
  @js.native
  sealed trait aborted
    extends playerframeworkLib.PlayerFrameworkNs.ImageErrorCode
  
  /**
  		* An unknown image error occurred.
  		**/
  @js.native
  sealed trait unknown
    extends playerframeworkLib.PlayerFrameworkNs.ImageErrorCode
  
  /* 1 */ val aborted: aborted with scala.Double = js.native
  /* 0 */ val unknown: unknown with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[playerframeworkLib.PlayerFrameworkNs.ImageErrorCode with scala.Double] = js.native
}

