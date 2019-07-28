package typings.parityDashPoe.parityDashPoeMod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("parity-poe", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def formatInbound(message: POEMessage): Buffer = js.native
  def formatOutbound(message: POEMessage): Buffer = js.native
  def parseInbound(buffer: Buffer): POEMessage = js.native
  def parseOutbound(buffer: Buffer): POEMessage = js.native
}

