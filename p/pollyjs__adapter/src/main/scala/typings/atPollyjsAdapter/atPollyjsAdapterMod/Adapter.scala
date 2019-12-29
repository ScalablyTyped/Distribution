package typings.atPollyjsAdapter.atPollyjsAdapterMod

import typings.atPollyjsAdapter.Anon_Body
import typings.atPollyjsCore.atPollyjsCoreMod.Request
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Adapter extends js.Object {
  def connect(): Unit
  def disconnect(): Unit
  def passthroughRequest(pollyRequest: Request): js.Promise[Anon_Body]
}

object Adapter {
  @scala.inline
  def apply(connect: () => Unit, disconnect: () => Unit, passthroughRequest: Request => js.Promise[Anon_Body]): Adapter = {
    val __obj = js.Dynamic.literal(connect = js.Any.fromFunction0(connect), disconnect = js.Any.fromFunction0(disconnect), passthroughRequest = js.Any.fromFunction1(passthroughRequest))
  
    __obj.asInstanceOf[Adapter]
  }
}

