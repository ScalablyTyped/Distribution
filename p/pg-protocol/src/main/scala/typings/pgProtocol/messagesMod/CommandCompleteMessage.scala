package typings.pgProtocol.messagesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("pg-protocol/dist/messages", "CommandCompleteMessage")
@js.native
class CommandCompleteMessage protected () extends js.Object {
  def this(length: Double, text: String) = this()
  
  val length: Double = js.native
  
  val name: MessageName = js.native
  
  val text: String = js.native
}
