package typings
package playerframeworkLib.PlayerFrameworkNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait MediaErrorCode extends js.Object

@JSGlobal("PlayerFramework.MediaErrorCode")
@js.native
object MediaErrorCode extends js.Object {
  /**
  		* Media playback was aborted.
  		**/
  @js.native
  sealed trait aborted
    extends playerframeworkLib.PlayerFrameworkNs.MediaErrorCode
  
  /**
  		* Media playback was aborted due to a corruption problem or because unsupported features were used.
  		**/
  @js.native
  sealed trait decode
    extends playerframeworkLib.PlayerFrameworkNs.MediaErrorCode
  
  /**
  		* Media download failed due to a network error.
  		**/
  @js.native
  sealed trait network
    extends playerframeworkLib.PlayerFrameworkNs.MediaErrorCode
  
  /**
  		* Media source could not be loaded either because the server or network failed or because the format is not supported.
  		**/
  @js.native
  sealed trait notSupported
    extends playerframeworkLib.PlayerFrameworkNs.MediaErrorCode
  
  /**
  		* An unknown media error occurred.
  		**/
  @js.native
  sealed trait unknown
    extends playerframeworkLib.PlayerFrameworkNs.MediaErrorCode
  
  /* 1 */ val aborted: aborted with scala.Double = js.native
  /* 3 */ val decode: decode with scala.Double = js.native
  /* 2 */ val network: network with scala.Double = js.native
  /* 4 */ val notSupported: notSupported with scala.Double = js.native
  /* 0 */ val unknown: unknown with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[playerframeworkLib.PlayerFrameworkNs.MediaErrorCode with scala.Double] = js.native
}

