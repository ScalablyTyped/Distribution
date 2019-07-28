package typings.parityDashPmr.parityDashPmrMod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("parity-pmr", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def format(message: PMRMessage): Buffer = js.native
  def parse(buffer: Buffer): PMRMessage = js.native
}

