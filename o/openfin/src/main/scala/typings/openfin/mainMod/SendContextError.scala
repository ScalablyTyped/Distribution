package typings.openfin.mainMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("openfin/_v2/fdc3/main", "SendContextError")
@js.native
object SendContextError extends js.Object {
  /* "SendContextError:HandlerError" */ val HandlerError: typings.openfin.errorsMod.SendContextError.HandlerError with String = js.native
  /* "SendContextError:SendIntentTimeout" */ val HandlerTimeout: typings.openfin.errorsMod.SendContextError.HandlerTimeout with String = js.native
  /* "SendContextError:NoHandler" */ val NoHandler: typings.openfin.errorsMod.SendContextError.NoHandler with String = js.native
  @JSBracketAccess
  def apply(value: String): js.UndefOr[typings.openfin.errorsMod.SendContextError with String] = js.native
}

