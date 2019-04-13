package typings
package pakoLib.pakoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// https://github.com/nodeca/pako/blob/893381abcafa10fa2081ce60dae7d4d8e873a658/lib/deflate.js
@JSImport("pako", "Deflate")
@js.native
class Deflate () extends js.Object {
  def this(options: DeflateOptions) = this()
  var err: ReturnCodes = js.native
  var msg: java.lang.String = js.native
  var result: stdLib.Uint8Array | js.Array[scala.Double] = js.native
  def onData(chunk: Data): scala.Unit = js.native
  def onEnd(status: scala.Double): scala.Unit = js.native
  def push(data: Data): scala.Boolean = js.native
  def push(data: Data, mode: FlushValues): scala.Boolean = js.native
  def push(data: Data, mode: scala.Boolean): scala.Boolean = js.native
  def push(data: stdLib.ArrayBuffer): scala.Boolean = js.native
  def push(data: stdLib.ArrayBuffer, mode: FlushValues): scala.Boolean = js.native
  def push(data: stdLib.ArrayBuffer, mode: scala.Boolean): scala.Boolean = js.native
}

