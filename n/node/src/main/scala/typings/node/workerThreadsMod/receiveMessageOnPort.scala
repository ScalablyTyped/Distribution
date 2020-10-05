package typings.node.workerThreadsMod

import typings.node.anon.Message
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("worker_threads", "receiveMessageOnPort")
@js.native
object receiveMessageOnPort extends js.Object {
  /**
    * Receive a single message from a given `MessagePort`. If no message is available,
    * `undefined` is returned, otherwise an object with a single `message` property
    * that contains the message payload, corresponding to the oldest message in the
    * `MessagePort`’s queue.
    */
  def apply(port: MessagePort): js.UndefOr[Message] = js.native
}

