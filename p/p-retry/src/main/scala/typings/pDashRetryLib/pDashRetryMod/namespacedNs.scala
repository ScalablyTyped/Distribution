package typings
package pDashRetryLib.pDashRetryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("p-retry", JSImport.Namespace)
@js.native
object namespacedNs extends js.Object {
  @js.native
  class AbortError protected ()
    extends pDashRetryLib.pDashRetryMod.AbortErrorClass {
    /**
    	Abort retrying and reject the promise.
    	@param message - Error message or custom error.
    	*/
    def this(message: java.lang.String) = this()
    def this(message: stdLib.Error) = this()
    /* CompleteClass */
    override var message: java.lang.String = js.native
    /* CompleteClass */
    override var name: java.lang.String = js.native
    /* CompleteClass */
    @JSName("name")
    override val name_AbortErrorClass: pDashRetryLib.pDashRetryLibStrings.AbortError = js.native
    /* CompleteClass */
    override val originalError: stdLib.Error = js.native
  }
  
}

