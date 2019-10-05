package typings.pako.pakoMod

import typings.std.ArrayBuffer
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// https://github.com/nodeca/pako/blob/893381abcafa10fa2081ce60dae7d4d8e873a658/lib/inflate.js
@JSImport("pako", "Inflate")
@js.native
class Inflate () extends js.Object {
  def this(options: InflateOptions) = this()
  var err: ReturnCodes = js.native
  var header: js.UndefOr[Header] = js.native
  var msg: String = js.native
  var result: Data = js.native
  def onData(chunk: Data): Unit = js.native
  def onEnd(status: Double): Unit = js.native
  def push(data: Data): Boolean = js.native
  def push(data: Data, mode: Boolean): Boolean = js.native
  def push(data: Data, mode: FlushValues): Boolean = js.native
  def push(data: ArrayBuffer): Boolean = js.native
  def push(data: ArrayBuffer, mode: Boolean): Boolean = js.native
  def push(data: ArrayBuffer, mode: FlushValues): Boolean = js.native
}

@JSImport("pako", "inflate")
@js.native
object inflate extends js.Object {
  def apply(data: Data): Uint8Array = js.native
  def apply(data: Data, options: InflateFunctionOptions): Uint8Array = js.native
}

