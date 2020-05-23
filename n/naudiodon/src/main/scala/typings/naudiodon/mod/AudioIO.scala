package typings.naudiodon.mod

import typings.naudiodon.anon.InOptions
import typings.naudiodon.anon.InOptionsOutOptions
import typings.naudiodon.anon.OutOptions
import typings.node.streamMod.Duplex
import typings.node.streamMod.Readable
import typings.node.streamMod.Writable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("naudiodon", "AudioIO")
@js.native
object AudioIO extends js.Object {
  def apply(options: InOptions): Readable with AudioStream = js.native
  def apply(options: InOptionsOutOptions): Duplex with AudioStream = js.native
  def apply(options: OutOptions): Writable with AudioStream = js.native
}

