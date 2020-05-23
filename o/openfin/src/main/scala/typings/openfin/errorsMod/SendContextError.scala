package typings.openfin.errorsMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait SendContextError extends js.Object

@JSImport("openfin/_v2/fdc3/errors", "SendContextError")
@js.native
object SendContextError extends js.Object {
  /**
    * Indicates that all handlers for the given context threw an error when invoked.
    */
  @js.native
  sealed trait HandlerError extends SendContextError
  
  /**
    * Indicates that all handers for the given context failed to completed before a timeout was reached
    */
  @js.native
  sealed trait HandlerTimeout extends SendContextError
  
  /**
    * Indicates that the target application has no windows that have a relevant handler for the given context.
    */
  @js.native
  sealed trait NoHandler extends SendContextError
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[SendContextError with String] = js.native
  /* "SendContextError:HandlerError" */ @js.native
  object HandlerError extends TopLevel[HandlerError with String]
  
  /* "SendContextError:SendIntentTimeout" */ @js.native
  object HandlerTimeout extends TopLevel[HandlerTimeout with String]
  
  /* "SendContextError:NoHandler" */ @js.native
  object NoHandler extends TopLevel[NoHandler with String]
  
}

