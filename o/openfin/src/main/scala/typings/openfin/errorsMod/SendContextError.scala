package typings.openfin.errorsMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait SendContextError extends js.Object
@JSImport("openfin/_v2/fdc3/errors", "SendContextError")
@js.native
object SendContextError extends js.Object {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[SendContextError with String] = js.native
  
  /**
    * Indicates that all handlers for the given context threw an error when invoked.
    */
  @js.native
  sealed trait HandlerError extends SendContextError
  /* "SendContextError:HandlerError" */ @js.native
  object HandlerError extends TopLevel[HandlerError with String]
  
  /**
    * Indicates that all handers for the given context failed to completed before a timeout was reached
    */
  @js.native
  sealed trait HandlerTimeout extends SendContextError
  /* "SendContextError:SendIntentTimeout" */ @js.native
  object HandlerTimeout extends TopLevel[HandlerTimeout with String]
  
  /**
    * Indicates that the target application has no windows that have a relevant handler for the given context.
    */
  @js.native
  sealed trait NoHandler extends SendContextError
  /* "SendContextError:NoHandler" */ @js.native
  object NoHandler extends TopLevel[NoHandler with String]
}
