package typings
package pakoLib.pakoMod

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
  var msg: java.lang.String = js.native
  var result: Data = js.native
  def onData(chunk: Data): scala.Unit = js.native
  def onEnd(status: scala.Double): scala.Unit = js.native
  def push(data: Data): scala.Boolean = js.native
  def push(data: Data, mode: FlushValues): scala.Boolean = js.native
  def push(data: Data, mode: scala.Boolean): scala.Boolean = js.native
  def push(data: stdLib.ArrayBuffer): scala.Boolean = js.native
  def push(data: stdLib.ArrayBuffer, mode: FlushValues): scala.Boolean = js.native
  def push(data: stdLib.ArrayBuffer, mode: scala.Boolean): scala.Boolean = js.native
}

