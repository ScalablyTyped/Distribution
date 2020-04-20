package typings.pgProtocol.messagesMod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("pg-protocol/dist/messages", "AuthenticationMD5Password")
@js.native
class AuthenticationMD5Password protected () extends BackendMessage {
  def this(length: Double, salt: Buffer) = this()
  /* CompleteClass */
  override var length: Double = js.native
  /* CompleteClass */
  override var name: MessageName = js.native
  val salt: Buffer = js.native
}

