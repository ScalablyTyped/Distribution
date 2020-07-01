package typings.pollyjsAdapter.mod

import org.scalablytyped.runtime.StringDictionary
import typings.pollyjsAdapter.anon.Body
import typings.pollyjsCore.mod.Request
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Adapter extends js.Object {
  val options: StringDictionary[js.Any]
  def connect(): Unit
  def disconnect(): Unit
  def passthroughRequest(pollyRequest: Request): js.Promise[Body]
}

object Adapter {
  @scala.inline
  def apply(
    connect: () => Unit,
    disconnect: () => Unit,
    options: StringDictionary[js.Any],
    passthroughRequest: Request => js.Promise[Body]
  ): Adapter = {
    val __obj = js.Dynamic.literal(connect = js.Any.fromFunction0(connect), disconnect = js.Any.fromFunction0(disconnect), options = options.asInstanceOf[js.Any], passthroughRequest = js.Any.fromFunction1(passthroughRequest))
    __obj.asInstanceOf[Adapter]
  }
}

