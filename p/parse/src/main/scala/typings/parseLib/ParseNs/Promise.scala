package typings
package parseLib.ParseNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Parse.Promise")
@js.native
class Promise[T] () extends IPromise[T] {
  def always(callback: js.Function): Promise[T] = js.native
  def done(callback: js.Function): Promise[T] = js.native
  def fail(callback: js.Function): Promise[T] = js.native
  def reject(error: js.Any): scala.Unit = js.native
  def resolve(result: js.Any): scala.Unit = js.native
}

@JSGlobal("Parse.Promise")
@js.native
object Promise extends js.Object {
  def as[U](resolvedValue: U): parseLib.ParseNs.Promise[U] = js.native
  def error(error: js.Any): parseLib.ParseNs.Promise[_] = js.native
  def is(possiblePromise: js.Any): scala.Boolean = js.native
  def when(promises: parseLib.ParseNs.IPromise[_]*): parseLib.ParseNs.Promise[_] = js.native
  def when(promises: js.Array[parseLib.ParseNs.IPromise[_]]): parseLib.ParseNs.Promise[_] = js.native
}

