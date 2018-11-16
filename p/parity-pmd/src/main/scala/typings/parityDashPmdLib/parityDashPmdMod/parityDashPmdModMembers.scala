package typings
package parityDashPmdLib.parityDashPmdMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("parity-pmd", JSImport.Namespace)
@js.native
object parityDashPmdModMembers extends js.Object {
  def format(message: PMDMessage): nodeLib.Buffer = js.native
  def parse(buffer: nodeLib.Buffer): PMDMessage = js.native
}

