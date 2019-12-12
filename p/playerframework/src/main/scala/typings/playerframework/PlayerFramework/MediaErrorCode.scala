package typings.playerframework.PlayerFramework

import org.scalablytyped.runtime.TopLevel
import typings.playerframework.PlayerFramework.MediaErrorCode.aborted
import typings.playerframework.PlayerFramework.MediaErrorCode.decode
import typings.playerframework.PlayerFramework.MediaErrorCode.network
import typings.playerframework.PlayerFramework.MediaErrorCode.notSupported
import typings.playerframework.PlayerFramework.MediaErrorCode.unknown
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[MediaErrorCode with Double] = js.native
  /* 1 */ @js.native
  object aborted extends TopLevel[aborted with Double]
  
  /* 3 */ @js.native
  object decode extends TopLevel[decode with Double]
  
  /* 2 */ @js.native
  object network extends TopLevel[network with Double]
  
  /* 4 */ @js.native
  object notSupported extends TopLevel[notSupported with Double]
  
  /* 0 */ @js.native
  object unknown extends TopLevel[unknown with Double]
  
}

