package typings.pRetry.mod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("p-retry", "AbortError")
@js.native
class AbortErrorCls protected () extends AbortErrorClass {
  /**
  	Abort retrying and reject the promise.
  	@param message - Error message or custom error.
  	*/
  def this(message: String) = this()
  def this(message: Error) = this()
}
