package typings.parityPmd.mod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("parity-pmd", "parse")
@js.native
object parse extends js.Object {
  def apply(buffer: Buffer): PMDMessage = js.native
}

