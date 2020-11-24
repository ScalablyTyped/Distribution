package typings.pgProtocol.messagesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("pg-protocol/dist/messages", "BackendKeyDataMessage")
@js.native
class BackendKeyDataMessage protected () extends js.Object {
  def this(length: Double, processID: Double, secretKey: Double) = this()
  
  val length: Double = js.native
  
  val name: MessageName = js.native
  
  val processID: Double = js.native
  
  val secretKey: Double = js.native
}
