package typings.pgProtocol.messagesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("pg-protocol/dist/messages", "ReadyForQueryMessage")
@js.native
class ReadyForQueryMessage protected () extends js.Object {
  def this(length: Double, status: String) = this()
  
  val length: Double = js.native
  
  val name: MessageName = js.native
  
  val status: String = js.native
}
