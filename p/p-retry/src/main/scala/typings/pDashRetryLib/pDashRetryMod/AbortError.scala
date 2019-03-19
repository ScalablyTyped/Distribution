package typings
package pDashRetryLib.pDashRetryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("p-retry", "AbortError")
@js.native
class AbortError protected ()
  extends stdLib.Error {
  /**
  	 * Abort retrying and reject the promise.
  	 *
  	 * @param message - Error message or custom error.
  	 */
  def this(message: java.lang.String) = this()
  def this(message: stdLib.Error) = this()
  /* CompleteClass */
  override var message: java.lang.String = js.native
  /* CompleteClass */
  override var name: java.lang.String = js.native
  @JSName("name")
  val name_AbortError: pDashRetryLib.pDashRetryLibStrings.AbortError = js.native
  val originalError: stdLib.Error = js.native
}

