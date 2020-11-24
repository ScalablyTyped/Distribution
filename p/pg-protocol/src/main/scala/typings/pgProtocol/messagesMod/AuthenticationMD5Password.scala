package typings.pgProtocol.messagesMod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("pg-protocol/dist/messages", "AuthenticationMD5Password")
@js.native
class AuthenticationMD5Password protected () extends BackendMessage {
  def this(length: Double, salt: Buffer) = this()
  
  val salt: Buffer = js.native
}
