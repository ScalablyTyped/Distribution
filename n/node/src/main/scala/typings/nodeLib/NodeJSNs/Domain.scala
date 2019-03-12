package typings
package nodeLib.NodeJSNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Domain extends EventEmitter {
  def add(emitter: EventEmitter): scala.Unit = js.native
  def add(emitter: Timer): scala.Unit = js.native
  def bind[T /* <: js.Function */](cb: T): T = js.native
  def intercept[T /* <: js.Function */](cb: T): T = js.native
  def remove(emitter: EventEmitter): scala.Unit = js.native
  def remove(emitter: Timer): scala.Unit = js.native
  def run[T](fn: js.Function1[/* repeated */ js.Any, T], args: js.Any*): T = js.native
}

