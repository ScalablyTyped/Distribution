package typings
package newrelicLib.newrelicMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TransactionHandle extends js.Object {
  /**
    * End the transaction.
    */
  def end(): scala.Unit = js.native
  def end(callback: js.Function0[_]): scala.Unit = js.native
  /**
    * Mark the transaction to be ignored.
    */
  def ignore(): scala.Unit = js.native
}

