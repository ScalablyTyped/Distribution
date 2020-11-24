package typings.playerframework.PlayerFramework

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
}
