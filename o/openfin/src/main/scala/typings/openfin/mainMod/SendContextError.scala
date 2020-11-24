package typings.openfin.mainMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("openfin/_v2/fdc3/main", "SendContextError")
@js.native
object SendContextError extends js.Object {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[typings.openfin.errorsMod.SendContextError with String] = js.native
  
  /* "SendContextError:HandlerError" */ val HandlerError: typings.openfin.errorsMod.SendContextError.HandlerError with String = js.native
  
  /* "SendContextError:SendIntentTimeout" */ val HandlerTimeout: typings.openfin.errorsMod.SendContextError.HandlerTimeout with String = js.native
  
  /* "SendContextError:NoHandler" */ val NoHandler: typings.openfin.errorsMod.SendContextError.NoHandler with String = js.native
}
