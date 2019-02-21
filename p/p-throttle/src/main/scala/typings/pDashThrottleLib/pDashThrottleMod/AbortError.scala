package typings
package pDashThrottleLib.pDashThrottleMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("p-throttle", "AbortError")
@js.native
/**
	 * Abort pending execution. All unresolved promised are rejected with a `AbortError` error.
	 */
class AbortError ()
  extends stdLib.Error {
  /* CompleteClass */
  override var message: java.lang.String = js.native
  /* CompleteClass */
  override var name: java.lang.String = js.native
  @JSName("name")
  val name_AbortError: pDashThrottleLib.pDashThrottleLibStrings.AbortError = js.native
}

