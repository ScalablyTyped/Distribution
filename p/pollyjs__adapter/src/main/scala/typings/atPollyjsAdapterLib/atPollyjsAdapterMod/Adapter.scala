package typings
package atPollyjsAdapterLib.atPollyjsAdapterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Adapter extends js.Object {
  def connect(): scala.Unit
  def disconnect(): scala.Unit
}

object Adapter {
  @scala.inline
  def apply(connect: () => scala.Unit, disconnect: () => scala.Unit): Adapter = {
    val __obj = js.Dynamic.literal(connect = js.Any.fromFunction0(connect), disconnect = js.Any.fromFunction0(disconnect))
  
    __obj.asInstanceOf[Adapter]
  }
}

