package typings.parityDashPmd.parityDashPmdMod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("parity-pmd", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def format(message: PMDMessage): Buffer = js.native
  def parse(buffer: Buffer): PMDMessage = js.native
}

