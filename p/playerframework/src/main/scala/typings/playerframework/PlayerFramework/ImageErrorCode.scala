package typings.playerframework.PlayerFramework

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ImageErrorCode with Double] = js.native
  /* 1 */ @js.native
  object aborted extends TopLevel[aborted with Double]
  
  /* 0 */ @js.native
  object unknown extends TopLevel[unknown with Double]
  
}

