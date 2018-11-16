package typings
package parityDashPmrLib.parityDashPmrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("parity-pmr", JSImport.Namespace)
@js.native
object parityDashPmrModMembers extends js.Object {
  def format(message: PMRMessage): nodeLib.Buffer = js.native
  def parse(buffer: nodeLib.Buffer): PMRMessage = js.native
}

