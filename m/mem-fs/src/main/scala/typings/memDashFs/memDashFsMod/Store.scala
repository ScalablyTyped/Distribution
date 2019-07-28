package typings.memDashFs.memDashFsMod

import typings.node.eventsMod.EventEmitter
import typings.node.streamMod.Transform
import typings.vinyl.vinylMod.File
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Store extends EventEmitter {
  def add(file: File): this.type = js.native
  def each(callback: js.Function2[/* file */ File, /* index */ Double, Unit]): this.type = js.native
  def get(filepath: String): File = js.native
  def stream(): Transform = js.native
}

