package typings.parityPmd.mod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("parity-pmd", "format")
@js.native
object format extends js.Object {
  def apply(message: PMDMessage): Buffer = js.native
}

