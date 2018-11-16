package typings
package parseLib.nodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("parse/node", "Promise")
@js.native
class Promise[T] ()
  extends parseLib.ParseNs.Promise[T]

@JSImport("parse/node", "Promise")
@js.native
object Promise extends js.Object {
  def as[U](resolvedValue: U): parseLib.ParseNs.Promise[U] = js.native
  def error(error: js.Any): parseLib.ParseNs.Promise[_] = js.native
  def is(possiblePromise: js.Any): scala.Boolean = js.native
  def when(promises: parseLib.ParseNs.IPromise[_]*): parseLib.ParseNs.Promise[_] = js.native
  def when(promises: js.Array[parseLib.ParseNs.IPromise[_]]): parseLib.ParseNs.Promise[_] = js.native
}

