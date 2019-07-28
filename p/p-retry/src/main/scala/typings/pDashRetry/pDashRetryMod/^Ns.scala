package typings.pDashRetry.pDashRetryMod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("p-retry", JSImport.Namespace)
@js.native
object `^Ns` extends js.Object {
  @js.native
  class AbortError protected () extends AbortErrorClass {
    /**
    	Abort retrying and reject the promise.
    	@param message - Error message or custom error.
    	*/
    def this(message: String) = this()
    def this(message: Error) = this()
    /* CompleteClass */
    override var message: String = js.native
    /* CompleteClass */
    override var name: String = js.native
    /* CompleteClass */
    @JSName("name")
    override val name_AbortErrorClass: typings.pDashRetry.pDashRetryStrings.AbortError = js.native
    /* CompleteClass */
    override val originalError: Error = js.native
  }
  
}

