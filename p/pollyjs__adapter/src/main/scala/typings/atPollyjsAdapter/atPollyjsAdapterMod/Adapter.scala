package typings.atPollyjsAdapter.atPollyjsAdapterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Adapter extends js.Object {
  def connect(): Unit
  def disconnect(): Unit
}

object Adapter {
  @scala.inline
  def apply(connect: () => Unit, disconnect: () => Unit): Adapter = {
    val __obj = js.Dynamic.literal(connect = js.Any.fromFunction0(connect), disconnect = js.Any.fromFunction0(disconnect))
  
    __obj.asInstanceOf[Adapter]
  }
}

