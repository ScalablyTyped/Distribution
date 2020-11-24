package typings.playerframework.PlayerFramework

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
}
