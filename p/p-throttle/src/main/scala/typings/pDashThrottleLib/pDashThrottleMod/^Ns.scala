package typings
package pDashThrottleLib.pDashThrottleMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("p-throttle", JSImport.Namespace)
@js.native
object `^Ns` extends js.Object {
  @js.native
  /**
  	Abort pending execution. All unresolved promised are rejected with a `AbortError` error.
  	*/
  class AbortError ()
    extends pDashThrottleLib.pDashThrottleMod.AbortErrorClass {
    /* CompleteClass */
    override var message: java.lang.String = js.native
    /* CompleteClass */
    override var name: java.lang.String = js.native
    /* CompleteClass */
    @JSName("name")
    override val name_AbortErrorClass: pDashThrottleLib.pDashThrottleLibStrings.AbortError = js.native
  }
  
}

