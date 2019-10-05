package typings.node.osMod

import typings.node.nodeStrings.BE
import typings.node.nodeStrings.LE
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("os", "endianness")
@js.native
object endianness extends js.Object {
  def apply(): BE | LE = js.native
}

