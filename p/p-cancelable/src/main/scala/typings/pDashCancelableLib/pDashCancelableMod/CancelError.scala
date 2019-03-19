package typings
package pDashCancelableLib.pDashCancelableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("p-cancelable", "CancelError")
@js.native
class CancelError ()
  extends stdLib.Error {
  def this(reason: java.lang.String) = this()
  val isCanceled: pDashCancelableLib.pDashCancelableLibNumbers.`true` = js.native
  /* CompleteClass */
  override var message: java.lang.String = js.native
  /* CompleteClass */
  override var name: java.lang.String = js.native
  @JSName("name")
  val name_CancelError: pDashCancelableLib.pDashCancelableLibStrings.CancelError = js.native
}

