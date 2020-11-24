package typings.openfin.errorsMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ChannelError extends js.Object
@JSImport("openfin/_v2/fdc3/errors", "ChannelError")
@js.native
object ChannelError extends js.Object {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[ChannelError with String] = js.native
  
  /**
    * Indicates that a channel of a provided ID does not exist.
    */
  @js.native
  sealed trait ChannelWithIdDoesNotExist extends ChannelError
  /* "ChannelError:ChannelWithIdDoesNotExist" */ @js.native
  object ChannelWithIdDoesNotExist extends TopLevel[ChannelWithIdDoesNotExist with String]
}
