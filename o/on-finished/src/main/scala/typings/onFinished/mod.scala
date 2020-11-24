package typings.onFinished

import typings.node.httpMod.IncomingMessage
import typings.node.httpMod.OutgoingMessage
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("on-finished", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  def apply(
    msg: IncomingMessage,
    listener: js.Function2[/* err */ Error | Null, /* msg */ IncomingMessage, Unit]
  ): IncomingMessage = js.native
  def apply(
    msg: OutgoingMessage,
    listener: js.Function2[/* err */ Error | Null, /* msg */ OutgoingMessage, Unit]
  ): OutgoingMessage = js.native
  
  def isFinished(msg: IncomingMessage): Boolean = js.native
  def isFinished(msg: OutgoingMessage): Boolean = js.native
}
