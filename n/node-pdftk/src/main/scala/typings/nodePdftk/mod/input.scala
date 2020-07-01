package typings.nodePdftk.mod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("node-pdftk", "input")
@js.native
object input extends js.Object {
  def apply(file: String): PDFTK = js.native
  def apply(file: Buffer): PDFTK = js.native
}

