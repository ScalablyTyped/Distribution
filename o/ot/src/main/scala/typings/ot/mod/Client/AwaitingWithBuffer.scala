package typings.ot.mod.Client

import typings.ot.mod.TextOperation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * In the 'AwaitingWithBuffer' state, the client is waiting for an operation
  * to be acknowledged by the server while buffering the edits the user makes
  */
@js.native
trait AwaitingWithBuffer extends Sync[AwaitingWithBuffer, AwaitingWithBuffer, AwaitingConfirm] {
  
  var buffer: TextOperation = js.native
  
  var outstanding: TextOperation = js.native
  
  def resend(client: typings.ot.mod.Client): Unit = js.native
}
@JSImport("ot", "Client.AwaitingWithBuffer")
@js.native
object AwaitingWithBuffer extends js.Object {
  
  def apply(outstanding: TextOperation, buffer: TextOperation): AwaitingWithBuffer = js.native
}
