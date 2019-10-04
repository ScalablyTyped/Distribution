package typings.msgpackDashLite.msgpackDashLiteMod

import typings.node.eventsMod.EventEmitter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Decoder extends EventEmitter {
  var bufferish: js.Any = js.native
  var offset: Double = js.native
  def decode(chunk: js.Any): Unit = js.native
  def end(chunk: js.Any): Unit = js.native
  def fetch(): Unit = js.native
  def flush(): Unit = js.native
  def pull(): Double = js.native
  def push(chunk: js.Any): Unit = js.native
  def read(): Double = js.native
  def reserve(length: Double): Double = js.native
  def write(chunk: js.Any): Unit = js.native
}

