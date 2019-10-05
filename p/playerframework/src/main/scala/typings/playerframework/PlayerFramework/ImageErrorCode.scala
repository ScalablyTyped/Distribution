package typings.playerframework.PlayerFramework

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
  sealed trait aborted extends ImageErrorCode
  
  /**
  		* An unknown image error occurred.
  		**/
  @js.native
  sealed trait unknown extends ImageErrorCode
  
  /* 1 */ val aborted: typings.playerframework.PlayerFramework.ImageErrorCode.aborted with Double = js.native
  /* 0 */ val unknown: typings.playerframework.PlayerFramework.ImageErrorCode.unknown with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ImageErrorCode with Double] = js.native
}

