package typings.pgProtocol.messagesMod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("pg-protocol/dist/messages", "CopyDataMessage")
@js.native
class CopyDataMessage protected () extends js.Object {
  def this(length: Double, chunk: Buffer) = this()
  
  val chunk: Buffer = js.native
  
  val length: Double = js.native
  
  val name: String | Double = js.native
}
