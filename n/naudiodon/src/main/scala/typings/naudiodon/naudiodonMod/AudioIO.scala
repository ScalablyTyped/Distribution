package typings.naudiodon.naudiodonMod

import typings.naudiodon.Anon_InOptions
import typings.naudiodon.Anon_InOptionsOutOptions
import typings.naudiodon.Anon_OutOptions
import typings.node.streamMod.Duplex
import typings.node.streamMod.Readable
import typings.node.streamMod.Writable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("naudiodon", "AudioIO")
@js.native
object AudioIO extends js.Object {
  def apply(options: Anon_InOptions): Readable with AudioStream = js.native
  def apply(options: Anon_InOptionsOutOptions): Duplex with AudioStream = js.native
  def apply(options: Anon_OutOptions): Writable with AudioStream = js.native
}

