package typings
package pDashCancelableLib.pDashCancelableMod.PCancelableNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PCancelable[T]
  extends stdLib.Promise[T] {
  val isCanceled: scala.Boolean = js.native
  def cancel(): scala.Unit = js.native
  def cancel(reason: java.lang.String): scala.Unit = js.native
}

