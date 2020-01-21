package typings.parityPoe.mod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("parity-poe", "parseInbound")
@js.native
object parseInbound extends js.Object {
  def apply(buffer: Buffer): POEMessage = js.native
}

