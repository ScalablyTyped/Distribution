package typings.playerframework.PlayerFramework

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
  sealed trait aborted extends MediaErrorCode
  
  /**
  		* Media playback was aborted due to a corruption problem or because unsupported features were used.
  		**/
  @js.native
  sealed trait decode extends MediaErrorCode
  
  /**
  		* Media download failed due to a network error.
  		**/
  @js.native
  sealed trait network extends MediaErrorCode
  
  /**
  		* Media source could not be loaded either because the server or network failed or because the format is not supported.
  		**/
  @js.native
  sealed trait notSupported extends MediaErrorCode
  
  /**
  		* An unknown media error occurred.
  		**/
  @js.native
  sealed trait unknown extends MediaErrorCode
  
  /* 1 */ val aborted: typings.playerframework.PlayerFramework.MediaErrorCode.aborted with Double = js.native
  /* 3 */ val decode: typings.playerframework.PlayerFramework.MediaErrorCode.decode with Double = js.native
  /* 2 */ val network: typings.playerframework.PlayerFramework.MediaErrorCode.network with Double = js.native
  /* 4 */ val notSupported: typings.playerframework.PlayerFramework.MediaErrorCode.notSupported with Double = js.native
  /* 0 */ val unknown: typings.playerframework.PlayerFramework.MediaErrorCode.unknown with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[MediaErrorCode with Double] = js.native
}

