package typings
package parityDashPoeLib.parityDashPoeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("parity-poe", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def formatInbound(message: parityDashPoeLib.parityDashPoeMod.POEMessage): nodeLib.Buffer = js.native
  def formatOutbound(message: parityDashPoeLib.parityDashPoeMod.POEMessage): nodeLib.Buffer = js.native
  def parseInbound(buffer: nodeLib.Buffer): parityDashPoeLib.parityDashPoeMod.POEMessage = js.native
  def parseOutbound(buffer: nodeLib.Buffer): parityDashPoeLib.parityDashPoeMod.POEMessage = js.native
}

