package typings.naudiodon.mod

import typings.naudiodon.AnonInOptions
import typings.naudiodon.AnonInOptionsOutOptions
import typings.naudiodon.AnonOutOptions
import typings.node.streamMod.Duplex
import typings.node.streamMod.Readable
import typings.node.streamMod.Writable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("naudiodon", "AudioIO")
@js.native
object AudioIO extends js.Object {
  def apply(options: AnonInOptions): Readable with AudioStream = js.native
  def apply(options: AnonInOptionsOutOptions): Duplex with AudioStream = js.native
  def apply(options: AnonOutOptions): Writable with AudioStream = js.native
}

