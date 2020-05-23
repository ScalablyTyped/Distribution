package typings.openfin.errorsMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ChannelError extends js.Object

@JSImport("openfin/_v2/fdc3/errors", "ChannelError")
@js.native
object ChannelError extends js.Object {
  /**
    * Indicates that a channel of a provided ID does not exist.
    */
  @js.native
  sealed trait ChannelWithIdDoesNotExist extends ChannelError
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[ChannelError with String] = js.native
  /* "ChannelError:ChannelWithIdDoesNotExist" */ @js.native
  object ChannelWithIdDoesNotExist extends TopLevel[ChannelWithIdDoesNotExist with String]
  
}

