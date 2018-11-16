package typings
package parseLib.parseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("parse", "Promise")
@js.native
class Promise[T] ()
  extends parseLib.nodeMod.Promise[T]

@JSImport("parse", "Promise")
@js.native
object Promise extends js.Object {
  def as[U](resolvedValue: U): parseLib.ParseNs.Promise[U] = js.native
  def error(error: js.Any): parseLib.ParseNs.Promise[_] = js.native
  def is(possiblePromise: js.Any): scala.Boolean = js.native
  def when(promises: parseLib.ParseNs.IPromise[_]*): parseLib.ParseNs.Promise[_] = js.native
  def when(promises: js.Array[parseLib.ParseNs.IPromise[_]]): parseLib.ParseNs.Promise[_] = js.native
}

